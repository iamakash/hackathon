<g:if test="${list}">
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Description</td>
            <td>Created By</td>
            <td>Modified By</td>
            <td>Update</td>
        </tr>
        </thead>
        <tbody>

        <g:each in="${list}" status="i" var="defaultLabel">
            <tr>
                <td>${i}</td>
                <td>${defaultLabel.name}</td>
                <td>${defaultLabel.description}</td>
                <td>${defaultLabel.createdBy.username}</td>
                <td>${defaultLabel.modifiedBy.username}</td>
                <td><a href="${createLink(controller: "defaultLabel", action: "edit", params: [id: defaultLabel.id])}">update</a>
                </td>
            </tr>
        </g:each>
        <util:remoteNonStopPageScroll total="${count ?: 0}" controller="defaultLabel" action="filter" max="10"
                                      update="showDefaultLabel"/>

        </tbody>
    </table>
</g:if>

<g:else>
    <td colspan="5">
        <div class="text-center">
            Nothing To show
        </div>
    </td>
</g:else>