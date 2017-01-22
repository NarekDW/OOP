package com.epam.courses.oop.t04;

import com.epam.courses.oop.t02.product.Product;
import java.util.Comparator;

/**
 * Created by Narek on 17.01.2017.
 */
public class ProductCompare implements Comparator<Product> {
    private ProductEnum sortingRule;

    public ProductCompare(){

    }

    public ProductCompare(ProductEnum sortingRule){
        this.sortingRule = sortingRule;
    }

    public ProductCompare setSortingRule(ProductEnum sortingRule) {
        this.sortingRule = sortingRule;
        return this;
    }


    @Override
    public int compare(Product one, Product two) {
        switch(sortingRule){
            case PRICE:
                return Double.compare(one.getPrice(), two.getPrice());
            case NAME:
                return one.getName().compareToIgnoreCase(two.getName());
            case PRICE_AND_NAME:
                if(Double.compare(one.getPrice(), two.getPrice()) == 0)
                    return one.getName().compareToIgnoreCase(two.getName());
                return Double.compare(one.getPrice(), two.getPrice());
            default:
                throw new RuntimeException("Illegal Enum");
        }
    }
}
