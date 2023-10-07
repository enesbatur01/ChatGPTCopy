package chatgpt;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        /*
         kullanıcıdan yaşını al
         0-18 den devletten 1000tl burs alsın
         18e eşit ve 26 arasındaysa  1500
         25 ten büyük ve 50 den küçükse 2000
         50 ye eşit ve büyükse emekli yazsın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşını gir");
        byte age = input.nextByte();

        if (age >= 0 && age < 18){
            System.out.println("çocuktur");
        } else if (age >= 18 && age<24  ) {
            System.out.println("gençtir");
        } else if (age >= 24) {
            System.out.println("olgundur");

        }else {
            System.out.println("Age cant less than zero");
        }


    }


}
