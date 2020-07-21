package ssm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Product;
import ssm.pojo.ProductExample;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    List<Product> selectByExampleAndCid(@Param("cid") String cid,@Param("query") String query);

    List<Product> selectByCid(@Param("cid") String cid,@Param("begin") int begin);

    int countByCid(String cid);

    Product selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int updateIsHOt(String pid);

}