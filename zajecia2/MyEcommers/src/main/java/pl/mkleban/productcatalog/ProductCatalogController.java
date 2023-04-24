package pl.mkleban.productcatalog;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ProductCatalogController {

    private ProductCatalog catalog;

    ProductCatalogController(ProductCatalog catalog){
        this.catalog = catalog;
    }

    @GetMapping("/api/products")
    List<Product> allProducts(){
        return catalog.allPublishedProducts();
    }


}
