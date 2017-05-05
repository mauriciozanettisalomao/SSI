<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 


<script	src="${pageContext.request.contextPath}/static/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<c:set var="index" value="${0}"/>

<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-2 col-md-2">
			<div class="panel-group menu-side" id="accordion">
				<c:forEach var="row" items="${menu}" varStatus="status">
					<c:choose>
						<c:when test="${status.count eq 1}">
							<c:set var="classCollapsein" value="in"/>
						</c:when>
						<c:otherwise>
							<c:set var="classCollapsein" value=""/>
						</c:otherwise>
					</c:choose>
					<c:if test="${(show gt 0) && (group ne row.descriptionGroup)}">
						<c:set var="show" value="0"/>						
									</table>
								</div>
							</div>
					</div>
					</c:if>
					<c:if test="${group ne row.descriptionGroup}">
						<c:set var="group" value="${row.descriptionGroup}"/>
						<c:set var="index" value="${index + 1}"/>
						<c:set var="show" value="1"/>							
					<div class="panel panel-default">													
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion" href="#collapse${index}"><span class="glyphicon glyphicon-folder-close">
									</span>${row.descriptionGroup}</a>
								</h4>
							</div>
							<div id="collapse${index}" class="panel-collapse collapse ${classCollapsein}">
								<div class="panel-body">
									<table class="table">
					</c:if>
										<tr>
											<td>
												<span class="glyphicon text-primary"></span><a href="${pageContext.request.contextPath}/">${row.profileFunctionality}</a>
											</td>
										</tr>
				</c:forEach>
									</table>
								</div>
							</div>				
				</div>
			</div>
		</div>
    </div>
</div>
