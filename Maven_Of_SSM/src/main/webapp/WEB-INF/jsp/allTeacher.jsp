<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户列表</title>
</head>
<body>
    <table border="1">
        <tbody>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
                <th>操作</th>
            </tr>
            <c:if test="${!empty list }">
                <c:forEach items="${list}" var="teacher">
                    <tr>
                        <td>${teacher.name }</td>
                        <td>${teacher.password }</td>
                        <td><a href="">编辑</a>
                            <a href="">删除</a></td>
                    </tr>
                </c:forEach>
            </c:if>
        </tbody>
    </table>
</body>
</html>