package com.amazon.ata.dynamodbindexdesignandusage.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InviteDao_Factory implements Factory<InviteDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public InviteDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public InviteDao get() {
    return new InviteDao(mapperProvider.get());
  }

  public static InviteDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new InviteDao_Factory(mapperProvider);
  }
}
