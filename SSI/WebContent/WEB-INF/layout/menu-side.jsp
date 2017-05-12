<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<div class="container-fluid1">
	<div class="row">
		<div class="col-xs-12">
			<div class="panel-group menu-side" id="accordion">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<span class="text-primary">Minhas Ações</span>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse in">
						<table class="table">
							<tr>
								<td><span class="badge">5</span></td>
								<td><span class="text-primary"><a
										href="${pageContext.request.contextPath}/"><small>Minhas
												Solicitações em Aprovação</small></a></span></td>
							</tr>
							<tr>
								<td><span class="badge">2</span></td>
								<td><span class="text-primary"></span><a
									href="${pageContext.request.contextPath}/"><small>Pendente
											Aprovação como Gestor</small></a></td>
							</tr>
							<tr>
								<td><span class="badge">0</span></td>
								<td><span class="text-primary"></span><a
									href="${pageContext.request.contextPath}/"><small>Pendente
											Aprovação como Owner</small></a></td>
							</tr>
						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>

