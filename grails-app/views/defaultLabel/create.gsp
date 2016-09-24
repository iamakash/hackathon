<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create DefaultLabel</title>
    <script src='${resource(dir: "/tinymce/js/tinymce", file: "tinymce.min.js")}'></script>

    <script>
        tinymce.init({
            selector: '#description'
        });
    </script>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6 center-block">
            <div class="panel panel-primary">
                <div class="panel-heading">DefaultLabel</div>

                <div class="panel-body">
                    <form action="${createLink(action: "save", controller: "defaultLabel")}">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="name" class="form-control" id="name" placeholder="Enter name">
                            <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                    bean="${defaultLabelCOError}" field="name" as="list"/>
                        </div>

                        <div class="form-group">
                            <label for="description">Description</label>
                            <textarea class="form-control" id="description" name="description" rows="3"></textarea>
                            <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                    bean="${defaultLabelCOError}" field="description" as="list"/>
                        </div>
                    </form>
                </div>

                <div class="panel-footer"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
