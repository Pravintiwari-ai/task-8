import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class OnlineQuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of Questions
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "1. What are Java loops?",
            new String[]{"A. Repetitive control structures", "B. Conditional statements", "C. Exception handlers", "D. None"},
            1
        ));

        questions.add(new Question(
            "2. What is enhanced for-loop?",
            new String[]{"A. Loop over arrays/collections", "B. A type of while loop", "C. Used for infinite loops", "D. Used for files"},
            1
        ));

        questions.add(new Question(
            "3. How do you handle multiple user inputs?",
            new String[]{"A. By using Scanner multiple times", "B. By using loops", "C. By creating multiple variables", "D. Both A and B"},
            4
        ));

        questions.add(new Question(
            "4. How is a switch-case different from if-else?",
            new String[]{"A. Faster for fixed values", "B. Slower", "C. Used for strings only", "D. Same as if-else"},
            1
        ));

        questions.add(new Question(
            "5. What are collections in Java?",
            new String[]{"A. Framework to store and manipulate data", "B. Loops", "C. Packages", "D. None"},
            1
        ));

        questions.add(new Question(
            "6. What is ArrayList?",
            new String[]{"A. Dynamic array in Java", "B. Fixed array", "C. HashMap", "D. LinkedList"},
            1
        ));

        questions.add(new Question(
            "7. How to iterate using iterators?",
            new String[]{"A. Using while(hasNext())", "B. Using for loop", "C. Using enhanced for", "D. All of these"},
            1
        ));

        questions.add(new Question(
            "8. What is a Map?",
            new String[]{"A. Key-value pair collection", "B. Array", "C. Set", "D. None"},
            1
        ));

        questions.add(new Question(
            "9. How to sort a list?",
            new String[]{"A. Collections.sort()", "B. Arrays.sort()", "C. Using loop", "D. Both A and B"},
            4
        ));

        questions.add(new Question(
            "10. How to shuffle elements?",
            new String[]{"A. Collections.shuffle()", "B. Random.shuffle()", "C. Arrays.reverse()", "D. None"},
            1
        ));

        int score = 0;

        System.out.println("\n===== Welcome to the Java Quiz App =====\n");

        // Loop through each question
        for (Question q : questions) {
            System.out.println(q.questionText);
            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (q.isCorrect(answer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("===== Quiz Completed! =====");
        System.out.println("Your Final Score: " + score + "/" + questions.size());

        if (score >= 8)
            System.out.println("🎉 Excellent! You really know Java well!");
        else if (score >= 5)
            System.out.println("🙂 Good effort! Keep learning!");
        else
            System.out.println("😕 Keep practicing Java concepts!");

        sc.close();
    }
}