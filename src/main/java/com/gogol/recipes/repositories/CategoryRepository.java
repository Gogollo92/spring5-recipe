package com.gogol.recipes.repositories;

import com.gogol.recipes.domain.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
  
  Optional<Category> findByDescription(String description);

}
