<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
</head>
<body>

    <sql:query var="result" dataSource="jdbc/wbr">
        select * from wbr.repl_vwbr_user_nextel where cd_login_user = 'CRMORAIS'
    </sql:query>


	<table>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.no_usuario}" /></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>