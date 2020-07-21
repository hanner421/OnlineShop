package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Category;
import ssm.pojo.Product;
import ssm.service.HotProductCategoryService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class HotProductCategoryController {

    @Autowired
    private HotProductCategoryService service;

    @RequestMapping("/products.action")
    private String findAll(String query, String cid,Model model){
        List<Product> hotProductList = service.findAll(query);
        List<Product> selectProductList = service.selectByName(cid, query);
        List<Category> productCategory = service.findCategory();
        model.addAttribute("productCategory",productCategory);
        model.addAttribute("hotProductList",hotProductList);
        model.addAttribute("selectProductList",selectProductList);
        return "test.jsp";
    }

    @RequestMapping("/productsCategory.action")
    private String findCategory(Model model){
        List<Category> productCategory = service.findCategory();
        model.addAttribute("productCategory",productCategory);
        return "testCategory.jsp";
    }

}
