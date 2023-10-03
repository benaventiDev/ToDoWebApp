<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${pageTitle}</title> <!-- Dynamic title -->

    <!-- Bootstrap CSS from WebJars -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <% if (Boolean.TRUE.equals(request.getAttribute("includeDatePicker"))) { %>
    <link rel="stylesheet" href="webjars/flatpickr/4.6.13/dist/flatpickr.css">

    <% } %>
</head>
<body>
<!-- Common Header -->
<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
    <a class="navbar-brand m-1" href="https://courses.in28minutes.com">in28Minutes</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/list-todos">Todos</a></li>
        </ul>
    </div>
    <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a></li>
    </ul>
</nav>

<!-- Dynamic Content -->
<div class="container mt-4">
    <jsp:include page="${content}" />
</div>

<!-- Common Footer -->
<footer class="text-center mt-5">
    <p>&copy; 2025 My Website</p>
</footer>

<!-- jQuery and Bootstrap JS from WebJars -->
<script src="${pageContext.request.contextPath}/webjars/jquery/3.7.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
<% if (Boolean.TRUE.equals(request.getAttribute("includeDatePicker"))) { %>
<script src="webjars/flatpickr/4.6.13/dist/flatpickr.js"></script>
<script>
    flatpickr("#targetDate", { dateFormat: "Y-m-d" });
</script>
<% } %>
</body>
</html>
