package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CancelEventActivity_Factory implements Factory<CancelEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public CancelEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public CancelEventActivity get() {
    return new CancelEventActivity(eventDaoProvider.get());
  }

  public static CancelEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new CancelEventActivity_Factory(eventDaoProvider);
  }
}
