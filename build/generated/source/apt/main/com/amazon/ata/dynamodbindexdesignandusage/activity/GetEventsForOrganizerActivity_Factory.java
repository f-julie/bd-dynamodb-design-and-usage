package com.amazon.ata.dynamodbindexdesignandusage.activity;

import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetEventsForOrganizerActivity_Factory
    implements Factory<GetEventsForOrganizerActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public GetEventsForOrganizerActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetEventsForOrganizerActivity get() {
    return new GetEventsForOrganizerActivity(eventDaoProvider.get());
  }

  public static GetEventsForOrganizerActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new GetEventsForOrganizerActivity_Factory(eventDaoProvider);
  }
}
