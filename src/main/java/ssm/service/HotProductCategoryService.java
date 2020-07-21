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
        productExample.setOrderByClause("is_hot DESC,pid DESC LIMIT 0,8");
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPnameLike("%"+query+"%");
        List<Product> hotProductList = productMapper.selectByExample(productExample);
        return hotProductList;
    }

    /**
     * 这个productCategory是那个category的，代表大标签，就“手机”这种
     * @return
     */
    @Transactional(readOnly = true)
    public List<Category> findCategory(){
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andCidLike("%%");
        List<Category> productCategory = categoryMapper.selectByExample(categoryExample);
        return productCategory;
    }


    @Transactional(readOnly = true)
    public List<Product> selectByName(String cid,String query){
        if(query == null){
            query = "";
        }
        if(cid == null){
            cid = "1";
        }
        List<Product> selectProductList = productMapper.selectByExampleAndCid(cid, query);
        return selectProductList;
    }
}
