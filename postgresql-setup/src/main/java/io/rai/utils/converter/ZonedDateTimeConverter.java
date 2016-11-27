package io.rai.utils.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by rai on 16/11/26.
 */
@Converter(autoApply = true)
public class ZonedDateTimeConverter implements AttributeConverter<ZonedDateTime, String> {
  private static DateTimeFormatter FORMATTER_FROM_DB = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm:ss.nnn xxx");
  private static DateTimeFormatter FORMATTER_TO_DB = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm:ss.nnn xxx");

  @Override
  public String convertToDatabaseColumn(ZonedDateTime attribute) {
    if (attribute == null) {
      return null;
    }
    String result = attribute.toString();
    return result;
  }

  @Override
  public ZonedDateTime convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      return null;
    }
    return ZonedDateTime.parse(dbData);
  }
}
