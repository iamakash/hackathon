<html>
<head>
    <meta name='layout' content='main'/>
    <title><g:message code="springSecurity.login.title"/></title>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>

<body>

%{--<div class="container">--}%
    <div class="row" style="text-align: center;margin-top: 10%">
        <div class="col-md-offset-4 col-md-4">
            <div class="form-login">
                <form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
                    <g:if test='${flash.message}'>
                        <div class='login_message'>${flash.message}</div>
                    </g:if>
                    <h4>Welcome back.</h4>
                    <input type="text" id="userName" name="j_username" class="form-control input-sm chat-input"
                           placeholder="username"/>
                </br>
                    <input type="text" id="userPassword" name="j_password" class="form-control input-sm chat-input"
                           placeholder="password"/>
                </br>
                    <div class="wrapper">
                        <span class="group-btn">
                            <input type='submit' class="btn btn-primary btn-md" id="submit" value='${message(code: "springSecurity.login.button")}'/>
                            %{--<a href="#" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>--}%
                        </span>
                    </div>
                </form>
            </div>

        </div>
    %{--</div>--}%
</div>
<script type='text/javascript'>
    (function () {
        document.forms['loginForm'].elements['j_username'].focus();
    })();
</script>
</body>
</html>
