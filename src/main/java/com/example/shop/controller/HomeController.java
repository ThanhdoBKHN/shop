package com.example.shop.controller;

import com.example.shop.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    private final IProductService iProductService;

    public HomeController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @GetMapping("productList")
    public String productList(Model model){
        model.addAttribute("product", iProductService.getList());
        return "client/product/productlist";
    }
}
