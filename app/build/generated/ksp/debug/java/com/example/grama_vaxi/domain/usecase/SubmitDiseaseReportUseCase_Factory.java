package com.example.grama_vaxi.domain.usecase;

import com.example.grama_vaxi.domain.repository.ReportRepository;
import com.example.grama_vaxi.domain.repository.SyncScheduler;
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
public final class SubmitDiseaseReportUseCase_Factory implements Factory<SubmitDiseaseReportUseCase> {
  private final Provider<ReportRepository> reportRepositoryProvider;

  private final Provider<SyncScheduler> syncSchedulerProvider;

  private SubmitDiseaseReportUseCase_Factory(Provider<ReportRepository> reportRepositoryProvider,
      Provider<SyncScheduler> syncSchedulerProvider) {
    this.reportRepositoryProvider = reportRepositoryProvider;
    this.syncSchedulerProvider = syncSchedulerProvider;
  }

  @Override
  public SubmitDiseaseReportUseCase get() {
    return newInstance(reportRepositoryProvider.get(), syncSchedulerProvider.get());
  }

  public static SubmitDiseaseReportUseCase_Factory create(
      Provider<ReportRepository> reportRepositoryProvider,
      Provider<SyncScheduler> syncSchedulerProvider) {
    return new SubmitDiseaseReportUseCase_Factory(reportRepositoryProvider, syncSchedulerProvider);
  }

  public static SubmitDiseaseReportUseCase newInstance(ReportRepository reportRepository,
      SyncScheduler syncScheduler) {
    return new SubmitDiseaseReportUseCase(reportRepository, syncScheduler);
  }
}
