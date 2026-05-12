package com.example.grama_vaxi.presentation.viewmodel;

import com.example.grama_vaxi.domain.usecase.MarkAlertReadUseCase;
import com.example.grama_vaxi.domain.usecase.ObserveAlertsUseCase;
import com.example.grama_vaxi.domain.usecase.ObserveUpcomingVaccinesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class NotificationsViewModel_Factory implements Factory<NotificationsViewModel> {
  private final Provider<ObserveAlertsUseCase> observeAlertsUseCaseProvider;

  private final Provider<ObserveUpcomingVaccinesUseCase> observeUpcomingVaccinesUseCaseProvider;

  private final Provider<MarkAlertReadUseCase> markAlertReadUseCaseProvider;

  private NotificationsViewModel_Factory(
      Provider<ObserveAlertsUseCase> observeAlertsUseCaseProvider,
      Provider<ObserveUpcomingVaccinesUseCase> observeUpcomingVaccinesUseCaseProvider,
      Provider<MarkAlertReadUseCase> markAlertReadUseCaseProvider) {
    this.observeAlertsUseCaseProvider = observeAlertsUseCaseProvider;
    this.observeUpcomingVaccinesUseCaseProvider = observeUpcomingVaccinesUseCaseProvider;
    this.markAlertReadUseCaseProvider = markAlertReadUseCaseProvider;
  }

  @Override
  public NotificationsViewModel get() {
    return newInstance(observeAlertsUseCaseProvider.get(), observeUpcomingVaccinesUseCaseProvider.get(), markAlertReadUseCaseProvider.get());
  }

  public static NotificationsViewModel_Factory create(
      Provider<ObserveAlertsUseCase> observeAlertsUseCaseProvider,
      Provider<ObserveUpcomingVaccinesUseCase> observeUpcomingVaccinesUseCaseProvider,
      Provider<MarkAlertReadUseCase> markAlertReadUseCaseProvider) {
    return new NotificationsViewModel_Factory(observeAlertsUseCaseProvider, observeUpcomingVaccinesUseCaseProvider, markAlertReadUseCaseProvider);
  }

  public static NotificationsViewModel newInstance(ObserveAlertsUseCase observeAlertsUseCase,
      ObserveUpcomingVaccinesUseCase observeUpcomingVaccinesUseCase,
      MarkAlertReadUseCase markAlertReadUseCase) {
    return new NotificationsViewModel(observeAlertsUseCase, observeUpcomingVaccinesUseCase, markAlertReadUseCase);
  }
}
