package org.caioocardoso.strategy;

import java.util.ArrayList;
import java.util.List;

public class ECommerceShoppingCart {
    private List<ProductProtocol> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct(ProductProtocol product){
        products.add(product);
    }

    public List<ProductProtocol> getProducts(){
        return products;
    }

    public Integer getTotalPrice(){
        Integer totalPrice = 0;
        for (ProductProtocol product : products){
            totalPrice += product.price;
        }
        return totalPrice;
    }

    public Integer getTotalWithDiscount(){
        return discountStrategy.getTotalPriceWithDiscount(this);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
