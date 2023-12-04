<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Settings</title>
    <link rel="stylesheet" href="css/settings.css"> <!-- Your CSS file -->
</head>
<body>

    <header>
        <h1>Settings</h1>
    </header>

    <main>
        <div class="container">
            <section id="password-change">
                <h2>Change Password</h2>
                <pre>${error}</pre>
                <form action="change-password" id="change-password-form" method="post">
                    <input type="password" name="currPass" id="current-password" placeholder="Current Password" required><br>
                    <input type="password" name="newPass"  id="new-password" placeholder="New Password" required><br>
                    <input type="password" name="cnfPass" id="confirm-password" placeholder="Confirm New Password" required><br>
                    <input type="submit" class="btn btn-primary" value="Change Password" required="required">
                </form>
            </section>
            <section id="delete-account">
                <h2>Delete Account</h2>
                <p>Are you sure you want to delete your account? This action cannot be undone.</p>
                <form action = "delete-user">
                    <input type="submit" class="btn btn-primary" value="Delete Account">
                </form>
            </section>
        </div>
    </main>

    <footer>
        <!-- Footer content if needed -->
    </footer>

    <!--<script src="javascript/settings.js"></script>--> <!-- Your JavaScript file -->
</body>
</html>
