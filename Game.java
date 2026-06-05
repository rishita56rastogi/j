import java.util.*;
import java.util.Scanner;
import java.util.Random;



public class Game {
    public static void main(String[] args) {
        int rock , paper, scicssor,user,bot;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
      System.out.println("Enter 1 =rock , 2=paper, 3= scissor:");
      user= sc.nextInt();
      bot = r.nextInt(3)+1 ;
    

        System.out.println("user:");
        switch (user) {
            case 1:
                System.out.println("rock");
                break;
            case 2:
                System.out.println("paper");
                break;
            case 3:
                System.out.println("scissor");
                break;
        
           default:
                System.out.println("no select");
                break;
        }
        System.out.println("bot:");

         switch (bot){
            case 1:
                System.out.println("rock");
                break;
            case 2:
                System.out.println("paper");
                break;
            case 3:
                System.out.println("scissor");
                break;
        
           default:
                System.out.println("no select");
                break;
        }

        if (user==1&&bot==2 || user==2&&bot==3 ||user==3&&bot==1){
           System.out.println("bot wins");
         }
        else if(user==bot){
            System.out.println("draw");
          }
        
         else{
          System.out.println("user wins");
         }
         

                
 
        }





    }
    

