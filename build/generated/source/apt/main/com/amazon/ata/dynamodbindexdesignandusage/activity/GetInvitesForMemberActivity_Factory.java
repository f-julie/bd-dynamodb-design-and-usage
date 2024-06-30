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
public final class GetInvitesForMemberActivity_Factory
    implements Factory<GetInvitesForMemberActivity> {
  private final Provider<InviteDao> inviteDaoProvider;

  private final Provider<EventDao> eventDaoProvider;

  public GetInvitesForMemberActivity_Factory(
      Provider<InviteDao> inviteDaoProvider, Provider<EventDao> eventDaoProvider) {
    this.inviteDaoProvider = inviteDaoProvider;
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetInvitesForMemberActivity get() {
    return new GetInvitesForMemberActivity(inviteDaoProvider.get(), eventDaoProvider.get());
  }

  public static GetInvitesForMemberActivity_Factory create(
      Provider<InviteDao> inviteDaoProvider, Provider<EventDao> eventDaoProvider) {
    return new GetInvitesForMemberActivity_Factory(inviteDaoProvider, eventDaoProvider);
  }
}
