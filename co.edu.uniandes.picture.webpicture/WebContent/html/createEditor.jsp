<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<! DOCTYPE html>
<meta charset="UTF-8">
<html lang="en">
<link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Index web site for WebPicture online DSL model editor">
<head>
    <title>Create new editor</title>
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
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/grids-responsive.css">
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
    <div class="splash-container" style="background-color:#FFFFFF; height:100%">
        <header>
            <p style="visibility:hidden">I bet you can't see me</p>
        </header>
        <form id="createEditorForm" name="createEditorForm" action="create_editor" method="post" enctype="multipart/form-data">
        <div style="text-align:center; height:100%">
            <div style="height:50%">
                <div class="pure-g">
                    <div class="pure-u-1-3" style="text-align:center; height:auto; border-right:1px solid #808080">
                        <img class="pure-img-responsive" src="resources/res/crt1.png" style="width:50%;heigth:50%; margin-top:50px" />
                    </div>
                    <div class="pure-u-1-3" style="text-align:center; height:auto; border-right:1px solid #808080">
                        <img class="pure-img-responsive" src="resources/res/crt2.png" style="width:50%;heigth:50%; margin-top:50px" />
                    </div>
                    <div class="pure-u-1-3" style="text-align:center; height:auto">
                        <img class="pure-img-responsive" src="resources/res/crt3.png" style="width:50%;heigth:50%; margin-top:50px" />
                    </div>
                </div>
                <div class="pure-g" style="height:100%">
                    <div class="pure-u-1-3" style="text-align:center; height:auto; border-right:1px solid #808080">
                        <p class="marketing-header" style="text-align:center">Upload a metamodel</p>
                    </div>
                    <div class="pure-u-1-3" style="text-align:center; height:auto; border-right:1px solid #808080">
                        <p class="marketing-header" style="text-align:center">Upload a graphical representation</p>
                    </div>

                    <div class="pure-u-1-3" style="text-align:center; height:auto">
                        <p class="marketing-header" style="text-align:center">Aditional information</p>
                    </div>
                </div>
            </div>
            <div style="height:50%">
                <div class="pure-g">
                    <div class="pure-u-1-3" style="text-align:center; height:100%;border-right:1px solid #808080">
                        <p style="text-align:center">Upload an ecore file</p>
                        <input id="uploadEcore" name="uploadEcore" type="file" class="custom-file-input" accept=".ecore" style="margin-left:100px" />
                    </div>
                    <div class="pure-u-1-3" style="text-align:center; height:100%; border-right:1px solid #808080">
                        <p style="text-align:center">Upload a picture file</p>
                        <input id="uploadPicture" name="uploadPicture" type="file" class="custom-file-input" accept=".picture" style="margin-left:100px" >
                        <p id="folderText" style="text-align:center">Upload aditional resources</p>
                        <input id="uploadExtras" name="uploadExtras" type="file" class="custom-file-input" accept="image/*" multiple style="margin-left:100px" >
                    </div>
                    <div class="pure-u-1-3" style="text-align:center; height:auto">
                        <div class="pure-form pure-form-stacked">
                            
                                <div class="pure-g">
                                    <div class="pure-u-1 pure-u-md-1-2">
                                        <input id="dName" name="dName" type="text" placeholder="Editor name">
                                    </div>
                                    <div class="pure-u-1 pure-u-md-1-2">
                                        <input id="dAuthor" name="dAuthor" type="text" placeholder="Author">
                                    </div>
                                </div>
                                    <textArea id="dDescription" name="dDescription" type="text" class="pure-input-1-2" placeholder="Editor description" style="width:100%"></textArea>
                        	
                        </div>
                        <button type="button" class="button-success pure-button" onclick="createEditor()">Generate editor</button>
                    </div>
                </div>
            </div>
        </div>
        </form>
    </div>
  
    
    <div class="content-wrapper">
        <p class="hero-tagline" style="text-align:center; background-color:#1D78CC;color:white"><i class="fa fa-angle-down"></i> Help</p>
        <div class="content">
            <h3 class="content-subhead" style="text-align:center">
        		<i class="fa fa-check-circle"></i> The basics
        	</h3>
            <p style="text-align:justify">WebPicture lets you create awesome DSL web based editors, using key features of <a target="_blank" href="http://www.eclipse.org/modeling/emf/">EMF</a> and <a target="_blank" href="http://backus1.uniandes.edu.co/enar/dokuwiki/doku.php?id=picture">Picture</a> a domain specific language independent to the desire metamodel to represent.</p>
            <h3 class="content-subhead" style="text-align:center">
        		<i class="fa fa-check-circle"></i> Getting everything you need
        	</h3>
            <h3 class="content-subhead">
        		<i class="fa fa-sitemap"></i> Building the metamodel
        	</h3>
            <p style="text-align:justify">EMF technology lets you create quick and easy metamodels for code generation. WebPicture requieres an ecore model you can learn more about EMF you can follow this <a target="_blank" href="http://eclipsesource.com/blogs/tutorials/emf-tutorial/">tutorial</a>.</p>

            <h3 class="content-subhead">
        		<i class="fa fa-picture-o"></i> Setting the graphical representation
        	</h3>
            <p style="text-align:justify">To set the graphical representation for your model is to upload your own graphical representation. You can write down your own Picture file following the specification available in the <a target="_blank" href="http://backus1.uniandes.edu.co/enar/dokuwiki/doku.php?id=picture">EnAr Wiki </a>. Also there is a cool option that you must try it auto generates a custom Picture file based on a ecore file you can choose between several options to customize everything in your editor. You can learn more at <a target="_blank" href="http://localhost:8080/PictureMaker/" id="pictureServer">PictureMaker</a>.</p>

            <p style="text-align:justify">If your Picture files references media resources such as images you must upload a folder which contains all the resources requiered. We recomend using a single folder that contains all your files.</p>

            <h3 class="content-subhead">
        		<i class="fa fa-rocket"></i> Ready
        	</h3>
            <p style="text-align:justify">Got everything done now click the Generate editor button to create the new editor.</p>
            <h3 class="content-subhead" style="text-align:center">
        		<i class="fa fa-question-circle"></i> Got troubles?
        	</h3>
            <h3 class="content-subhead">
        		<i class="fa fa-times"></i> Metamodel exception
        	</h3>
            <p style="text-align:justify">Make sure that everything in side the XML structure of the ecore file is valid, probably you should validate its structure.</p>
            <h3 class="content-subhead">
        		<i class="fa fa-times"></i> Picture exception
        	</h3>
            <p style="text-align:justify">First make sure that your file does not have any missing brackets. Second make sure the content has no additional mistaking inputs</p>
            <h3 class="content-subhead">
        		<i class="fa fa-times"></i> Directory exception
        	</h3>
            <p style="text-align:justify">In case your graphical representation uses external resources such as images and media make sure that you've uploaded a folder with a proper name and structure. Also make sure the files names and directories correspont to your Picture file.</p>
        </div>
        <div class="footer" style="background-color:#181818">
            <p>All rights reserved Uniandes 2014</p>
            <p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p>
        </div>
    </div>
</body>
<script>
    function createEditor() {
        var nEcore = $("#uploadEcore").val();
        var nPicture = $("#uploadPicture").val();
        var nExtras = $("#uploadExtras").val();
        
 
        //Verificar los archivos requeridos  
        if (nEcore == '' || nPicture == '')
        {
            if(nEcore == '')
            {
                 bootbox.alert("WebPicture requieres an ecore file", function () {});
            }
            else
            {
                bootbox.alert("WebPicture requieres a picture file", function () {});
            }
            throw new Error("No model / no picture file");
        }
        else
        {
        	if(endsWith(nEcore, '.ecore') == false)
        	{
        		bootbox.alert("WebPicture requieres an ecore file", function () {});
        		throw new Error("No model / no picture file");
        	}
        	if(endsWith(nPicture, '.picture') == false)
        	{
        		bootbox.alert("WebPicture requieres a picture file", function () {});
        		throw new Error("No model / no picture file");
        	}
        }
        //Verificar que los campos requeridos esten llenos
        var dName = $("#dName").val().trim();
        var dAuthor = $("#dAuthor").val().trim();
        var dDescription = $("#dDescription").val().trim();
        if (dName == " " || dName == "" || dName == null || dDescription == " " || dDescription == "" || dDescription == null || dAuthor == " " || dAuthor == "" || dAuthor == null) 
        {
            bootbox.alert("All fields in inforation secction are mandatory", function () {});
        }
        //Crear editor
        else
        {
        	var form = $('#createEditorForm');
        	form.submit();
        	
        }
    }
    
    function endsWith(str, suffix) {
        return str.indexOf(suffix, str.length - suffix.length) !== -1;
    }
    
</script>

</html>
