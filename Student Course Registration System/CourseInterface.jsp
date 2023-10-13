<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course Registration System</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2>Available Courses</h2>
    <table>
        <thead>
            <tr>
                <th>Code</th>
                <th>Title</th>
                <th>Description</th>
                <th>Schedule</th>
                <th>Capacity</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.code}</td>
                    <td>${course.title}</td>
                    <td>${course.description}</td>
                    <td>${course.schedule}</td>
                    <td>${course.capacity}</td>
                    <td>
                        <form action="register" method="post">
                            <input type="hidden" name="studentId" value="student123"> <!-- Replace with actual student ID -->
                            <input type="hidden" name="courseId" value="${course.id}">
                            <button type="submit">Register</button>
                        </form>
                        <form action="drop" method="post">
                            <input type="hidden" name="studentId" value="student123">
                            <input type="hidden" name="courseId" value="${course.id}">
                            <button type="submit">Drop</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
