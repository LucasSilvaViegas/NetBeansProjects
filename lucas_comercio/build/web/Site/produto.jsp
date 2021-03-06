<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.List"%>
<%@include file="cabecalho.jsp"%>

<%
    ProdutoDAO dao = new ProdutoDAO();
    Produto obj = new Produto();
    List<Produto> pLista = dao.listar();
    Integer codigo = Integer.parseInt(request.getParameter("codigo"));
    obj = dao.buscarPorChavePrimaria(codigo);
    Integer quant = obj.getQuant();
%>

<div>
     <script>
            // Can also be used with $(document).ready()
            $(window).load(function() {
              $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
              });
            });
            </script>
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		
		<!--fonts-->
		<link href='//fonts.googleapis.com/css?family=Fredoka+One' rel='stylesheet' type='text/css'>
		
		<!--fonts-->
		<!--bootstrap-->
			 <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
		<!--coustom css-->
			<link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!--shop-kart-js-->
        <script src="js/simpleCart.min.js"></script>
		<!--default-js-->
			<script src="js/jquery-2.1.4.min.js"></script>
		<!--bootstrap-js-->
			<script src="js/bootstrap.min.js"></script>
<!-- FlexSlider -->
            <script src="js/imagezoom.js"></script>
              <script defer src="js/jquery.flexslider.js"></script>
            <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

            <script>
            // Can also be used with $(document).ready()
            $(window).load(function() {
              $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
              });
            });
            </script>
        <!-- //FlexSlider-->
<script src="js/imagezoom.js"></script>


</div>

<div class="showcase-grid">
    <div class="container">
        <div class="col-md-8 showcase">
            <div class="flexslider">
                <ul class="slides">
                    <li data-thumb="../fotos/<%=obj.getImagem1()%>">
                        <div> <img src="../fotos/<%=obj.getImagem1()%>" data-imagezoom="true" width="20" height="10"> </div>
                    </li>
                    <li data-thumb="../fotos/<%=obj.getImagem2()%>">
                        <div> <img src="../fotos/<%=obj.getImagem2()%>" data-imagezoom="true" width="20" height="10"> </div>
                    </li>
                    <li data-thumb="../fotos/<%=obj.getImagem3()%>">
                        <div> <img src="../fotos/<%=obj.getImagem3()%>" data-imagezoom="true" width="20" height="10"> </div>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="col-md-4 showcase">
            <div class="showcase-rt-top">
                <div class="pull-left shoe-name">
                    <h3><%=obj.getTitulo()%></h3>
                    <p><%=obj.getDescricao()%></p>
                    <h4>$<%=obj.getPreco()%></h4>
                </div>
                <div class="pull-left rating-stars">
                    <ul>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#" class="active"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-star star-stn" aria-hidden="true"></span></a></li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>
            <hr class="featurette-divider">
            <div class="shocase-rt-bot">
                <div class="float-qty-chart">
                    <form action="carrinho.jsp" method="post">
                    <input type="hidden" name="txtCodigo" value="<%=obj.getCodigo()%>"/>
                    
                            <h3>QTY: </h3>
                            <input type="number" value=1 name="txtQuantidade" min="1"/>
                            <br />

                    
                        <button type="submit" class="btn item_add" >Add To Cart</button>
                </form>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
            <div class="showcase-last">
                <h3>product details</h3>
                <ul>
                    <li>Internal bootie wraps your foot for a sock-like fit</li>
                    <li>Unique eyestays work with the Flywire cables to create an even better glove-like fit</li>
                    <li>Waffle outsole for durability and multi-surface traction</li>
                    <li>Sculpted Cushlon midsole combines plush cushioning and springy resilience for impact protection</li>
                    <li>Midsole flex grooves for greater forefoot flexibility</li>
                </ul>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>


<div class="specifications">
    <div class="container">
        <h3>Item Details</h3> 
        <div class="detai-tabs">
            <!-- Nav tabs -->
            <ul class="nav nav-pills tab-nike" role="tablist">
                <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Highlights</a></li>
                <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Description</a></li>
                <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Terms & conditiona</a></li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="home">
                    <p>The full-length Max Air unit delivers excellent cushioning with enhanced flexibility for smoother transitions through footstrike.</p> 
                    <p>Dynamic Flywire cables integrate with the laces and wrap your midfoot for a truly adaptive, supportive fit.</p>
                </div>
                <div role="tabpanel" class="tab-pane" id="profile">
                    <p>Nike is one of the leading manufacturer and supplier of sports equipment, footwear and apparels. Nike is a global brand and it continuously creates products using high technology and design innovation. Nike has a vast collection of sports shoes for men at Snapdeal. You can explore our range of basketball shoes, football shoes, cricket shoes, tennis shoes, running shoes, daily shoes or lifestyle shoes. Take your pick from an array of sports shoes in vibrant colours like red, yellow, green, blue, brown, black, grey, olive, pink, beige and white. Designed for top performance, these shoes match the way you play or run. Available in materials like leather, canvas, suede leather, faux leather, mesh etc, these shoes are lightweight, comfortable, sturdy and extremely sporty. The sole of all Nike shoes is designed to provide an increased amount of comfort and the material is good enough to provide an improved fit. These shoes are easy to maintain and last for a really long time given to their durability. Buy Nike shoes for men online with us at some unbelievable discounts and great prices. So get faster and run farther with your Nike shoes and track how hard you can play.</p>    
                </div>
                <div role="tabpanel" class="tab-pane" id="messages">
                    The images represent actual product though color of the image and product may slightly differ.    
                </div>
            </div>
        </div>
    </div>
</div>


<div class="you-might-like">
    <div class="container">
        <h3>Outros Produtos</h3> <br/><br/>
        <%    for (Produto item : pLista) {

        %>
        <div class="col-md-4 grid-stn simpleCart_shelfItem">
            <!-- normal -->
            <div class="ih-item square effect3 bottom_to_top">
                <div class="bottom-2-top">
                    <div class="img"><img src="../fotos/<%=item.getImagem1()%>" alt="/" class="img-responsive gri-wid"></div>
                    <div class="info">
                        <div class="pull-left styl-hdn">
                            <h3><%=item.getTitulo()%></h3>
                        </div>
                        <div class="pull-right styl-price">
                            <p><a  href="#" class="item_add"><span class="glyphicon glyphicon-shopping-cart grid-cart" aria-hidden="true"></span> <span class=" item_price">$<%=item.getPreco()%></span></a></p>
                        </div>
                        <div class="clearfix"></div>
                    </div></div>
            </div>
            <!-- end normal -->
            <div class="quick-view">
                <a href="produto.jsp?codigo=<%=item.getCodigo()%>">Quick view</a>
            </div>
        </div>
        <% }%>
    </div>
</div>
<br/><br/>

<%@include file="rodape.jsp"%>