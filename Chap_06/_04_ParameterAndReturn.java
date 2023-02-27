package Chap_06;

public class _04_ParameterAndReturn {
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 2승은 " + result);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
    }
}
