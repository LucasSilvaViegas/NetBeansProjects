package org.apache.jsp.Site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProdutoDAO;
import modelo.Produto;
import java.util.List;

public final class produto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Site/cabecalho.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
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
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("    <title>N-Air a E-commerce category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"N-Air Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("\t\t<script type=\"application/x-javascript\"> addEventListener(\"load\", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\t\t<meta charset utf=\"8\">\n");
      out.write("\t\t<!--fonts-->\n");
      out.write("\t\t<link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t\n");
      out.write("\t\t<!--fonts-->\n");
      out.write("\t\t<!--bootstrap-->\n");
      out.write("\t\t\t <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\t<!--coustom css-->\n");
      out.write("\t\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--shop-kart-js-->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("\t\t<!--default-js-->\n");
      out.write("\t\t\t<script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("\t\t<!--bootstrap-js-->\n");
      out.write("\t\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<!--script-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"header-top\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\">N-AIR</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"login-bars\">\n");
      out.write("                        <a class=\"btn btn-default log-bar\" href=\"register.html\" role=\"button\">Sign up</a>\n");
      out.write("                        <a class=\"btn btn-default log-bar\" href=\"signup.html\" role=\"button\">Login</a>\n");
      out.write("                        <div class=\"cart box_1\">\n");
      out.write("                            <a href=\"checkout.html\">\n");
      out.write("                            <h3>\n");
      out.write("                                <div class=\"total\">\n");
      out.write("<span class=\"simpleCart_total\"></span>(<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span>)</div></h3>\n");
      out.write("                            </a>\n");
      out.write("                            <p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\t\n");
      out.write("                    </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!---menu-----bar--->\n");
      out.write("                <div class=\"header-botom\">\n");
      out.write("                    <div class=\"content white\">\n");
      out.write("                    <nav class=\"navbar navbar-default nav-menu\" role=\"navigation\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <!--/.navbar-header-->\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse collapse-pdng\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav nav-font\">\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Shop<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("                                        <li><a href=\"products.html\">Tees</a></li>\n");
      out.write("                                        <li><a href=\"products.html\">Tops</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"products.html\">Tracks</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"products.html\">Gear</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Men<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                                                <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                    <li><a href=\"products.html\">Joggers</a></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Foot Ball</a></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Cricket</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Tennis</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Casual</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                        <a href=\"#\"><img src=\"images/menu1.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4 menu-img-pad\">\n");
      out.write("                        <a href=\"#\"><img src=\"images/menu2.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Women<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu multi-column columns-2\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                    <li><a href=\"products.html\">Tops</a></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Bottoms</a></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Yoga Pants</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Sports</a></li>\n");
      out.write("                                                    <li class=\"divider\"></li>\n");
      out.write("                                                    <li><a href=\"products.html\">Gym</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                        <a href=\"#\"><img src=\"images/menu3.jpg\" alt=\"/\" class=\"img-rsponsive men-img-wid\" /></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">kids<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"products.html\">Tees</a></li>\n");
      out.write("                                        <li><a href=\"products.html\">Shorts</a></li>\n");
      out.write("                                        <li><a href=\"products.html\">Gear</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"products.html\">Watches</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"products.html\">Shoes</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"contact.html\">Catch</a></li>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/.navbar-collapse-->\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </nav>\n");
      out.write("                    <!--/.navbar-->   \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.content--->\n");
      out.write("                </div>\n");
      out.write("                    <!--header-bottom-->\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    ProdutoDAO dao = new ProdutoDAO();
    Produto obj = new Produto();
    Integer codigo = Integer.parseInt(request.getParameter("codigo"));
    obj = dao.buscarPorChavePrimaria(codigo);
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"showcase-grid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-8 showcase\">\n");
      out.write("                    <div class=\"flexslider\">\n");
      out.write("                          <ul class=\"slides\">\n");
      out.write("                            <li data-thumb=\"../fotos/");
      out.print(obj.getImagem1());
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"> <img src=\"../fotos/");
      out.print(obj.getImagem1());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li data-thumb=\"../fotos/");
      out.print(obj.getImagem2());
      out.write("\">\n");
      out.write("                                 <div class=\"thumb-image\"> <img src=\"../fotos/");
      out.print(obj.getImagem2());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li data-thumb=\"../fotos/");
      out.print(obj.getImagem3());
      out.write("\">\n");
      out.write("                               <div class=\"thumb-image\"> <img src=\"../fotos/");
      out.print(obj.getImagem3());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("                          </ul>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 showcase\">\n");
      out.write("                    <div class=\"showcase-rt-top\">\n");
      out.write("                        <div class=\"pull-left shoe-name\">\n");
      out.write("                            <h3>");
      out.print(obj.getTitulo());
      out.write("</h3>\n");
      out.write("                            <p>");
      out.print(obj.getDescricao());
      out.write("</p>\n");
      out.write("                            <h4>&#36;190</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left rating-stars\">\n");
      out.write("                            <ul>\n");
      out.write("    <li><a href=\"#\" class=\"active\"><span class=\"glyphicon glyphicon-star star-stn\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("    <li><a href=\"#\" class=\"active\"><span class=\"glyphicon glyphicon-star star-stn\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("    <li><a href=\"#\" class=\"active\"><span class=\"glyphicon glyphicon-star star-stn\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("    <li><a href=\"#\"><span class=\"glyphicon glyphicon-star star-stn\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("    <li><a href=\"#\"><span class=\"glyphicon glyphicon-star star-stn\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"featurette-divider\">\n");
      out.write("                    <div class=\"shocase-rt-bot\">\n");
      out.write("                        <div class=\"float-qty-chart\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"qty\">\n");
      out.write("                                <h3>Size Chart</h3>\n");
      out.write("                                <select class=\"form-control siz-chrt\">\n");
      out.write("                                  <option>6 US</option>\n");
      out.write("                                  <option>7 US</option>\n");
      out.write("                                  <option>8 US</option>\n");
      out.write("                                  <option>9 US</option>\n");
      out.write("                                  <option>10 US</option>\n");
      out.write("                                  <option>11 US</option>\n");
      out.write("                                </select>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"qty\">\n");
      out.write("                                <h4>QTY</h4>\n");
      out.write("                                <select class=\"form-control qnty-chrt\">\n");
      out.write("                                  <option>1</option>\n");
      out.write("                                  <option>2</option>\n");
      out.write("                                  <option>3</option>\n");
      out.write("                                  <option>4</option>\n");
      out.write("                                  <option>5</option>\n");
      out.write("                                  <option>6</option>\n");
      out.write("                                  <option>7</option>\n");
      out.write("                                </select>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"ad-2-crt simpleCart_shelfItem\">\n");
      out.write("                                <a class=\"btn item_add\" href=\"#\" role=\"button\">Add To Cart</a>\n");
      out.write("                                <a class=\"btn\" href=\"#\" role=\"button\">Buy Now</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"showcase-last\">\n");
      out.write("                        <h3>product details</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Internal bootie wraps your foot for a sock-like fit</li>\n");
      out.write("        <li>Unique eyestays work with the Flywire cables to create an even better glove-like fit</li>\n");
      out.write("                            <li>Waffle outsole for durability and multi-surface traction</li>\n");
      out.write("        <li>Sculpted Cushlon midsole combines plush cushioning and springy resilience for impact protection</li>\n");
      out.write("                            <li>Midsole flex grooves for greater forefoot flexibility</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"specifications\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <h3>Item Details</h3> \n");
      out.write("                <div class=\"detai-tabs\">\n");
      out.write("                    <!-- Nav tabs -->\n");
      out.write("                    <ul class=\"nav nav-pills tab-nike\" role=\"tablist\">\n");
      out.write("                    <li role=\"presentation\" class=\"active\"><a href=\"#home\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Highlights</a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"#profile\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">Description</a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"#messages\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">Terms & conditiona</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <!-- Tab panes -->\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane active\" id=\"home\">\n");
      out.write("                    <p>The full-length Max Air unit delivers excellent cushioning with enhanced flexibility for smoother transitions through footstrike.</p> \n");
      out.write("                    <p>Dynamic Flywire cables integrate with the laces and wrap your midfoot for a truly adaptive, supportive fit.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"profile\">\n");
      out.write("                    <p>Nike is one of the leading manufacturer and supplier of sports equipment, footwear and apparels. Nike is a global brand and it continuously creates products using high technology and design innovation. Nike has a vast collection of sports shoes for men at Snapdeal. You can explore our range of basketball shoes, football shoes, cricket shoes, tennis shoes, running shoes, daily shoes or lifestyle shoes. Take your pick from an array of sports shoes in vibrant colours like red, yellow, green, blue, brown, black, grey, olive, pink, beige and white. Designed for top performance, these shoes match the way you play or run. Available in materials like leather, canvas, suede leather, faux leather, mesh etc, these shoes are lightweight, comfortable, sturdy and extremely sporty. The sole of all Nike shoes is designed to provide an increased amount of comfort and the material is good enough to provide an improved fit. These shoes are easy to maintain and last for a really long time given to their durability. Buy Nike shoes for men online with us at some unbelievable discounts and great prices. So get faster and run farther with your Nike shoes and track how hard you can play.</p>    \n");
      out.write("                    </div>\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"messages\">\n");
      out.write("                        The images represent actual product though color of the image and product may slightly differ.    \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"you-might-like\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"you-might\">Products You May Like</h3>\n");
      out.write("                <div class=\"col-md-4 grid-stn simpleCart_shelfItem\">\n");
      out.write("                     <!-- normal -->\n");
      out.write("                        <div class=\"ih-item square effect3 bottom_to_top\">\n");
      out.write("                            <div class=\"bottom-2-top\">\n");
      out.write("                    <div class=\"img\"><img src=\"images/grid4.jpg\" alt=\"/\" class=\"img-responsive gri-wid\"></div>\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <div class=\"pull-left styl-hdn\">\n");
      out.write("                                    <h3>style 01</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pull-right styl-price\">\n");
      out.write("                                    <p><a  href=\"#\" class=\"item_add\"><span class=\"glyphicon glyphicon-shopping-cart grid-cart\" aria-hidden=\"true\"></span> <span class=\" item_price\">$190</span></a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div></div>\n");
      out.write("                        </div>\n");
      out.write("                    <!-- end normal -->\n");
      out.write("                    <div class=\"quick-view\">\n");
      out.write("                        <a href=\"single.html\">Quick view</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 grid-stn simpleCart_shelfItem\">\n");
      out.write("                    <!-- normal -->\n");
      out.write("                        <div class=\"ih-item square effect3 bottom_to_top\">\n");
      out.write("                            <div class=\"bottom-2-top\">\n");
      out.write("                    <div class=\"img\"><img src=\"images/grid6.jpg\" alt=\"/\" class=\"img-responsive gri-wid\"></div>\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <div class=\"pull-left styl-hdn\">\n");
      out.write("                                    <h3>style 01</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pull-right styl-price\">\n");
      out.write("    <p><a  href=\"#\" class=\"item_add\"><span class=\"glyphicon glyphicon-shopping-cart grid-cart\" aria-hidden=\"true\"></span> <span class=\" item_price\">$190</span></a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div></div>\n");
      out.write("                        </div>\n");
      out.write("                    <!-- end normal -->\n");
      out.write("                    <div class=\"quick-view\">\n");
      out.write("                        <a href=\"single.html\">Quick view</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 grid-stn simpleCart_shelfItem\">\n");
      out.write("                    <!-- normal -->\n");
      out.write("                        <div class=\"ih-item square effect3 bottom_to_top\">\n");
      out.write("                            <div class=\"bottom-2-top\">\n");
      out.write("                    <div class=\"img\"><img src=\"images/grid3.jpg\" alt=\"/\" class=\"img-responsive gri-wid\"></div>\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <div class=\"pull-left styl-hdn\">\n");
      out.write("                                    <h3>style 01</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pull-right styl-price\">\n");
      out.write("    <p><a  href=\"#\" class=\"item_add\"><span class=\"glyphicon glyphicon-shopping-cart grid-cart\" aria-hidden=\"true\"></span> <span class=\" item_price\">$190</span></a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div></div>\n");
      out.write("                        </div>\n");
      out.write("                    <!-- end normal -->\n");
      out.write("                    <div class=\"quick-view\">\n");
      out.write("                        <a href=\"single.html\">Quick view</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer-grid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-2 re-ft-grd\">\n");
      out.write("                    <h3>Categories</h3>\n");
      out.write("                    <ul class=\"categories\">\n");
      out.write("                        <li><a href=\"#\">Men</a></li>\n");
      out.write("                        <li><a href=\"#\">Women</a></li>\n");
      out.write("                        <li><a href=\"#\">Kids</a></li>\n");
      out.write("                        <li><a href=\"#\">Formal</a></li>\n");
      out.write("                        <li><a href=\"#\">Casuals</a></li>\n");
      out.write("                        <li><a href=\"#\">Sports</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 re-ft-grd\">\n");
      out.write("                    <h3>Short links</h3>\n");
      out.write("                    <ul class=\"shot-links\">\n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"#\">Support</a></li>\n");
      out.write("                        <li><a href=\"#\">Delivery</a></li>\n");
      out.write("                        <li><a href=\"#\">Return Policy</a></li>\n");
      out.write("                        <li><a href=\"#\">Terms & conditions</a></li>\n");
      out.write("                        <li><a href=\"contact.html\">Sitemap</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 re-ft-grd\">\n");
      out.write("                    <h3>Social</h3>\n");
      out.write("                    <ul class=\"social\">\n");
      out.write("                        <li><a href=\"#\" class=\"fb\">facebook</a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"twt\">twitter</a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"gpls\">g+ plus</a></li>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 re-ft-grd\">\n");
      out.write("                    <div class=\"bt-logo\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"index.html\" class=\"ft-log\">N-AIR</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"copy-rt\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("            <p>&copy;   2015 N-AIR All Rights Reserved. Design by <a href=\"http://www.w3layouts.com\">w3layouts</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
}
