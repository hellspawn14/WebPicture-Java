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
        <div class="pure-u-1-3" style="text-align:center;border-right:1px solid #808080; height:100%; background-color: #F0F0F0 ;">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Editor name</h3>
                <img class="pure-img-responsive" src="resources/res/basic.png" style="width:auto;height:auto" />
            </div>
            <div style="text-align:justify">
                <i class="fa fa-user" style="margin-left:20px"></i> Author: Will Anderson
                <br>
                <i class="fa fa-ellipsis-h" style="margin-left:20px"></i> Description: A simple editor for archimate application layer
                <br>
                <i class="fa fa-calendar" style="margin-left:20px"></i> Created: 2014/11/28 22:30:54
            </div>
            <!-- Comandos del editor -->
            <div style="margin-top:50px">
                <button type="submit" class="button-secondary pure-button pure-input-1-2" onclick="getSelectedActionForEditor('newModel', 1)"><i class="fa fa-file"></i> New diagram</button>
                <button type="submit" class="button-error pure-button pure-input-1-2" onclick="getSelectedActionForEditor('deleteEditor', 1)"><i class="fa fa-times"></i> Delete editor</button>
            </div>
        </div>
        <!-- Aca va el acceso a los diagramas existentes-->
        <div id="diagrams" class="pure-u-2-3" style="text-align:center; height:100%; overflow-y: auto">
            <div class="hero-titles">
                <h3 class="hero-tagline" style="text-align:center; margin-top:50px">Available diagrams</h3>
            </div>
            <!-- Inicio plantilla de celda de tabla para un editor-->
            <div id="diagram1" class="pure-g" style="border-top:1px solid #808080; border-bottom:1px solid #808080">
                <!-- Preview del editor (icono por defecto) -->
                <div class="pure-u-1-6" style="text-align:center">
                    <img class="pure-img-responsive" src="resources/res/projectModel2.png" style="width:120px;height:120px" />
                </div>
                <!-- Información basica del editor -->
                <div class="pure-u-5-6" style="text-align:left">
                    <div class="pure-g">
                        <div class="pure-u-5-6" style="text-align:left">
                            <i class="fa fa-bookmark-o" style="margin-left:10px"></i> Name: Archimate application for AndiAsistencia
                            <br>
                            <i class="fa fa-user" style="margin-left:10px"></i> Author: Will Anderson
                            <br>
                            <i class="fa fa-ellipsis-h" style="margin-left:10px"></i> Description: Application model as-is model for Andi asistencia
                            <br>
                            <i class="fa fa-calendar" style="margin-left:10px"></i> Created: 2014/11/28 22:30:54
                            <br>
                            <i class="fa fa-calendar" style="margin-left:10px"></i> Last modified: 2014/11/28 22:30:54
                            <br>
                        </div>
                        <div class="pure-u-1-6" style="text-align:left">
                            <button type="submit" class="button-secondary pure-button" style="width:100%;height:65px" onclick="getSelectedActionForModel('newModel', 1)"><i class="fa fa-pencil-square-o" style="margin-left:10px"></i>
                            </button>

                            <button type="submit" class="button-error pure-button" style="width:100%; height:65px" onclick="getSelectedActionForModel('delete', 1)"><i class="fa fa-times" style="margin-left:10px"></i>
                            </button>

                        </div>
                    </div>
                </div>
            </div>
            <div id="pad1" style="height:2px">
            </div>
            <!-- Fin plantilla-->
            <!-- Fin acceso a diagramas existentes -->
        </div>
    </div>


    <div class="footer l-box is-center" style="background-color:#181818; margin-top:0px">
        <p>All rights reserved Uniandes 2014</p>
        <p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p>
    </div>
    <!-- Script de referencia para llamar la funcion de acuerdo al comando y al editor seleccionado-->
    <script>
        function getSelectedActionForEditor(action, editor) {
            alert("editor: " + action + " for " + editor);
        }

        function getSelectedActionForModel(action, model) {
            alert("model: " + action + " for " + model);
            if (action == 'delete') {
                bootbox.dialog({
                    message: "Selected item will be deleted, would you like to continue?",
                    buttons: {
                        success: {
                            label: "Yes",
                            className: "btn-primary",
                            callback: function () {
                                $('#diagram_' + model).fadeOut(500, function () {
                                    $(this).remove();
                                });
                                $('#pad_' + model).fadeOut(500, function () {
                                    $(this).remove();
                                });
                                checkState();
                            }
                        },
                        danger: {
                            label: "No",
                            className: "btn-danger",
                            callback: function () {
                                //Hacer nada
                            }
                        }
                    }
                });
            }
        }

        function checkState() {
            var elements = $("#diagrams > div").length;
            var elements = $("#diagrams > div").length;
            if (elements == 3) {
                var msg = "<div class=" + '"' + "hero-titles" + '"' + ">" + "\n" + "<h3 class=" + '"' + "marketing-header" + '"' + " style=" + '"' + "text-align:center; margin-top:50px" + '"' + ">" + "There's no available diagrams to display" + "</h3>" + "\n" + "</div";
                $('#diagrams').append(msg);
            }
        }
    </script>

</body>

</html>