package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.ProductMapper;
import ssm.pojo.Product;

import java.util.List;

@Service
public class productsCategoryService {

    @Autowired
    private ProductMapper productMapper;

    @Transactional(readOnly = true)
    public List<Product> pCategory(String cid){
        List<Product> pCategory = productMapper.selectByCid(cid);
        return pCategory;
    }

}
