<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name='layout' content='main'/>
    <title>Email</title>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            hellooooooooooooo${username}
            <a class="mcnButton " title="GET IN TOUCH WITH US"
               href="${createLink(controller: 'userRegistration', action: 'verifyEmailAddress', absolute: true, params: [token: userId])}"
               target="_blank"
               style="font-weight: bold;letter-spacing: normal;line-height: 100%;text-align: center;text-decoration: none;color: #FFFFFF;
               word-wrap: break-word;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%;">

                CLICK HERE TO ACTIVATE YOUR ACCOUNT</a>
        </div>
    </div>
</div>
</body>
</html>