<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container">
    <h1>Enter Todo Details</h1>
    <form:form method="post" modelAttribute="todo">
        Description: <form:input path="description" type="text" name="description" required="required"/>
        <form:errors path="description" cssClass="text-warning"/>
        <form:input path="id" type="hidden"/>
        <form:input path="done" type="hidden"/>
        <br/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
</div>