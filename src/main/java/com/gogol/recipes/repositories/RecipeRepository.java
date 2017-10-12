package com.gogol.recipes.repositories;

import com.gogol.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
