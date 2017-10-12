package com.gogol.recipes.service;

import com.gogol.recipes.domain.Recipe;
import java.util.Set;

public interface RecipeService {
  Set<Recipe> getRecipes();
}
