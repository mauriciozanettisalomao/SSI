<%@ page pageEncoding="UTF-8" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="content">
	<div class="row">
		<div class="row-xs-11">

			<div class="content">
				<div class="row">
					<div class="col-xs-11 FundoTitulo TextCinzaBold">Solicitação
						de Serviços de IT</div>
				</div>
				<div class="row">
					<div class="col-xs-11">
						<span class="pull-right">*&nbsp;Campo&nbsp;Obrigatório</span>
					</div>
				</div>
			</div>


			<div class="content">
				<div class="row">
					<span class="fontRequestData">Dados do Solicitante</span>
				</div>
			</div>

			<div class="content">
				<form>
					<div class="form-group">
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Login</div>
							<div class="col-xs-6">${user.cdLoginUser}</div>
							<div class="col-xs-2 FundoTitulo textdefaultbold">Prestador
								de Serviços</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Nome</div>
							<div class="col-xs-8">${user.nmUser}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Empresa</div>
							<div class="col-xs-8">${user.collaboratorCompany.nmCollaboratorComany}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Data
								Término das Atividades</div>
							<div class="col-xs-8">
								<fmt:formatDate value="${user.dtEndValid}" pattern="dd/MM/yyyy" />
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Cargo</div>
							<div class="col-xs-8">${user.deJobTitle}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Centro de
								Custo/Área</div>
							<div class="col-xs-8">${user.idCostCenter}-${user.deArea}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Fleet*ID</div>
							<div class="col-xs-2">
								<input class="form-control input-sm"
									value="${userSystem.nrFleetId}" placeholder="Ex: 55*11*1111"></>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Telefone
								Nextel</div>
							<div class="col-xs-2">
								<input class="form-control input-sm"
									value="${userSystem.nrNextelPhone}"
									placeholder="Ex: 1178550000"></>
							</div>
						</div>

						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Telefone/Ramal</div>
							<div class="col-xs-2">
								<input class="form-control input-sm"
									value="${userSystem.nrPhoneRamal}"
									placeholder="Ex: 11947400000"></>
							</div>
						</div>

						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">Filial</div>
							<div class="col-xs-8">${userSystem.locality.cdBranchRH}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">* Gestor</div>
							<div class="col-xs-2">
								<input class="form-control input-sm"
									value="${userSystem.manager.cdLoginUser}"
									placeholder="Ex: 11947400000"></>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">*
								Localidade de atendimento</div>
							<div class="col-xs-8">${userSystem.locality.nmLocality}</div>
						</div>
						<div class="row">
							<div class="col-xs-3 FundoTitulo textdefaultbold">*
								Localidade de trabalho</div>
							<div class="col-xs-8 ">${userSystem.defaulLocality.nmLocality}</div>
						</div>
					</div>
					<div class="col-xs-2 col-xs-offset-5">
						<input class="btn btn-default" type="submit" value="Continuar" />
					</div>						 
				</form>
			</div>


		</div>
	</div>
</div>

