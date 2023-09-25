<%
    request.setAttribute("pageTitle", "Add Todo");
    request.setAttribute("content", "todo/todoContent.jsp");
    request.setAttribute("includeDatePicker", true);
%>

<jsp:include page="../layout.jsp" />
