package com.example.androidclassapllication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class FoodHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_home_page);
        ArrayList<FavoriteFoods> myFavoriteFoods = new ArrayList<>();
        FavoriteFoodsAdapter favoriteFoodsAdapter = new FavoriteFoodsAdapter(myFavoriteFoods);
        RecyclerView recyclerView = findViewById(R.id.fvoriteRecycler);
        recyclerView.setAdapter(favoriteFoodsAdapter);


        FavoriteFoods firstFavoriteFood = new FavoriteFoods(R.drawable.burger, "pizza", 2500, "yummy");
        FavoriteFoods secondFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"burger",100,"green");
        FavoriteFoods thirdFavoriteFood = new FavoriteFoods(R.drawable.burger,"vegetable",100,"green");
        FavoriteFoods fourthFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"Indomie",100,"green");
        FavoriteFoods fifthFavoriteFood = new FavoriteFoods(R.drawable.burger,"Rice",100,"green");





        myFavoriteFoods.add(firstFavoriteFood);
        myFavoriteFoods.add(secondFavoriteFood);
        myFavoriteFoods.add(thirdFavoriteFood);
        myFavoriteFoods.add(fourthFavoriteFood);
        myFavoriteFoods.add(fifthFavoriteFood);
    }
}