import java.util.Scanner;
public class max {
    public static void main(String[] args) {
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       char ch;
       do {
           System.out.println("enter a number");
           Scanner input=new Scanner(System.in);
          int num=input.nextInt();
          if(num>max)
              max=num;
          if(num<min)
              min=num;
           System.out.println("Do you want to continue y/n");
           ch=input.next().charAt(0);
        }
       while(ch=='y'||ch=='Y');
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
