import java.util.Scanner;

public class quizz {
    public static void main(String[] args) {
        String[] question={"1.what is name","2.what is clg","3.movie name"};
        String[][] option={{"1.piyush","2.rahul","3.raj"},
                            {"1.pccoe","2.dyp","3.IU"},
                            {"1.noland","2.rrr","3.salman"}};

        int[] ans={1,2,3};
        int scorce=0;
        int guess;

        Scanner scanner=new Scanner(System.in);

        System.out.println("welcome to Quizz");

        for (int i=0;i<question.length;i++){
            System.out.println(question[i]);
            for (String options:option[i]){
                System.out.println(options);
            }
            System.out.print("enter you ans=");
            guess=scanner.nextInt();

            if(guess==ans[i]){
                System.out.println("correct");
                scorce++;
            }
            else {
                System.out.println("wrong");
            }
        }
        System.out.println("your total scorce is= "+scorce+" from 3 que");
    }
}
