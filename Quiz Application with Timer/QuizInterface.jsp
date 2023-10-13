<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quiz Application</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <form action="QuizServlet" method="post">
        <h2>${question.question}</h2>

        <c:forEach var="option" items="${question.options}" varStatus="loop">
            <label>
                <input type="radio" name="selectedOption" value="${loop.index}" required> ${option}
            </label><br>
        </c:forEach>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
