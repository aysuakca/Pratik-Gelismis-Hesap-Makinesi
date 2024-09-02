import java.util.Scanner;

public class test {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Cikarma : " + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }
    static int division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bolme : " + result);
        return result;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Ust Bulma : " + result);
        return result;
    }
    static int mod(int a, int b) {
        return a % b;
        }

    static void calc(int a, int b) {
        System.out.print("Cevresi : " + (2*(a+b)));
        System.out.print("Alani : " + (a*b));
    }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int select;

            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Mod Alma\n"
                    + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

            while (true) {
                System.out.println(menu);
                System.out.print("Bir Islem Seciniz : ");
                select = scan.nextInt();

                if (select == 0) {
                    break;
                }

                System.out.print("Ilk Sayi :");
                int a = scan.nextInt();
                System.out.print("Ikinci Sayi :");
                int b = scan.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        multi(a, b);
                        break;
                    case 4:
                        if (division(a,b) == 0){
                            System.out.println("Ikinci Sayi 0'dan Farkli Olmalidir");
                        }
                        division(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 6:
                        mod(a, b);
                        break;
                    case 7:
                        calc(a, b);
                        break;
                    default:
                        System.out.println("Gecersiz bir islem girdiniz!");
                }
            }
            System.out.println("Gule Gule");
        }
    }












