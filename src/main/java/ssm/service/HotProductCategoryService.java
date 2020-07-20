package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.CategoryMapper;
import ssm.dao.ProductMapper;
import ssm.pojo.Category;
import ssm.pojo.CategoryExample;
import ssm.pojo.Product;
import ssm.pojo.ProductExample;

import java.util.List;

@Service
public class HotProductCategoryService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Transactional(readOnly = true)
    public List<Product> findAll(String query){
        if(query == null){
            query = "";
        }
        ProductExample productExample = new ProductExample();
        productExample.setOrderByClause("is_hot DESC,pid DESC LIMIT 0,1");
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPnameLike("%"+query+"%");
        List<Product> hotProductList = productMapper.selectByExample(productExample);
        return hotProductList;
    }

    @Transactional(readOnly = true)
    public List<Category> findCategory(){
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andCidLike("%%");
        List<Category> productCategory = categoryMapper.selectByExample(categoryExample);
        return productCategory;
    }
}
