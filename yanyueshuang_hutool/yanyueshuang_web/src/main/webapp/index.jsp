<%@ page contentType="text/html; charset=utf-8" language="java"
         import="java.sql.*" errorPage="" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/userServlet.do?method=findUserByNameAndPassoword" method="post">
    <div class="form-group">
        <label for="exampleInputPassword1">用户名</label>
        <input type="text" class="form-control" id="exampleInputPassword1" placeholder="用户名" name="username" value="zhangsan">
    </div>    <div class="form-group">
        <label for="exampleInputEmail1">登录</label>
        <input type="password" class="form-control" id="exampleInputEmail1" placeholder="名称" name="userpassword" value="t7z3r8h5">
    </div>

    <button type="submit" class="btn btn-default">登录</button>
</form>
</body>
</html>