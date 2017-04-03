package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            h3.panel-title {text-align: center}\r\n");
      out.write("            body.fondo{background-color: #acc7dc }\r\n");
      out.write("            div.panel-default > div.panel-heading {\r\n");
      out.write("                background-color: #dfeef3;\r\n");
      out.write("            }\r\n");
      out.write("            body { \r\n");
      out.write("                background-image: url(\"1.png\");\r\n");
      out.write("                background-position: left top;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-attachment: fixed;\r\n");
      out.write("            }\r\n");
      out.write("            div.botones{text-align: center}\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Usuario</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/menu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    </head\r\n");
      out.write("\r\n");
      out.write("    <body class=\"fondo\">\r\n");
      out.write("    <body class=\"fondo\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                    <div class=\"login-panel panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h3 class=\"panel-title\">Registrar Usuario</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <form method=\"POST\" action=\"ServletUsuario\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>correo: </label>\r\n");
      out.write("                                    <input type=\"text\" name=\"correo\"class=\"form-control\">                                                 \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>contraseña: </label>\r\n");
      out.write("                                    <input type=\"password\" name=\"contrasena\"class=\"form-control\">                                                 \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>nombre: </label>\r\n");
      out.write("                                    <input type=\"text\" name=\"nombre\"class=\"form-control\">                                                 \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>programa: </label>\r\n");
      out.write("                                    <input type=\"text\" name=\"programa\"class=\"form-control\">                                               \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>semestre: </label>\r\n");
      out.write("                                    <input type=\"number\" name=\"semestre\"class=\"form-control\">                                             \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label>tipo: </label>\r\n");
      out.write("                                    <select name=\"tipo\"class=\"form-control\">\r\n");
      out.write("                                        <option value=\"1\" selected>Estudiante</option>\r\n");
      out.write("                                        <option value=\"2\" selected=>Tutor</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"botones\"> \r\n");
      out.write("                                    <button type=\"submit\" value=\"crear\" class=\"btn btn  btn-primary btn-block\">Registrar</a><br/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </center>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </body>\r\n");
      out.write("</html>\r\n");
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
