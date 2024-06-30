package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetInvitesForEventActivity_Factory
    implements Factory<GetInvitesForEventActivity> {
  private final Provider<InviteDao> inviteDaoProvider;

  public GetInvitesForEventActivity_Factory(Provider<InviteDao> inviteDaoProvider) {
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public GetInvitesForEventActivity get() {
    return new GetInvitesForEventActivity(inviteDaoProvider.get());
  }

  public static GetInvitesForEventActivity_Factory create(Provider<InviteDao> inviteDaoProvider) {
    return new GetInvitesForEventActivity_Factory(inviteDaoProvider);
  }
}
