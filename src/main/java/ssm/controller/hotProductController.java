package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Product;
import ssm.service.hotProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class hotProductController {

    @Autowired
    private hotProductService service;

    @RequestMapping("/findAll.action")
    private String findAll(String query, Model model){
        List<Product> productList = service.findAll(query);
        model.addAttribute("productList",productList);
        return "";
    }

}
