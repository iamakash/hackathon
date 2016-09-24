<html>
<head>
    <meta name='layout' content='main'/>
    <title>Create State</title>
</head>

<body>
<div class="container col-sm-12">
    <div id="wrapper">
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
                        <div class="panel panel-primary">
                            <div class="panel-heading">Add State</div>

                            <div class="panel-body">
                                <g:form controller="admin" action="saveState">
                                    <div class="form-group">
                                        <label for="name">State Name</label>
                                        <input type="text" class="form-control" name="name" id="name"
                                               aria-describedby="nameHelp"
                                               placeholder="Name">
                                    </div>

                                    <div class="form-group">
                                        State Decsription
                                        <textarea class="form-control" name="description" id="description"
                                                  placeholder="Description"></textarea>
                                    </div>

                                    <div class="form-group">
                                        <label for="submit">
                                            <input type="submit" class="btn btn-success" value="Create" id="submit"/>
                                        </label>
                                    </div>
                                </g:form>
                            </div>
                        </div>
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
