package com.amazon.ata.dynamodbindexdesignandusage.integration;

import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInvitesForMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.dao.models.Event;
import com.amazon.ata.dynamodbindexdesignandusage.dao.models.Invite;
import com.amazon.ata.dynamodbindexdesignandusage.dao.models.Member;
import com.amazon.ata.dynamodbindexdesignandusage.integration.helper.ActivityProvider;
import com.amazon.ata.dynamodbindexdesignandusage.integration.helper.TestDataProvider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhaseExtraTest {
    private GetInvitesForMemberActivity getInvitesForMemberActivity;
    private TestDataProvider testDataProvider;

    @BeforeEach
    private void setup() {
        getInvitesForMemberActivity = ActivityProvider.provideGetInvitesForMemberActivity();
        testDataProvider = new TestDataProvider();
    }

    @Test
    void getInvitesForMemberActivity_noInvites_returnsEmptyLIst() {
        // GIVEN
        Member member = testDataProvider.createMember();

        // WHEN
        List<Invite> result = getInvitesForMemberActivity.handleRequest(member.getId());

        // THEN
        assertTrue(
            result.isEmpty(),
            String.format("Expected no invites to be returned but received: %s", result.size())
        );
    }

    @Test
    void getInvitesForMemberActivity_allAcceptedInvites_returnsAcceptedInvites() {
        // GIVEN
        List<Invite> expectedInvites = new ArrayList<>();
        Member member = testDataProvider.createMember();

        for (int i = 0; i < 3; i++) {
            Event event = testDataProvider.createEvent();
            expectedInvites.add(testDataProvider.createAcceptedInviteForEvent(event, member.getId()));
        }

        // WHEN
        List<Invite> result = getInvitesForMemberActivity.handleRequest(member.getId());

        // THEN
        assertEquals(
            expectedInvites.size(),
            result.size(),
            "Expected to receive same number of invites for event, but received: " + result
        );
        assertTrue(
            result.containsAll(expectedInvites),
            String.format("Expected all invites for event (%s) to be returned but received: %s", expectedInvites, result)
        );
    }

    @Test
    void getInvitesForMemberActivity_someAcceptedInvites_returnsAllInvites() {
        // GIVEN
        List<Invite> expectedInvites = new ArrayList<>();
        Member member = testDataProvider.createMember();

        for (int i = 0; i < 3; i++) {
            Event event = testDataProvider.createEvent();
            expectedInvites.add(testDataProvider.createAcceptedInviteForEvent(event, member.getId()));
        }

        for (int i = 0; i < 3; i++) {
            Event event = testDataProvider.createEvent();
            expectedInvites.add(testDataProvider.createRejectedInviteForEvent(event, member.getId()));
        }

        // WHEN
        List<Invite> result = getInvitesForMemberActivity.handleRequest(member.getId());

        // THEN
        assertEquals(
            expectedInvites.size(),
            result.size(),
            "Expected to receive same number of invites for event, but received: " + result
        );
        assertTrue(
            result.containsAll(expectedInvites),
            String.format("Expected all invites for event (%s) to be returned but received: %s", expectedInvites, result)
        );
    }
}
