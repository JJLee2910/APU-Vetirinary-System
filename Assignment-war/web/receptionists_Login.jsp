<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Receptionists Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Additional custom styles */
        .navbar {
            background-color: #f8f9fa;
            padding: 10px 0;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .navbar-link {
            color: #007bff;
            text-decoration: none;
            margin-left: 2rem;
            margin-right: 2rem;
        }
        .main-content {
            margin-top: 50px;
            text-align: center;
        }
        form {
            margin-top: 20px;
            max-width: 400px; /* Limit the width of the form */
            margin-left: auto; /* Center the form horizontally */
            margin-right: auto;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="landing.jsp" class="navbar-link">Back</a>
        <a href="receptionists_Register.jsp" class="navbar-link">Sign Up</a>
    </div>
    <div class="main-content">
        <div>
            <p>Receptionists Login Page</p>
        </div>
        <!--Login Form-->
        <form action="Receptionists_Login" method="POST">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" class="form-control" id="username" name="username">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>
            <button type="submit" class="btn btn-primary btn-block">Login</button>
        </form>
    </div>
</body>
</html>
