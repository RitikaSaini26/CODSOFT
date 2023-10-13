<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>ATM Interface</title>
</head>
<body>

    <h2>ATM Interface</h2>

    <form action="ATMServlet" method="post">
        <label for="amount">Enter Amount:</label>
        <input type="text" name="amount" required>
        <br>

        <input type="radio" name="transactionType" value="withdraw" checked> Withdraw
        <input type="radio" name="transactionType" value="deposit"> Deposit
        <input type="radio" name="transactionType" value="checkBalance"> Check Balance
        <br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
