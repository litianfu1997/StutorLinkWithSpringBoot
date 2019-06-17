<%--
  Created by IntelliJ IDEA.
  User: litianfu
  Date: 2019-06-12
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script>
        //页面加载
        $(function () {
            $("#btn").click(function () {
                var userCode = $("#userCode").val();
                alert("已提交")
                var userName = $("#userName").val();
                var password = $("#password").val();
                var birthday = $("#birthday").val();
                var professional = $("#professional").val();
                var sex = $("#sex").val();
                var userPhone = $("#userPhone").val();
                $.ajax({
                    url:"user/register.action",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"userCode":'+userCode+',"userName":'+userName+',"password":'+password+',"birthday":'+birthday+',"professional":'+professional+',"sex":'+sex+',"userPhone":'+userPhone+'}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应之后的json的数据，进行解析

                    }
                })
            })
        })
    </script>
</head>
    <body>

        用户名：<input type="text" id="userCode"><br>
        昵称：<input type="text" id="userName"><br>
        密码：<input type="text" id="password"><br>
        生日：<input type="text" id="birthday"><br>
        职业：<input type="text" id="professional"><br>
        性别：<input type="text" id="sex"><br>
        手机号码：<input type="text" id="userPhone"><br>
        <input type="button" value="提交" id="btn">

    </body>
</html>
