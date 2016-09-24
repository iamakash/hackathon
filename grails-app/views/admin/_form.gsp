<div class="panel panel-primary">
    <div class="panel-heading">Add Milestone</div>

    <div class="panel-body">
        <g:form controller="admin" action="saveMilestone">
            <div class="form-group">
                <label for="name">Milestone Name</label>
                <input type="text" class="form-control" name="name" id="name" aria-describedby="nameHelp"
                       placeholder="Name">
            </div>

            <div class="form-group">
                Milestone Decsription
                <textarea class="form-control" name="description" id="description" placeholder="Description"></textarea>
            </div>
            <div class="form-group">
                <label for="submit">
                    <input type="submit" class="btn btn-success" value="Create" id="submit"/>
                </label>
            </div>
        </g:form>
    </div>
</div>