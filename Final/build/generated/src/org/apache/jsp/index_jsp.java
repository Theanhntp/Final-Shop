package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/notify.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/modallink.jsp");
    _jspx_dependants.add("/search.jsp");
    _jspx_dependants.add("/cart.jsp");
    _jspx_dependants.add("/category.jsp");
    _jspx_dependants.add("/home-filter.jsp");
    _jspx_dependants.add("/home-product.jsp");
    _jspx_dependants.add("/footer.jsp");
    _jspx_dependants.add("/register.jsp");
    _jspx_dependants.add("/login.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- header.jsp -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\"\n");
      out.write("        integrity=\"sha512-NhSC1YmyruXifcj/KFRWoC561YpHpc5Jtzgvbuzx5VozKpWvQ+4nXhPdFgmx8xqexRcpAglTj9sIBWINXa8x5w==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"app\">\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <nav class=\"header__navbar\">\n");
      out.write("                    <ul class=\"header__navbar-list\">\n");
      out.write("                        <li class=\"header__navbar-item\">Kênh Người Bán</li>\n");
      out.write("                        <li class=\"header__navbar-item header__navbar-item--has-qr header__navbar-item--separate\">\n");
      out.write("                            Tải ứng dụng\n");
      out.write("                            <div class=\"header__qr\">\n");
      out.write("                                <img src=\"assets/img/qrCode.png\" alt=\"QR code\" class=\"header__qr-img\">\n");
      out.write("                                <div class=\"header__qr-apps\">\n");
      out.write("                                    <a target=”_blank” href=\"https://apps.apple.com/vn/app/id959841449\"\n");
      out.write("                                        class=\"header__qr-link\"> <img src=\"./assets/img/appstore.png\" alt=\"App Store\"\n");
      out.write("                                            class=\"header__qr-download-img\"></a>\n");
      out.write("                                    <a target=”_blank”\n");
      out.write("                                        href=\"https://play.google.com/store/apps/details?id=com.shopee.vn&hl=vi&gl=US&pli=1\"\n");
      out.write("                                        class=\"header__qr-link\"> <img src=\"./assets/img/ggplay.png\" alt=\"Google Play\"\n");
      out.write("                                            class=\"header__qr-download-img\"></a>\n");
      out.write("                                    <a target=”_blank” href=\"https://appgallery.huawei.com/app/C101433653\"\n");
      out.write("                                        class=\"header__qr-link\"> <img src=\"./assets/img/appgallery.png\" alt=\"Gallary\"\n");
      out.write("                                            class=\"header__qr-download-img\"></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"header__navbar-item\">\n");
      out.write("                            <span class=\"header__navbar-item--no-pointer\">Kết nối</span>\n");
      out.write("                            <a href=\"https://www.facebook.com/ShopeeVN\" target=”_blank”\n");
      out.write("                                class=\"header__navbar-item-link\"><i\n");
      out.write("                                    class=\"header__navbar-icon fa-brands fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"https://www.instagram.com/Shopee_VN/\" target=”_blank”\n");
      out.write("                                class=\"header__navbar-item-link\"><i\n");
      out.write("                                    class=\"header__navbar-icon fa-brands fa-instagram\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- <li class=\"header_navbar-item\"></li>\n");
      out.write("                    <li class=\"header_navbar-item\"></li>\n");
      out.write("                    <li class=\"header_navbar-item\"></li> -->\n");
      out.write("                    </ul>\n");
      out.write("<!-- header.jsp -->");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- notify.jsp -->\n");
      out.write("<ul class=\"header__navbar-list\">\n");
      out.write("    <li class=\"header__navbar-item header__navbar-item--has-notify\">\n");
      out.write("        <a href=\"\" class=\"header__navbar-item-link\"><i\n");
      out.write("                class=\"header__navbar-icon fa-solid fa-bell\"></i>Thông báo</a>\n");
      out.write("        <div class=\"header__notify\">\n");
      out.write("            <header class=\"header__notify-header\">\n");
      out.write("                <h3>Thông báo mới nhận</h3>\n");
      out.write("            </header>\n");
      out.write("            <ul class=\"header__notify-list\">             \n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <footer class=\"header__notify-footer\">\n");
      out.write("                <a href=\"\" class=\"header__notify-footer-btn\">Xem tất cả</a>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </li>\n");
      out.write("    <!--  -->\n");
      out.write("    <!--  -->\n");
      out.write("    <li class=\"header__navbar-item\">\n");
      out.write("        <a href=\"\" class=\"header__navbar-item-link\"><i\n");
      out.write("                class=\"header__navbar-icon fa-regular fa-circle-question\"></i>Trợ giúp</a>\n");
      out.write("    </li>\n");
      out.write("    <!-- notify.jsp -->\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- search.jsp -->\n");
      out.write("</nav>\n");
      out.write("<div class=\"header-with-search\">\n");
      out.write("    <div class=\"header__logo\">\n");
      out.write("        <a href=\"loadpage\" class=\"header__logo-link\">\n");
      out.write("            <img class=\"header__logo-img\" src=\"assets/img/logo.svg.png\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"header__search\">\n");
      out.write("        <div class=\"header__search-input-wrap\">\n");
      out.write("            <input type=\"text\" class=\"header__search-input\" placeholder=\"Nhập để tìm kiếm sản phẩm\">\n");
      out.write("            <!-- Search history -->\n");
      out.write("            <!--                            <div class=\"header__search-history\">\n");
      out.write("                                            <h3 class=\"header__search-history-heading\">Lịch sử tìm kiếm</h3>\n");
      out.write("                                            <ul class=\"header__search-history-list\">\n");
      out.write("                                                <li class=\"header__search-history-item\">\n");
      out.write("                                                    <a href=\"\">Kem dưỡng da</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"header__search-history-item\">\n");
      out.write("                                                    <a href=\"\">Kem trị mụn</a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("            \n");
      out.write("                                        </div>-->\n");
      out.write("            <div class=\"header__search-history\">\n");
      out.write("                <h3 class=\"header__search-history-heading\">Lịch sử tìm kiếm</h3>\n");
      out.write("                <ul class=\"header__search-history-list\">\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header__search-select\">\n");
      out.write("            <span class=\"header__search-select-label\">Trong shop</span>\n");
      out.write("            <i class=\"header__search-select-icon fas fa-angle-down\"></i>\n");
      out.write("            <ul class=\"header__search-option\">\n");
      out.write("                <li class=\"header__search-option-item\">\n");
      out.write("                    <span>Trong shop</span>\n");
      out.write("                    <i class=\"fas fa-check\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"header__search-option-item\">\n");
      out.write("                    <span>Ngoài shop</span>\n");
      out.write("                    <i class=\"fas fa-check\"></i>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"header__search-btn\">\n");
      out.write("            <i class=\"header__search-btn-icon fas fa-search\"></i>\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
      out.write("    <!-- search.jsp -->\n");
      out.write("    <!--SEARCH HANDLER-->\n");
      out.write("    <script>\n");
      out.write("        let searchButtonEl = document.querySelector('.header__search-btn');\n");
      out.write("        let searchInputEl = document.querySelector('.header__search-input');\n");
      out.write("\n");
      out.write("        searchButtonEl.addEventListener(\"click\", () => {\n");
      out.write("            window.location.href = \"filterproduct?action=search&searchcontent=\" + searchInputEl.value;\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- cart.jsp  -->\n");
      out.write("<!-- Cart layout -->\n");
      out.write("<div class=\"header__cart-wrap\">\n");
      out.write("    <div class=\"header__cart\">\n");
      out.write("        <i class=\"header__cart-icon fas fa-shopping-cart\"></i>\n");
      out.write("        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <span class=\"header__cart-notice\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("        <!-- No cart: header__cart-list--no-cart -->\n");
      out.write("        <div class=\"header__cart-list\">\n");
      out.write("            <img src=\"./assets/img/no-cart.png\" alt=\"\" class=\"header__cart-no-cart-img\">\n");
      out.write("            <span class=\"header__cart-list-no-cart-msg\">Chưa có sản phầm</span>\n");
      out.write("\n");
      out.write("            <!-- having product -->\n");
      out.write("            <h4 class=\"header__cart-heading\">Sản phẩm đã thêm</h4>\n");
      out.write("            <ul class=\"header__cart-list-item\">\n");
      out.write("                <!-- Cart item -->\n");
      out.write("                ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("                  \n");
      out.write("            </ul>\n");
      out.write("            <a href=\"checkout.jsp\" class=\"header__cart-view-cart btn btn--primary\">Thanh toán</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("<!-- cart.jsp  -->\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- category.jsp  -->\n");
      out.write("<div class=\"app__container\">\n");
      out.write("    <div class=\"grid\">\n");
      out.write("        <div class=\"grid__row app__content\">\n");
      out.write("            <div class=\"grid__col-2\">\n");
      out.write("                <nav class=\"category\">\n");
      out.write("                    <h3 class=\"category__heading\"><i class=\"fas fa-list category__heading-icon\"></i>Danh mục\n");
      out.write("                    </h3>\n");
      out.write("                    <ul class=\"category-list\">\n");
      out.write("                        <li class=\"category-item\"> <!--category-item--active-->                           \n");
      out.write("                            <a href=\"loadpage\" class=\"category-item__link\">Tất cả sản phẩm</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!-- category.jsp -->\n");
      out.write("            \n");
      out.write("<!--                    <li class=\"category-item\">\n");
      out.write("                            <img src=\"assets/img/HGlogo.jpg\" alt=\"\">\n");
      out.write("                            <a href=\"#\" class=\"category-item__link\">HG</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"category-item\">\n");
      out.write("                            <img src=\"assets/img/RGlogo.jpg\" alt=\"\">\n");
      out.write("                            <a href=\"#\" class=\"category-item__link\">RG</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"category-item\">\n");
      out.write("                            <img src=\"assets/img/MGlogo.jpg\" alt=\"\">\n");
      out.write("                            <a href=\"#\" class=\"category-item__link\">MG</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"category-item\">\n");
      out.write("                            <img src=\"assets/img/PGlogo.jpg\" alt=\"\">\n");
      out.write("                            <a href=\"#\" class=\"category-item__link\">PG</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"category-item\">\n");
      out.write("                            <img src=\"assets/img/TOOLlogo.jpg\" alt=\"\">\n");
      out.write("                            <a href=\"#\" class=\"category-item__link\">Tool</a>\n");
      out.write("                        </li>\n");
      out.write("-->");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function filterProduct(sql) {\n");
      out.write("        window.location.href = \"filterproduct?action=\" + sql;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<!-- home-filter.jsp -->\n");
      out.write("<div class=\"grid__col-10\">\n");
      out.write("    <div class=\"home-filter\">\n");
      out.write("        <span class=\"home-filter__label\">Sắp xếp theo</span>\n");
      out.write("        <button class=\"home-filter__btn btn\" onclick=\"filterProduct('popular')\">Phổ biến</button>\n");
      out.write("        <button class=\"home-filter__btn btn\" onclick=\"filterProduct('new')\">Mới nhất</button>\n");
      out.write("        <button class=\"home-filter__btn btn\" onclick=\"filterProduct('best')\">Bán chạy</button>\n");
      out.write("\n");
      out.write("        <div class=\"select-input\">\n");
      out.write("            <span class=\"select-input__label\">Giá</span>\n");
      out.write("            <i class=\"fas fa-angle-down\"></i>\n");
      out.write("            <!-- List option -->\n");
      out.write("            <ul class=\"select-input__list\">\n");
      out.write("                <li class=\"select-input__item\">\n");
      out.write("                    <a href=\"filterproduct?action=ascprice\" class=\"select-input__link\">Giá: Thấp đến cao</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"select-input__item\">\n");
      out.write("                    <a href=\"filterproduct?action=descprice\" class=\"select-input__link\">Giá: Cao đến thấp</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"home-filter__page\">\n");
      out.write("            <span class=\"home-filter__page-num\">\n");
      out.write("                <span class=\"home-filter__page-current\">1</span>/14\n");
      out.write("            </span>\n");
      out.write("            <div class=\"home-filter__page-control\">\n");
      out.write("                <a href=\"#\" class=\"home-filter__page-btn home-filter__page-btn--disable\">\n");
      out.write("                    <i class=\"home-filter__page-icon fas fa-angle-left\"></i>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"home-filter__page-btn\">\n");
      out.write("                    <i class=\"home-filter__page-icon fas fa-angle-right\"></i>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- home-filter.jsp -->\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- home-product.jsp -->\n");
      out.write("<div class=\"home-product\">\n");
      out.write("    <div class=\"grid__row\">\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<ul class=\"home-product__pagination pagnigation\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</ul>\n");
      out.write(" <script src=\"assets/js/paging.js\"></script>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- home-product.jsp -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer.jsp -->\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <div class=\"grid__row\">\n");
      out.write("                    <div class=\"grid__col-2-4\">\n");
      out.write("                        <h3 class=\"footer__heading\">Chăm sóc khách hàng</h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\">Trung Tâm Trợ Giúp</a>\n");
      out.write("                            </li>\n");
      out.write("                      \n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\">Hướng dẫn mua hàng</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__col-2-4\">\n");
      out.write("                        <h3 class=\"footer__heading\">Về chúng tôi</h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\">Giới Thiệu</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\">Tuyển dụng</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\">Điều khoản</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__col-2-4\">\n");
      out.write("                        <h3 class=\"footer__heading\">Theo dõi</h3>\n");
      out.write("                        <ul class=\"footer-list\">\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\"><i class=\"footer-item__icon fab fa-facebook\"></i>\n");
      out.write("                                    Facebook\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\"><i class=\"footer-item__icon fab fa-instagram\"></i>\n");
      out.write("                                    Instagram\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer-item\">\n");
      out.write("                                <a href=\"#\" class=\"footer-item__link\"><i class=\"footer-item__icon fab fa-linkedin\"></i>\n");
      out.write("                                    Linkedin\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__col-2-4\">\n");
      out.write("                        <h3 class=\"footer__heading\">Thanh toán</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"grid__col-2-4\">\n");
      out.write("                        <h3 class=\"footer__heading\">Vào cửa hàng trên ứng dụng</h3>\n");
      out.write("                        <div class=\"footer__download\">\n");
      out.write("                            <img src=\"/assets/img/qrCode.png\" alt=\"QR\" class=\"footer__download-qr\">\n");
      out.write("                            <div class=\"footer__download-apps\">\n");
      out.write("                                <a href=\"\" class=\"footer__download-app-link\">\n");
      out.write("                                    <img src=\"assets/img/ggplay.png\" alt=\"google play\" class=\"footer__download-app-img\">\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"\" class=\"footer__download-app-link\">\n");
      out.write("                                    <img src=\"assets/img/appstore.png\" alt=\"app store\" class=\"footer__download-app-img\">\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"\" class=\"footer__download-app-link\">\n");
      out.write("                                    <img src=\"assets/img/appgallery.png\" alt=\"app gallary\"\n");
      out.write("                                        class=\"footer__download-app-img\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer__bottom\">\n");
      out.write("                <div class=\"grid\">\n");
      out.write("                        <p class=\"footer__text\">© 2023 - Bản quyền thuộc về Gundam Shop</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("<!-- footer.jsp -->   \n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- register.jsp -->\n");
      out.write("<!-- ------------Modal layout------------- -->\n");
      out.write("<div class=\"modal\">\n");
      out.write("    <div class=\"modal__overlay\"></div>\n");
      out.write("    <div class=\"modal__body\">\n");
      out.write("        <!-- Register form    -->\n");
      out.write("        <div class=\"auth-form register\">\n");
      out.write("            <div class=\"auth-form__container\">\n");
      out.write("                <div class=\"auth-form__header\">\n");
      out.write("                    <h3 class=\"auth-form__heading\">Đăng ký</h3>\n");
      out.write("                    <span class=\"auth-form__switch-btn\">Đăng nhập</span>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"register\" method=\"get\">\n");
      out.write("                    <div class=\"auth-form__form\">\n");
      out.write("\n");
      out.write("                        <div class=\"auth-form__group\">\n");
      out.write("                            <input type=\"text\" class=\"auth-form__input\" placeholder=\"Nhập tên của bạn\" name=\"name\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"auth-form__group\">\n");
      out.write("                            <input type=\"text\" class=\"auth-form__input\" placeholder=\"Nhập số điện thoại của bạn\" name=\"phone\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"auth-form__group\">\n");
      out.write("                            <input type=\"email\" class=\"auth-form__input\" placeholder=\"Nhập email của bạn\" name=\"email\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"auth-form__group\">\n");
      out.write("                            <input type=\"password\" class=\"auth-form__input\" placeholder=\"Nhập mật khẩu của bạn\" name=\"pass\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"auth-form__group\">\n");
      out.write("                            <input type=\"password\" class=\"auth-form__input\" placeholder=\"Nhập lại mật khẩu của bạn\" name=\"cpass\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"auth-form__aside\">\n");
      out.write("                        <p class=\"auth-form__policy-text\">Bằng việc đăng kí, bạn đã đồng ý về\n");
      out.write("                            <a href=\"\" class=\"auth-form__text-link\"> Điều khoản dịch vụ </a>&\n");
      out.write("                            <a href=\"\" class=\"auth-form__text-link\"> Chính sách bảo mật</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <div class=\"auth-form__controls\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn--normal\">TRỞ LẠI</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn--primary\">ĐĂNG KÝ</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"auth-form__socials\">\n");
      out.write("                <a href=\"\" class=\" auth-form__socials-facebook btn btn--size-s btn--with-icon\">\n");
      out.write("                    <i class=\"auth-form__socials-icon fa-brands fa-square-facebook\"></i>\n");
      out.write("                    <span class=\"auth-form__socials-title\"> Kết nối với facebook</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"\" class=\" auth-form__socials-google btn btn--size-s btn--with-icon\">\n");
      out.write("                    <i class=\"auth-form__socials-icon fa-brands fa-google\"></i>\n");
      out.write("                    <span class=\"auth-form__socials-title\"> Kết nối với google</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- register.jsp -->\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- login.jsp -->\n");
      out.write("<!-- Login form -->\n");
      out.write("\n");
      out.write("<div class=\"auth-form login\">\n");
      out.write("    <div class=\"auth-form__container\">\n");
      out.write("        <div class=\"auth-form__header\">\n");
      out.write("            <h3 class=\"auth-form__heading\">Đăng nhập</h3>\n");
      out.write("            <span class=\"auth-form__switch-btn\">Đăng ký</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"auth-form__form\">\n");
      out.write("            <form name=\"loginform\" action=\"login\" method=\"GET\">\n");
      out.write("                <div class=\"auth-form__group\">\n");
      out.write("                    <input type=\"text\" class=\"auth-form__input\" placeholder=\"Nhập email của bạn\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"auth-form__group\">\n");
      out.write("                    <input type=\"password\" class=\"auth-form__input\" placeholder=\"Nhập mật khẩu của bạn\" name=\"pass\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"auth-form__aside\">\n");
      out.write("            <div class=\"auth-form__help\">\n");
      out.write("                <a href=\"\" class=\"auth-form__help-link auth-form__help-forgot\">Quên mật khẩu</a>\n");
      out.write("                <span class=\"auth-form__help-separate\"></span>\n");
      out.write("                <a href=\"\" class=\"auth-form__help-link\">Cần trợ giúp</a>\n");
      out.write("            </div>\n");
      out.write("            <p style=\"color: red; font-size: 1.5rem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"auth-form__controls\">\n");
      out.write("            <button type=\"button\"class=\"btn btn--normal\">TRỞ LẠI</button>\n");
      out.write("            <button type=\"submit\" class=\"btn btn--primary\">ĐĂNG NHẬP</button>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"auth-form__socials\">\n");
      out.write("        <a href=\"\" class=\" auth-form__socials-facebook btn btn--size-s btn--with-icon\">\n");
      out.write("            <i class=\"auth-form__socials-icon fa-brands fa-square-facebook\"></i>\n");
      out.write("            <span class=\"auth-form__socials-title\"> Đăng nhập với facebook</span>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"\" class=\" auth-form__socials-google btn btn--size-s btn--with-icon\">\n");
      out.write("            <i class=\"auth-form__socials-icon fa-brands fa-google\"></i>\n");
      out.write("            <span class=\"auth-form__socials-title\"> Đăng nhập với google</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"assets/js/mycode.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\" integrity=\"sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/0.26.1/axios.min.js\" integrity=\"sha512-bPh3uwgU5qEMipS/VOmRqynnMXGGSRv+72H/N260MQeXZIK4PG48401Bsby9Nq5P5fz7hy5UGNmC/W1Z51h2GQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("<script src=\"assets/js/vietnamAPI.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- login.jsp -->\n");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.notifications}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("notify");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li class=\"header__notify-item .header__notify-item--viewed\">\n");
          out.write("                        <a href=\"notification?nid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.notificationID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"header__notify-link\" style=\"text-decoration: none\">\n");
          out.write("                            ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            <div class=\"header__notify-info\">\n");
          out.write("                                <span class=\"header__notify-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                <span class=\"header__notify-description\" style=\"color: orange\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.getCreateAt()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                <span class=\"header__notify-description\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </span>\n");
          out.write("                            </div>\n");
          out.write("                        </a>\n");
          out.write("                    </li>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.type eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <img src=\"assets/img/dangvanchuyen.jpg\" class=\"header__notify-img\" />\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.type eq 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <img src=\"assets/img/xacnhandonhang.jpg\" class=\"header__notify-img\" />\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notify.type eq 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <img src=\"assets/img/tuchoidonhang.jpg\" class=\"header__notify-img\" />\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!--                        <li class=\"register-button header__navbar-item header__navbar-item--strong  header__navbar-item--separate\">Đăngký</li>\n");
        out.write("                        <li class=\"login-button header__navbar-item header__navbar-item--strong\">Đăng nhập</li>-->\n");
        out.write("<li class=\"header__navbar-item header__navbar-user\">\n");
        out.write("    <img class=\"header__navbar-user-img\"\n");
        out.write("         src=\"assets/img/user.jpg\"\n");
        out.write("         alt=\"\">\n");
        out.write("    <span class=\"header__navbar-user-name\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("    <ul class=\"header__navbar-user-menu\">\n");
        out.write("        <li class=\"header__navbar-user-item\"><a href=\"myaccount\">Tài khoản của tôi</a></li>\n");
        out.write("        ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <li class=\"header__navbar-user-item\"><a href=\"logout\">Đăng xuất</a></li>\n");
        out.write("    </ul>\n");
        out.write("</li> \n");
        out.write("</ul>\n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.isAdmin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"header__navbar-user-item\"><a href=\"dashboardmanager\">Quản lý cửa hàng</a></li>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <li class=\"register-button header__navbar-item header__navbar-item--strong  header__navbar-item--separate\">Đăngký</li>\n");
        out.write("                        <li class=\"login-button header__navbar-item header__navbar-item--strong\">Đăng nhập</li>\n");
        out.write(" </ul>");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cookies");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.cookies}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("cookieItem");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookies}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookieItem.name == 'searchhistory'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_2.setVar("value");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookieItem.value.split('/')}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"header__search-history-item\">\n");
          out.write("                                    <a href=\"filterproduct?action=search&searchcontent=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                </li>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("size");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("o");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                   \n");
          out.write("                    <li class=\"header__cart-item\">\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.images.get(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                             alt=\"\" class=\"header__cart-img\">\n");
          out.write("                        <div class=\"header__cart-item-info\">\n");
          out.write("                            <div class=\"header__cart-item-head\">\n");
          out.write("                                <h5 class=\"header__cart-item-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </h5>\n");
          out.write("                                <div class=\"header__cart-item-price-wrap\">\n");
          out.write("                                    <span class=\"header__cart-item-price\">");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write(" đ</span>\n");
          out.write("                                    <span class=\"header__cart-item-multiply\">x</span>\n");
          out.write("                                    <span class=\"header__cart-item-qnt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"header__cart-item-body\">\n");
          out.write("                                <span class=\"header__cart-item-description\">\n");
          out.write("                                    Phân loại: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </span>\n");
          out.write("                                <form name=\"processcartform2\" action=\"processcart\" method=\"post\">\n");
          out.write("                                    <input type=\"hidden\" name=\"idhome\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                </form>\n");
          out.write("                                <span class=\"header__cart-item-remove\" onclick=\"document.processcartform2.submit()\"> Xóa </span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_fmt_formatNumber_0.setType("number");
    _jspx_th_fmt_formatNumber_0.setGroupingUsed(true);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("category");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li class=\"category-item\">\n");
          out.write("                                 <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                <a href=\"filterproduct?action=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"category-item__link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            </li>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("p");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <div class=\"grid__col-2-4\">\n");
          out.write("                <!-- Product item -->\n");
          out.write("                <a class=\"home-product-item\" href=\"singleproduct?productid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                    <div class=\"home-product-item__img\"\n");
          out.write("                         style=\"background-image:url('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.images.get(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\">\n");
          out.write("                    </div>\n");
          out.write("                    <h4 class=\"home-product-item__name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                    <div class=\"home-product-item__price\">\n");
          out.write("                        <span class=\"home-product-item__price-old\">");
          if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write(" đ</span>\n");
          out.write("                        <span class=\"home-product-item__price-current\">");
          if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write(" đ</span>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"home-product-item__action\">\n");
          out.write("                        <span class=\"home-product-item__like home-product-item__like--liked\">\n");
          out.write("                            <i class=\"home-product-item__like-icon-empty far fa-heart\"></i>\n");
          out.write("                            <i class=\"home-product-item__like-icon-fill fas fa-heart\"></i>\n");
          out.write("                        </span>\n");
          out.write("                        <div class=\"home-product-item__rating\">\n");
          out.write("                            <i class=\"home-product-item__star--gold fas fa-star\"></i>\n");
          out.write("                            <i class=\"home-product-item__star--gold fas fa-star\"></i>\n");
          out.write("                            <i class=\"home-product-item__star--gold fas fa-star\"></i>\n");
          out.write("                            <i class=\"home-product-item__star--gold fas fa-star\"></i>\n");
          out.write("                            1`\n");
          out.write("                        </div>\n");
          out.write("                        <span class=\"home-product-item__sold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTotalProductSold()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đã bán</span>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"home-product-item__origin\">\n");
          out.write("                        <span class=\"home-product-item__brand\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                        <span class=\"home-product-item__origin-name\">Nhật Bản</span>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"home-product-item__favourite\">\n");
          out.write("                        <i class=\"fas fa-check\"></i>\n");
          out.write("                        <span>Yêu thích</span>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"home-product-item__sale-off\">\n");
          out.write("                        <span class=\"home-product-item__sale-off-percent\">10%</span>\n");
          out.write("                        <span class=\"home-product-item__sale-off-label\">GIẢM</span>\n");
          out.write("                    </div>\n");
          out.write("                </a>\n");
          out.write("            </div>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_fmt_formatNumber_1.setType("number");
    _jspx_th_fmt_formatNumber_1.setGroupingUsed(true);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price*1.1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_fmt_formatNumber_2.setType("number");
    _jspx_th_fmt_formatNumber_2.setGroupingUsed(true);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_groupingUsed_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setVar("message");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <p style=\"color: red; font-size: 1.5rem\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</p>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
