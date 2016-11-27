package io.rai.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rai on 16/11/27.
 */
public class LocalizedString {
  private Map<String, String> values;

  /**
   * Instantiates a new Localized string.
   */
  public LocalizedString() {
    this.values = new HashMap<>();
  }

  /**
   * Gets values.
   *
   * @return the values
   */
  public Map<String, String> getValues() {
    return values;
  }

  /**
   * Sets values.
   *
   * @param values the values
   */
  public void setValues(Map<String, String> values) {
    this.values = values;
  }

  /**
   * Put localized string.
   *
   * @param key   the key
   * @param value the value
   * @return the localized string
   */
  public LocalizedString put(String key, String value) {
    this.values.put(key, value);
    return this;
  }

  /**
   * Clear.
   */
  public void clear() {
    this.values.clear();
    this.values = new HashMap<>();
  }

  @Override
  public String toString() {
    return "LocalizedString{" +
        "values=" + values +
        '}';
  }
}
