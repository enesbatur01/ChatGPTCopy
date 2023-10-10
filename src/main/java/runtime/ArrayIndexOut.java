package runtime;

public class ArrayIndexOut {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

            int value = nums[10];
            System.out.println("Dizi elemanı: " + value);

    }
}
