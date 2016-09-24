

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div class="row" style="text-align: center;margin-top: 10%">
    <div class="col-md-offset-4 col-md-4 col-lg-6 col-lg-3">
        <div class="form-login">
            <form action='${createLink(action: "register", controller: "userRegistration")}' method='POST'
                  id='loginForm' class='cssform' autocomplete='off'>

                <div class="form-group">
                    <input type="text" id="username" name="username" class="form-control input-sm chat-input"
                           placeholder="enter the username"/>
                </div>

                <div class="form-group">
                    <input type="text" id="emailAddress" name="emailAddress" class="form-control input-sm chat-input"
                           placeholder="enter the emailAddress"/>
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" class="form-control input-sm chat-input"
                           placeholder="enter the password"/>
                </div>

                <div class="form-group">
                    <label for="confirmPassword">Confirm Password</label>
                    <input type="password" id="confirmPassword" name="confirmPassword"
                           class="form-control input-sm chat-input"
                           placeholder="enter the  password again"/>
                </div>
            </br>
                <div class="wrapper">
                    <span class="group-btn">
                        <input type='submit' class="btn btn-primary btn-md" id="submit"
                               value='Register'/>
                    </span>
                </div>
            </form>
        </div>

    </div>
    %{--</div>--}%
</div>

</body>
</html>