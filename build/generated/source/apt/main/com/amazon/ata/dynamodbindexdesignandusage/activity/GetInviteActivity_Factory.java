package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetInviteActivity_Factory implements Factory<GetInviteActivity> {
  private final Provider<InviteDao> inviteDaoProvider;

  public GetInviteActivity_Factory(Provider<InviteDao> inviteDaoProvider) {
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public GetInviteActivity get() {
    return new GetInviteActivity(inviteDaoProvider.get());
  }

  public static GetInviteActivity_Factory create(Provider<InviteDao> inviteDaoProvider) {
    return new GetInviteActivity_Factory(inviteDaoProvider);
  }
}
