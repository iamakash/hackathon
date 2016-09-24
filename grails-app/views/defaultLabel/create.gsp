<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name='layout' content='main'/>
    <title>Create DefaultLabel</title>
    <script>
        tinymce.init({
            selector: '#description'
        });
    </script>
</head>

<body>
<div class="container">
    <div class="wrapper">
        <g:render template="/admin/left_nav"/>
        </div>

        <div class="row">
            <div class="col-lg-6 col-lg-offset-3">
                <div class="panel panel-primary ">
                    <div class="panel-heading">Insert Default Label</div>

                    <div class="panel-body">
                        <form action="${createLink(action: "save", controller: "defaultLabel")}">
                            <div class="form-group">
                                <label for="name">Name</label>
                                <input type="text" class="form-control" id="name" name="name" placeholder="Enter name">
                                <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                        bean="${defaultLabelCOError}" field="name" as="list"/>
                            </div>

                            <div class="form-group">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" name="description" rows="3"></textarea>
                                <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                        bean="${defaultLabelCOError}" field="description" as="list"/>
                            </div>
                            <button type="submit" class=" form-control btn btn-primary">Create</button>

                        </form>
                    </div>

                </div>
            </div>
        </div>

</div>
</body>
</html>
