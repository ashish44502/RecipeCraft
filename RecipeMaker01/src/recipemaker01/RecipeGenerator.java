/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recipemaker01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;



/**
 *
 * @author A
 */




public class RecipeGenerator extends javax.swing.JFrame {

    
    
    
     private static final Map<String, List<Recipe>> RECIPE_DATABASE = initializeRecipeDatabase();
    
    
    // Method to initialize the recipe database
    private static Map<String, List<Recipe>> initializeRecipeDatabase() {
        
        
        Map<String, List<Recipe>> database = new HashMap<>();
        

        
              // Italian recipes---------------------------------------------
            
        List<Recipe> italianRecipes = new ArrayList<>();
        italianRecipes.add(new Recipe("Spaghetti Carbonara", 
                 List.of("spaghetti", "eggs", "pancetta", "parmesan cheese", "black pepper"),
                 "1. Cook pasta\n 2. Fry pancetta\n 3. Mix eggs with cheese\n 4. Combine all ingredients")); // Added category
        
    italianRecipes.add(new Recipe("Margherita Pizza", 
        List.of("pizza dough", "tomato sauce", "mozzarella", "basil"), 
        "1. Roll out dough\n 2. Add sauce and toppings\n 3. Bake at 220°C for 12 minutes")); // Added category


// Risotto alla Milanese
        italianRecipes.add(new Recipe("Risotto alla Milanese",
           List.of("arborio rice", "saffron", "white wine", "chicken stock", "butter", "parmesan", "onion"),
          "1. Sauté onion\n2. Toast rice\n3. Deglaze with wine\n4. Add stock gradually\n5. Stir in saffron and finish with butter/parmesan"
        ));

//Lasagna Bolognese
        italianRecipes.add(new Recipe("Lasagna Bolognese",
    List.of("lasagna sheets", "ground beef", "tomato sauce", "béchamel sauce", "onion", "carrot", "celery", "parmesan"),
     "1. Make ragù\n2. Layer sheets with sauces\n3. Bake at 180°C for 45 minutes"
));
        
        
        

//Tiramisu
        italianRecipes.add(new Recipe("Tiramisu",
        List.of("ladyfingers", "mascarpone", "eggs", "espresso", "cocoa powder", "sugar"),
        "1. Dip cookies in coffee\n2. Layer with mascarpone cream\n3. Dust with cocoa\n4. Chill overnight"));

//Osso Buco
        italianRecipes.add(new Recipe("Osso Buco",
            List.of("veal shanks", "white wine", "stock", "tomato paste", "carrot", "onion", "celery", "gremolata"),
                 "1. Brown veal\n2. Sauté vegetables\n3. Braise with liquids\n4. Serve with gremolata"));

//Minestrone Soup
        italianRecipes.add(new Recipe(
    "Minestrone Soup",
        List.of("mixed vegetables", "beans", "pasta", "tomatoes", "garlic", "onion", "olive oil", "parmesan"),
            "1. Sauté aromatics\n2. Add vegetables\n3. Simmer with stock\n4. Add pasta/beans\n5. Serve with parmesan"));

//Panna Cotta
        italianRecipes.add(new Recipe("Panna Cotta",
            List.of("heavy cream", "sugar", "vanilla", "gelatin", "berries"),
            "1. Heat cream with sugar\n2. Bloom gelatin\n3. Combine and chill\n4. Serve with berry sauce"));

//Fettuccine Alfredo
        italianRecipes.add(new Recipe("Fettuccine Alfredo",
            List.of("fettuccine", "butter", "heavy cream", "parmesan", "nutmeg", "black pepper"),
             "1. Cook pasta\n2. Make sauce with butter/cream\n3. Toss with pasta and cheese"
        ));

//Caprese Salad
        italianRecipes.add(new Recipe( "Caprese Salad",
             List.of("fresh mozzarella", "tomatoes", "basil", "olive oil", "balsamic glaze", "salt"),
                        "1. Slice mozzarella and tomatoes\n2. Layer with basil\n3. Drizzle with oil/balsamic"));

        database.put("Italian", italianRecipes);
        

        // Mexican recipes--------------------------------------------------------
        
        List<Recipe> mexicanRecipes = new ArrayList<>();
        mexicanRecipes.add(new Recipe("Chicken Tacos", 
            List.of("chicken breast", "taco shells", "lettuce", "tomato", "cheese", "sour cream"), 
            "1. Season and cook chicken\n 2. Warm taco shells\n 3. Assemble with toppings"));

        mexicanRecipes.add(new Recipe("Guacamole", 
            List.of("avocado", "lime", "onion", "tomato", "cilantro"), 
            "1. Mash avocados\n 2. Mix with other ingredients\n 3. Season to taste"));
        
        
        
        database.put("Mexican", mexicanRecipes);

        // Asian recipes------------------------------------------------------------
  
        
        List<Recipe> asianRecipes = new ArrayList<>();
        

        
        
        asianRecipes.add(new Recipe("Vegetable Stir Fry", 
           List.of("rice", "mixed vegetables", "soy sauce", "garlic", "ginger"), 
           "1. Cook rice\n 2. Stir fry vegetables with garlic and ginger\n 3. Add sauce"));
        asianRecipes.add(new Recipe("Chicken Curry", 
            List.of("chicken", "curry paste", "coconut milk", "onion", "potatoes"), 
            "1. Brown chicken\n 2. Add vegetables and curry paste\n 3. Simmer in coconut milk"));
        database.put("Asian", asianRecipes);
        
        
        
                // Indian Cuisine----------------------------------------------------------------
        List<Recipe> indianRecipes = new ArrayList<>();
        // Breakfast
        indianRecipes.add(new Recipe("Masala Dosa", 
            List.of("rice flour", "lentils", "potatoes", "onion", "spices"),
            "1. Make batter and ferment\n2. Spread on griddle\n3. Add potato filling\n4. Serve with chutney"));
        // Lunch
        indianRecipes.add(new Recipe("Thali", 
            List.of("rice", "dal", "vegetables", "chapati", "yogurt", "pickle"),
            "1. Prepare all components\n2. Serve together on platter"
          ));
        // Dinner
        indianRecipes.add(new Recipe("Butter Chicken", 
            List.of("chicken", "tomato", "cream", "butter", "spices"),
            "1. Marinate chicken\n2. Cook in tomato sauce\n3. Finish with cream"
        ));
        database.put("Indian", indianRecipes);

        // Japanese Cuisine
        List<Recipe> japaneseRecipes = new ArrayList<>();
        // Breakfast
        japaneseRecipes.add(new Recipe("Tamagoyaki", 
            List.of("eggs", "sugar", "soy sauce", "mirin"),
            "1. Mix ingredients\n2. Cook in layers\n3. Roll and slice"
        ));
        // Lunch
        japaneseRecipes.add(new Recipe("Bento Box", 
            List.of("rice", "fish", "vegetables", "pickles"),
            "1. Prepare all components\n2. Arrange in box"
        ));
        // Dinner
        japaneseRecipes.add(new Recipe("Sukiyaki", 
            List.of("beef", "tofu", "vegetables", "noodles", "sukiyaki sauce"),
            "1. Simmer ingredients in broth\n2. Dip in raw egg (optional)"
        ));
        database.put("Japanese", japaneseRecipes);


        // Bangladeshi Cuisine
        List<Recipe> bangladeshiRecipes = new ArrayList<>();

        // ========== BREAKFAST ========== //
        bangladeshiRecipes.add(new Recipe(
            "Paratha with Dal",  
            List.of("flour", "oil", "salt", "lentils", "onion", "garlic", "turmeric", "cumin"),
            "1. Knead dough and roll parathas\n2. Pan-fry until golden\n3. Cook dal with spices\n4. Serve hot"

        ));

        bangladeshiRecipes.add(new Recipe(
            "Chira with Gur & Banana",  
            List.of("flattened rice (chira)", "jaggery (gur)", "banana", "coconut", "milk"),
            "1. Soak chira in water\n2. Mix with jaggery and banana\n3. Top with coconut and milk"

        ));

        bangladeshiRecipes.add(new Recipe(
            "Khichuri (Breakfast Style)",  
            List.of("rice", "lentils", "ginger", "turmeric", "cumin", "bay leaves", "ghee"),
            "1. Cook rice and lentils with spices\n2. Temper with ghee and cumin\n3. Serve with fried egg"
        ));

        // ========== LUNCH ========== //
        bangladeshiRecipes.add(new Recipe(
            "Bhorta Platter",  
            List.of("fish/shrimp", "eggplant", "potato", "mustard oil", "onion", "green chili"),
            "1. Boil/grind main ingredient\n2. Mash with spices, onion, chili\n3. Season with mustard oil"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Morog Polao (Chicken Pulao)",  
            List.of("basmati rice", "chicken", "yogurt", "ginger-garlic paste", "cardamom", "cloves", "ghee"),
            "1. Marinate chicken in yogurt\n2. Cook rice with whole spices\n3. Layer and dum-cook"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Shorshe Ilish (Hilsa in Mustard Sauce)",  
            List.of("hilsa fish", "mustard paste", "green chili", "turmeric", "mustard oil"),
            "1. Marinate fish in mustard paste\n2. Steam or fry lightly\n3. Cook in mustard gravy"
        ));

        // ========== DINNER ========== //
        bangladeshiRecipes.add(new Recipe(
            "Mutton Rezala",  
            List.of("mutton", "onion", "ginger paste", "garlic paste", "yogurt", "poppy seed paste", "ghee"),
            "1. Brown mutton with onions\n2. Add yogurt and spice paste\n3. Slow-cook until tender"

        ));

        bangladeshiRecipes.add(new Recipe(
            "Panta Bhat with Fried Hilsa",  
            List.of("leftover rice", "water", "hilsa fish", "mustard oil", "onion", "green chili"),
            "1. Soak rice overnight\n2. Fry hilsa with turmeric\n3. Serve with raw onion/chili"

        ));

        bangladeshiRecipes.add(new Recipe(
            "Beef Tehari",  
            List.of("beef", "rice", "garlic", "ginger", "cinnamon", "cloves", "biriyani masala"),
            "1. Cook beef with spices\n2. Layer with parboiled rice\n3. Dum-cook on low heat"

        ));




        //bangladeshiRecipes----------------------------------------------------------------


        // ========== RICE DISHES ========== //
        bangladeshiRecipes.add(new Recipe(
            "Kacchi Biryani",
            List.of("basmati rice", "mutton", "yogurt", "garlic", "ginger", "biriyani masala", "saffron", "ghee"),
            "1. Marinate mutton with yogurt and spices overnight\n" +
            "2. Parboil rice with whole spices\n" +
            "3. Layer mutton and rice in handi\n" +
            "4. Dum cook for 2 hours on low heat"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Tehari (Beef Pulao)",
            List.of("rice", "beef", "potato", "garlic", "ginger", "turmeric", "cumin", "bay leaves"),
            "1. Brown beef with spices\n" +
            "2. Add potatoes and rice\n" +
            "3. Cook with measured water\n" +
            "4. Steam covered for 20 minutes"
        ));

        // ========== FISH DISHES ========== //
        bangladeshiRecipes.add(new Recipe(
            "Shorshe Ilish",
            List.of("hilsa fish", "mustard paste", "green chili", "turmeric", "mustard oil"),
            "1. Marinate fish with mustard paste and turmeric\n" +
            "2. Heat mustard oil until smoking\n" +
            "3. Add fish and chilies\n" +
            "4. Cook covered for 10 minutes"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Pabda Jhol",
            List.of("pabda fish", "turmeric", "cumin", "coriander", "green chili", "mustard oil"),
            "1. Fry fish lightly in mustard oil\n" +
            "2. Temper oil with spices\n" +
            "3. Add water and simmer\n" +
            "4. Add fish back and cook 5 minutes"
        ));

        // ========== VEGETARIAN DISHES ========== //
        bangladeshiRecipes.add(new Recipe(
            "Shobji Bhorta",
            List.of("mixed vegetables", "mustard oil", "onion", "green chili", "salt"),
            "1. Boil vegetables until soft\n" +
            "2. Mash coarsely\n" +
            "3. Mix with raw onion, chili\n" +
            "4. Season with mustard oil"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Dal Fry",
            List.of("lentils", "garlic", "onion", "cumin", "red chili", "ghee"),
            "1. Cook lentils until soft\n" +
            "2. Temper with fried garlic\n" +
            "3. Add onion and spices\n" +
            "4. Finish with ghee"
        ));

        // ========== STREET FOODS ========== //
        bangladeshiRecipes.add(new Recipe(
            "Fuchka",
            List.of("semolina", "potato", "chickpeas", "tamarind water", "green chili", "cumin"),
            "1. Make hollow puris with semolina\n" +
            "2. Fill with spiced potato\n" +
            "3. Top with chickpeas\n" +
            "4. Pour tamarind water before eating"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Jhalmuri",
            List.of("puffed rice", "chanachur", "mustard oil", "onion", "cucumber", "green chili"),
            "1. Mix puffed rice with chanachur\n" +
            "2. Add chopped vegetables\n" +
            "3. Season with mustard oil\n" +
            "4. Toss well and serve"
        ));

        // ========== DESSERTS ========== //
        bangladeshiRecipes.add(new Recipe(
            "Payesh",
            List.of("rice", "milk", "sugar", "cardamom", "bay leaves", "nuts"),
            "1. Boil rice in milk\n" +
            "2. Add sugar and spices\n" +
            "3. Cook until thickened\n" +
            "4. Garnish with nuts"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Chomchom",
            List.of("cottage cheese", "sugar syrup", "saffron", "cardamom", "pistachio"),
            "1. Knead chenna into oval shapes\n" +
            "2. Boil in sugar syrup\n" +
            "3. Soak overnight\n" +
            "4. Coat with mawa"
        ));

        // ========== SPECIAL OCCASION ========== //
        bangladeshiRecipes.add(new Recipe(
            "Morog Polao",
            List.of("chicken", "basmati rice", "ghee", "yogurt", "garlic", "ginger", "whole spices"),
            "1. Marinate chicken in yogurt\n" +
            "2. Fry with whole spices\n" +
            "3. Layer with rice\n" +
            "4. Dum cook for 30 minutes"
        ));

        bangladeshiRecipes.add(new Recipe(
            "Bhuna Khichuri",
            List.of("rice", "lentils", "ginger", "garlic", "turmeric", "cumin", "ghee"),
            "1. Fry spices in ghee\n" +
            "2. Add rice and lentils\n" +
            "3. Cook with measured water\n" +
            "4. Serve with fried eggplant"
        ));

        database.put("Bangladeshi", bangladeshiRecipes);



        //greekRecipes-------------------------------------------------------------------------

            List<Recipe> greekRecipes = new ArrayList<>();

        // Main Dishes
        greekRecipes.add(new Recipe(
            "Moussaka",
            List.of("eggplant", "potatoes", "ground lamb", "tomato sauce", "béchamel sauce", "cinnamon"),
            "1. Layer fried eggplant/potatoes\n2. Add spiced lamb mixture\n3. Top with béchamel\n4. Bake until golden"
        ));

        greekRecipes.add(new Recipe(
            "Souvlaki",
            List.of("pork shoulder", "olive oil", "lemon juice", "oregano", "garlic", "pita bread"),
            "1. Marinate meat overnight\n2. Skewer and grill\n3. Serve with tzatziki in pita"
        ));

        // Appetizers
        greekRecipes.add(new Recipe(
            "Spanakopita",
            List.of("phyllo dough", "spinach", "feta cheese", "dill", "eggs", "butter"),
            "1. Sauté spinach with herbs\n2. Mix with feta\n3. Layer in phyllo\n4. Bake until crispy"
        ));

        // Desserts
        greekRecipes.add(new Recipe(
            "Baklava",
            List.of("phyllo dough", "walnuts", "cinnamon", "honey syrup", "cloves", "butter"),
            "1. Layer phyllo with nuts\n2. Cut diamond shapes\n3. Bake and pour cold syrup"
        ));

        database.put("Greek", greekRecipes);



        //thaiRecipes--------------------------------------------------------------------------


            List<Recipe> thaiRecipes = new ArrayList<>();

        // Curries
        thaiRecipes.add(new Recipe(
            "Tom Yum Goong",
            List.of("shrimp", "lemongrass", "kaffir lime leaves", "galangal", "chili", "mushrooms"),
            "1. Boil aromatics\n2. Add shrimp\n3. Finish with lime juice\n4. Top with cilantro"
        ));

        thaiRecipes.add(new Recipe(
            "Pad Thai",
            List.of("rice noodles", "tamarind paste", "fish sauce", "shrimp", "bean sprouts", "peanuts"),
            "1. Soak noodles\n2. Make sauce\n3. Stir-fry with eggs\n4. Garnish with lime"
        ));

        // Salads
        thaiRecipes.add(new Recipe(
            "Som Tum",
            List.of("green papaya", "green beans", "tomatoes", "peanuts", "fish sauce", "lime"),
            "1. Pound garlic/chilies\n2. Shred papaya\n3. Mix all ingredients\n4. Serve immediately"
        ));

        // Desserts
        thaiRecipes.add(new Recipe(
            "Mango Sticky Rice",
            List.of("glutinous rice", "coconut milk", "mango", "sesame seeds", "salt"),
            "1. Steam rice\n2. Mix with coconut sauce\n3. Serve with mango slices"
        ));


        database.put("Thai", thaiRecipes);



        //frenchRecipes----------------------------------------------------------------------------------

        List<Recipe> frenchRecipes = new ArrayList<>();

        // Classics
        frenchRecipes.add(new Recipe(
            "Boeuf Bourguignon",
            List.of("beef chuck", "red wine", "mushrooms", "pearl onions", "bacon", "carrots"),
            "1. Brown beef\n2. Deglaze with wine\n3. Slow-cook 3 hours\n4. Add vegetables last"
        ));

        frenchRecipes.add(new Recipe(
            "Ratatouille",
            List.of("eggplant", "zucchini", "bell peppers", "tomatoes", "herbes de Provence"),
            "1. Sauté vegetables separately\n2. Layer in casserole\n3. Bake until tender"
        ));

        // Pastries
        frenchRecipes.add(new Recipe(
            "Croissants",
            List.of("butter", "flour", "yeast", "milk", "sugar", "salt"),
            "1. Make dough\n2. Fold butter layers\n3. Proof and bake\n4. 3-day process"
        ));

        // Desserts
        frenchRecipes.add(new Recipe(
            "Crème Brûlée",
            List.of("heavy cream", "vanilla bean", "egg yolks", "sugar", "torched sugar"),
            "1. Heat cream with vanilla\n2. Temper eggs\n3. Bake in water bath\n4. Caramelize top"
        ));

        database.put("French", frenchRecipes);




    //chineseRecipes-----------------------------------------------------------------------------------


        List<Recipe> chineseRecipes = new ArrayList<>();

    // Sichuan (Spicy)
        chineseRecipes.add(new Recipe(
            "Mapo Tofu",
            List.of("tofu", "ground pork", "doubanjiang", "Sichuan peppercorns", "chili oil", "garlic"),
            "1. Sauté pork with spicy bean paste\n2. Add tofu cubes gently\n3. Thicken sauce\n4. Finish with numbing peppercorns"
        ));

        // Cantonese (Steamed)
        chineseRecipes.add(new Recipe(
            "Dim Sum Har Gow",
            List.of("shrimp", "wheat starch", "tapioca starch", "bamboo shoots", "lard"),
            "1. Make translucent dough\n2. Fill with shrimp mixture\n3. Pleat wrappers\n4. Steam 5 mins"
        ));

        // Beijing (Imperial)
        chineseRecipes.add(new Recipe(
            "Peking Duck",
            List.of("whole duck", "hoisin sauce", "pancakes", "scallions", "maltose syrup"),
            "1. Air-dry duck 24hrs\n2. Glaze and roast\n3. Serve with thin pancakes"
        ));

        // Shanghai (Braised)
        chineseRecipes.add(new Recipe(
            "Hong Shao Rou",
            List.of("pork belly", "dark soy", "rock sugar", "Shaoxing wine", "ginger"),
            "1. Caramelize sugar\n2. Braise pork 2hrs\n3. Reduce sauce to glaze"
        ));

        // Street Food
        chineseRecipes.add(new Recipe(
            "Jianbing",
            List.of("mung bean flour", "egg", "hoisin", "crispy wonton", "scallions"),
            "1. Spread batter thin\n2. Crack egg on top\n3. Add sauces\n4. Fold with crunch"
        ));

        database.put("Chinese", chineseRecipes);





        //middleEasternRecipes--------------------------------------------------------------------------------


        List<Recipe> middleEasternRecipes = new ArrayList<>();

        // Levantine
        middleEasternRecipes.add(new Recipe(
            "Fattoush",
            List.of("pita bread", "sumac", "cucumber", "tomato", "pomegranate molasses", "mint"),
            "1. Toast pita chips\n2. Chop vegetables\n3. Toss with sumac dressing"
        ));

        // Persian
        middleEasternRecipes.add(new Recipe(
            "Fesenjan",
            List.of("chicken", "pomegranate molasses", "walnuts", "onion", "turmeric"),
            "1. Brown chicken\n2. Grind walnuts\n3. Simmer 2hrs until sauce darkens"
        ));

        // Turkish
        middleEasternRecipes.add(new Recipe(
            "Iskender Kebab",
            List.of("lamb", "pita", "tomato sauce", "yogurt", "brown butter"),
            "1. Grill sliced lamb\n2. Layer over bread\n3. Drizzle with sauces"
        ));

        // Egyptian
        middleEasternRecipes.add(new Recipe(
            "Koshari",
            List.of("rice", "lentils", "macaroni", "crispy onions", "tomato sauce"),
            "1. Cook components separately\n2. Layer in bowl\n3. Top with onions"
        ));

        // Dessert
        middleEasternRecipes.add(new Recipe(
            "Kunafa",
            List.of("kataifi dough", "akawi cheese", "rose water", "simple syrup", "pistachios"),
            "1. Layer cheese between dough\n2. Bake until golden\n3. Soak in syrup"
        ));

        database.put("Middle Eastern", middleEasternRecipes);
       
        
        
       /* 
        // Ingredient to search for
        String searchIngredient = "";

        // Filter and display recipes containing the ingredient
        System.out.println("Recipes containing '" + searchIngredient + "':");
        boolean found = false;

        for (Recipe recipe : italianRecipes) {
            if (recipe.getIngredients().contains(searchIngredient)) {

                found = true;
            }
        }

        if (!found) {
            //System.out.println("No recipes found with '" + searchIngredient + "'.");
        }
        
        */
       
       
    class Recipe {
    private String name;
    private List<String> ingredients;
    private String instructions;
    private String category;

    public Recipe(String name, List<String> ingredients, String instructions,String category) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.category = category;
        
    }

    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public String getInstructions() { return instructions; }
    public String getCategory() { return category; }

    }
        
        
        
        
        // Add more cuisines and recipes as needed...
        
        return database;
    }

    


    
    public static List<Recipe> generateRecipes(String ingredients, String cuisineType, String category) {
    List<Recipe> matchingRecipes = new ArrayList<>();
    String[] ingredientArray = ingredients.split(",");
    
    // Get recipes for the selected cuisine
    List<Recipe> cuisineRecipes = RECIPE_DATABASE.getOrDefault(cuisineType, new ArrayList<>());
    
    // Find recipes that match at least one ingredient AND the selected category
    for (Recipe recipe : cuisineRecipes) {
        // Skip if category doesn't match (unless "Any" is selected)
        if (!category.equals("Any") && !recipe.getName().equalsIgnoreCase(category)) {
            continue;
        }       
        for (String ingredient : ingredientArray) {
            if (recipe.containsIngredient(ingredient.trim().toLowerCase())) {
                matchingRecipes.add(recipe);
                break; // No need to check other ingredients for this recipe
            }
        }
    }
    
    // If no matches found with ingredients, return random recipes from the cuisine and category
    if (matchingRecipes.isEmpty() && !cuisineRecipes.isEmpty()) {
        Random rand = new Random();
        List<Recipe> filteredByCategory = cuisineRecipes.stream()
            .filter(r -> category.equals("Dinner") || r.getName().equalsIgnoreCase(category))
            .filter(r -> category.equals("Breakfast") || r.getName().equalsIgnoreCase(category))
            .filter(r -> category.equals("Lunch") || r.getName().equalsIgnoreCase(category))
            .filter(r -> category.equals("Any") || r.getName().equalsIgnoreCase(category))
            .collect(Collectors.toList());
            
        if (!filteredByCategory.isEmpty()) {
            int randomIndex = rand.nextInt(filteredByCategory.size());
            matchingRecipes.add(filteredByCategory.get(randomIndex));
        }
    }
    
    return matchingRecipes;
}
    
    
    
    
    
    // Recipe class to hold recipe information
    public static class Recipe {
        private String name;
        private List<String> ingredients;
        private String instructions;

        
        
        public Recipe(String name, List<String> ingredients, String instructions) {
            this.name = name;
            this.ingredients = new ArrayList<>(ingredients);
            this.instructions = instructions;
        }

      
        public boolean containsIngredient(String ingredient) {
            for (String item : ingredients) {
                if (item.toLowerCase().contains(ingredient.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
        

        
        // Getters
        public String getName() { return name; }
        public List<String> getIngredients() { return new ArrayList<>(ingredients); }
        public String getInstructions() { return instructions; }
        
        @Override
        public String toString() {
            return name;
        }
    }


    /**
     * Creates new form RecipeGenerator
     */
    
    
    
    public RecipeGenerator( ) {
        
                ImageIcon icon = new ImageIcon(getClass().getResource("logo.png"));
        setIconImage(icon.getImage());
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        CuisineF = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingreadientsSearch = new javax.swing.JTextArea();
        CategoryBox = new javax.swing.JComboBox<>();
        ClearBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultshow = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Let's Create Something Exciting!\n");

        BackBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 51));
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/back (3).png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("What ingredients do you have?");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Select your Category-");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Select your cuisine type-");

        SearchBtn.setBackground(new java.awt.Color(255, 102, 0));
        SearchBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/decision-making.png"))); // NOI18N
        SearchBtn.setText("Generate");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        CuisineF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CuisineF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American", "Bangladeshi", "Indian", "Greek", "Middle Eastern", "Mexican", "Japanese", "French", "Thai", "Chinese", "Italian", "Asian" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Items/cooking (1).png"))); // NOI18N

        ingreadientsSearch.setColumns(20);
        ingreadientsSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ingreadientsSearch.setLineWrap(true);
        ingreadientsSearch.setRows(5);
        ingreadientsSearch.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ingreadientsSearch);

        CategoryBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Breakfast", "Lunch", "Dinner", " " }));

        ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(204, 0, 0));
        ClearBtn.setText("Restore");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(CuisineF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BackBtn)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ClearBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuisineF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ClearBtn)
                .addGap(18, 18, 18)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jLabel2.getAccessibleContext().setAccessibleName("\tLet's Create Something Exciting!\n");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        resultshow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        resultshow.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane3.setViewportView(resultshow);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 430, 460));

        getAccessibleContext().setAccessibleName("RecipeGenerator");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void resultShowActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
         String newLine = System.lineSeparator();
        
    }                                                  
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        DashBoard DashBoardFrame =new DashBoard();
        DashBoardFrame.setVisible(true);
        DashBoardFrame.pack();
        DashBoardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        // Assuming you have these UI components:
// JTextField ingredientField;
// JComboBox<String> cuisineTypeComboBox;

// JButton searchButton;
// JTextArea resultArea;
// public class LoadingAnimationPage{





    SearchBtn.addActionListener(new ActionListener() {
        
        
           
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            SearchBtn.setText("Loading...");
            SearchBtn.setEnabled(false);
            
                        String ingredients = ingreadientsSearch.getText();
            String cuisineType = (String) CuisineF.getSelectedItem();
            String category = (String) CategoryBox.getSelectedItem();
            //generate 
                        List<RecipeGenerator.Recipe> recipes;
            recipes = RecipeGenerator.generateRecipes( ingredients,cuisineType, category);
            
            
            new Thread(() -> {
            try {
                Thread.sleep(3000); // Simulate a task (3 seconds)

            

          

            
            // Display results
            if (recipes.isEmpty()) {
                resultshow.setText("No recipes found. Try different ingredients or cuisine.");
                

                
            } else {
                StringBuilder resultText = new StringBuilder();
                for (RecipeGenerator.Recipe recipe : recipes) {
                    resultText.append("=== ").append(recipe.getName()).append(" ===\n");
                    //resultText.append("Category: ").append(recipe.getName()).append("\n");
                    resultText.append("Ingredients: ").append(String.join(", ", recipe.getIngredients())).append("\n");
                    resultText.append("Instructions:\n").append(recipe.getInstructions()).append("\n\n");
                }
                resultshow.setText(resultText.toString());
                
            }
                
                
                
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            // Re-enable button on Swing UI thread
            SwingUtilities.invokeLater(() -> {
                SearchBtn.setText("Generate");
                SearchBtn.setEnabled(true);
            });
        }).start();
            
    
           /*
            // Get user inputs
            String ingredients = ingreadientsSearch.getText();
            String cuisineType = (String) CuisineF.getSelectedItem();
            String category = (String) CategoryBox.getSelectedItem();
            

            // Generate recipes
            List<RecipeGenerator.Recipe> recipes;
            recipes = RecipeGenerator.generateRecipes( ingredients,cuisineType, category);
            
            // Display results
            if (recipes.isEmpty()) {
                resultshow.setText("No recipes found. Try different ingredients or cuisine.");
                

                
            } else {
                StringBuilder resultText = new StringBuilder();
                for (RecipeGenerator.Recipe recipe : recipes) {
                    resultText.append("=== ").append(recipe.getName()).append(" ===\n");
                    //resultText.append("Category: ").append(recipe.getName()).append("\n");
                    resultText.append("Ingredients: ").append(String.join(", ", recipe.getIngredients())).append("\n");
                    resultText.append("Instructions:\n").append(recipe.getInstructions()).append("\n\n");
                }
                resultshow.setText(resultText.toString());
                
            } */ 
        }
            

                   
    } );

    
    }//GEN-LAST:event_SearchBtnActionPerformed
            
    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        ingreadientsSearch.setText(null);
        CuisineF.setSelectedItem(null);
        CategoryBox.setSelectedItem(null);
        resultshow.setText(null);
    }//GEN-LAST:event_ClearBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JComboBox<String> CuisineF;
    private javax.swing.JButton SearchBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea ingreadientsSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane resultshow;
    // End of variables declaration//GEN-END:variables
}
