package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.MemberDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetMemberActivity_Factory implements Factory<GetMemberActivity> {
  private final Provider<MemberDao> memberDaoProvider;

  public GetMemberActivity_Factory(Provider<MemberDao> memberDaoProvider) {
    this.memberDaoProvider = memberDaoProvider;
  }

  @Override
  public GetMemberActivity get() {
    return new GetMemberActivity(memberDaoProvider.get());
  }

  public static GetMemberActivity_Factory create(Provider<MemberDao> memberDaoProvider) {
    return new GetMemberActivity_Factory(memberDaoProvider);
  }
}
