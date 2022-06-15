package com.example.androidclassapllication;

import android.util.JsonReader;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {


        FavoriteFoods firstFavoriteFood = new FavoriteFoods(R.drawable.burger, "pizza", 2500, "yummy");
        FavoriteFoods secondFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"burger",100,"green");
        FavoriteFoods thirdFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"vegetable",100,"green");
        FavoriteFoods fourthFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"Indomie",100,"green");
        FavoriteFoods fifthFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"Rice",100,"green");

        System.out.println( "fisrt "+ firstFavoriteFood.foodName);
        System.out.println( "second "+ secondFavoriteFood.foodName);

        ArrayList<FavoriteFoods> myFavoriteFoods = new ArrayList<>();
        myFavoriteFoods.add(firstFavoriteFood);
        myFavoriteFoods.add(secondFavoriteFood);
        myFavoriteFoods.add(thirdFavoriteFood);
        myFavoriteFoods.add(fourthFavoriteFood);
        myFavoriteFoods.add(fifthFavoriteFood);


        System.out.println( "MY LIST = "+ myFavoriteFoods.size());


    }
}
