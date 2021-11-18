package com.example.pw25s.controller;

import com.example.pw25s.model.ProdutoSalvarDTO;
import com.example.pw25s.model.enums.StatusPedido;
import com.example.pw25s.repository.PedidoRepository;
import com.example.pw25s.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;


    @GetMapping("")
    public String produtos(Model model){
        model.addAttribute("produtos",  produtoRepository.findAll());
        return "produto/homeproduto";
    }


    @GetMapping("/cadastro")
    public String novoProduto(ProdutoSalvarDTO produtoSalvarDTO){
        return "produto/produtoformulario";
    }

    @PostMapping(value = "/save")
    public String salvarPedido(@Valid ProdutoSalvarDTO produtoSalvarDTO, BindingResult result,Model model){
        if(!result.hasErrors()) {
            produtoRepository.save(produtoSalvarDTO.toProduto());
        }
        model.addAttribute("produtos",  produtoRepository.findAll());

        return "produto/homeproduto";
    }
}
