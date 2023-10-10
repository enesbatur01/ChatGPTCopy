package chatgpt;

import java.io.*;
import java.util.Scanner;

public class d01IOExcept {
    public static void main(String[] args) {
        try {
            int age = 1;


            if (age < 0) {
                throw new EksiYasException("Yaş negatif olamaz!");
            }

            System.out.println("Yaşınız: " + age);

        } catch (EksiYasException e) {
            System.out.println("Özel istisna yakalandı: " + e.getMessage());
        }






    }
}
