package pl.kleban.michal.creditcard;

import org.junit.jupiter.api.Test;

public class ProductCatalogTest {
    @Test
    void itAllowsToLoadProductDetails(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct();

    }

    @Test
    void itDenyPublicitaionWithoutImageAndPrice(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct();

        assertThrows{
            ProductCantBePublishedException.class,
                    () -> catalog.publishProduct(productId);
        }
    }

    @Test
    void itDoesNotShowDraftProducts(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct();

        assertEquals(0, catalog.allPublishedProducts());

    }


}
