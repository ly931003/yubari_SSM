<#assign projectName= "yubari"/>
<!DOCTYPE html>
<html lang="zh">
<head>
    <title>List</title>
</head>
<body>
更新时间：<%=new Date()%><br>
<table>
    <tr>
        <th>名称</th>
        <th>价格</th>
        <th>描述</th>
        <th>日期</th>
        <th>操作</th>
    </tr>
    <#list Items as item>
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.detail}</td>
            <td>${item.createtime?string("yyyy-MM-dd")}</td>
            <td><a href="/items/delete.do?id=${item.id}">删除</a>
                <a href="/items/edit.do?id=${item.id}">修改</a></td>
        </tr>
    </#list>
</table>
<br>${projectName}
</body>
</html>
