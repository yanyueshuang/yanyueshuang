<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8"/>
    <title>Krajee JQuery Plugins - &copy; Kartik</title>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
    <script src="<%=request.getContextPath()%>/js/jquery-2.0.3.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/fileinput.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<div class="container kv-main">

    <br>
    <form enctype="multipart/form-data"  method="post" action="<%=request.getContextPath()%>/image/imageServlet.do?method=saveImage">

        <div class="form-group">
            <input id="file-1" type="file" multiple class="file" data-overwrite-initial="false" data-min-file-count="2">
        </div>
        <div>
            <input type="submit" value="提交">
        </div>
    </form>
</div>
</body>
<script>

    $("#file-1").fileinput({
        uploadUrl: '#', // you must set a valid URL here else you will get an error
        allowedFileExtensions : ['jpg', 'png','gif'],
        overwriteInitial: false,
        maxFileSize: 1000,
        maxFilesNum: 10,
        //allowedFileTypes: ['image', 'video', 'flash'],
        slugCallback: function(filename) {
            return filename.replace('(', '_').replace(']', '_');
        }
    });

</script>
</html>
