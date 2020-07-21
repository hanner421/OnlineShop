package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.page.pageVo;
import ssm.pojo.Product;
import ssm.service.productsCategoryService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class productsCategoryController {

    @Autowired
    private productsCategoryService productsCategoryService;

    @RequestMapping("/pCategory.action")
    public String pCategory(String cid, Integer pageNow,Model model){
        pageVo pVo = productsCategoryService.pCategory(cid,pageNow);
        model.addAttribute("pVo",pVo);
        return "testCategory.jsp";
    }

}
