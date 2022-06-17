package com.garimp.garimp.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garimp.garimp.models.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    ArrayList<Produto> produtos = new ArrayList<>();
    @GetMapping    
    public ArrayList<Produto> getProdutos(){
        Produto produto = new Produto(1, 200, "P", "inverno");
        this.produtos.add(produto);
        
        return this.produtos;


    }
}


