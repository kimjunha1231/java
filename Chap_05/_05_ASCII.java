package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드(AMS) : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 65부터 시작, 소문자는 97부터 시작, 숫자(0)은 48부터 시작
        System.out.println(c);
        System.out.println((int) c);

        c = 'B';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);

            }
            ;
            ch++;

        }
        ;
        // 영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " "); // A1A2A3...

            }
            System.out.println();
        }
        ;
    }
}
