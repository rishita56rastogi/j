
import java.util.Scanner;
import java.util.Random;



public class Game {
    public static void main(String[] args) {
        int userscore = 0,botscore = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for(int i=1;i<=3;i++){
        System.out.println("Round " + i );
      System.out.println("Enter 1 = rock , 2 = paper, 3 = scissor:");
     int user= sc.nextInt();
      int bot = r.nextInt(3)+1 ;
      
       

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
           botscore++;
         }
        else if(user==bot){
            System.out.println("draw");
          }
        
         else{
          System.out.println("user wins");
          userscore++;
         }
         System.out.println();
        }

        System.out.println("result:");


         if(userscore>botscore){
            System.out.println("user wins");
         }
         else if(botscore>userscore){
            System.out.println("bot wins");
         }
         else{
            System.out.println("match draw");
         }

         System.out.println("EXIT");
         

                
 
        
    }

}
    

