package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import com.amazon.ata.dynamodbindexdesignandusage.dao.MemberDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteMemberActivity_Factory implements Factory<DeleteMemberActivity> {
  private final Provider<MemberDao> memberDaoProvider;

  private final Provider<InviteDao> inviteDaoProvider;

  public DeleteMemberActivity_Factory(
      Provider<MemberDao> memberDaoProvider, Provider<InviteDao> inviteDaoProvider) {
    this.memberDaoProvider = memberDaoProvider;
    this.inviteDaoProvider = inviteDaoProvider;
  }

  @Override
  public DeleteMemberActivity get() {
    return new DeleteMemberActivity(memberDaoProvider.get(), inviteDaoProvider.get());
  }

  public static DeleteMemberActivity_Factory create(
      Provider<MemberDao> memberDaoProvider, Provider<InviteDao> inviteDaoProvider) {
    return new DeleteMemberActivity_Factory(memberDaoProvider, inviteDaoProvider);
  }
}
