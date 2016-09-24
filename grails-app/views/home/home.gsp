<html>
<head>
    <title>Smartly | Sign Up</title>
    <meta name="layout" content="main"/>
</head>

<body>
<div class="content-wrapper">
    <div class="body-wrapper">
        <div class="section-content">
            <div class="container">
                <helper:renderErrors/>
            </div>
        </div>

        <div class="container">
            <div class="omb_login white-block clear open-account">
                <h4>Open Your Smartly Account</h4>

                <div class="row omb_row-sm-offset-3 omb_loginOr i-section-title">
                    <hr class="omb_hrOr">
                    <i class="icon-user-plus"></i>
                </div>

                <div class="row omb_row-sm-offset-3">
                    <div class="omb_socialButtons clear">
                        <a href="#"
                           class="btn btn-block btn-lg btn-dark_blue">Login via Facebook</a>
                        <a href="#"
                           class="btn btn-block btn-lg btn-blue">Login via LinkedIn</a>
                        <a href="#"
                           class="btn btn-block btn-lg btn-red">Login via Google+</a>
                    </div>
                </div>

                <div class="row omb_row-sm-offset-3 omb_loginOr">
                    <hr class="omb_hrOr">
                    <span class="omb_spanOr">or</span>
                </div>

                <h4>Continue with email</h4>

                <form role="form" name="signupForm" action="${createLink(controller: 'user', action: 'save')}"
                      class="col-sm-9" method="post">

                    <div class="row">
                        <div class="form-group col-sm-6 ${hasErrors(bean: signUpCO, field: "firstName", 'has-error')}">
                            <div class="input-group">
                                <input type="text" class="form-control" name="firstName" id="firstName"
                                       placeholder="First Name" value="">
                                <helper:renderFieldError bean="" field="firstName"/>
                            </div>
                        </div>

                        <div class="form-group col-sm-6">
                            <div class="input-group">
                                <input type="text" class="form-control" name="middleName" id="middleName"
                                       placeholder="Middle Name" value="">
                                <helper:renderFieldError bean="" field="middleName"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-sm-6">
                            <div class="input-group">
                                <input type="text" class="form-control" name="lastName" id="lastName"
                                       placeholder="Last Name" value="">
                                <helper:renderFieldError bean="" field="lastName"/>
                            </div>
                        </div>

                        <div class="form-group col-sm-6">
                            <div class="input-group">
                                <input type="email" class="form-control" name="username" id="emailAddress"
                                       placeholder="Email Address" value="">
                                <helper:renderFieldError bean="" field="username"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-sm-6">
                            <div class="input-group">
                                <input type="password" class="form-control" name="password" id="password"
                                       placeholder="Create Password">
                                <helper:renderFieldError bean="" field="password"/>
                            </div>
                        </div>

                        <div class="form-group col-sm-6">
                            <div class="input-group">
                                <input type="password" class="form-control" name="confirmPassword" id="confirmPassword"
                                       placeholder="Retype Password">
                                <helper:renderFieldError bean="" field="confirmPassword"/>
                            </div>
                        </div>
                    </div>

                    <div class="form-group col-sm-6">
                        <button type="reset" class="btn btn-grey">Reset</button>
                    </div>

                    <div class="form-group col-sm-6">
                        <button type="submit" class="btn btn-green btn-mid">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>