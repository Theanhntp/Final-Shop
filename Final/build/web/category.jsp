
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- category.jsp  -->
<div class="app__container">
    <div class="grid">
        <div class="grid__row app__content">
            <div class="grid__col-2">
                <nav class="category">
                    <h3 class="category__heading"><i class="fas fa-list category__heading-icon"></i>Danh mục
                    </h3>
                    <ul class="category-list">
                        <li class="category-item"> <!--category-item--active-->                           
                            <a href="loadpage" class="category-item__link">Tất cả sản phẩm</a>
                        </li>
                        
                        <c:forEach items="${requestScope.categoryList}" var="category">
                            <li class="category-item">
                                 <img src="${category.image}" alt="">
                                <a href="filterproduct?action=${category.name}" class="category-item__link">${category.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </nav>
            </div>
            