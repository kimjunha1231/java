package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int fee = 4000;
        int time = 10;
        boolean light =false;
        boolean disabledPerson = false;
        int sum = fee*time;
        if (sum > 30000){
            sum = 30000;
        }
        if (light){
            sum /=2;
            
        }
        if (disabledPerson){
            sum /=2;
            
        }
        System.out.println("주차 요금은 " + sum +"원 입니다.");
    }
}
