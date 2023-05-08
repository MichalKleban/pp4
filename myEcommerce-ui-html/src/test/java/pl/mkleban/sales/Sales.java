package pl.mkleban;

import java.util.Optional;
public class Sales {
    private CartStorage cartStorage;
    private ProductDetailsProvidder productDetailsProvidder;

    public
    public void addToChart(String cusomerId, String productId){
        Cart customersCart = loadForCustomer(cusomerId)
                .orElse(Cart.empty());
        ProductCetails product = getProductDetails(productId)
                .orElseThrow(() -> new noSuchProductException);

        customersCart.add(product);

        cartStorage.save(customerId, customersCart);
    }
    private Optional<ProductDetails> getProductDetails(String )


    private Optional<Cart> loadForCustomer(String customerId){
        return cartStorage.load(customerId);
    }
}