package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetAttendingEventsForMemberActivity_Factory
    implements Factory<GetAttendingEventsForMemberActivity> {
  private final Provider<EventDao> eventDaoProvider;

  private final Provider<InviteDao> inviteDaoProvider;

  public GetAttendingEventsForMemberActivity_Factory(
      Provider<EventDao> eventDaoProvider, Provider<InviteDao> inviteDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public GetAttendingEventsForMemberActivity get() {
    return new GetAttendingEventsForMemberActivity(eventDaoProvider.get(), inviteDaoProvider.get());
  }

  public static GetAttendingEventsForMemberActivity_Factory create(
      Provider<EventDao> eventDaoProvider, Provider<InviteDao> inviteDaoProvider) {
    return new GetAttendingEventsForMemberActivity_Factory(eventDaoProvider, inviteDaoProvider);
  }
}
