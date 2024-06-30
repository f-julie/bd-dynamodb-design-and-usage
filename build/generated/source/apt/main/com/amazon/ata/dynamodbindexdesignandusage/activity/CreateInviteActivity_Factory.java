package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateInviteActivity_Factory implements Factory<CreateInviteActivity> {
  private final Provider<InviteDao> inviteDaoProvider;

  public CreateInviteActivity_Factory(Provider<InviteDao> inviteDaoProvider) {
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public CreateInviteActivity get() {
    return new CreateInviteActivity(inviteDaoProvider.get());
  }

  public static CreateInviteActivity_Factory create(Provider<InviteDao> inviteDaoProvider) {
    return new CreateInviteActivity_Factory(inviteDaoProvider);
  }
}
