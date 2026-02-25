package org.caioocardoso.strategy;

public class ChristmasDiscount extends DiscountStrategy {
    float discount = 50;

    @Override
    public Integer getTotalPriceWithDiscount(ECommerceShoppingCart shoppingCart) {
        float totalPrice = shoppingCart.getTotalPrice();
        totalPrice = totalPrice * ((100 - discount) / 100);
        return (int) totalPrice;
    }
}
