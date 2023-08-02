package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.ProductBean;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



@FeignClient(name = "gateway-server", url = "localhost:9004")
public interface MicroserviceProduitsProxy {
    @GetMapping(value = "/api/produits/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping( value = "/api/produits/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

    @GetMapping( value = "/api/produits/ProduitsTest")
    String testUnProduit();

}
