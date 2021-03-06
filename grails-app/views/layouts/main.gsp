<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Grails"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
    <link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
    <asset:stylesheet src="bootstrap.min.css"/>
    <asset:stylesheet src="custom.css"/>
    <asset:javascript src="jquery-1.11.1.min.js"/>
    <asset:javascript src="jquery-1.10.2.js"/>
    <asset:javascript src="bootstrap.min.js"/>
    <asset:stylesheet src="login.css"/>
    <asset:stylesheet src="leftslider.css"/>
    <asset:javascript src="leftslider.js"/>

    <g:layoutHead/>
</head>

<body>

<div class="header">
    <div class="row" style="background-color: #ccccff">
        <div class="col-md-12">
            <div class="col-sm-4" id="issueLogo" role="banner">
                <asset:image style="width: 70%;background-color: #ccccff" src="issuetrak-logo-retina.png" alt="issue"/>
            </div>
            <g:render template="/layouts/userNavigation"/>
        </div>
    </div>
</div>
<g:layoutBody/>
<g:render template="/templates/footer"/>
<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt"
                                                                   default="Loading&hellip;"/></div>
</body>
</html>
