<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name='layout' content='main'/>
    <title>Edit DefaultLabel</title>
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
        <div class="col-lg-6 col-lg-offset-3 center-block">
            <div class="panel panel-primary">
                <div class="panel-heading">DefaultLabel</div>

                <div class="panel-body">
                    <form action="${createLink(action: "update", controller: "defaultLabel", params: [defaultLabelId: defaultLabelId])}">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" name="name" id="name" %{--placeholder="${defaultLabelName}"--}%
                             value="${defaultLabelName}" >
                            <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                    bean="${defaultLabelCOError}" field="name" as="list"/>
                        </div>

                        <div class="form-group">
                            <label for="description">Description</label>
                            <textarea class="form-control" id="description" placeholder="${defaultLabelDescription}" name="description"
                                      value="${defaultLabelDescription}" rows="3"></textarea>
                            <g:hasErrors bean="${defaultLabelCOError}"/><g:renderErrors
                                    bean="${defaultLabelCOError}" field="description" as="list"/>
                        </div>
                        <button type="submit" class=" form-control btn btn-primary">Update</button>

                    </form>
                </div>

                <div class="panel-footer"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
