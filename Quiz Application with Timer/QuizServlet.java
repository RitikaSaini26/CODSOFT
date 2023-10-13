@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Quiz quiz = (Quiz) session.getAttribute("quiz");
        if (quiz == null) {
            List<Question> questions = // Populate your questions here
            quiz = new Quiz(questions);
            session.setAttribute("quiz", quiz);
        }

        int selectedOptionIndex = Integer.parseInt(request.getParameter("selectedOption"));
        quiz.submitAnswer(selectedOptionIndex);

        if (quiz.isLastQuestion()) {
            session.removeAttribute("quiz"); // Quiz completed, remove from session
            response.sendRedirect("Result.jsp");
        } else {
            response.sendRedirect("QuizInterface.jsp");
        }
    }
}
