import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        int r, d;
        double pi = 3.14, c, a, da;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz :  ");
        r = input.nextInt();

        c = 2 * pi * r;
        System.out.println("Dairenin Çevresi :  " + c);

        a = pi * r * r;
        System.out.println("Dairenin Alanı :  " + a);

        System.out.print("Daire Diliminin Merkez Açı Ölçüsü : ");
        d = input.nextInt();

        da = (pi * (r*r) * d) / 360;
        System.out.print("Daire Dilimin Alanı : " + da);





    }
}
