package com.example.informationbook;

//this class is for how the data will be displayed on the screen

public class ModelClass {

    private String imageName;
    private String CategoryName;

    public ModelClass(String imageName, String categoryName) {
        this.imageName = imageName;
        CategoryName = categoryName;
    }

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return CategoryName;
    }
}
