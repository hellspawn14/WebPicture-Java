<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<html lang="en">
<link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Index web site for WebPicture online DSL model editor">
<head>
	<title>WebPicture</title>
    <link rel="icon" href="resources/res/siteIcon.png" type="image/x-icon">
    <!-- Hojas de estilo -->
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/grids-responsive.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/marketing.css">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="resources/pure-css/css/layouts/headers.css"> 
</head>
<body>
    <div class="header">
    	<div class="home-menu pure-menu pure-menu-open pure-menu-horizontal pure-menu-fixed"style="background-color:#181818">
        	<a class="pure-menu-heading" href="welcome"><img src="resources/res/logo.png" class="pure-img"/></a>
    	</div>  
	</div>
    <div class="splash-container"style="background-color:#FFFFFF">
    	<header>
        	<p style="color:white">I bet you can't see me</p>
        </header>
        <div class="pure-g">
        	<div class="pure-u-1-3" style="text-align:center;border-right:1px solid #808080; height:100%">
            	<div class="hero-titles">
                	<h2 class="hero-tagline" style="text-align:center">Create a new editor</h3>
                </div>
                <img class="pure-img-responsive" src="resources/res/sqr1.png" style="width:80%;heigth:80%"/>
                <div class="hero-titles" style="text-align:center">
                    <a href="new_editor" class="button-cta pure-button" style="width:inherit">New editor</a>
                </div>
            </div>
            <div class="pure-u-1-3" style="text-align:center; border-right:1px solid #808080; height:100%">
            	<div class="hero-titles">
                	<h2 class="hero-tagline" style="text-align:center">Review existing editors</h3>
                </div>
                <img class="pure-img-responsive" src="resources/res/sqr2.png" style="width:80%;heigth:80%"/>
                <div class="hero-titles" style="text-align:center">
                    <a href="all_editors" class="button-cta pure-button" style="width:inherit">Review editors</a>
                </div>
            </div>
            <div class="pure-u-1-3" style="text-align:center; height:100%">
            	<div class="hero-titles">
                	<h2 class="hero-tagline" style="text-align:center">Edit existing model</h3>
                </div>
                <img class="pure-img-responsive" src="resources/res/sqr3.png" style="width:80%;heigth:80%"/>
                <div class="hero-titles" style="text-align:center">
                    <a href="all_diagrams" class="button-cta pure-button" style="width:inherit">Review models</a>
                </div>
        	</div>
        </div>
    </div>
    <div class="content-wrapper">
    	<p class="hero-tagline" style="text-align:center; background-color:#1D78CC;color:white"><i class="fa fa-angle-down"></i> Help me choose</p>
		<div class="content">
        	<p>WebPicture lets you generate DSL editors. To do so WebPicture takes a metamodel and a graphical representation built in for that particular metamodel. Let us explain in deep how WebPicture above options can work for you.</p>
            
            <h3 class="content-subhead">
        		<i class="fa fa-pencil"></i> Create new editor
        	</h3>
            <p>Upload an ecore file (metamodel file) to start the process to generate a custom DSL web editor. We'll guide you thru the process step by step to select customize your new awesome DSL editor.</p>
            
            <h3 class="content-subhead">
        		<i class="fa fa-file"></i> Create a new model
        	</h3>
            <p>Select between a wide offer of available web editors to create awesome models.</p>
            <h3 class="content-subhead">
        		<i class="fa fa-folder-open"></i> Edit existing model
        	</h3>
            <p>Got any created model but you want to modify it, no problem just upload the save file and we'll handle the rest for you</p>        
        </div>
       	<div class="footer" style="background-color:#181818">
			<p>All rights reserved Uniandes 2014</p>
        	<p>Universidad de los Andes - Computer engineering department - Engineering Faculty</p>           
		</div>
    </div>
</body>
</html>