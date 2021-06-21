<%--
  Created by IntelliJ IDEA.
  User: syw
  Date: 2021/4/22
  Time: 9:15 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<%--
文件上传表单
    1 设置表单提交方式 method= post
    2 设置表单类行为二进制表单 enctype= multiply/form-data
    3 设置表单元素的name属性值（file文件域）
--%>
<form method="post" action="uploadServlet" enctype="multipart/form-data">

   <br>
    文件：<input type="file" name="myfile"><br>
    <button type="submit">提交</button>

</form>


</body>
</html>
