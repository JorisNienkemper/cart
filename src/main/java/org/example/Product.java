package org.example;

public class Product extends Object{
    private String name;
    private int price;

    public Product(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Product)) return false;

        Product product =(Product) obj;
        if(this.name.equalsIgnoreCase(product.name) && this.price == product.price){
            return true;
        }else{
            return false;
        }
    }
}
