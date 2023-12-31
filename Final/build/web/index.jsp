
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ include file="notify.jsp" %>
<c:choose>
    <c:when test="${sessionScope.account != null}">
        <%@ include file="user.jsp" %>
    </c:when>
    <c:otherwise>
        <%@ include file="modallink.jsp" %>
    </c:otherwise>
</c:choose>
<%@ include file="search.jsp" %>
<%@ include file="cart.jsp" %>
<%@ include file="category.jsp" %>
<%@ include file="home-filter.jsp" %>
<%@ include file="home-product.jsp" %>
<%@ include file="footer.jsp" %>
<%@ include file="register.jsp" %>
<%@ include file="login.jsp" %>

