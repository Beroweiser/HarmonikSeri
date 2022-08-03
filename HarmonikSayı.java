import java.util.Scanner;

public class HarmonikSayı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı giriniz : ");
        int n = inp.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++){
            result += (1.0 / i);
            
        }
        System.out.println("Harmonik sayın : "+ result);
        inp.close();
    }
}
