package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.ProductMapper;
import ssm.page.pageVo;
import ssm.pojo.Product;

import java.util.List;

@Service
public class productsCategoryService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 这个pCategory是详细的每个大分类下的商品的列表
     * @param
     * @return
     */
    @Transactional(readOnly = true)
    public pageVo pCategory(String cid,Integer pageNow){
        //未进行分页搜索查询列表，则默认查询第一页
        if(pageNow == null){
            pageNow = 1;
        }
        Integer begin = (pageNow-1)*3;
        List<Product> pCategory = productMapper.selectByCid(cid,begin);
        Integer myCounts = productMapper.countByCid(cid);
        //总页数
        Integer myPages = (Integer)(myCounts%3==0 ? myCounts/3 : myCounts/3+1);
        //封装pageVO
        pageVo vo = new pageVo(pageNow,myPages,cid,begin,pCategory);
        return vo;
    }
}
