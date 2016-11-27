package io.rai.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Created by rai on 16/11/26.
 */
@Entity
@Table(name = "category")
@EntityListeners(AuditingEntityListener.class)
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column
  private String name;

  @CreatedDate
  @Column(name = "created_date")
  private ZonedDateTime createdAt;

  @LastModifiedDate
  @Column(name = "last_modified_date")
  private ZonedDateTime lastModifiedAt;

  /**
   * Gets id.
   *
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets created at.
   *
   * @return the created at
   */
  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets created at.
   *
   * @param createdAt the created at
   */
  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Gets last modified at.
   *
   * @return the last modified at
   */
  public ZonedDateTime getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Sets last modified at.
   *
   * @param lastModifiedAt the last modified at
   */
  public void setLastModifiedAt(ZonedDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  @Override
  public String toString() {
    return "Category{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", createdAt=" + createdAt +
        ", lastModifiedAt=" + lastModifiedAt +
        '}';
  }
}
