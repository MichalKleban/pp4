package pl.mkleban.sales;

import org.junit.jupiter.api.Test;
public class CollectingProductsTest {
    @Test
    void itAllowsToCollectProductsToCart(){
        Sales sales = thereIsSalesModule();
        String productId = thereIsProduct();
        String customer = thereIsCustomer("Michał");


        sales.addToCart(customer, productId);


        assertThereIsNProductsInCustomerCart(customer, 1);
    }

    private Sales thereIsSalesModule(){
        return new Sales;
    }

    privte void assertThereIsNProductsInCustomerCart(customer, int productsCount){

    }

    private String thereIsCustomer(String customerId){
        return customerId;
    }
    private  String thereIsProduct(){
        return UUID.randomUUID().toString();
    }

}