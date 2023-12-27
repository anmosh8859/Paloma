<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width= , initial-scale=1.0">
    <title>Paloma</title>
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v2.1.6/css/unicons.css">
    <link rel="stylesheet" href="css/index2.css">
</head>
<body>

    <!-- navbar -->
    <nav>
        <div class="container">
            <div class="logo">
                <img src="images/logo.jpg" alt="">
                <h1>PALOMA</h1>
            </div>
            <div class="search-bar" id="search-bar">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" id="search"><g fill="#200E32" transform="translate(2 2)"><ellipse cx="8.599" cy="8.653" rx="8.599" ry="8.653"></ellipse><path d="M18.674623,19.9552573 C18.3405833,19.9444414 18.0229443,19.8069986 17.7853553,19.5704698 L15.7489321,17.1901566 C15.3123366,16.7908936 15.2766365,16.1123232 15.668898,15.6689038 L15.668898,15.6689038 C15.8525005,15.4831065 16.1021409,15.3786387 16.3625268,15.3786387 C16.6229128,15.3786387 16.8725531,15.4831065 17.0561557,15.6689038 L19.6172468,17.7181208 C19.9861582,18.0957076 20.0999999,18.656254 19.9078887,19.1492153 C19.7157774,19.6421767 19.2536179,19.9754211 18.7279791,20 L18.674623,19.9552573 Z" opacity=".4"></path></g></svg>
            <input type="search" placeholder="Search for Creator">  
            </div>
            <div class="create">
                <label class="btn btn-primary" for="create-post" id="create-post-btn">Create</label>
            <form action="logout">
                <input type="submit" class="btn btn-primary" value="Logout">
            </form>
                <div class="profile-photo">
                    <img src="${user.profilepicture}" alt="">
                </div>
        </div>       
        </div>
    </nav>

    <!-- MAIN -->

    <main>
        <div class="container">
            <!-- left -->
            <div class="left">
                <!-- sidebar -->
                <div class="sidebar">
                    <a class="menu-item active" href="/">
                        <span><i class="uil uil-home"></i></span><h3>Home</h3>
                    </a>
                    <a class="menu-item active" href="timeline">
                        <span><i class="uil uil-home"></i></span><h3>My Timeline</h3>
                    </a>
                    <a class="menu-item" id="explore-link">
                        <span><i class="uil uil-compass"></i></span>
                        <h3>Explore</h3>
                    </a>

                        <a class="menu-item" href="editUser">
                            <span><i class="uil uil-palette"></i></span><h3>Edit Profile</h3>
                        </a>
                        
                    <a class="menu-item" href="settings">
                        <span><i class="uil uil-setting"></i></span><h3>Settings</h3>
                    </a>
                </div>

                <!-- post creation  -->
                <form action="create-post" method="post" enctype="multipart/form-data">
                    <div class="post-creation" id="post-creation-section">
                        <h2>Create a New Post</h2>
                        <div class="post-input">
                            <div class="user-avatar">
                                <img src="${user.profilepicture}" alt="User Avatar">
                            </div>
                            <div class="post-content">
                                    <textarea id="post-caption" name="postdata" placeholder="What's happening?"></textarea>
                                <div class="image-upload">
                                    <input type="file" id="image-upload" name="image" accept="image/*">
                                    <label for="image-upload">Upload an image</label>
                                </div>
                            </div>
                        </div>
                        <button class="btn btn-primary" type="submit">Post</button>
                    </div>
                </form>
            </div>

        <!-- middle -->
    <div class="middle">
        <div class="feeds">
            <c:forEach items="${posts}" var="post">
                    <!-- Rest of your existing code --
                <!-- feeds  -->
                <div class="feed">
                    <div class="head">
                        <div class="user">
                            <div class="profile-photo">
                                <img src="${user.profilepicture}">
                            </div>
                            <div class="ingo">
                                <h3>${user.name}</h3>
                                <small>${post.timestamp}</small>
                            </div>
                        </div>
                        <div>
                            <span class="edit">
                                <i class="uil uil-ellipsis-h"></i>
                            </span> 
                        </div>  
                    </div>
                        <div class="photo">
                            <img src="${post.imagepath}" alt="">
                        </div>
                        <div class="action-buttons">
                            <div class="interaction-buttons">
                                <span class="like-icon"><i class="uil uil-heart"></i></span>
                                <span class="comment-icon"><i class="uil uil-comment-dots"></i></span>
                            </div>
                            <div class="comment-box">
                                <textarea class="comment-input" placeholder="Write a comment"></textarea>
                                <button class="post-comment-btn">Post</button>
                            </div>
                        </div>
                        <div class="liked-by">
                            <p>Liked by <b>Vastvikta</b> and <b>123 others</b></p>
                        </div>
                        <div class="caption">
                            <p><b>${user.name}</b> ${post.post}</p>
                        </div>
                        <div class="text-muted comment">View all 18 comments</div>
                </div>
            </c:forEach>    
        </div>
    </div>
            <!-- right -->
        <div class="right">
            <div class="user-profile">
                <div class="profile-pic">
                    <img src="${user.profilepicture}" alt="User Profile Picture">
                </div>
                <div class="user-info">
                    <h2 class="user-name">${user.name}</h2>
                    <p class="user-username">${user.username}</p>
                </div>
                <div class="user-stats">
                    <p class="user-description">${user.bio}</p>
                </div>
                    <button class="user-follow-button btn btn-primary" id="following-button">Following: 100</button>
                    <button class="user-follow-button btn btn-primary" id="followers-button">Followers: 1,000</button>
            </div>

            
        </div>

        </div>
    </main>
    <script src="javascript/index2.js"></script>
</body>
</html>