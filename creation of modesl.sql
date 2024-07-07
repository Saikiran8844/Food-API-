use conn_recipe;

CREATE TABLE Recipe (
    recipe_id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    restaurant_id VARCHAR(255)
);

CREATE TABLE Ingredient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    value VARCHAR(255),
    recipe_id VARCHAR(255),
    FOREIGN KEY (recipe_id) REFERENCES Recipe(recipe_id)
);
