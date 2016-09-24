<html>
<head>
    <meta name='layout' content='main'/>
</head>

<body>
<div class="container">
    <div class="col-sm-12">
        <div class="col-lg-4">
            <a href="${createLink(controller: "project", action: "create")}"
               class="btn btn-primary">Create New Project</a>
            <br>
            <br>
        </div>
    </div>

    <g:if test="${projects}">
        <div class="col-md-4">
            <ul class="list-group">
                <g:each in="${projects}" var="project">
                    <a href="${createLink(controller: "issue", action: "index")}"><li class="list-group-item">${project.name}</li></a>
                </g:each>
            </ul>
        </div>
    </g:if>
    <g:else>
        You don't have any projects
    </g:else>
</div>

</body>
</html>
