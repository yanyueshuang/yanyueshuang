/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.33.v20201020
 * Generated at: 2021-02-18 12:45:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_005f02_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/software/maven_bendi/myrepository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
    _jspx_dependants.put("file:/D:/software/maven_bendi/myrepository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1606306120197L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title>Pipeline Bootstrap 4.0 Theme</title>\r\n");
      out.write("    <!-- load stylesheets -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400\">\r\n");
      out.write("    <!-- Google web font \"Open Sans\", https://fonts.google.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/font-awesome-4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Font Awesome, http://fontawesome.io/ -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/css/magnific-popup.css\">\r\n");
      out.write("    <!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/css/templatemo-style.css\">\r\n");
      out.write("    <!-- Templatemo style -->\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("    <section id=\"welcome\" class=\"tm-content-box tm-banner margin-b-10\">\r\n");
      out.write("        <div class=\"tm-banner-inner\">\r\n");
      out.write("            <h1 class=\"tm-banner-title\">电子相册</h1>\r\n");
      out.write("              <a href=\"");
      out.print(request.getContextPath());
      out.write("/add.jsp\"\r\n");
      out.write("                                               class=\"tm-nav-item-link tm-button\"> <i\r\n");
      out.write("                            class=\"fa fa-image tm-nav-fa\"></i>上传图片\r\n");
      out.write("                    </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"tm-body\">\r\n");
      out.write("        <div class=\"tm-sidebar\">\r\n");
      out.write("            <nav class=\"tm-main-nav\">\r\n");
      out.write("                <ul class=\"tm-main-nav-ul\">\r\n");
      out.write("                    <li class=\"tm-nav-item\"><a href=\"#welcome\"\r\n");
      out.write("                                               class=\"tm-nav-item-link tm-button\"> <i\r\n");
      out.write("                            class=\"fa fa-smile-o tm-nav-fa\"></i>Welcome\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"tm-nav-item\"><a href=\"#gallery\"\r\n");
      out.write("                                               class=\"tm-nav-item-link tm-button\"> <i\r\n");
      out.write("                            class=\"fa fa-image tm-nav-fa\"></i>Image Gallery\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"tm-main-content\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tm-content-box tm-content-box-home\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/img/1200x800-01.jpg\"\r\n");
      out.write("                     alt=\"Image 1\" class=\"img-fluid tm-welcome-img\">\r\n");
      out.write("                <div class=\"tm-welcome-boxes-container\">\r\n");
      out.write("                    <div class=\"tm-welcome-box\">\r\n");
      out.write("                        <div class=\"tm-welcome-text\">\r\n");
      out.write("                            <h2 class=\"tm-section-title\">Aliquam ante sapien</h2>\r\n");
      out.write("                            <p>Duis vel elit eu eros dapibus vestibulum vel vel nibh.\r\n");
      out.write("                                Nulla id ornare eros, at efficitur risus.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"#\" class=\"tm-welcome-link tm-button\">Learn More</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tm-welcome-box\">\r\n");
      out.write("                        <div class=\"tm-welcome-text\">\r\n");
      out.write("                            <h2 class=\"tm-section-title\">Lorem ipsum dolor</h2>\r\n");
      out.write("                            <p>Vivamus eleifend ac turpis sit amet maximus. Nulla in\r\n");
      out.write("                                faucibus nisl, ut ultrices magna.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"#\" class=\"tm-welcome-link tm-button\">Read Details</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"copyrights\">\r\n");
      out.write("                Collect from <a href=\"http://www.cssmoban.com/\">企业网站模板</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"gallery\" class=\"tm-content-box\">\r\n");
      out.write("                <div class=\"grid tm-gallery\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- load JS files -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<!-- jQuery (https://jquery.com/download/) -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/tether.min.js\"></script>\r\n");
      out.write("<!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) -->\r\n");
      out.write("<script\r\n");
      out.write("        src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("<!-- Magnific pop-up (http://dimsemenov.com/plugins/magnific-popup/) -->\r\n");
      out.write("<script\r\n");
      out.write("        src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.singlePageNav.min.js\"></script>\r\n");
      out.write("<!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->\r\n");
      out.write("\r\n");
      out.write("<!-- Templatemo scripts -->\r\n");
      out.write("<script>\r\n");
      out.write("    $(function() {\r\n");
      out.write("\r\n");
      out.write("        //鼠标停留2秒后相应时间\r\n");
      out.write("        var shi = '';\r\n");
      out.write("        var headl = null;\r\n");
      out.write("        $(\".effect-bubba\").mouseover(function() {\r\n");
      out.write("            shi = $(this)\r\n");
      out.write("            headl = setTimeout(function() {\r\n");
      out.write("                var se = confirm(\"您确定要删除这张图片吗!\");\r\n");
      out.write("                if (se == true) {\r\n");
      out.write("                    //异步删除图片\r\n");
      out.write("\r\n");
      out.write("                    //获取id\r\n");
      out.write("                    var imageId =  shi.children(\"span\").text();\r\n");
      out.write("                    $.post(\"");
      out.print(request.getContextPath());
      out.write("/image/imageServlet.do?method=deleteImageByImageId\",{\r\n");
      out.write("                        imageId:imageId\r\n");
      out.write("                    },function (data) {\r\n");
      out.write("                        if(data==true){\r\n");
      out.write("                            location.reload();\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                    })\r\n");
      out.write("                } else {\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }, 2000)\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }).mouseout(function () {\r\n");
      out.write("            clearTimeout(headl)\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    function setNavbar() {\r\n");
      out.write("        if ($(document).scrollTop() > 160) {\r\n");
      out.write("            $('.tm-sidebar').addClass('sticky');\r\n");
      out.write("        } else {\r\n");
      out.write("            $('.tm-sidebar').removeClass('sticky');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("        // Single page nav\r\n");
      out.write("        $('.tm-main-nav').singlePageNav({\r\n");
      out.write("            'currentClass' : \"active\",\r\n");
      out.write("            offset : 20\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // Detect window scroll and change navbar\r\n");
      out.write("        setNavbar();\r\n");
      out.write("\r\n");
      out.write("        $(window).scroll(function() {\r\n");
      out.write("            setNavbar();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // Magnific pop up\r\n");
      out.write("        $('.tm-gallery').magnificPopup({\r\n");
      out.write("            delegate : 'a', // child items selector, by clicking on it popup will open\r\n");
      out.write("            type : 'image',\r\n");
      out.write("            gallery : {\r\n");
      out.write("                enabled : true\r\n");
      out.write("            }\r\n");
      out.write("            // other options\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /index_02.jsp(102,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("image");
      // /index_02.jsp(102,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index_02.jsp(102,20) '${imageList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${imageList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <figure class=\"effect-bubba\">\r\n");
            out.write("                            <img\r\n");
            out.write("                                    src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${image.imagename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"Image 8\" class=\"img-fluid\"\r\n");
            out.write("                                    style=\"height: 300px\"  onmouseover=\"\">\r\n");
            out.write("                            <figcaption>\r\n");
            out.write("                                <h2>\r\n");
            out.write("                                    Light <span>Bridge</span>\r\n");
            out.write("                                </h2>\r\n");
            out.write("                                <p>Fusce faucibus metus in augue</p>\r\n");
            out.write("                                <a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${image.imagename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" style=\"height: 500px; width: 500px\">View\r\n");
            out.write("                                    more</a>\r\n");
            out.write("                            </figcaption>\r\n");
            out.write("                            <span style=\"display: none\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${image.imgaeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("                        </figure>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
