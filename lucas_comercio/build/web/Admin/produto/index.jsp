<%@page import="modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.Marca"%>
<%@include file="../cabecalho.jsp" %>
<%
    ProdutoDAO dao = new ProdutoDAO();
    List<Produto> lista;

    if (request.getParameter("codigo") != null) {
        Produto obj = dao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("codigo")));
        if (obj != null) {
            Boolean funcionou = dao.excluir(obj);
            if (funcionou) {
                out.print("dsdsdsdsd");
            }
        }
    }
if(request.getParameter("txtFiltro") !=null){
        lista = dao.listar(request.getParameter("txtFiltro"));
    }else{
    lista = dao.listar();}
%>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Gerenciamento de Produtos

        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">listagem</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> listagem de registros
            </li>
        </ol>
    </div>
</div>
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">

        <div class="panel-body">

            <a  href="add.jsp" class="btn  btn-primary btn-sm fa fa-plus-square-o" >Novo</a>

        </div>
    </div>
</div>
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">
        <form action="#" method="post">
            <div class="form-group input-group">
                <input type="text" name="txtFiltro" class="form-control" placeholder="digite...">
                <span class="input-group-btn"><button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button></span>
            </div>
        </form>
        <div class="panel-body">


            <div class="table-responsive">
                <table class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th>C�digo</th>
                            <th>Nome</th>
                            <th>Marca</th>
                            <th>Descri��o</th>
                            <th>Pre�o</th>
                            <th>QTD.</th>
                            <th>Imagem</th>
                            <th>Imagem</th>
                            <th>Imagem</th>
                            <th>A��es</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Produto item : lista) {
                        %>

                        <tr>
                            <td><%=item.getCodigo()%></td>
                            <td><%=item.getTitulo()%></td>
                            <td><%=item.getCodmarca().getNome()%></td>
                            <td><%=item.getDescricao()%></td>
                            <td><%=item.getPreco()%></td>
                            <td><%=item.getQuant()%></td>
                            <td><img src="../../fotos/<%=item.getImagem1()%>" width="40" height="40"></td>
                            <td><img src="../../fotos/<%=item.getImagem2()%>" width="40" height="40"></td>
                            <td><img src="../../fotos/<%=item.getImagem3()%>" width="40" height="40"></td>
                            

                            <td>
                                <a href="index.jsp?codigo=<%=item.getCodigo()%>" class="btn  btn-danger btn-sm">Excluir</a>  
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>

                <!-- /.table-responsive -->
            </div>

        </div>
        <!-- /.panel-body -->
    </div>
    <!-- /.panel -->
</div>
<%@include file="../rodape.jsp" %>
