package com.example.grama_vaxi.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class VaccineReminderWorker_AssistedFactory_Impl implements VaccineReminderWorker_AssistedFactory {
  private final VaccineReminderWorker_Factory delegateFactory;

  VaccineReminderWorker_AssistedFactory_Impl(VaccineReminderWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public VaccineReminderWorker create(Context p0, WorkerParameters p1) {
    return delegateFactory.get(p0, p1);
  }

  public static Provider<VaccineReminderWorker_AssistedFactory> create(
      VaccineReminderWorker_Factory delegateFactory) {
    return InstanceFactory.create(new VaccineReminderWorker_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<VaccineReminderWorker_AssistedFactory> createFactoryProvider(
      VaccineReminderWorker_Factory delegateFactory) {
    return InstanceFactory.create(new VaccineReminderWorker_AssistedFactory_Impl(delegateFactory));
  }
}
