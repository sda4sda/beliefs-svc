package org.sda4sda.beliefs.svc;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctrineRepository extends ReactiveMongoRepository<Doctrine, String> {

}
