package com.amazon.ata.dynamodbindexdesignandusage.integration.helper;

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
import com.amazon.ata.dynamodbindexdesignandusage.dependency.DaggerServiceComponent;
import com.amazon.ata.dynamodbindexdesignandusage.dependency.ServiceComponent;

public final class ActivityProvider {
    private static final ServiceComponent DAGGER = DaggerServiceComponent.create();

    private ActivityProvider() {
    }

    public static DeleteMemberActivity provideDeleteMemberActivity() {
        return DAGGER.provideDeleteMemberActivity();
    }
    public static CreateMemberActivity provideCreateMemberActivity() {
        return DAGGER.provideCreateMemberActivity();
    }
    public static GetMemberActivity provideGetMemberActivity() {
        return DAGGER.provideGetMemberActivity();
    }

    public static GetInviteActivity provideGetInviteActivity() {
        return DAGGER.provideGetInviteActivity();
    }
    public static GetInvitesForMemberActivity provideGetInvitesForMemberActivity() {
        return DAGGER.provideGetInvitesForMemberActivity();
    }
    public static GetAcceptedInvitesForEventActivity provideGetAcceptedInvitesForEventActivity() {
        return DAGGER.provideGetAcceptedInvitesForEventActivity();
    }
    public static GetInvitesForEventActivity provideGetInvitesForEventActivity() {
        return DAGGER.provideGetInvitesForEventActivity();
    }
    public static CreateInviteActivity provideCreateInviteActivity() {
        return DAGGER.provideCreateInviteActivity();
    }
    public static GetAttendingEventsForMemberActivity provideGetAttendingEventsForMemberActivity() {
        return DAGGER.provideGetAttendingEventsForMemberActivity();
    }

    public static GetEventActivity provideGetEventActivity() {
        return DAGGER.provideGetEventActivity();
    }
    public static CreateEventActivity provideCreateEventActivity() {
        return DAGGER.provideCreateEventActivity();
    }
    public static CancelEventActivity provideCancelEventActivity() {
        return DAGGER.provideCancelEventActivity();
    }
    public static GetEventsForOrganizerActivity provideGetEventsForOrganizerActivity() {
        return DAGGER.provideGetEventsForOrganizerActivity();
    }
}
