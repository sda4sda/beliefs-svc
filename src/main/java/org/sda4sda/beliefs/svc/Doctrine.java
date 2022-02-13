package org.sda4sda.beliefs.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import reactor.core.publisher.Mono;
@Document
public class Doctrine {

  @Id
  public String id;

  @Indexed(unique = true)
  public Integer order;
  
  public String name;

  @Transient
  public String localizedName;

  public Doctrine() {}

  public Doctrine(Integer order, String name) {
    this.order = order;
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Doctrine[id='%s', order='%s', name='%s']", id, order, name);
  }

  @Autowired
  public Mono<Doctrine> toLocalized(String locale, LocalizedValueRepository localizedValueRepository) {

    return localizedValueRepository.findByLocaleAndKey(locale, this.name)
      .map(localizedName -> {
        this.localizedName = localizedName.value;

        return this;
      });
  }

}
