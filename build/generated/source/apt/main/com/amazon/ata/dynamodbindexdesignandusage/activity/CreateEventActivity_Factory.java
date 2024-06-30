package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreateEventActivity_Factory implements Factory<CreateEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public CreateEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public CreateEventActivity get() {
    return new CreateEventActivity(eventDaoProvider.get());
  }

  public static CreateEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new CreateEventActivity_Factory(eventDaoProvider);
  }
}
