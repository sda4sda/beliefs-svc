package org.sda4sda.beliefs.svc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Doctrine {

  @Id
  public String id;

  @Indexed(unique = true)
  public Integer order;
  
  public String name;

  public Doctrine() {}

  public Doctrine(Integer order, String name) {
    this.order = order;
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Doctrine[id='%s', order='%s', name='%s']", id, order, name);
  }

}
