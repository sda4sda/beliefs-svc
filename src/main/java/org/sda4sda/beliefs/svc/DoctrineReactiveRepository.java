package org.sda4sda.beliefs.svc;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DoctrineReactiveRepository extends ReactiveMongoRepository<Doctrine, String> {

}
