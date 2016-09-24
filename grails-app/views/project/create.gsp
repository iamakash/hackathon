<html>
<head>
    <meta name='layout' content='main'/>
    <script src='${resource(dir: "/tinymce/js/tinymce", file: "tinymce.min.js")}'></script>

    <script>
        tinymce.init({
            selector: '#description'
        });
    </script>
</head>

<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">Create Project</div>
        <div class="panel-body">
            <g:form controller="project" action="save">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" name="name" id="name" aria-describedby="nameHelp"
                           placeholder="Name">
                </div>

                <div class="form-group">
                    Description
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

</body>
</html>
