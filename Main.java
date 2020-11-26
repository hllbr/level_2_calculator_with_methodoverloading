
import java.util.Scanner;

/*
calculator_with_methodoverloading
 */
public class Main {
    public static int cıkarma(int a,int b){
        return (a-b);
    }
    public static int cıkarma(int a,int b,int c){
        return (a-b-c);
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int toplama(int a,int b){
        return (a+b);
    }
    public static double bolme(int a,int b){
        return (a/b);
    }
    public static double bolme(int a,int b,int c){
        return ((a+b)/c);
    }
    public static double kalan (int a,int b){
        return (a%b);
    }
    public static double kalan(int a,int b,int c){
        return ((a+b)%c);
    }
    public static int carpma(int a,int b){
        return (a*b);
    }
    public static int carpma(int a,int b,int c){
        return (a*b*c);
    }
    public static void main(String[] args) {
        String islemler = "1 TOPLAMA(2'Lİ)\\n"
                + "2 TOPLAMA(3'LÜ)\n"
                + "3 ÇIKARMA(2'Lİ)\n"
                + "4 ÇIKARMA(3'LÜ)\n"
                + "5 ÇARPMA(2'Lİ)\n"
                + "6 ÇARPMA(3'LÜ)\n"
                + "7 BÖLME(2'Lİ)\n"
                + "8 BÖLME(3'LÜ)\n"
                + "9 KALAN(2'lİ)\n"
                + "10 KALAN(3'LÜ)\n"
                + "11 İSLEMLER MENÜSÜNÜ GÖRME\n"
                + "12 ÇIKIŞ (Q veya q)\n";
        System.out.println("2.seviye hesap makinası");
        System.out.println(islemler);
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız...");
            String islem =scn.nextLine();
             if(islem.equals("1")){
                        System.out.println("seçtiğiniz işlem 2 adet sayı toplamadır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println(toplama(a, b));
                    continue;
             }else if(islem.equals("2")){
                        System.out.println("seçtiğiniz işlem 3 adet sayı toplamadır.");
                        System.out.println("Lütfen int bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                         System.out.println("Lütfen bir sayı giriniz");
                        int c = scn.nextInt();
                        System.out.println(toplama(a, b, c));
                    continue;
            }else if(islem.equals("3")){
                        System.out.println("seçtiğiniz işlem 2 sayının farkıdır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println(cıkarma(a, b));
                    continue;
            }else if(islem.equals("4")){
                        System.out.println("seçtiğiniz işlem 3 adet sayının farkıdır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int c = scn.nextInt();
                        System.out.println(cıkarma(a, b, c));
                    continue;
            }else if(islem.equals("5")){
                        System.out.println("seçtiğiniz işlem 2 adet sayı çarpımıdır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println(carpma(a, b));
                    continue;
            }else if(islem.equals("6")){
                        System.out.println("seçtiğiniz işlem 3 adet sayı çarpımıdır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int c = scn.nextInt();
                        System.out.println(carpma(a, b, c));
                    continue;
            }else if(islem.equals("7")){
                        System.out.println("seçtiğiniz işlem 2 adet sayı bölmedir.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println(bolme(a, b));
                    continue;
            }else if(islem.equals("8")){
                        System.out.println("seçtiğiniz işlem 3 adet sayı bölmedir.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int c = scn.nextInt();
                        System.out.println(bolme(a, b, c));
                    continue;
            }else if(islem.equals("9")){
                        System.out.println("seçtiğiniz işlem 2 adet sayı ile kalan bulmadır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println(kalan(a, b));
                    continue;
            }else if(islem.equals("10")){
                        System.out.println("seçtiğiniz işlem 3 adet sayı ile kalan bulmadır.");
                        System.out.println("Lütfen bir sayı giriniz");
                        int a = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int b = scn.nextInt();
                        System.out.println("Lütfen bir sayı giriniz");
                        int c = scn.nextInt();
                        System.out.println(kalan(a, b, c));
                    continue;
            }else if(islem.equals("11")){
                        System.out.println("*************************************************************");
                        System.out.println(islemler);
                        System.out.println("*************************************************************");
                    continue;
            }else if(islem.equals("12") || islem.equals("q") || islem.equals("Q")){
                        System.out.println("calculatorden çıkılıyor iyi günler daha iyi versiyonlarad görüşmek üzere.....");
                    break;
            }else{
                        System.out.println("uygun bir metod bulunamadı");
                        System.out.println(islemler);
                    continue;
            }

        }
    }
    
}
