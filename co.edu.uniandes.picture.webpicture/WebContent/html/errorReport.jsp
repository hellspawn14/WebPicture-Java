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
        <div class="pure-u-1-2" style="text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Upps there has been an error </h3>
                <img class="pure-img-responsive" src="resources/res/errorReport.png" style="width:auto;height:auto;text-align:center " />
            </div>
        </div>
        <!-- Aca va el acceso a los diagramas existentes-->
        <div class="pure-u-1-2" style="text-align:center; height:100%; overflow-y: auto">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Error report</h3> 
            </div>
            <div style="margin-top:30%">
                <h3 class="marketing-header">Picture file does not correspond to the model</h3>
            <a href="new_editor" class="button-cta pure-button">Return</a>
            </div>
            

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
            alert(idEditor);
            var dName = $("#dName").val().trim();
            var dAutor = $("#dAuthor").val().trim();
            var dDescription = $("#dDescription").val().trim();
            if (dName == " " || dName == "" || dName == null || dDescription == " " || dDescription == "" || dDescription == null || dDescription == " " || dDescription == "" || dDescription == null)
            {
                bootbox.alert("All fields are mandatory", function () {
                });
            }
            //Crear editor
        }
    </script>

</body>

</html>