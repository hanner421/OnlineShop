package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.ProductMapper;
import ssm.pojo.Product;
import ssm.pojo.ProductExample;

import java.util.List;

@Service
public class hotProductService {

    @Autowired
    private ProductMapper productMapper;

    @Transactional(readOnly = true)
    public List<Product> findAll(String query){
        if(query == null){
            query = "";
        }
        ProductExample productExample = new ProductExample();
        productExample.setOrderByClause("is_hot DESC,pid DESC");
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPnameLike("%"+query+"%");
        List<Product> productList = productMapper.selectByExample(productExample);
        return productList;
    }
}
