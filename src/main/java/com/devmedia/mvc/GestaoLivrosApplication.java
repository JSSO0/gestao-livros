package com.devmedia.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = { "com.devmedia.mvc.controller" })
@EnableJpaRepositories(basePackages = { "com.devmedia.mvc.repository" })
@EntityScan(basePackages = { "com.devmedia.mvc.entity" }) // adicionado pacote da classe Livro
public class GestaoLivrosApplication {
      public static void main(String[] args) {
            SpringApplication.run(GestaoLivrosApplication.class, args);
      }
}