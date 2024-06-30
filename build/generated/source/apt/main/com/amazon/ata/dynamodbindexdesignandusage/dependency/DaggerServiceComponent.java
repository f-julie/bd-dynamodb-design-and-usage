package com.amazon.ata.dynamodbindexdesignandusage.dependency;

import com.amazon.ata.dynamodbindexdesignandusage.activity.CancelEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateInviteActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.CreateMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.DeleteMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetAcceptedInvitesForEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetAttendingEventsForMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetEventsForOrganizerActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInviteActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInvitesForEventActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetInvitesForMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.activity.GetMemberActivity;
import com.amazon.ata.dynamodbindexdesignandusage.dao.EventDao;
import com.amazon.ata.dynamodbindexdesignandusage.dao.InviteDao;
import com.amazon.ata.dynamodbindexdesignandusage.dao.MemberDao;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
  private Provider<DynamoDBMapper> provideDynamoDBMapperProvider;

  private DaggerServiceComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ServiceComponent create() {
    return new Builder().build();
  }

  private MemberDao getMemberDao() {
    return new MemberDao(provideDynamoDBMapperProvider.get());
  }

  private InviteDao getInviteDao() {
    return new InviteDao(provideDynamoDBMapperProvider.get());
  }

  private EventDao getEventDao() {
    return new EventDao(provideDynamoDBMapperProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideDynamoDBMapperProvider =
        DoubleCheck.provider(DaoModule_ProvideDynamoDBMapperFactory.create(builder.daoModule));
  }

  @Override
  public DeleteMemberActivity provideDeleteMemberActivity() {
    return new DeleteMemberActivity(getMemberDao(), getInviteDao());
  }

  @Override
  public CreateMemberActivity provideCreateMemberActivity() {
    return new CreateMemberActivity(getMemberDao());
  }

  @Override
  public GetMemberActivity provideGetMemberActivity() {
    return new GetMemberActivity(getMemberDao());
  }

  @Override
  public GetInviteActivity provideGetInviteActivity() {
    return new GetInviteActivity(getInviteDao());
  }

  @Override
  public GetInvitesForMemberActivity provideGetInvitesForMemberActivity() {
    return new GetInvitesForMemberActivity(getInviteDao(), getEventDao());
  }

  @Override
  public GetAcceptedInvitesForEventActivity provideGetAcceptedInvitesForEventActivity() {
    return new GetAcceptedInvitesForEventActivity(getInviteDao());
  }

  @Override
  public GetInvitesForEventActivity provideGetInvitesForEventActivity() {
    return new GetInvitesForEventActivity(getInviteDao());
  }

  @Override
  public CreateInviteActivity provideCreateInviteActivity() {
    return new CreateInviteActivity(getInviteDao());
  }

  @Override
  public GetAttendingEventsForMemberActivity provideGetAttendingEventsForMemberActivity() {
    return new GetAttendingEventsForMemberActivity(getEventDao(), getInviteDao());
  }

  @Override
  public GetEventActivity provideGetEventActivity() {
    return new GetEventActivity(getEventDao());
  }

  @Override
  public CreateEventActivity provideCreateEventActivity() {
    return new CreateEventActivity(getEventDao());
  }

  @Override
  public CancelEventActivity provideCancelEventActivity() {
    return new CancelEventActivity(getEventDao());
  }

  @Override
  public GetEventsForOrganizerActivity provideGetEventsForOrganizerActivity() {
    return new GetEventsForOrganizerActivity(getEventDao());
  }

  public static final class Builder {
    private DaoModule daoModule;

    private Builder() {}

    public ServiceComponent build() {
      if (daoModule == null) {
        this.daoModule = new DaoModule();
      }
      return new DaggerServiceComponent(this);
    }

    public Builder daoModule(DaoModule daoModule) {
      this.daoModule = Preconditions.checkNotNull(daoModule);
      return this;
    }
  }
}
