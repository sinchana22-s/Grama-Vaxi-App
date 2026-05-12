package com.example.grama_vaxi.domain.usecase;

import com.example.grama_vaxi.domain.repository.AnimalRepository;
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
public final class ObserveAnimalsUseCase_Factory implements Factory<ObserveAnimalsUseCase> {
  private final Provider<AnimalRepository> animalRepositoryProvider;

  private ObserveAnimalsUseCase_Factory(Provider<AnimalRepository> animalRepositoryProvider) {
    this.animalRepositoryProvider = animalRepositoryProvider;
  }

  @Override
  public ObserveAnimalsUseCase get() {
    return newInstance(animalRepositoryProvider.get());
  }

  public static ObserveAnimalsUseCase_Factory create(
      Provider<AnimalRepository> animalRepositoryProvider) {
    return new ObserveAnimalsUseCase_Factory(animalRepositoryProvider);
  }

  public static ObserveAnimalsUseCase newInstance(AnimalRepository animalRepository) {
    return new ObserveAnimalsUseCase(animalRepository);
  }
}
