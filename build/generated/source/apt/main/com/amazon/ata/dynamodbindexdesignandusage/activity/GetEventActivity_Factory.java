package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetEventActivity_Factory implements Factory<GetEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public GetEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetEventActivity get() {
    return new GetEventActivity(eventDaoProvider.get());
  }

  public static GetEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new GetEventActivity_Factory(eventDaoProvider);
  }
}
