package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        int k=250;
        for (int i = 0; i < size.length; i++) {
            size[i]=k;
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
            k+=5;
        }
        
    }   
}
