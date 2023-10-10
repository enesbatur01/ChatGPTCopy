package runtime;

public class NullPointer {
    public static void main(String[] args) {
        String str = null; // text adında bir String nesnesi, null olarak atanmış.


            int length = str.length(); // null bir nesneye erişmeye çalışma
            System.out.println("Dizi uzunluğu: " + length);



    }
}
