package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TutoriaSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <style type=\"text/css\">\n");
      out.write("            h3.panel-title {text-align: center}\n");
      out.write("            body.fondo{background-color: #acc7dc }\n");
      out.write("            div.panel-default > div.panel-heading {\n");
      out.write("                    background-color: #dfeef3;\n");
      out.write("            }\n");
      out.write("            div.botones{text-align: center}\n");
      out.write("            div.horas.input-group{display: inline}\n");
      out.write("         </style>\n");
      out.write("       <title>Tutoria</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/menu.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body class=\"fondo\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <div class=\"login-panel panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">Completar solicitud</h3>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"login\" />\n");
      out.write("                                   <form role=\"form\" method=\"POST\" action=\"ServletSesion\">\n");
      out.write("                                       \n");
      out.write("                                                    <input type=\"hidden\" name=\"action\" value=\"CrearSesion\" />\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label>Tema: </label>\n");
      out.write("                                                        <input  name=\"temaSolicitud\" class=\"form-control\">                                                    \n");
      out.write("                                                    </div>                                                \n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label>Fecha: </label>\n");
      out.write("                                                        <input name=\"fechaSolicitud\" class=\"form-control\">                                                    \n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label>Hora: </label>\n");
      out.write("                                                        <hr>\n");
      out.write("                                                        <div class=\"horas\">\n");
      out.write("                                                        De:<input name=\"HoraDe\" class=\"form-control\" >\n");
      out.write("                                                        Hasta:<input name=\"HoraHasta\" class=\"form-control\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                       \n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"botones\"> \n");
      out.write("                                                        <button type=\"submit\" value=\"crear\" class=\"btn btn  btn-primary btn-block\">Insertar</a><br/>\n");
      out.write("                                                        <button type=\"reset\" class=\"btn btn  btn-primary btn-block\">Limpiar </button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
