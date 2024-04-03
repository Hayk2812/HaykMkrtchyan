package com.intvdn.javaStarter.Extands;

public class Maybach extends car {
    private String company;
    private String founder;
    private  String successor; // iravahajord
    private String headquarters; // shtab
    private String products; //

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getSuccessor() {
        return successor;
    }

    public void setSuccessor(String successor) {
        this.successor = successor;
    }

    public void printINfo(){
        super.printInfo();
        System.out.println("Company;" + company);
        System.out.println("Founder;" + founder);
        System.out.println("Successor;" + successor);
        System.out.println("Headquarters;" + headquarters);
        System.out.println("Products;" + products);
    }
}
