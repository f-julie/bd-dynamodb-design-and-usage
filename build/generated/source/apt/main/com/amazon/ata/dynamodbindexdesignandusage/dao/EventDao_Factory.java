package com.amazon.ata.dynamodbindexdesignandusage.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EventDao_Factory implements Factory<EventDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public EventDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public EventDao get() {
    return new EventDao(mapperProvider.get());
  }

  public static EventDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new EventDao_Factory(mapperProvider);
  }
}
