package com.intvdn.javaStarter.ExtandsBirds;

public class Ostrich extends Birds{
    private int weight;
    private double height;
    private String category;
    private boolean toLayEggs;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isToLayEggs() {
        return toLayEggs;
    }

    public void setToLayEggs(boolean toLayEggs) {
        this.toLayEggs = toLayEggs;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void PrintINFo(){
        super.printInfo();
        System.out.println("Weight;" +" " + weight);
        System.out.println("Height;" + " " +  height);
        System.out.println("Category;" + " " + category);
        System.out.println("ToLayEggs;" + " " +  (toLayEggs == true ? "Yes": "No"));
    }
}
