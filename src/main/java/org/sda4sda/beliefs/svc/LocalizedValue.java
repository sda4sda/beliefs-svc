package org.sda4sda.beliefs.svc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;

@CompoundIndexes({
  @CompoundIndex(name = "locale_key", def = "{'locale': 1, 'key': 1}")
})
public class LocalizedValue {

  @Id
  public String id;

  public String locale;

  @Indexed(unique = true)
  public String key;
  
  public String value;

  public LocalizedValue() {}

  public LocalizedValue(String locale, String key, String value) {
    this.locale = locale;
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return String.format( "LocalizedValue[id=%s, locale=%s, key='%s', value='%s']", id, locale, key, value);
  }

}