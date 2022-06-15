package com.example.androidclassapllication;

public class FavoriteFoods {
    int foodImage = R.drawable.burger;
    String foodName = "burger";
    int price = 500;
    String foodDesc = "fresh patty";

    public FavoriteFoods(int foodImage, String foodName, int price, String foodDesc) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.price = price;
        this.foodDesc = foodDesc;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }


}
