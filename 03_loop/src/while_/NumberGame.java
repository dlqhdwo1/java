package while_;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main (String[] args) {

        int count=0;
        int user;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = (int)(Math.random()*100+1);
        
        //x~y사이의 난수 
        // 

        do {
            System.out.println("숫자를 입력하세요 : ");
            user = scan.nextInt();

            if (x>user) { System.out.println("높게"); }
            else if (x<user) { System.out.println("낮게"); }
            count++;
        }               
        while (x!=user);  //x가 user랑 같지않을때는 계속반복 x와 user값이 같으면 while문종료.
        System.out.println("정답입니다! "+count+"회 만에 맞췄습니다.");
    }
}


//한번더? (Y/N)