<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .error {
            color: red;
            font-weight: bold;
            font-size: 16px;
            text-align: center;
            transition: opacity 0.3s ease;
        }
        .hidden {
            opacity: 0;
            visibility: hidden;
        }
    </style>
    <script>
        // Hide error message when user clicks any input field
        function hideMessage() {
            var msg = document.getElementById("errorMsg");
            if (msg) {
                msg.classList.add("hidden");
            }
        }
    </script>
</head>
<body>
    <center>
        <h2>Admin Login</h2>
        <% 
            String msg = (String) request.getAttribute("msg");
        %>
        
        <p id="errorMsg" class="error"><%= msg %></p>

        <form action="alog" method="post">
            Username: 
            <input type="text" name="a_name" onclick="hideMessage()"><br><br>

            Password: 
            <input type="password" name="a_pwd" onclick="hideMessage()"><br><br>

            <input type="submit" value="Login">
        </form>
    </center>
</body>
</html>
