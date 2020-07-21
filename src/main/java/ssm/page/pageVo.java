package ssm.page;

import ssm.pojo.Product;

import java.util.List;

public class pageVo {
        private Integer pageNow;   //当前页
        private Integer myPages;   //总页数
        private String cid;   //查询的分类值
        private Integer begin;     //每页起始值
        private List<Product> productList;  //每页记录

        public pageVo() {
        }

        public pageVo(Integer pageNow, Integer myPages, String cid, Integer begin,List<Product> productList) {
            this.pageNow = pageNow;
            this.myPages = myPages;
            this.cid = cid;
            this.begin = begin;
            this.productList = productList;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public Integer getPageNow() {
            return pageNow;
        }

        public void setPageNow(Integer pageNow) {
            this.pageNow = pageNow;
        }

        public Integer getMyPages() {
            return myPages;
        }

        public void setMyPages(Integer myPages) {
            this.myPages = myPages;
        }

        public Integer getBegin() {
            return begin;
        }

        public void setBegin(Integer begin) {
            this.begin = begin;
        }

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        @Override
        public String toString() {
            return "PageVO{" +
                    "pageNow=" + pageNow +
                    ", myPages=" + myPages +
                    ", cid=" + cid +
                    ", begin=" + begin +
                    ", itemsList=" + productList +
                    '}';
        }

}
