<%=request.getAttribute("loginUser")%>

<form action="${pageContext.request.contextPath}/" method="post">

	<input type="text" name="col1"></input>
	<input class="btn btn-primary" type="submit" value="enviar"></input>	

</form>