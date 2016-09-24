<html>
<head>
    <meta name='layout' content='main'/>
</head>

<body>
<div class="container col-sm-12">
    <div id="wrapper">
        <g:render template="left_nav"/>
        <div class="row">
            <div class="col-lg-8  col-lg-offset-2 text-right">
                <a href="${createLink(controller: "admin",action: "createMileStone")}" class="btn btn-warning"> Create New</a>
            </div>
        </div>
        <div id="page-content-wrapper">
            <button type="button" class="hamburger is-closed" data-toggle="offcanvas">
                <span class="hamb-top"></span>
                <span class="hamb-middle"></span>
                <span class="hamb-bottom"></span>
            </button>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <td>Value</td>
                                <td>Description</td>
                                <td>Created By</td>
                                <td>Delete</td>
                            </tr>
                            </thead>
                            <tbody>
                            <g:if test="${mileStoneList!=null}">
                                <g:each in="${mileStoneList}" var="milestone">
                                    <tr>
                                        <td>${milestone.name}</td>
                                        <td>${milestone.description}</td>
                                        <td>${milestone.createdBy.username}</td>
                                        <td><a href="${createLink(controller: "admin",action: "deleteMilestone",params: [id:milestone.id])}">Delete</a> </td>
                                    </tr>
                                </g:each>
                            </g:if>
                            <g:else>
                                <td colspan="4">
                                    <div class="text-center">
                                        Nothing To show
                                    </div>
                                </td>
                            </g:else>
                            </tbody>
                        </table>
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
