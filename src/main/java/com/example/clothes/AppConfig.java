package com.example.clothes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.example.clothes")
public class AppConfig {
    @Bean
    public ClothingService clothingService(ClothingRepository repository) {
        return new ClothingServiceImpl(repository);
    }

    @Bean
    public ClothingService discount(ClothingRepository repository) {
        return new Discount(repository);
    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public EagerSingleton eagerSingleton() {
        return new EagerSingleton();
    }

    @Bean
    @Lazy
    public LazySingleton lazySingleton() {
        return new LazySingleton();
    }
}
