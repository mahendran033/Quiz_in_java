package javaBasic;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		question_answer questions = new question_answer();
        question_answer answers = new question_answer();
        Scanner input = new Scanner(System.in);
        char ans;
        int correct =0,wrong =0;
        questions.question1();
        ans = input.next().charAt(0);
        if(ans==answers.answer1){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question2();
        ans = input.next().charAt(0);
        if(ans==answers.answer2){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question3();
        ans = input.next().charAt(0);
        if(ans==answers.answer3){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question4();
        ans = input.next().charAt(0);
        if(ans==answers.answer4){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question5();
        ans = input.next().charAt(0);
        if(ans==answers.answer5){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question6();
        ans = input.next().charAt(0);
        if(ans==answers.answer6){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question7();
        ans = input.next().charAt(0);
        if(ans==answers.answer7){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question8();
        ans = input.next().charAt(0);
        if(ans==answers.answer8){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question9();
        ans = input.next().charAt(0);
        if(ans==answers.answer9){
            correct++;
        }
        else{
            wrong++;
        }
        questions.question10();
        ans = input.next().charAt(0);
        if(ans==answers.answer10){
            correct++;
        }
        else{
            wrong++;
        }
        double correct_double = correct;
        double percentage = (correct_double/100)*100;
        System.out.println("The total marks are : 100 ");
        System.out.println("You marks are "+correct*10);
        System.out.println("Total Questions are : 10");
        System.out.println("The correct answer are : "+ correct +"The wrong answer are : " + wrong);
        System.out.println("The percentage is : "+ percentage +"%");

    }
}
class question_answer{
    void question1(){
        System.out.println("1.What is Java?\r\n" + //
"a) A type of coffee\r\n" + //
"b) A programming language\r\n" + //
"c) A smartphone\r\n" + //
"d) A game");
    }
    void question2(){
        System.out.println("2.What is the file extension for a Java file?\r\n" + //
"a) .txt\r\n" + //
"b) .java\r\n" + //
"c) .exe\r\n" + //
"d) .doc");
    }
    void question3(){
        System.out.println("3.Which keyword is used to define a class in Java?\r\n" + //
"a) class\r\n" + //
"b) define\r\n" + //
"c) new\r\n" + //
"d) object");
    }
    void question4(){
        System.out.println("4.What does System.out.println(); do?\r\n" + //
"a) Deletes a file\r\n" + //
"b) Prints text to the console\r\n" + //
"c) Compiles the program\r\n" + //
"d) Stops the program");
    }
    void question5(){
        System.out.println("5.Which symbol is used to end a statement in Java?\r\n" + //
"a) :\r\n" + //
"b) .\r\n" + //
"c) ;\r\n" + //
"d) ,");
    }
    void question6(){
        System.out.println("6.What is the output of System.out.println(2 + 3);?\r\n" + //
"a) 23\r\n" + //
"b) 2 + 3\r\n" + //
"c) 5\r\n" + //
"d) Error");
    }
    void question7(){
        System.out.println("7.Which of these is NOT a Java data type?\r\n" + //
"a) int\r\n" + //
"b) float\r\n" + //
"c) word\r\n" + //
"d) boolean");
    }
    void question8(){
        System.out.println("8.What does // mean in Java?\r\n" + //
"a) It starts a comment.\r\n" + //
"b) It divides two numbers.\r\n" + //
"c) It ends a statement.\r\n" + //
"d) It prints text.");
    }
    void question9(){
        System.out.println("9.Which operator is used to compare two values in Java?\r\n" + //
"a) =\r\n" + //
"b) ==\r\n" + //
"c) !=\r\n" + //
"d) equals()");
    }
    void question10(){
        System.out.println("10.What is the entry point for a Java program?\r\n" + //
"a) public static void main(String[] args)\r\n" + //
"b) System.out.println()\r\n" + //
"c) void start()\r\n" + //
"d) public main()");
}
    char answer1 = 'b';
    char answer2 = 'b';
    char answer3 = 'a';
    char answer4 = 'b';
    char answer5 = 'c';
    char answer6 = 'c';
    char answer7 = 'c';
    char answer8 = 'a';
    char answer9 = 'b';
    char answer10 = 'a';
    


	}


