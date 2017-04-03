package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Sesion;

public final class Estudiante_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body { \r\n");
      out.write("                background-image: url(\"1.png\");\r\n");
      out.write("                background-position: left top;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-attachment: fixed;\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("                table, td, tr {\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("               \r\n");
      out.write("            } .bar {\r\n");
      out.write("                \r\n");
      out.write("                border: #16a085 2px solid;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("            }#head {\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                background-color: #16a085  ;\r\n");
      out.write("            } #ini {\r\n");
      out.write("                background-color:  #008080  ;\r\n");
      out.write("            }\r\n");
      out.write("            #tuto {\r\n");
      out.write("                background-color: #008080;\r\n");
      out.write("            }\r\n");
      out.write("            #calen {\r\n");
      out.write("                background-color: #008080;\r\n");
      out.write("            }\r\n");
      out.write("            #prog {\r\n");
      out.write("                background-color: #008080;\r\n");
      out.write("            }\r\n");
      out.write("            #histo {\r\n");
      out.write("                background-color: #008080;\r\n");
      out.write("            }\r\n");
      out.write("            #cali {\r\n");
      out.write("                background-color: #008080;\r\n");
      out.write("            } a:link {\r\n");
      out.write("                color: white ;\r\n");
      out.write("            }\r\n");
      out.write("            a:visited {\r\n");
      out.write("                color: white ;\r\n");
      out.write("            }\r\n");
      out.write("            a:hover {\r\n");
      out.write("                color: white ;\r\n");
      out.write("            }\r\n");
      out.write("            a:active {\r\n");
      out.write("                color: white ;\r\n");
      out.write("            } \r\n");
      out.write("        </style>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <div style=\"position: fixed; left:0; top:0\"><img src=\"Uteach.png\" width=\"1363\" height=\"230\"/></div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <center>\r\n");
      out.write("        <table width=\"80%\" id=\"bodyTutor\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"100%\" colspan=\"2\" id=\"head\">\r\n");
      out.write("                    <img src=\"user.png\" align=\"right\" width=\"100\" height=\"100\">\r\n");
      out.write("                    <div align=\"right\">\r\n");
      out.write("                        \r\n");
      out.write("                    <a href=\"\" >Modificar Perfil</a><br>\r\n");
      out.write("                    <a href=\"FormularioUsuario.jsp\" >Cerrar Sesion</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>    \r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td width=\"30%\">\r\n");
      out.write("                <table width=\"100%\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"bar\" id=\"ini\">\r\n");
      out.write("                            <a href=\"\" >Inicio</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"bar\" id=\"tuto\">\r\n");
      out.write("                            <a href=\"\" >Consultar Tutorias</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"bar\" id=\"calen\">\r\n");
      out.write("                            <a href=\"TutoriaSesion.jsp\" >Programar Tutorias</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"bar\" id=\"prog\">\r\n");
      out.write("                            <a href=\"\" >Historial de tutorias</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"bar\" id=\"histo\">\r\n");
      out.write("                            <a href=\"\">Mi Calificacion</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>  \r\n");
      out.write("            </td>   \r\n");
      out.write("            <form method=\"GET\" action=\"ServletSesion\">\r\n");
      out.write("            <td width=\"70%\">");
      out.write("\r\n");
      out.write("                 <table width=\"400\" border=\"2\" align=\"center\">\r\n");
      out.write("                                <caption align=\"top\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th width=\"84\" scope=\"col\"><strong>TEMA </strong></th>\r\n");
      out.write("                                    <th width=\"84\" scope=\"col\"><strong>FECHA</strong></th>\r\n");
      out.write("                                    <th width=\"84\" scope=\"col\"><strong>PRECIO </strong></th>\r\n");
      out.write("                                    <th width=\"84\" scope=\"col\"><strong>HORA</strong></th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </caption>\r\n");
      out.write("                                ");

                                    if (request.getAttribute("sesion") != null) {
                                        ArrayList<Sesion> s = (ArrayList<Sesion>) request.getAttribute("sesion");
                                        for (Sesion p : s) {
                                
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>");
      out.print( p.getTema() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( p.getFecha() );
      out.write("</td>\r\n");
      out.write("                                    <td>");
      out.print( p.getPrecio() );
      out.write("</td>\r\n");
      out.write("                                     <td>");
      out.print( p.getHora() );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");

                                        }
                                    }

                                
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                            </table>\r\n");
      out.write("                                      <input type=\"submit\" name =\"Actualizar\"/><br/>  \r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        </center>\r\n");
      out.write("           </form>\r\n");
      out.write("    </body>\r\n");
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
