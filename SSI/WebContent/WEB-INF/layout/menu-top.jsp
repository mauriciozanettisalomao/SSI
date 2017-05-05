<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 

<script
src="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>


<div class="row">
	<div class="col-xs-12">
		<div class="nav navbar-default navbax-fixed-top" role="navigation">	
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#elementoCollapse1">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<span class="navbar-brand visible-xs-block">SSI - Solicitações de Serviços IT</span>
				</div>
			</div>
			<div class="collapse navbar-collapse" id="elementoCollapse1">
				<ul class="nav nav-tabs">
					<c:forEach var="row" items="${menu}" varStatus="status">
					<c:if test="${(show gt 0) && (group ne row.descriptionGroup)}">
							</ul>
							</li>
					</c:if>
					<c:if test="${group ne row.descriptionGroup}">
						<c:set var="group" value="${row.descriptionGroup}"/>
						<c:set var="show" value="1"/>
					
								<li class="dropdown" role="menu">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">${row.descriptionGroup} <span class="caret"></span></a>
							<ul class="dropdown-menu">
					</c:if>
									<li><a href="#">${row.profileFunctionality}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>	
	</div>
</div>
