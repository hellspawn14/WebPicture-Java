<%@page import="java.util.ArrayList"%>
<%@page import="en.ar.picture.webpicture.core.Editor"%>
<%@page import="en.ar.picture.webpicture.core.util.DateParser"%>
<%@page import="en.ar.picture.webpicture.core.Webpicture"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<! DOCTYPE html>
<meta charset="UTF-8">
<html lang="en">
<link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Index web site for WebPicture online DSL model editor">

<head>
<title>WebPicture</title>
<link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
<!-- JQuery -->
<script src="http://code.jquery.com/jquery-2.1.1.js"></script>
<script src="http://code.jquery.com/ui/jquery-ui-git.js"></script>
<!-- Bootstrap -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<!-- Bootbox -->
<script src="resources/bootbox/bootbox.js"></script>
<!-- Hojas de estilo -->
<link rel="stylesheet" href="http://yui.yahooapis.com/pure//pure.css">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure//grids-responsive.css">
<link rel="stylesheet"
	href="resources/pure-css/css/layouts/marketing.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link rel="stylesheet" href="resources/pure-css/css/layouts/headers.css">
</head>
<body>
	<div class="header">
		<div
			class="home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed"
			style="background-color: #181818">
			<a class="pure-menu-heading" href="welcome"> <img
				src="resources/res/logo.png" class="pure-img" />
			</a>
		</div>
	</div>
	<div class="pure-g">
		<div class="pure-u-1-3"
			style="text-align: center; border-right: 1px solid #808080; height: 100%; background-color: #F0F0F0">
			<div class="hero-titles">
				<h3 class="hero-tagline"
					style="text-align: center; margin-top: 50px">Review editors</h3>
			</div>
			<img class="pure-img-responsive" src="resources/res/sqr2.png"
				style="width: auto; height: auto" />

		</div>
		<!-- Aca va el acceso a los editores existentes-->
		<div id="editors" class="pure-u-2-3"
			style="text-align: center; height: 100%; overflow-y: auto">
			<div class="hero-titles">
				<h3 class="hero-tagline"
					style="text-align: center; margin-top: 50px">Available editors</h3>
			</div>
			<form id="reviewEditorsForm" name="reviewEditorsForm"
				action="available_editors" method="post">
				<%
					Webpicture webpicture = Webpicture.getInstance();
									DateParser dateParser = webpicture.getDateParser();
									Editor current = null;
									ArrayList <Editor> availableEditors = webpicture.getAllEditors();
									String cnt = "";
									if (availableEditors.isEmpty())
									{
										cnt = "<div class=" + '"' + "hero-titles" + '"' + ">" + "\n" + "<h3 class=" + '"' + "marketing-header" + '"' + " style=" + '"' + "text-align:center; margin-top:50px" + '"' + ">" + "There's no available editors to display" + "</h3>" + "\n" + "</div";
				%>
				<%=cnt%>
				<%
					}			
									else 
									{
										for (int i = 0; i < availableEditors.size(); i++)
										{
											current = availableEditors.get(i);
											cnt = current.toString(dateParser.dateToString(current.getCreated()));
				%>
				<%=cnt%>
				<%
					}
									}
				%>
				<input id="editor" type="hidden" value="" name="editor" />
			</form>
		</div>
	</div>
	<div class="footer l-box is-center"
		style="background-color: #181818; margin-top: 0px">
		<p>All rights reserved Uniandes 2014</p>
		<p>Universidad de los Andes - Computer engineering department -
			Engineering Faculty</p>
	</div>


	<!-- Script de referencia para llamar la funcion de acuerdo al comando y al editor seleccionado-->
	<script>
		$('#reviewEditorsForm').on("submit", function(e) {
			e.preventDefault();
			$.ajax({
				url : $(this).attr('action'),
				type : $(this).attr('method'),
				data : $(this).serialize(),
				success : function(data) {

				},
				error : function(jXHR, textStatus, errorThrown) {
					alert(errorThrown);
				}
			});
		})

		function getSelectedActionForEditor(action, editor) {
			if (action == 'delete') {
				bootbox
						.dialog({
							message : "Selected item will be deleted, would you like to continue?",
							buttons : {
								success : {
									label : "Yes",
									className : "btn-primary",
									callback : function() {
										$('#editor_' + editor).fadeOut(500,
												function() {
													$(this).remove();
												});
										$('#pad_' + editor).fadeOut(500,
												function() {
													$(this).remove();
												});
										//Eliminar el editor en el servidor
										$("#editor").val(editor);

										var form = $('#reviewEditorsForm');
										form.submit();
										checkState();
									}
								},
								danger : {
									label : "No",
									className : "btn-danger",
									callback : function() {
										//Hacer nada
									}
								}
							}
						});
			}
		}

		function checkState() {
			var elements = $("#editors > div").length;
			if (elements == 3) {
				var msg = "<div class=" + '"' + "hero-titles" + '"' + ">"
						+ "\n"
						+ "<h3 class=" + '"' + "marketing-header" + '"' + " style=" + '"' + "text-align:center; margin-top:50px" + '"' + ">"
						+ "There's no available editors to display" + "</h3>"
						+ "\n" + "</div";
				$('#editors').append(msg);
			}
		}
	</script>
</body>

</html>