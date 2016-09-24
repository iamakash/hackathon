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

    <g:layoutHead/>
</head>

<body>

<div class="header">
    <div class="row" style="background-color: #ccccff">
        <div class="col-sm-4" id="issueLogo" role="banner">
            <asset:image style="width: 70%;background-color: #ccccff" src="issuetrak-logo-retina.png" alt="issue"/>
        </div>
        <sec:ifLoggedIn>
            <div class="col-sm-8" style="text-align: center;margin-top: 1%" role="banner">
                <div class="dropdown text-right" style="margin-right: 5px;">
                    <a href="${createLink(controller: "logout")}" class="btn btn-success dropdown-toggle color"
                       type="button" aria-haspopup="true" aria-expanded="true">
                        Logout
                    </a>
                </div>
            </div>
        </sec:ifLoggedIn>
        <sec:ifNotLoggedIn>
            <div class="col-sm-8" style="text-align: center;margin-top: 1%" role="banner">
                <div class="col-sm-8">
                    <div class="col-sm-4 dropdown" style="padding-right: 0px">
                        <button class="btn btn-success dropdown-toggle color" type="button" id="dropdownMenu2"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Dropdown
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </div>

                    <div class="col-sm-8">
                        <button class="btn btn-success color" type="submit">Button</button>
                        <button class="btn btn-success color" type="submit">Button</button>
                        <button class="btn btn-success color" type="submit">Button</button>
                        <button class="btn btn-success color" type="submit">Button</button>
                    </div>
                </div>

                <div class="col-sm-4">
                    <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle color" type="button" id="dropdownMenu1"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Dropdown
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </sec:ifNotLoggedIn>
    </div>
</div>
<g:layoutBody/>
<g:render template="/templates/footer"/>
<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt"
                                                                   default="Loading&hellip;"/></div>
</body>
</html>
