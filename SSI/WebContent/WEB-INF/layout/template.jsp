<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>

<title><tiles:getAsString name="title" /></title>

<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/static/css/nii.css"
	rel="stylesheet" type="text/css" />		
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/css/bootstrap.min.css" />

<script
	src="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/css/bootstrap.min.css"></script>
<script
	src="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/jquery/3.1.1-1/jquery.min.js"></script>	
<script
	src="${pageContext.request.contextPath}/static/script/scripts.js"></script>		

<meta name="viewport" content="width= device-width, initial-scale=1" />  


</head>
<body>

	<div class="content">
		<div class="row">
			<div class="col-xs-12">
				<tiles:insertAttribute name="header" />
			</div>
		</div>	
			
		</br>
		<div class="row">
			<div class="col-xs-12">
				<tiles:insertAttribute name="menu-top" />
			</div>
		</div>	

		</br>
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-2">
				<tiles:insertAttribute name="menu-side" />
			</div>
			<div class="col-xs-12 col-sm-12 col-md-10">
				<tiles:insertAttribute name="body" />
			</div>
		</div>

		<div class="row">
			<div class="col-xs-12">		
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>
	
</body>
</html>