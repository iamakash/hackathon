<html>
<head>
    <meta name='layout' content='main'/>
</head>

<body>
<ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">${project.name}</a></li>
    <li class="breadcrumb-item active">issues</li>
</ol>

<div class="container">
    <div class="col-md-4">
        <ul class="list-group">
            <a href="${createLink(controller: "project", action: "index")}">
                <li class="list-group-item">Issues</li>
            </a>
            <a href="${createLink(controller: "label", action: "index")}">
                <li class="list-group-item">Manage Label</li>
            </a>
            <li class="list-group-item">Manage Status</li>
            <li class="list-group-item">Manage Milestone</li>
        </ul>
    </div>

</div>

</body>
</html>
