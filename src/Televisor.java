public class Televisor {
    boolean tvStatus;
    void turnOn(){
        tvStatus=true;
    }
    void turnOff(){
        tvStatus=false;
    }
    void showStatus(){
        System.out.println(tvStatus);
    }
}
