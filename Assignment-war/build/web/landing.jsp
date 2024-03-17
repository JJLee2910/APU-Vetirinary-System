<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Landing Page of APU Veterinary Clinic and Boarding</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Additional custom styles */
        body {
            background-image: url('your-background-image.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh; /* Ensure full height */
            margin: 0; /* Remove default margin */
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>
    <div class="text-center">
        <h1>Welcome to APU Veterinary Clinic and Boarding</h1>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <a href="receptionists_Login.jsp" class="btn btn-primary btn-lg btn-block">Log In As Receptionists</a>
                </div>
                <div class="col-md-4">
                    <a href="staff_Login.jsp" class="btn btn-primary btn-lg btn-block">Log In As Staff</a>
                </div>
                <div class="col-md-4">
                    <a href="vet_Login.jsp" class="btn btn-primary btn-lg btn-block">Log In As Vet</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
