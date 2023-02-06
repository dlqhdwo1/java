package array;

import java.util.Scanner;

public class ArrayTest {

   public static void main(String[] args) {
    
         int num;
         boolean[] ar = new boolean[4];
         while(true) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("주차장 관리 프로그램");
         System.out.println("**************");
         System.out.println("  1.입차");
         System.out.println("  2.출차");
         System.out.println("  3.리스트");
         System.out.println("  4.종료");
         System.out.print("메뉴 : ");
         num = scanner.nextInt();
         
         if(num == 1) {
            System.out.println("위치 입력 : ");
            int position = scanner.nextInt();
            if(ar[position-1]) {
               System.out.println(position + "이미 주차되어 있습니다.");
            }
            ar[position-1] = true;
           
         }
         if(num == 2) {
            System.out.println("위치 입력 : ");
            int position = scanner.nextInt();
            if(ar[position-1]) {
               System.out.println("출차");
               ar[position -1] = false;
            }
            else {
               System.out.println("");
            }
         }
         if(num == 3) {
            for(int i = 0; i < ar.length; i++) {
               System.out.println((i + 1) +"번 위치"+ar[i]);
            }
         }
         if(num == 4) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
         
      }
     
   }  
     
}

