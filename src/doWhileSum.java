import java.util.Scanner;
public class doWhileSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        char ch;
        do {
            int a=input.nextInt();
            sum=sum+a;
             ch=input.next().charAt(0);
        }
        while(ch!='q');

    }
}
