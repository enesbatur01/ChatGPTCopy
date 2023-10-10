package runtime;

public class ArithmeticExc {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // Sıfıra bölcez

            int result = num1/num2; // Sıfıra bölmeye çalışma
            System.out.println("Sonuç: " + result);

    }

}
