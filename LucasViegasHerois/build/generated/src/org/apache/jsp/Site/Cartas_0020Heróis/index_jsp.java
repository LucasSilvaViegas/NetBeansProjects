package org.apache.jsp.Site.Cartas_0020Heróis;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Heroi;
import dao.HeroiDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <script src=\"jquery-2.2.4.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\" onload=\"inicia();\">\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div id=\"divCartasVermelhas\" onclick=\"if (cartaVirada == false) {\n");
      out.write("                        apareceVermelho();\n");
      out.write("                    }\">\n");
      out.write("\n");
      out.write("                <div id=\"nomeVermelho\"></div>\n");
      out.write("                <div id=\"caracteristicasVermelho\">\n");
      out.write("                    <div id=\"caracteristicasVermelhoInteligencia\" onclick=\"inteligencia();cartaVirada = true;\">\t</div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasVermelhoForca\" onclick=\"forca();cartaVirada = true;\"></div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasVermelhoVelocidade\" onclick=\"velocidade();cartaVirada = true;\">\t</div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasVermelhoResistencia\" onclick=\"resistencia();cartaVirada = true;\">\t</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"divCartasAzuis\">\n");
      out.write("\n");
      out.write("                <div id=\"nomeAzul\"></div>\n");
      out.write("                <div id=\"caracteristicasAzuis\">\n");
      out.write("                    <div id=\"caracteristicasAzulInteligencia\"></div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasAzulForca\"></div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasAzulVelocidade\"></div>\n");
      out.write("\n");
      out.write("                    <div id=\"caracteristicasAzulResistencia\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <button id=\"btnJogarDnv\" style=\"display:none;margin-top:400px;\" onclick=\"jogadnv()\" align=\"center\">Jogar Novamente</button>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var divCartasVermelhas = document.getElementById(\"divCartasVermelhas\");\n");
      out.write("            var nomeVermelho = document.getElementById(\"nomeVermelho\");\n");
      out.write("            var caracteristicasVermelho = document.getElementById(\"caracteristicasVermelho\");\n");
      out.write("            var caracteristicasVermelhoInteligencia = document.getElementById(\"caracteristicasVermelhoInteligencia\");\n");
      out.write("            var caracteristicasVermelhoForca = document.getElementById(\"caracteristicasVermelhoForca\");\n");
      out.write("            var caracteristicasVermelhoVelocidade = document.getElementById(\"caracteristicasVermelhoVelocidade\");\n");
      out.write("            var caracteristicasVermelhoResistencia = document.getElementById(\"caracteristicasVermelhoResistencia\");\n");
      out.write("\n");
      out.write("            var divCartasAzuis = document.getElementById(\"divCartasAzuis\");\n");
      out.write("            var nomeAzul = document.getElementById(\"nomeAzul\");\n");
      out.write("            var caracteristicasAzuis = document.getElementById(\"caracteristicasAzuis\");\n");
      out.write("            var caracteristicasAzulInteligencia = document.getElementById(\"caracteristicasAzulInteligencia\");\n");
      out.write("            var caracteristicasAzulForca = document.getElementById(\"caracteristicasAzulForca\");\n");
      out.write("            var caracteristicasAzulVelocidade = document.getElementById(\"caracteristicasAzulVelocidade\");\n");
      out.write("            var caracteristicasAzulResistencia = document.getElementById(\"caracteristicasAzulResistencia\")\n");
      out.write("\n");
      out.write("            var baralhoVermelho = Array();\n");
      out.write("            var baralhoAzul = Array();\n");
      out.write("            var temp, tempVelha;\n");
      out.write("\n");
      out.write("            var cartaVirada = false;\n");
      out.write("            var intervalo;\n");
      out.write("\n");
      out.write("            var cemiterioVermelho = Array();\n");
      out.write("            var cemiterioAzul = Array();\n");
      out.write("\n");
      out.write("            var maiorQualidadeAzul;\n");
      out.write("\n");
      out.write("            var btnJogarDnv = document.getElementById(\"btnJogarDnv\");\n");
      out.write("\n");
      out.write("            //Baralho principal com todas as cartas que logo vai ser cortado separando\n");
      out.write("            var cartasArray;\n");
      out.write("\n");
      out.write("            function inicia() {\n");
      out.write("                cartasArray = Array(       \n");
      out.write("        ");

            HeroiDAO dao = new HeroiDAO();
            List<Heroi> lista;
            lista = dao.listarRandom();

           for(int i=0;i<lista.size();i++)  {
               Heroi hero = lista.get(i);
        
      out.write("\n");
      out.write("       \n");
      out.write("                {\n");
      out.write("                    nome: \"");
      out.print(hero.getNome());
      out.write("\",\n");
      out.write("                    inteligencia: ");
      out.print(hero.getInteligencia());
      out.write(",\n");
      out.write("                    forca: ");
      out.print(hero.getForca());
      out.write(",\n");
      out.write("                    velocidade: ");
      out.print(hero.getVelocidade());
      out.write(",\n");
      out.write("                    resistencia: ");
      out.print(hero.getResistencia());
      out.write(",\n");
      out.write("                    imagem: '../../fotos/");
      out.print(hero.getFoto());
      out.write("'\n");
      out.write("                }\n");
      out.write("                        \n");
      out.write("            ");

                if(i != lista.size() - 1)
                {
                out.print(",");
                }
       }

            
      out.write("\n");
      out.write("\n");
      out.write("                );\n");
      out.write("                //Variável temporaria que armazena um numero aleatório de 0-tamanho do array\n");
      out.write("                temp = Math.floor((Math.random() * cartasArray.length));\n");
      out.write("                tempVelha = temp;\n");
      out.write("                //Separação de cartas loop vermelho\n");
      out.write("                for (var i = 0; i < cartasArray.length * 2; i++) {\n");
      out.write("                    while (temp == tempVelha) {\n");
      out.write("                        temp = Math.floor((Math.random() * cartasArray.length));\n");
      out.write("                    }\n");
      out.write("                    tempVelha = temp;\n");
      out.write("                    baralhoVermelho.push(cartasArray[temp]);\n");
      out.write("                    cartasArray.splice(temp, 1);\n");
      out.write("                    while (temp == tempVelha) {\n");
      out.write("                        temp = Math.floor((Math.random() * cartasArray.length));\n");
      out.write("                    }\n");
      out.write("                    tempVelha = temp;\n");
      out.write("                    baralhoAzul.push(cartasArray[temp]);\n");
      out.write("                    cartasArray.splice(temp, 1);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                for (var i = 0; i < cartasArray.length; i++) {\n");
      out.write("                    baralhoVermelho.push(cartasArray[i]);\n");
      out.write("                    if (i + 1 < cartasArray.length) {\n");
      out.write("                        baralhoAzul.push(cartasArray[i + 1]);\n");
      out.write("                    }\n");
      out.write("                    cartasArray.splice(0, 2);\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                vermelhoClicar();\n");
      out.write("                azulEstatico();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function verificaMaiorQualidadeAzul() {\n");
      out.write("                if (baralhoAzul[0].inteligencia > baralhoAzul[0].forca && baralhoAzul[0].inteligencia > baralhoAzul[0].velocidade && baralhoAzul[0].inteligencia > baralhoAzul[0].resistencia) {\n");
      out.write("                    maiorQualidadeAzul = \"inteligencia\";\n");
      out.write("                } else if (baralhoAzul[0].forca > baralhoAzul[0].inteligencia && baralhoAzul[0].forca > baralhoAzul[0].velocidade && baralhoAzul[0].forca > baralhoAzul[0].resistencia) {\n");
      out.write("                    maiorQualidadeAzul = \"forca\";\n");
      out.write("                } else if (baralhoAzul[0].velocidade > baralhoAzul[0].inteligencia && baralhoAzul[0].velocidade > baralhoAzul[0].forca && baralhoAzul[0].velocidade > baralhoAzul[0].resistencia) {\n");
      out.write("                    maiorQualidadeAzul = \"velocidade\";\n");
      out.write("                } else if (baralhoAzul[0].resistencia > baralhoAzul[0].inteligencia && baralhoAzul[0].resistencia > baralhoAzul[0].forca && baralhoAzul[0].resistencia > baralhoAzul[0].velocidade) {\n");
      out.write("                    maiorQualidadeAzul = \"resistencia\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function apareceVermelho() {\n");
      out.write("                divCartasVermelhas.style.backgroundImage = \"url(\" + baralhoVermelho[0].imagem + \")\";\n");
      out.write("                divCartasVermelhas.style.backgroundSize = \"contain\";\n");
      out.write("                nomeVermelho.innerHTML = baralhoVermelho[0].nome;\n");
      out.write("                caracteristicasVermelhoInteligencia.innerHTML = \"Inteligência: \" + baralhoVermelho[0].inteligencia;\n");
      out.write("                caracteristicasVermelhoForca.innerHTML = \"<br>Força: \" + baralhoVermelho[0].forca;\n");
      out.write("                caracteristicasVermelhoVelocidade.innerHTML = \"<br>Velocidade: \" + baralhoVermelho[0].velocidade;\n");
      out.write("                caracteristicasVermelhoResistencia.innerHTML = \"<br>Resistência: \" + baralhoVermelho[0].resistencia;\n");
      out.write("                divCartasVermelhas.style.pointerEvents = \"auto\";\n");
      out.write("                nomeVermelho.style.display = \"block\";\n");
      out.write("                caracteristicasVermelho.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function vermelhoClicar() {\n");
      out.write("                divCartasVermelhas.style.backgroundColor = \"red\";\n");
      out.write("                divCartasVermelhas.style.backgroundImage = \"none\";\n");
      out.write("                divCartasVermelhas.style.pointerEvents = \"auto\";\n");
      out.write("                nomeVermelho.style.display = \"none\";\n");
      out.write("                caracteristicasVermelho.style.display = \"none\";\n");
      out.write("                verificaMaiorQualidadeAzul();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function vermelhoEstatico() {\n");
      out.write("                divCartasVermelhas.style.backgroundColor = \"red\";\n");
      out.write("                divCartasVermelhas.style.backgroundImage = \"none\";\n");
      out.write("                divCartasVermelhas.style.pointerEvents = \"none\";\n");
      out.write("                nomeVermelho.style.display = \"none\";\n");
      out.write("                caracteristicasVermelho.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function azulEstatico() {\n");
      out.write("                divCartasAzuis.style.backgroundColor = \"blue\";\n");
      out.write("                divCartasAzuis.style.backgroundImage = \"none\";\n");
      out.write("                divCartasAzuis.style.pointerEvents = \"none\";\n");
      out.write("                nomeAzul.style.display = \"none\";\n");
      out.write("                caracteristicasAzuis.style.display = \"none\";\n");
      out.write("\n");
      out.write("                verificaMaiorQualidadeAzul();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function apareceAzul() {\n");
      out.write("                divCartasAzuis.style.backgroundImage = \"url(\" + baralhoAzul[0].imagem + \")\";\n");
      out.write("                divCartasAzuis.style.backgroundSize = \"contain\";\n");
      out.write("                nomeAzul.innerHTML = baralhoAzul[0].nome;\n");
      out.write("                caracteristicasAzulInteligencia.innerHTML = \"Inteligência: \" + baralhoAzul[0].inteligencia;\n");
      out.write("                caracteristicasAzulForca.innerHTML = \"<br>Força: \" + baralhoAzul[0].forca;\n");
      out.write("                caracteristicasAzulVelocidade.innerHTML = \"<br>Velocidade: \" + baralhoAzul[0].velocidade;\n");
      out.write("                caracteristicasAzulResistencia.innerHTML = \"<br>Resistência: \" + baralhoAzul[0].resistencia;\n");
      out.write("                nomeAzul.style.display = \"block\";\n");
      out.write("                caracteristicasAzuis.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function desapareceAzul() {\n");
      out.write("                divCartasAzuis.style.backgroundImage = \"blue\";\n");
      out.write("                divCartasAzuis.style.backgroundImage = \"none\";\n");
      out.write("                nomeAzul.innerHTML = \"\";\n");
      out.write("                caracteristicasAzulInteligencia.innerHTML = \"\";\n");
      out.write("                caracteristicasAzulForca.innerHTML = \"\";\n");
      out.write("                caracteristicasAzulVelocidade.innerHTML = \"\";\n");
      out.write("                caracteristicasAzulResistencia.innerHTML = \"\";\n");
      out.write("                divCartasAzuis.style.pointerEvents = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cartas_pro_cemiterio_vermelho() {\n");
      out.write("                cemiterioVermelho.push(baralhoVermelho[0]);\n");
      out.write("                cemiterioVermelho.push(baralhoAzul[0]);\n");
      out.write("                baralhoVermelho.splice(0, 1);\n");
      out.write("                baralhoAzul.splice(0, 1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cartas_pro_cemiterio_azul() {\n");
      out.write("                cemiterioAzul.push(baralhoVermelho[0]);\n");
      out.write("                cemiterioAzul.push(baralhoAzul[0]);\n");
      out.write("                baralhoAzul.splice(0, 1);\n");
      out.write("                baralhoVermelho.splice(0, 1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function reset() {\n");
      out.write("                vermelhoEstatico();\n");
      out.write("                azulEstatico();\n");
      out.write("                verificaMaiorQualidadeAzul();\n");
      out.write("\n");
      out.write("                cartaVirada = false;\n");
      out.write("                caracteristicasVermelhoInteligencia.style.pointerEvents = 'auto';\n");
      out.write("                caracteristicasVermelhoForca.style.pointerEvents = 'auto';\n");
      out.write("                caracteristicasVermelhoVelocidade.style.pointerEvents = 'auto';\n");
      out.write("                caracteristicasVermelhoResistencia.style.pointerEvents = 'auto';\n");
      out.write("\n");
      out.write("                caracteristicasVermelhoInteligencia.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasVermelhoForca.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasVermelhoVelocidade.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasVermelhoResistencia.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasAzulInteligencia.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasAzulForca.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasAzulVelocidade.style.backgroundColor = \"\";\n");
      out.write("                caracteristicasAzulResistencia.style.backgroundColor = \"\";\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function azulEscolhe() {\n");
      out.write("                apareceVermelho();\n");
      out.write("                divCartasVermelhas.style.pointerEvents = \"none\";\n");
      out.write("                apareceAzul();\n");
      out.write("\n");
      out.write("                if (maiorQualidadeAzul == \"inteligencia\") {\n");
      out.write("                    inteligencia();\n");
      out.write("                }\n");
      out.write("                if (maiorQualidadeAzul == \"forca\") {\n");
      out.write("                    forca();\n");
      out.write("                }\n");
      out.write("                if (maiorQualidadeAzul == \"velocidade\") {\n");
      out.write("                    velocidade();\n");
      out.write("                }\n");
      out.write("                if (maiorQualidadeAzul == \"resistencia\") {\n");
      out.write("                    resistencia();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function tempoResetar() {\n");
      out.write("                intervalo = setTimeout(reset, 3000);\n");
      out.write("                intervalo = setTimeout(caracteristicasVermelhoInteligencia.style.pointerEvents = 'none', 3000);\n");
      out.write("                intervalo = setTimeout(caracteristicasVermelhoForca.style.pointerEvents = 'none', 3000);\n");
      out.write("                intervalo = setTimeout(caracteristicasVermelhoVelocidade.style.pointerEvents = 'none', 3000);\n");
      out.write("                intervalo = setTimeout(caracteristicasVermelhoResistencia.style.pointerEvents = 'none', 3000);\n");
      out.write("                intervlao = setTimeout(apareceVermelho, 3000);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function verificarVencedor() {\n");
      out.write("                if (cemiterioAzul.length > cemiterioVermelho.length && baralhoVermelho.length == 0 && baralhoAzul.length == 0) {\n");
      out.write("                    intervalo = setTimeout(function () {\n");
      out.write("                        alert(\"PC WINS\");\n");
      out.write("                    }, 300);\n");
      out.write("                    btnJogarDnv.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("                if (cemiterioAzul.length < cemiterioVermelho.length && baralhoVermelho.length == 0 && baralhoAzul.length == 0) {\n");
      out.write("                    intervalo = setTimeout(function () {\n");
      out.write("                        alert(\"VC WINS\");\n");
      out.write("                    }, 300);\n");
      out.write("                    btnJogarDnv.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("                if (cemiterioAzul.length == cemiterioVermelho.length && baralhoVermelho.length == 0 && baralhoAzul.length == 0) {\n");
      out.write("                    intervalo = setTimeout(function () {\n");
      out.write("                        alert(\"EMPATE\");\n");
      out.write("                    }, 300);\n");
      out.write("                    btnJogarDnv.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function inteligencia() {\n");
      out.write("                if (baralhoVermelho[0].inteligencia > baralhoAzul[0].inteligencia) {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_vermelho();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoInteligencia.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulInteligencia.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    verificarVencedor();\n");
      out.write("                } else {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_azul();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoInteligencia.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulInteligencia.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    intervalo = setTimeout(vermelhoEstatico, 3000);\n");
      out.write("                    intervalo = setTimeout(azulEscolhe, 6000);\n");
      out.write("                    verificarVencedor();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function forca() {\n");
      out.write("                if (baralhoVermelho[0].forca > baralhoAzul[0].forca) {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_vermelho();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoForca.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulForca.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    verificarVencedor();\n");
      out.write("                } else {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_azul();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoForca.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulForca.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    intervalo = setTimeout(vermelhoEstatico, 3000);\n");
      out.write("                    intervalo = setTimeout(azulEscolhe, 6000);\n");
      out.write("                    verificarVencedor();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function velocidade() {\n");
      out.write("                if (baralhoVermelho[0].velocidade > baralhoAzul[0].velocidade) {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_vermelho();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoVelocidade.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulVelocidade.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    verificarVencedor();\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_azul();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoVelocidade.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulVelocidade.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    intervalo = setTimeout(vermelhoEstatico, 3000);\n");
      out.write("                    intervalo = setTimeout(azulEscolhe, 6000);\n");
      out.write("                    verificarVencedor();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function resistencia() {\n");
      out.write("                if (baralhoVermelho[0].resistencia > baralhoAzul[0].resistencia) {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_vermelho();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoResistencia.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulResistencia.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    verificarVencedor();\n");
      out.write("                } else {\n");
      out.write("                    apareceAzul();\n");
      out.write("                    cartas_pro_cemiterio_vermelho();\n");
      out.write("                    intervalo = setTimeout(caracteristicasVermelhoResistencia.style.backgroundColor = \"red\", 3000);\n");
      out.write("                    intervalo = setTimeout(caracteristicasAzulResistencia.style.backgroundColor = \"green\", 3000);\n");
      out.write("                    tempoResetar();\n");
      out.write("                    intervalo = setTimeout(vermelhoEstatico, 3000);\n");
      out.write("                    intervalo = setTimeout(azulEscolhe, 6000);\n");
      out.write("                    verificarVencedor();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function jogadnv() {\n");
      out.write("                baralhoVermelho.splice(0, baralhoVermelho.length);\n");
      out.write("                baralhoAzul.splice(0, baralhoAzul.length);\n");
      out.write("                cemiterioVermelho.splice(0, cemiterioVermelho.length);\n");
      out.write("                cemiterioAzul.splice(0, cemiterioAzul.length);\n");
      out.write("                tempoResetar();\n");
      out.write("                inicia();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
