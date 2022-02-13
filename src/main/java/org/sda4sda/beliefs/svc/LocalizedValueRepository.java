package org.sda4sda.beliefs.svc;

import org.springframework.data.mongodb.repository.MongoRepository;

import reactor.core.publisher.Mono;

public interface LocalizedValueRepository extends MongoRepository<LocalizedValue, String> {

  public Mono<LocalizedValue> findByLocaleAndKey(String locale, String key);

}
