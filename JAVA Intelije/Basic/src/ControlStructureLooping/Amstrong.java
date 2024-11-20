package ControlStructureLooping;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=s.nextInt();
        int x=n,result=0;
        int y=n;
        int num;
        double sum=1;
        double count=0;

        while(x>0){
            x=x/10;
            count++;

        }


        while(y>0){
            num=y%10;
            y=y/10;
            sum=Math.pow(num,count);
            result+=sum;
        }


    if(result==n){
        System.out.println("Its a Amstrong number");
    }
    else{
        System.out.println("Invalid number");
    }



    }
}
