import java.util.Scanner;
public class QuizApp {
public static void main(String[] args) {
    String[] questions = {
        "1. what is the capital of India?",
        "2. who wrote 'Romeo and Juliet'?",
        "3. What is the chemical symbol for water?",
        "4. which team won more 'IPL' trophies?",
        "5. Who is famous actor in india?"
    };
    String[] options = {
        "A) Hyderabad\tB) Chennai\tC) New Delhi\tD) Mumbai",
        "A) William Shakespeare\tB) J.K. Rowling\tC) Charles Dickens\tD) Jane Austen",
        "A) O\tB) H\tC) W\tD) Au",
        "A) CSK\tB) Mumbai\tC) RCB\tD) SRH",
        "A) Prabhas\tB) NTR\tC) Ram Charan\tD) Allu Arjun",
    };
    char [] answer = {'C', 'A', 'C', 'A', 'A'};

    int score = 0;
    char userAnswer;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i< questions.length; i++){
        System.out.println(questions[i]);
        System.out.println(options[i]);

        System.out.println("Enter your answer (A/B/C/D): ");
        userAnswer = scanner.next().toUpperCase().charAt(0);

        if (userAnswer == answer[i]){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Incorrect");
        }
    }
System.out.println("nQuiz is completed!");
System.out.println("Your final score is " + score + '/' + questions.length);
    
}
}