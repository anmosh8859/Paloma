document.getElementById('change-password-form').addEventListener('submit', function (e) {
    e.preventDefault();

    // Get form values
    const currentPassword = document.getElementById('current-password').value;
    const newPassword = document.getElementById('new-password').value;
    const confirmPassword = document.getElementById('confirm-password').value;

    // Perform password change logic here (you can add validation, etc.)
    // For demonstration purposes, you can log the values
    console.log('Current Password:', currentPassword);
    console.log('New Password:', newPassword);
    console.log('Confirm Password:', confirmPassword);

    // You can add your password change functionality here using AJAX/fetch or send data to the server
});

document.getElementById('delete-account-btn').addEventListener('click', function () {
    const confirmDelete = confirm('Are you sure you want to delete your account? This action cannot be undone.');

    if (confirmDelete) {
        // Perform account deletion logic here
        // For demonstration purposes, you can show an alert
        alert('Account deleted successfully.');
    }
});

