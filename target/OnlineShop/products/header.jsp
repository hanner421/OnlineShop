<%--
  Created by IntelliJ IDEA.
  User: ruyi
  Date: 2020/7/17
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<link type="text/css" rel="stylesheet" href="../css/style.css"/>

<!-- TOP HEADER -->
<div id="top-header">
    <div class="container">
        <ul class="header-links pull-left">
            <li><a href="#"><i class="fa fa-phone"></i> +820-820-8820</a></li>
            <li><a href="#"><i class="fa fa-envelope-o"></i> email@123456.com</a></li>
            <li><a href="#"><i class="fa fa-map-marker"></i> 武汉市友谊大道</a></li>
        </ul>
        <ul class="header-links pull-right">
            <li><a href="register.jsp"><i class="fa fa-register"></i> 注册</a></li>
            <li><a href="login.jsp"><i class="fa fa-login"></i> 登陆</a></li>
            <li><a href="user.jsp"><i class="fa fa-user-o"></i> 个人信息</a></li>
        </ul>
    </div>
</div>
<!-- /TOP HEADER -->

<!-- MAIN HEADER -->
<div id="header">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">
            <!-- LOGO -->
            <div class="col-md-3">
                <div class="header-logo">
                    <a href="#" class="logo">
                        <img src="http://demo.qfpffmp.cn/cssthemes5/twts_93_electro/img/logo.png" alt="">
                    </a>
                </div>
            </div>
            <!-- /LOGO -->

            <!-- SEARCH BAR -->
            <div class="col-md-6">
                <div class="header-search">
                    <form>
                        <select class="input-select">
                            <option value="0">所有商品</option>
                            <option value="1">手机数码</option>
                            <option value="1">运动户外</option>
                            <option value="1">电脑办公</option>
                            <option value="1">家具家居</option>
                            <option value="1">鞋靴箱包</option>
                            <option value="1">图书音像</option>
                            <option value="1">aaaa</option>
                            <option value="1">母婴孕婴</option>
                            <option value="1">汽车用品</option>
                        </select>
                        <input class="input" placeholder="Search here">
                        <button type="submit" class="search-btn">搜索</button>
                    </form>
                </div>
            </div>
            <!-- /SEARCH BAR -->

            <div class="col-md-3 clearfix">

                <div class="header-ctn">
                    <div>
                        <a href="order_list.jsp">
                            <i class="fa fa-heart-o"></i>
                            <span>订单</span>
                        </a>
                    </div>

                    <div class="menu-toggle">
                        <a href="cart.jsp">
                            <i class="fa fa-bars"></i>
                            <span>购物车</span>
                        </a>
                    </div>

                    <div class="browse-history">
                        <a href="browse-history.jsp">
                            <i class="fa fa-bars"></i>
                            <span>浏览历史</span>
                        </a>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</header>
<!-- /HEADER -->

<%--商品分类标签--%>
<nav id="navigation">
    <div class="container">
        <div id="responsive-nav">
            <ul class="main-nav nav navbar-nav">
                <li class="active"><a href="#">首页</a></li>

                <%--展现商品分类菜单--%>
                <c:forEach items="${categoryList }" var="category">
                    <li><a href="productList?cid=${category.cid }">${category.cname }</a></li>
                </c:forEach>

            </ul>
        </div>
    </div>
</nav>
