package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetAcceptedInvitesForEventActivity_Factory
    implements Factory<GetAcceptedInvitesForEventActivity> {
  private final Provider<InviteDao> inviteDaoProvider;

  public GetAcceptedInvitesForEventActivity_Factory(Provider<InviteDao> inviteDaoProvider) {
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public GetAcceptedInvitesForEventActivity get() {
    return new GetAcceptedInvitesForEventActivity(inviteDaoProvider.get());
  }

  public static GetAcceptedInvitesForEventActivity_Factory create(
      Provider<InviteDao> inviteDaoProvider) {
    return new GetAcceptedInvitesForEventActivity_Factory(inviteDaoProvider);
  }
}
