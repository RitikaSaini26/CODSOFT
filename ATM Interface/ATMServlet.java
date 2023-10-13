@WebServlet("/ATMServlet")
public class ATMServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount = Double.parseDouble(request.getParameter("amount"));
        String transactionType = request.getParameter("transactionType");

        BankAccount userAccount = new BankAccount(1000); // Replace with actual user account
        ATM atm = new ATM(userAccount);

        switch (transactionType) {
            case "withdraw":
                atm.withdraw(amount);
                break;
            case "deposit":
                atm.deposit(amount);
                break;
            case "checkBalance":
                double balance = atm.checkBalance();
                response.getWriter().write("Current Balance: " + balance);
                return;
            default:
                response.getWriter().write("Invalid transaction type.");
                return;
        }

        // Redirect back to the ATM Interface after processing the transaction
        response.sendRedirect("ATMInterface.jsp");
    }
}
