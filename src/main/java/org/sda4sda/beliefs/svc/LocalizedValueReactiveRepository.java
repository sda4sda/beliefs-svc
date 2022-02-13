package org.sda4sda.beliefs.svc;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface LocalizedValueReactiveRepository extends ReactiveMongoRepository<LocalizedValue, String> {

  public Mono<LocalizedValue> findByLocaleAndKey(String locale, String key);

}
