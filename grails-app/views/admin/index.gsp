<html>
<head>
    <meta name='layout' content='main'/>
</head>

<body>
    <div class="container">
        <div id="wrapper">


            <!-- Sidebar -->
            <g:render template="left_nav"/>
            <div id="page-content-wrapper">
                <button type="button" class="hamburger is-closed" data-toggle="offcanvas">
                    <span class="hamb-top"></span>
                    <span class="hamb-middle"></span>
                    <span class="hamb-bottom"></span>
                </button>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2">
                            Welcome <sec:loggedInUserInfo field="username"/>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /#page-content-wrapper -->

        </div>
    </div>
<!-- /#wrapper -->
</body>
</html>
