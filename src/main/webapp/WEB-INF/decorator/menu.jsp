<!--sidebar start-->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<aside>
	<div id="sidebar" class="nav-collapse">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">
			<li class="sub-menu">
				<a href="javascript:;"> 
					<i class="fa fa-clock-o"></i> <span>Agendamento</span>
				</a>
				<ul class="sub">
					<li><a href="<spring:url value="/agendamento/"/>">Cadastro</a></li>
				</ul>
			</li>			
		</ul>
		<!-- sidebar menu end-->
	</div>
</aside>
<!--sidebar end-->
