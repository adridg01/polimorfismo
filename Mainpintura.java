import java.util.Scanner;

public class Mainpintura {
    public static void main(String[] args) {
        Pintura a=new Pintura(250);
        Esfera e=new Esfera(15);
        Rectangulo r =new Rectangulo(20,35);
        Cilindro c =new Cilindro(10,30);
        System.out.println(e.toString());
        System.out.println(a.getcobertura(e));
        System.out.println(r.toString());
        System.out.println(a.getcobertura(r));
        System.out.println(c.toString());
        System.out.println(a.getcobertura(c));
    }
}
