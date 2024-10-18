import java.util.Scanner;
public class QuestionService {

Question[] questions = new Question[5];
String selection[] = new String[5];

public QuestionService()
{
    questions[0] =new Question(1,"what", "java", "cpp", "python","Csharp","java");
    questions[1] =new Question(2,"what", "java", "cpp", "python","Csharp","java");
    questions[2] =new Question(3,"what", "java", "cpp", "python","Csharp","java");
    questions[3] =new Question(4,"what", "java", "cpp", "python","Csharp","java");
    questions[4] =new Question(5,"what", "java", "cpp", "python","Csharp","java");


}
    public void playQuiz()
{
    int i=0;
    for(Question q : questions){
    System.out.println("Question no. : " + q.getId());
    System.out.println(q.getQuestion());
    System.out.print(q.getOpt1());
    System.out.print(q.getOpt2());
    System.out.print(q.getOpt3());
    System.out.print(q.getOpt4());
    Scanner sc = new Scanner(System.in);
    selection[i] = sc.nextLine();
    i++;
    }


    for(String s : selection)
{
    System.out.println(s);
}
}

public void printScore()
{
    int score =0;

    for(int i=0;i<questions.length;i++)
    {
        Question que = questions[i];
        String actualanswer = que.getAnswer();
        String userAnswer = selection[i];

        if(actualanswer.equals(userAnswer))
        {
              score++;
        }
    }
    System.out.println("your score is : " + score);
  }
}