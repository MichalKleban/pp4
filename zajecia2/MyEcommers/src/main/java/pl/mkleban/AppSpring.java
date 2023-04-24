package pl.mkleban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.mkleban.productcatalog.HashMapProductStorage;
import pl.mkleban.productcatalog.ProductCatalog;

import java.math.BigDecimal;

@SpringBootApplication
public class AppSpring {
    public static void main(String[] args){
        SpringApplication.run(AppSpring.class, args);
    }

    @Bean
    ProductCatalog createProductCatalog(){
        ProductCatalog  productCatalog = new ProductCatalog(new HashMapProductStorage());

        String product1 = productCatalog.addProduct("My ebook", "nice one");
        productCatalog.assignImage(product1, "image/ebook.jpeg");
        productCatalog.changePrice(product1, BigDecimal.valueOf(20.20));
        productCatalog.publishProduct(product1);

        String product2 = productCatalog.addProduct("Other ebook", "even nicer one");
        productCatalog.assignImage(product2, "image/ebook.jpeg");
        productCatalog.changePrice(product2, BigDecimal.valueOf(30.20));
        productCatalog.publishProduct(product2);

        return productCatalog;
    }
}
