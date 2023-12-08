<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <div>
        <form action="submit-form" method="post">
            email : <input type="email" name="email" id="">
            <br><br>
            password : <input type="password" name="password" id="">
            <br><br>
            <input type="submit" value="Login">

        </form>
        <a href='session'>Click Here</a>
        <br>
        <br>

        <div>
            <form action="savemyname" method="get">
                <input type="text" name="myname" id="" placeholder='enter name'>
                <br>
                <br>
                <input type="submit" value="Save My Name">
            </form>
            
            <br>
            <br>
            <a href='showmyname'>Show My Name</a>
        </div>
    </div>

</body>
</html>