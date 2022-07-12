package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CartTests {

    @Test
    @DisplayName("What is a cart")
    void whatIsEenCart(){
        //Arrange
        Cart cart = new Cart();
        //Act
        cart.addProduct(new Product("pindakaasXL",7));
        cart.addProduct(new Product("appels",5));
        cart.addProduct(new Product("rijst",3));

        List<Object> productsInCart = cart.getObjectModel();

        for(Object product : productsInCart){
            System.out.println(((Product)product).getName());
        }
    }

    @Test
    @DisplayName("What is a cart")
    void useOfRemoveOnListInterface(){
        //Arrange
        Cart cart = new Cart();
        //Act
        cart.addProduct(new Product("pindakaasXL",7));

//        Product appels = new Product("appels", 5);
//        cart.addProduct(appels);
        cart.addProduct(new Product("appels", 5));

        cart.addProduct(new Product("rijst",3));

        List<Object> productsInCart = cart.getObjectModel();

        productsInCart.isEmpty();

        productsInCart.remove(new Product("appels", 5));

        for(Object product: productsInCart){
            System.out.println(((Product)product).getName());
        }
    }
}
