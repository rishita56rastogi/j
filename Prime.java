public class Prime {
    public static void main(String[] args) {
        int no =41;
        Boolean isPrime=true;
        for(int i =2 ; i*i<=no;i++){
            if(no%i==0){
            isPrime= false;
           break;
            }
        } 
            if (isPrime){
            System.out.println("no is prime");
            }
            else{
                System.out.println("no is not prime");
 
            }


        }
    }
    

