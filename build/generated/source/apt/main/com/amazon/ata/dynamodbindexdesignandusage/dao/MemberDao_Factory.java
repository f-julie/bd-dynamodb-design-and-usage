package com.amazon.ata.dynamodbindexdesignandusage.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MemberDao_Factory implements Factory<MemberDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public MemberDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public MemberDao get() {
    return new MemberDao(mapperProvider.get());
  }

  public static MemberDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new MemberDao_Factory(mapperProvider);
  }
}
