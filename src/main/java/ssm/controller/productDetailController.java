package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Product;
import ssm.service.productDetailService;

@Controller
@RequestMapping(value = "/productdetail.action")
public class productDetailController {

    @Autowired
    private productDetailService proDetailService;

    public String productDetail(Product product, String pid, Model model){
        product = proDetailService.findProductBypid(pid);
        model.addAttribute("product",product);
        return "";
    }

}
