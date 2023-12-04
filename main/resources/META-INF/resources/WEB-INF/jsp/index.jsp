<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <title>PALOMA HOME PAGE</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header>
            <nav class="form-group">
                <img id="logo" src="images/paloma2.png" alt="">
                <div class="name-container">
                    <h1 class="name">PALOMA</h1>
                </div>
                <a href="home" class="btnhome">HOME</a>
                <button class="btnlogin">LOGIN/SIGNUP</button>
            </nav>
        </header>
        <div class="wrapper">

            <div class="form-box login">
                <h2>LOGIN</h2>
                <pre>${errorMessage}</pre>
                    <form:form action="login" method="post" modelAttribute="login">
                    <div class="input-box">
                        <span class="icon"><ion-icon name="mail-open-sharp">
                        </ion-icon></span>
                        <form:input type="email" path="lemail" name="lemail" required="required"/>
                        <form:label path="lemail" name="lemail"> EMAIL </form:label>
                    </div>
                    <div class="input-box">
                        <span class="icon">
                        <ion-icon name="key-sharp"></ion-icon>
                        </span>
                        <form:input type="password" path="lpassword" name="lpassword" required="required"/>
                        <form:label path="lpassword">PASSWORD</form:label>
                    </div>
                    <span id="validationMsg"></span>
                    <div class="remember-forgot">
                        <form:checkbox path="remember" value="remember"/>
                        <form:label path="remember"> REMEMBER ME </form:label>
                        <a href="#">FORGOT PASSWORD?</a>
                    </div>
                    <div>
                    <input type="submit" class="btn" value="Login" name="submit"/>
                    </div>
                    <div class="login-register">
                        <p>
                            DON'T HAVE AN ACCOUNT?
                            <a href="#" class="register-link">REGISTER</a>
                        </p>
                    </div>
                </form:form>
            </div>

            <div class="form-box register">
                <h2> REGISTRATION </h2>
                <form:form method="post" action="userCreate" modelAttribute="user">
                    <div class="input-box">
                        <span class="icon"><ion-icon name="mail-open-sharp"></ion-icon></span>
                        <form:input type="email" path="email" required="required"/>
                        <form:label path="email"> EMAIL </form:label>
                    </div>
                    <div class="input-box">
                        <span class="icon"><ion-icon name="person-sharp"></ion-icon></span>
                        <form:input type="text" path="username" required="required"/>
                        <form:label path="username"> USERNAME </form:label>
                    </div>
                    <div class="input-box">
                        <span class="icon"><ion-icon name="text-sharp"></ion-icon>
                        </span>
                        <form:input type="text" path="name" required="required"/>
                        <form:label path="name">NAME</form:label>
                    </div>
                   <div class="input-box">
                       <span class="icon">
                           <ion-icon name="text-sharp"></ion-icon>
                       </span>
                       <form:input type="number" path="age" required="required"/>
                       <form:label path="age">AGE</form:label>
                   </div>
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="key-sharp"></ion-icon>
                        </span>
                        <form:input type="password" path="password" required="required"/>
                        <form:label path="password"> PASSWORD </form:label>
                    </div>
                    <div class="input-box">
                        <span class="icon">
                            <ion-icon name="key-sharp"></ion-icon>
                        </span>
                        <input type="password" name="cnfPass" required="required"/>
                        <label>CONFIRM PASSWORD</label>
                    </div>
                    <div class="input-box1">
                    <form:select path="gender" id="gender" name="gender">
                        <form:option value="">SELECT GENDER</form:option>
                        <form:option value="Female">Female</form:option>
                        <form:option value="Male">Male</form:option>
                    </form:select>
                    </div>
                    <div>
                        <input type="submit" class="btn" value="Register" name ="submit"/>
                    </div>
                    <div class="login-register">
                        <p>ALREADY HAVE AN ACCOUNT? <a href="#"class="login-link">
                        LOGIN</a></p>
                    </div>
                </form:form>
            </div>
        </div>
        <script src="javascript/script.js"></script>
        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    </body>
</html>