<%@ page pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
</head>
<body>

    <sql:query var="result" dataSource="jdbc/dbsql_aplicacoes">
        select distinct dc_grupo, dc_funcionalidade, f.nu_sequencia
	from	tnxperfil 		as a,
		tnxusuario 		as b,
		tnxperfil_usuario	as c,
		tnxperfil_funcionalidade as d,
		tnxfuncionalidade as e,
		TNXGRUPO_FUNCIONALIDADE as f
	where	b.cd_usuario	= c.cd_usuario
	and	a.cd_perfil	= c.cd_perfil
	and c.cd_perfil = d.cd_perfil
    and d.cd_funcionalidade = e.cd_funcionalidade
    and e.cd_grupo = f.cd_grupo
	and a.cd_aplicacao = f.cd_aplicacao
	and	a.cd_aplicacao	= 9
	and	a.cd_ambiente	= 1
	and	b.lg_usuario	= 'PMSALOMA'
order by f.nu_sequencia
    </sql:query>

<html>
<script	src="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

<c:set var="index" value="${0}"/>

<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-2 col-md-2">
			<div class="panel-group menu-side" id="accordion">
				<c:forEach var="row" items="${result.rows}" varStatus="status">
				
					<c:choose>
						<c:when test="${status.count eq 1}">
							<c:set var="classCollapsein" value="in"/>
						</c:when>
						<c:otherwise>
							<c:set var="classCollapsein" value=""/>
						</c:otherwise>
					</c:choose>
				
					
											<c:if test="${(show gt 0) && (group ne row.dc_grupo)}">		
							<c:set var="show" value="0"/>						
									</table>
								</div>
							</div>
					</div>
							</c:if>
						

						
						<c:if test="${group ne row.dc_grupo}">

							<c:set var="group" value="${row.dc_grupo}"/>
							<c:set var="index" value="${index + 1}"/>
							<c:set var="show" value="1"/>							

					<div class="panel panel-default">													
							
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion" href="#collapse${index}"><span class="glyphicon glyphicon-folder-close">
									</span>${row.dc_grupo}</a>
								</h4>
							</div>
							<div id="collapse${index}" class="panel-collapse collapse ${classCollapsein}">
								<div class="panel-body">
									<table class="table">
						</c:if>
						
										<tr>
											<td>
												<span class="glyphicon text-primary"></span><a href="${pageContext.request.contextPath}/">${row.dc_funcionalidade}</a>
											</td>
										</tr>


					

				</c:forEach>
			</div>
		</div>
    </div>
</div>

</html>


</body>
</html>