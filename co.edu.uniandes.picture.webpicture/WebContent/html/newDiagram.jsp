<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<! DOCTYPE html>
<meta charset="UTF-8">
<html lang="en">
<link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Index web site for WebPicture online DSL model editor">

<head>
    <title>WebPicture</title>
    <link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
    <!-- JQuery -->
    <script src="http://code.jquery.com/jquery-2.1.1.js"></script>
    <script src="http://code.jquery.com/ui/jquery-ui-git.js"></script>
    <!-- Bootstrap -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <!-- Bootbox -->
    <script src="resources/bootbox/bootbox.js"></script>
    <!-- Hojas de estilo -->
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure//pure.css">
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure//grids-responsive.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/marketing.css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/headers.css">
</head>

<body>
    <div class="header">
        <div class="home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed" style="background-color:#181818">
            <a class="pure-menu-heading" href="welcome">
                <img src="resources/res/logo.png" class="pure-img" />
            </a>
        </div>
    </div>
    
    <div class="pure-g">
    	<!-- Informacion basica del editor -->
        <div class="pure-u-1-2" style="text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Create new diagram</h3>
                <img class="pure-img-responsive" src="resources/res/nwDiagram.png" style="width:auto;height:auto;text-align:center; " />
            </div>
            <div style="text-align:justify">
                <i class="fa fa-bookmark-o" style="margin-left:150px"></i> Name: Archimate application for AndiAsistencia
                <br>
                <i class="fa fa-user" style="margin-left:150px"></i> Author: Will Anderson
                <br>
                <i class="fa fa-ellipsis-h" style="margin-left:150px"></i> Description: A simple editor for archimate application layer
                <br>
                <i class="fa fa-calendar" style="margin-left:150px"></i> Created: 2014/11/28 22:30:54
            </div>
        </div>
        <!-- Aca va el acceso a los diagramas existentes-->
        <div class="pure-u-1-2" style="text-align:center; height:100%; overflow-y: auto">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Diagram information</h3> 
            </div>
            <form id="newDiagramForm" name="newDiagramForm" class="pure-form pure-form-aligned">
                <fieldset>
                    <div class="pure-control-group">
                        <legend style="text-align:left; margin-left:10px">Name</legend>
                        <input id="dName" name="dName" type="text" placeholder="Diagram name">
                    </div>

                    <div class="pure-control-group">
                        <legend style="text-align:left; margin-left:10px">Author</legend>
                        <input id="dAuthor" name="dAuthor" type="text" placeholder="Author">
                    </div>

                    <div class="pure-control-group">
                        <legend style="text-align:left; margin-left:10px">Description</legend>
                        <textArea id="dDescription" name="dDescription" type="text" placeholder="Description" class="pure-input-1"></textArea>
                    </div>
                    <input id="editor" type="hidden" value="" name="editor" />
                </fieldset>
            </form>
            <button id="createDiagram" type="button" class="pure-button pure-button-primary" style="margin-top:10px" onclick="createDiagram()">Create diagram</button>
        </div>
    </div>


    <div class="footer l-box is-center" style="background-color:#181818; margin-top:0px">
        <p>All rights reserved Uniandes 2014</p>
        <p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p>
    </div>
    <!-- Script de referencia para llamar la funcion de acuerdo al comando y al editor seleccionado-->
    <script>
        function createDiagram()
        {
            var idEditor = 1;
            var dName = $('#dName').val().trim();
            var dAuthor = $('#dAuthor').val().trim();
            var dDescription = $('#dDescription').val().trim();
            if (dName == ' ' || dName == '' || dName == null || dDescription == ' ' || dDescription == '' || dDescription == null || dAuthor == ' ' || dAuthor == '' || dAuthor == null)
            {
                bootbox.alert('All fields are mandatory', function () {
                });
            }
          	//Crear editor
            else
            {
            	$('#editor').val(idEditor);
				var form = $('#newDiagramForm');
				form.attr('action','editor_information');
				form.on('submit', function(e) {
					$.ajax({
						url: $(this).attr('action'),
						type : $(this).attr('method'),
						data : $(this).serialize(),
						success : function(data) {

						},
						error : function(jXHR, textStatus, errorThrown) {
							alert(errorThrown);
						}
					});
					return true; 
				});
				form.submit();
				//console.log($("#editor").val() + " " + $("#dName").val() + " " + $("#dAuthor").val() + " " + $("dDescription").val());
            }
            
        }
    </script>

</body>

</html>