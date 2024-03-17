<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Receptionists Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Additional custom styles */
        .navbar {
            background-color: #f2f2f2;
            padding: 10px 0;
            margin-bottom: 20px; /* Added margin-bottom to move the navbar down */
        }
        .navbar-link {
            color: #007bff;
            text-decoration: none;
            margin-left: 1rem;
            margin-right: 1rem;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <div class="container-fluid d-flex justify-content-between">
            <div>
                <a href="receptionists_CreateCustomer.jsp" class="navbar-link">Create Customer</a>
                <a href="receptionists_CreatePet_GetAllCustomers" class="navbar-link">Create Pet</a>
                <a href="receptionists_ManageAppointments_MakeAppointment.jsp" class="navbar-link">Manage Appointments</a>
                <a href="receptionists_ManageOwnAccount.jsp" class="navbar-link">Edit Profile</a>
            </div>
            <div>
                <a href="LogOut" class="navbar-link">Log Out</a>
            </div>
        </div>
    </div>

    <!-- Your page content here -->
</body>
</html>

