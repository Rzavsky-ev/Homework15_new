package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 10);
        Product pear = new Product("Груша", 100);
        Product banana = new Product("Банан", 30);

        Basket basket = new Basket();

        //добавление в корзину
        basket.addProduct(apple);
        basket.addProduct(pear);
        basket.addProduct(banana);
        basket.addProduct(apple);
        basket.addProduct(apple);

        //добавление в полную корзину
        basket.addProduct(pear);

        //получение стоимости корзины
        System.out.println(basket.calculateBasketAmount());

        //поиск товара, который есть в корзине
        System.out.println(basket.checkAvailability("Яблоко"));

        //поиск товара, которого нет в корзине
        System.out.println(basket.checkAvailability("Лимон"));

        //очистка корзины
        basket.clearingBasket();

        //печать пустой корзины
        basket.printBasket();

        //стоимость пустой корзины
        System.out.println(basket.calculateBasketAmount());

        //поиск товара в постой корзине
        System.out.println(basket.checkAvailability("Яблоко"));

    }
}