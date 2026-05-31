public class Methodsoverloading {

     /*static   void change (){
     int x = 56;
             }*/

        /*static void arrchange (int[]arr){
            arr[0]= 67;
        }*/


       /*static void returnType(){
       System.out.println("hello I am return type I don't need any returntype");
       }*/

       /*static void togetSucess(){
       System.out.println("keep coding until you become a software engineer");
        }*/

       

    /*method overloading using datatypes with same method and different parameters*/


       static int tech(){
            System.out.println("java");
            return 10;
          }
        static int tech(int x){
            System.out.println("python");
            return 5;
          }
          static int tech(int x ,int y){
            System.out.println("c++");
            return 1;
          }

    /*method overloading using no returntypes with same method and different parameters*/


        /* static void tech(){
            System.out.println("java");
          }
        static void tech(int x){
            System.out.println("python");
          }
          static void tech(int x ,int y){
            System.out.println("c++");
          }*/
    
    public static void main(String[] args) {
        //returnType();
       // togetSucess();
        
       /*{
        case 1: changing the integer value
        int a = 25;
        change();
        System.out.println(a);
       }*/
       
       /*  case 2: changing the array value
           int []marks ={10,20,22,45,56,67};
          arrchange(marks);
          System.out.println(marks[0]);*/
        tech();
        tech(12);
        tech(3, 5);

    }
    
}
