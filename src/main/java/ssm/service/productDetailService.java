package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.ProductMapper;
import ssm.pojo.Product;

@Service
public class productDetailService {

    @Autowired
    private ProductMapper productMapper;

    @Transactional(readOnly = true)
    public Product findProductBypid(String pid){
        productMapper.updateIsHOt(pid);
        Product product = productMapper.selectByPrimaryKey(pid);
        return product;
    }

}
