public class TrafficLight {
    public static void main(String[] args) {
        int sec =60;
        for(sec =1 ; sec<=60;sec++){
            if(sec==15){
                System.out.println("Ambulance! Signal Tod do");
                break;
            }
            if(sec%5==0){
                System.out.println("Camera Under Maintainance");
                continue;
            }
            if(sec<=20){
                System.out.println("Red : STOP");
            }
            else if(sec<=40){
                System.out.println("Yellow : Ready ho jao");
            }
            else{
                System.out.println("Green : Chalo");
            }
            
        }
    }
    
}
