<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${pageTitle}</title> <!-- Dynamic title -->

    <!-- Bootstrap CSS from WebJars -->
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
</head>
<body>
<!-- Common Header -->
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">TODOS Manager</a>
    </nav>
</header>

<!-- Dynamic Content -->
<div class="container mt-4">
    <jsp:include page="${content}" />
</div>

<!-- Common Footer -->
<footer class="text-center mt-5">
    <p>&copy; 2025 My Website</p>
</footer>

<!-- jQuery and Bootstrap JS from WebJars -->
<script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
