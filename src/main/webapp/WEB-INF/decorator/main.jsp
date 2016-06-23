<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="ThemeBucket">
<link rel="shortcut icon" href="/static/images/favicon.html">
<title><decorator:title default="R2S.biz - Agendador" /></title>
<!--Core CSS -->
<link href="/static/bs3/css/bootstrap.min.css" rel="stylesheet">
<link href="/static/assets/jquery-ui/jquery-ui-1.10.1.custom.min.css"
	rel="stylesheet">
<link href="/static/css/bootstrap-reset.css" rel="stylesheet">
<link href="/static/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="/static/assets/jvector-map/jquery-jvectormap-1.2.2.css"
	rel="stylesheet">
<link href="/static/css/clndr.css" rel="stylesheet">
<!--clock css-->
<link href="/static/assets/css3clock/css/style.css" rel="stylesheet">
<!--Morris Chart CSS -->
<link rel="stylesheet" href="/static/assets/morris-chart/morris.css">
<!-- Custom styles for this template -->
<link href="/static/css/style.css" rel="stylesheet">
<link href="/static/css/style-responsive.css" rel="stylesheet" />
<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="/static/js/ie8/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
 <decorator:head />
</head>
<body>
<section id="container">
		<page:applyDecorator name="header" encoding="utf-8"/>
		<page:applyDecorator name="menu" encoding="utf-8"/>
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">	
				<decorator:body/>
			</section>
		</section>
		<!--main content end-->
		<page:applyDecorator name="menudireito" encoding="utf-8"/>
	</section>

	<!-- Placed js at the end of the document so the pages load faster -->
	<!--Core js-->
	<script src="/static/js/lib/jquery.js"></script>
	<script src="/static/assets/jquery-ui/jquery-ui-1.10.1.custom.min.js"></script>
	<script src="/static/bs3/js/bootstrap.min.js"></script>
	<script src="/static/js/accordion-menu/jquery.dcjqaccordion.2.7.js"></script>
	<script src="/static/js/scrollTo/jquery.scrollTo.min.js"></script>
	<script src="/static/js/nicescroll/jquery.nicescroll.js" type="text/javascript"></script>
	<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="/static/js/flot-chart/excanvas.min.js"></script><![endif]-->
	<script src="/static/assets/jQuery-slimScroll-1.3.0/jquery.slimscroll.js"></script>
	<script src="/static/assets/skycons/skycons.js"></script>
	<script src="/static/assets/jquery.scrollTo/jquery.scrollTo.js"></script>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script src="/static/assets/calendar/clndr.js"></script>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.2/underscore-min.js"></script>
	<script src="/static/assets/calendar/moment-2.2.1.js"></script>
	<script src="/static/js/calendar/evnt.calendar.init.js"></script>
	<script src="/static/assets/jvector-map/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="/static/assets/jvector-map/jquery-jvectormap-us-lcc-en.js"></script>
	<script src="/static/assets/gauge/gauge.js"></script>
	<!--clock init-->
	<script src="/static/assets/css3clock/js/script.js"></script>
	<!--Easy Pie Chart-->
	<script src="/static/assets/easypiechart/jquery.easypiechart.js"></script>
	<!--Sparkline Chart-->
	<script src="/static/assets/sparkline/jquery.sparkline.js"></script>
	<!--Morris Chart-->
	<script src="/static/assets/morris-chart/morris.js"></script>
	<script src="/static/assets/morris-chart/raphael-min.js"></script>
	<!--jQuery Flot Chart-->
	<script src="/static/assets/flot-chart/jquery.flot.js"></script>
	<script src="/static/assets/flot-chart/jquery.flot.tooltip.min.js"></script>
	<script src="/static/assets/flot-chart/jquery.flot.resize.js"></script>
	<script src="/static/assets/flot-chart/jquery.flot.pie.resize.js"></script>
	<script src="/static/assets/flot-chart/jquery.flot.animator.min.js"></script>
	<script src="/static/assets/flot-chart/jquery.flot.growraf.js"></script>
	<script src="/static/js/dashboard.js"></script>
	<script src="/static/js/custom-select/jquery.customSelect.min.js"></script>
	<!--common script init for all pages-->
	<script src="/static/js/scripts.js"></script>

	<!--script for this page-->
</body>
</html>
