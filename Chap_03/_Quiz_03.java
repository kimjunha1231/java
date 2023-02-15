package Chap_03;

public interface _Quiz_03 {
    public static void main(String[] args) {
        String number = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(number.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        number = "030708-4567890";
        System.out.println(number.substring(0, number.indexOf("-") + 2));
    }
}
