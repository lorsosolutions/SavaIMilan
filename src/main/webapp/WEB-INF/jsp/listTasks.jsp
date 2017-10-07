<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="/WEB-INF/jsp/template/header.jsp" %>

<c:choose>
	<c:when test="${mode == 'MODE_HOME' }">
		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Zbirka akademskih radova</h1>
			<h2>Dobrodosli na najvecu zbirku akademskih radova u Srbiji</h2>
			<p class="lead">Ovo je zbirka akademskih radova od nasih postovanih profesora i autora, zelimo Vam srecno istrazivanje</p>
			<p>
				<a class="btn btn-lg btn-success" href="alltaskslist" role="button">Pogledajte zbirku</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row"></div>
	</c:when>
	<c:when test="${mode == 'MODE_TASKS' }">
		<div class="row">
			<div class="col-lg-12 col-md-12">
			
			<br>

			<div class="form-row align-items-center">
    <div class="col-sm-3">
      <label class="sr-only" for="inlineFormInputName">Name</label>
      <input type="text" class="form-control mb-2 mb-sm-0" id="inlineFormInputName" placeholder="Autor ili naziv dela">
    </div>
    <div class="col-auto">
      <button type="submit" class="btn btn-primary">Pretrazi</button>
    </div>
  </div>

<br>

			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<table class="table table-hover table-striped table-bordered">
					<thead>
						<tr>
							<th>K.Broj</th>
							<th>Ime rada</th>
							<th>Datum izrade</th>
							<th>Ime autora</th>
							<th>Download</th>
							<th>Opcije</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${testTasks}" var="testTask">
							<tr>
								<td>${testTask.id }</td>
								<td>${testTask.ime }</td>
								<td>${testTask.datum }</td>
							
								
							<td class="text-center">
								<td> <button type="button" class="btn btn-primary btn-md">Download</button></td>
							</td>
								<td class="text-center">
									<a href="updatetask?id=${testTask.id}"><span class="glyphicon glyphicon-pencil"></span></a>&nbsp;
									<a href="deletetask?id=${testTask.id}"><span class="glyphicon glyphicon-trash"></span></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</c:when>
	<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE' }">
		<div class="container text-center">
			<h3>Dodavanje radova</h3>
			<hr>
			<form action="savetask" method="post" class="form-horizontal">
				<input type="hidden" name="id" value="${testTask.id}" />
				<div class="form-group">
					<label class="control-label col-md-3">Ime Rada</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="name" value="${testTasks.ime}" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">Datum izrade</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="description" value="${testTasks.ime}" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">Objavljen</label>
					<div class="col-md-7">
						<input type="radio" class="col-sm-1" name="finished" value="true" />
						<div class="col-sm-1">Da</div>
						<input type="radio" class="col-sm-1" name="finished" value="false" checked />
						<div class="col-sm-1">Ne</div>
					</div>
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Sacuvaj" />
				</div>
			</form>
		</div>
	</c:when>
</c:choose>

<%@include file="/WEB-INF/jsp/template/footer.jsp" %>