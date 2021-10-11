package ba.unsa.etf.rpr.predavanje02;
import java.util.Scanner;
public class Main {
    static int sumaCifara(int broj) {
        int pomocna=0;
        while(broj!=0){
            pomocna+=broj%10;
            broj=broj/10;
        }
        return pomocna;
    }
    public static void main(String[] args) {
	    Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = ulaz.nextInt();
        System.out.println("Brojevi između 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=2;i<n;i++){
            if(i%sumaCifara(i)==0){
                System.out.print(i + " ");
            }
        }
    }
}
