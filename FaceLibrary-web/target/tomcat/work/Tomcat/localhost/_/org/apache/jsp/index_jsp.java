/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-09 08:01:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>员工列表</title>\r\n");

	pageContext.setAttribute("APP_PATH", request.getContextPath());

      out.write("\r\n");
      out.write("<!-- web路径：\r\n");
      out.write("不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。\r\n");
      out.write("以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名\r\n");
      out.write("\t\thttp://localhost:3306/crud\r\n");
      out.write(" -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<link href=\"static/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<!-- 按钮 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-8\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary\" id=\"emp_add_modal_btn\">新增</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-danger\" id=\"emp_delete_all_btn\">删除</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 显示表格数据 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\" id=\"emps_table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"check_all\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>#</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>访客时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>用户id</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>图片</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>用户名</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 显示分页信息 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<!--分页文字信息  -->\r\n");
      out.write("\t\t\t<div class=\"col-md-6\" id=\"page_info_area\"></div>\r\n");
      out.write("\t\t\t<!-- 分页条信息 -->\r\n");
      out.write("\t\t\t<div class=\"col-md-6\" id=\"page_nav_area\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tvar totalRecord,currentPage;\r\n");
      out.write("\t//1、页面加载完成以后，直接去发送ajax请求,要到分页数据\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//去首页\r\n");
      out.write("\t\tto_page(1);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction to_page(pn){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/faces\",\r\n");
      out.write("\t\t\tdata:\"pn=\"+pn,\r\n");
      out.write("\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t//console.log(result);\r\n");
      out.write("\t\t\t\t//1、解析并显示员工数据\r\n");
      out.write("\t\t\t\tbuild_emps_table(result);\r\n");
      out.write("\t\t\t\t//2、解析并显示分页信息\r\n");
      out.write("\t\t\t\tbuild_page_info(result);\r\n");
      out.write("\t\t\t\t//3、解析显示分页条数据\r\n");
      out.write("\t\t\t\tbuild_page_nav(result);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction build_emps_table(result){\r\n");
      out.write("\t\t//清空table表格\r\n");
      out.write("\t\t$(\"#emps_table tbody\").empty();\r\n");
      out.write("\t\tvar emps = result.extend.pageInfo.list;\r\n");
      out.write("\t\t$.each(emps,function(index,item){\r\n");
      out.write("\t\t\tvar checkBoxTd = $(\"<td><input type='checkbox' class='check_item'/></td>\");\r\n");
      out.write("\t\t\tvar flId = $(\"<td></td>\").append(item.flId );\r\n");
      out.write("\t\t\tvar userId = $(\"<td></td>\").append(item.userId);\r\n");
      out.write("\t\t\tvar userName = $(\"<td></td>\").append(item.userName);\r\n");
      out.write("\t\t\tvar  flDate= $(\"<td></td>\").append(getHoursTime(item.flDate));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t<button class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t编辑\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\tvar editBtn = $(\"<button></button>\").addClass(\"btn btn-primary btn-sm edit_btn\")\r\n");
      out.write("\t\t\t\t\t\t\t.append($(\"<span></span>\").addClass(\"glyphicon glyphicon-pencil\")).append(\"编辑\");\r\n");
      out.write("\t\t\t//为编辑按钮添加一个自定义的属性，来表示当前员工id\r\n");
      out.write("\t\t\teditBtn.attr(\"edit-id\",item.flId );\r\n");
      out.write("\t\t\tvar delBtn =  $(\"<button></button>\").addClass(\"btn btn-danger btn-sm delete_btn\")\r\n");
      out.write("\t\t\t\t\t\t\t.append($(\"<span></span>\").addClass(\"glyphicon glyphicon-trash\")).append(\"删除\");\r\n");
      out.write("\t\t\t//为删除按钮添加一个自定义的属性来表示当前删除的员工id\r\n");
      out.write("\t\t\tdelBtn.attr(\"del-id\",item.flId);\r\n");
      out.write("\t\t\tvar btnTd = $(\"<td></td>\").append(editBtn).append(\" \").append(delBtn);\r\n");
      out.write("\t\t\t//var delBtn = \r\n");
      out.write("\t\t\t//append方法执行完成以后还是返回原来的元素\r\n");
      out.write("\t\t\t$(\"<tr></tr>\").append(checkBoxTd)\r\n");
      out.write("\t\t\t\t.append(flId)\r\n");
      out.write("\t\t\t\t.append(userId)\r\n");
      out.write("\t\t\t\t.append(userName)\r\n");
      out.write("\t\t\t\t.append(flDate)\r\n");
      out.write("\t\t\t\t.append(btnTd)\r\n");
      out.write("\t\t\t\t.appendTo(\"#emps_table tbody\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t//解析显示分页信息\r\n");
      out.write("\tfunction build_page_info(result){\r\n");
      out.write("\t\t$(\"#page_info_area\").empty();\r\n");
      out.write("\t\t$(\"#page_info_area\").append(\"当前\"+result.extend.pageInfo.pageNum+\"页,总\"+\r\n");
      out.write("\t\t\t\tresult.extend.pageInfo.pages+\"页,总\"+\r\n");
      out.write("\t\t\t\tresult.extend.pageInfo.total+\"条记录\");\r\n");
      out.write("\t\ttotalRecord = result.extend.pageInfo.total;\r\n");
      out.write("\t\tcurrentPage = result.extend.pageInfo.pageNum;\r\n");
      out.write("\t}\r\n");
      out.write("\t//解析显示分页条，点击分页要能去下一页....\r\n");
      out.write("\tfunction build_page_nav(result){\r\n");
      out.write("\t\t//page_nav_area\r\n");
      out.write("\t\t$(\"#page_nav_area\").empty();\r\n");
      out.write("\t\tvar ul = $(\"<ul></ul>\").addClass(\"pagination\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//构建元素\r\n");
      out.write("\t\tvar firstPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\").attr(\"href\",\"#\"));\r\n");
      out.write("\t\tvar prePageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&laquo;\"));\r\n");
      out.write("\t\tif(result.extend.pageInfo.hasPreviousPage == false){\r\n");
      out.write("\t\t\tfirstPageLi.addClass(\"disabled\");\r\n");
      out.write("\t\t\tprePageLi.addClass(\"disabled\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t//为元素添加点击翻页的事件\r\n");
      out.write("\t\t\tfirstPageLi.click(function(){\r\n");
      out.write("\t\t\t\tto_page(1);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tprePageLi.click(function(){\r\n");
      out.write("\t\t\t\tto_page(result.extend.pageInfo.pageNum -1);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar nextPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&raquo;\"));\r\n");
      out.write("\t\tvar lastPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"末页\").attr(\"href\",\"#\"));\r\n");
      out.write("\t\tif(result.extend.pageInfo.hasNextPage == false){\r\n");
      out.write("\t\t\tnextPageLi.addClass(\"disabled\");\r\n");
      out.write("\t\t\tlastPageLi.addClass(\"disabled\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tnextPageLi.click(function(){\r\n");
      out.write("\t\t\t\tto_page(result.extend.pageInfo.pageNum +1);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tlastPageLi.click(function(){\r\n");
      out.write("\t\t\t\tto_page(result.extend.pageInfo.pages);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//添加首页和前一页 的提示\r\n");
      out.write("\t\tul.append(firstPageLi).append(prePageLi);\r\n");
      out.write("\t\t//1,2，3遍历给ul中添加页码提示\r\n");
      out.write("\t\t$.each(result.extend.pageInfo.navigatepageNums,function(index,item){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar numLi = $(\"<li></li>\").append($(\"<a></a>\").append(item));\r\n");
      out.write("\t\t\tif(result.extend.pageInfo.pageNum == item){\r\n");
      out.write("\t\t\t\tnumLi.addClass(\"active\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tnumLi.click(function(){\r\n");
      out.write("\t\t\t\tto_page(item);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tul.append(numLi);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//添加下一页和末页 的提示\r\n");
      out.write("\t\tul.append(nextPageLi).append(lastPageLi);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//把ul加入到nav\r\n");
      out.write("\t\tvar navEle = $(\"<nav></nav>\").append(ul);\r\n");
      out.write("\t\tnavEle.appendTo(\"#page_nav_area\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
