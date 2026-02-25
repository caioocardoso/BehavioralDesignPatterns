package org.caioocardoso.strategy;

public class DiscountStrategy {
    public Integer getTotalPriceWithDiscount(ECommerceShoppingCart shoppingCart){
        return shoppingCart.getTotalPrice();
    };
}
