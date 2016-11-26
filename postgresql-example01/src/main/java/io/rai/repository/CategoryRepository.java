package io.rai.repository;

import io.rai.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rai on 16/11/26.
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
