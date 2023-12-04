<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Edit Profile</title>
  <link rel="stylesheet" href="css/editProfile.css">
</head>
<body>
  <div class="container">
    <h1>Edit Profile</h1>
    <div class="profile">
      <div class="profile-pic">
        <form action="change-profile-pic" method="post" enctype="multipart/form-data">
            <img id="profilePic" src="${user.profilepicture}" alt="Profile Picture">
            <input type="file" name="picture" id="fileInput" accept="image/*">
            <input type="submit" class="btn btn-primary" value="Change Profile Picture">
        </form>
      </div>
      <div class="profile-info">
        <form action="change-name" method="post">
            <label for="Name">Name:</label>
            <input type="text" name = "name" id="Name" value="${user.name}">
            <input type="submit" class="btn btn-primary" value="Change Name">
        </form>
        <form action="change-bio" method="post">
            <label for="bio">Bio:</label>
            <textarea id="bio" name = "bio">${user.bio}</textarea>
            <input type="submit" class="btn btn-primary" value="Change Bio">
        </form>
      </div>
    </div>
  </div>
</body>
</html>
