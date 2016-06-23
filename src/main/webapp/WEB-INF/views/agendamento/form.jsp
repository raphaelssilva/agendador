<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="html" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<div class="col-lg-12">
		<html:form action="/agendamento/save" commandName="agendamento"
			class="form-horizontal" role="form">

			<section class="panel"> <header class="panel-heading">
			Cadastrar agendamento </header>
			<div class="panel-body">
				<div class="position-center">
					<html:hidden path="id" />
					<div class="form-group">
						<label class="col-sm-3 control-label">Nome</label>
						<div class="col-sm-6">
							<html:input path="nome" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Descrição</label>
						<div class="col-sm-6">
							<html:textarea path="descricao" cssClass="form-control" rows="6" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Grupo</label>
						<div class="col-sm-6">
							<html:input path="grupo" cssClass="form-control" />
						</div>
					</div>
				</div>
			</div>
			</section>
			<section class="panel">
			<div class="panel-body">
				<div class="position-center">
					<div class="form-group">
						<label class="col-sm-3 control-label">Tipo de Ação</label>
						<div class="col-sm-6">
							<html:select path="" items="${biz.r2s.agendador.model.TypeAction.values()}">
							</html:select>
							<select class="form-control input-lg m-bot15">
								<option>Option 1</option>
								<option>Option 2</option>
								<option>Option 3</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<button type="submit" class="btn btn-danger">Enviar</button>
						</div>
					</div>
				</div>
			</div>
			</section>
		</html:form>
	</div>
</body>
</html>