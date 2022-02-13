package org.sda4sda.beliefs.svc;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface LocalizedValueRepository extends ReactiveMongoRepository<LocalizedValue, String> {

  public Mono<LocalizedValue> findByLocaleAndKey(String locale, String key);

}
