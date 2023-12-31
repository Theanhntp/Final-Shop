
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- register.jsp -->
<!-- ------------Modal layout------------- -->
<div class="modal">
    <div class="modal__overlay"></div>
    <div class="modal__body">
        <!-- Register form    -->
        <div class="auth-form register">
            <div class="auth-form__container">
                <div class="auth-form__header">
                    <h3 class="auth-form__heading">Đăng ký</h3>
                    <span class="auth-form__switch-btn">Đăng nhập</span>
                </div>
                <form action="register" method="get">
                    <div class="auth-form__form">

                        <div class="auth-form__group">
                            <input type="text" class="auth-form__input" placeholder="Nhập tên của bạn" name="name" required>
                        </div>
                        <div class="auth-form__group">
                            <input type="text" class="auth-form__input" placeholder="Nhập số điện thoại của bạn" name="phone" required>
                        </div>
                        <div class="auth-form__group">
                            <input type="email" class="auth-form__input" placeholder="Nhập email của bạn" name="email" required>
                        </div>
                        <div class="auth-form__group">
                            <input type="password" class="auth-form__input" placeholder="Nhập mật khẩu của bạn" name="pass" required>
                        </div>
                        <div class="auth-form__group">
                            <input type="password" class="auth-form__input" placeholder="Nhập lại mật khẩu của bạn" name="cpass" required>
                        </div>

                    </div>
                    <div class="auth-form__aside">
                        <p class="auth-form__policy-text">Bằng việc đăng kí, bạn đã đồng ý về
                            <a href="" class="auth-form__text-link"> Điều khoản dịch vụ </a>&
                            <a href="" class="auth-form__text-link"> Chính sách bảo mật</a>
                        </p>
                    </div>
                    <c:forEach var="message" items="${messages}">
                        <p style="color: red; font-size: 1.5rem"><c:out value="${message}" /></p>
                    </c:forEach>
                    <div class="auth-form__controls">
                        <button type="button" class="btn btn--normal">TRỞ LẠI</button>
                        <button type="submit" class="btn btn--primary">ĐĂNG KÝ</button>
                    </div>
                    

                </form>
            </div>
            <div class="auth-form__socials">
                <a href="" class=" auth-form__socials-facebook btn btn--size-s btn--with-icon">
                    <i class="auth-form__socials-icon fa-brands fa-square-facebook"></i>
                    <span class="auth-form__socials-title"> Kết nối với facebook</span>
                </a>
                <a href="" class=" auth-form__socials-google btn btn--size-s btn--with-icon">
                    <i class="auth-form__socials-icon fa-brands fa-google"></i>
                    <span class="auth-form__socials-title"> Kết nối với google</span>
                </a>
            </div>
        </div>
        <!-- register.jsp -->
