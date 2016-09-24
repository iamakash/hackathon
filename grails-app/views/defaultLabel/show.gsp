<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name='layout' content='main'/>
    <title>Show DefaultLabel</title>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-lg-8">
            <div id="showDefaultLabel">
                <g:render template="/defaultLabel/filter" model="[list: list, count: count]"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>