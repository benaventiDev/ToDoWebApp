<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
</head>
<body>
    <h1>Welcome to Login</h1>
<form method="post">
    Name: <label>
    <input type="text" name="name">
</label>
    Password: <label>
    <input type="password" name="password">
</label>
    <input type="submit">
</form>

<pre>${errorMessage}</pre>
</body>
</html>