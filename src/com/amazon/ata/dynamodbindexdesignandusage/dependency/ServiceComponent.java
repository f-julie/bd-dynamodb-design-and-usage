package com.amazon.ata.dynamodbindexdesignandusage.dependency;

import com.amazon.ata.dynamodbindexdesignandusage.activity.CancelEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateInviteActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.DeleteMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetAcceptedInvitesForEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetAttendingEventsForMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetEventsForOrganizerActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInviteActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInvitesForEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInvitesForMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetMemberActivity;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Declares the dependency roots that Dagger will provide.
 */
@Singleton
@Component(modules = DaoModule.class)
public interface ServiceComponent {
    DeleteMemberActivity provideDeleteMemberActivity();
    CreateMemberActivity provideCreateMemberActivity();
    GetMemberActivity provideGetMemberActivity();

    GetInviteActivity provideGetInviteActivity();
    GetInvitesForMemberActivity provideGetInvitesForMemberActivity();
    GetAcceptedInvitesForEventActivity provideGetAcceptedInvitesForEventActivity();
    GetInvitesForEventActivity provideGetInvitesForEventActivity();
    CreateInviteActivity provideCreateInviteActivity();
    GetAttendingEventsForMemberActivity provideGetAttendingEventsForMemberActivity();

    GetEventActivity provideGetEventActivity();
    CreateEventActivity provideCreateEventActivity();
    CancelEventActivity provideCancelEventActivity();
    GetEventsForOrganizerActivity provideGetEventsForOrganizerActivity();
}
