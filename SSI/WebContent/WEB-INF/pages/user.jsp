<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="container-fluid">

	<div class="row">
		<div class="col-xs-12 FundoTitulo TextCinzaBold">Solicitação de
			Serviços de IT</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<span class="pull-right">*&nbsp;Campo&nbsp;Obrigatório</span>
		</div>
	</div>

	<div class="row">
		<div class="col-xs-12">
			<span class="fontRequestData">Dados do Solicitante</span>
		</div>
	</div>

	<form action="${pageContext.request.contextPath}/novaSolicitacao"
		modelAttribute="userSystem" method="post">
		<input type="hidden" name="idUser" value="${user.idUser}" />
		<div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Login</div>
				<input type="hidden" name="cdLoginUser" value="${user.cdLoginUser}" />
				<div class="col-xs-6">${user.cdLoginUser}</div>
				<div class="col-xs-12 col-sm-2 col-md-2 FundoTitulo textdefaultbold">
					<c:choose>
						<c:when test="${user.tpWorkRelation=='T'}">
        							Prestador de Serviços
    							</c:when>
						<c:otherwise>
									Funcionário
    							</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Nome</div>
				<div class="col-xs-12 col-sm-8">${user.nmUser}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Empresa</div>
				<div class="col-xs-12 col-sm-8">${user.collaboratorCompany.nmCollaboratorComany}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Data
					Término das Atividades</div>
				<div class="col-xs-12 col-sm-8">
					<fmt:formatDate value="${user.dtEndValid}" pattern="dd/MM/yyyy" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Cargo</div>
				<div class="col-xs-12 col-sm-8">${user.deJobTitle}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Centro
					de Custo/Área</div>
				<div class="col-xs-12 col-sm-8">${user.idCostCenter}-${user.deArea}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Fleet*ID</div>
				<div class="col-xs-6 col-sm-2 col-md-2">
					<input class="form-control input-sm" name="nrFleetId"
						value="${userSystem.nrFleetId}" placeholder="Ex: 55*11*1111"></>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Telefone
					Nextel</div>
				<div class="col-xs-6 col-sm-2 col-md-2">
					<input class="form-control input-sm" name="nrNextelPhone"
						value="${userSystem.nrNextelPhone}" placeholder="Ex: 1178550000"></>
				</div>
			</div>

			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Telefone/Ramal</div>
				<div class="col-xs-6 col-sm-2 col-md-2">
					<input class="form-control input-sm" name="nrPhoneRamal"
						value="${userSystem.nrPhoneRamal}" placeholder="Ex: 11947400000"></>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">*
					Gestor</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<select id="selectedRecord" name="manager.idUser"
						class="form-control input-sm selectpicker">
						<c:forEach var="manager" items="${manager}">
							<option value="${manager.idUser}"
								${manager.idUser == userSystem.manager.idUser ? 'selected' : ''}>${manager.nmUser}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">Filial</div>
				<div class="col-xs-12 col-sm-8">${user.nmBranch}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">*
					Localidade de atendimento</div>
				<div class="col-xs-12 col-sm-8">${userSystem.locality.nmLocality}</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-4 FundoTitulo textdefaultbold">*
					Localidade de trabalho</div>
				<div class="col-xs-12 col-sm-8 ">${userSystem.defaulLocality.nmLocality}</div>
			</div>
		</div>
		<div class="col-xs-10 col-xs-offset-3 col-sm-2 col-sm-offset-5 buttonPadding">
			<input class="btn btn-default" type="submit" value="Continuar" />
		</div>
	</form>

</div>

