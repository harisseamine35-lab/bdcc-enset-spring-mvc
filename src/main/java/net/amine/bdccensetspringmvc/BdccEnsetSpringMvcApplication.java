package net.amine.bdccensetspringmvc;

import net.amine.bdccensetspringmvc.entities.Products;
import net.amine.bdccensetspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //->ils regardent les dependences
@SpringBootApplication
public class BdccEnsetSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(BdccEnsetSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args ->{
            productRepository.save(Products.builder() // ajouter des produits a la base de donner
                    .name("Computer")
                    .price(5400)
                    .quantity(12)
                    .build());
            productRepository.save(Products.builder()
                    .name("Printer")
                    .price(1200)
                    .quantity(11)
                    .build());
            productRepository.save(Products.builder()
                    .name("Smart phone")
                    .price(12000)
                    .quantity(12)
                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });





        };

    }
}
