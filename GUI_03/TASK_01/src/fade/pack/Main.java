package fade.pack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Square[] lista = new Square[5];

        try {
            lista[0] = new Square(3);
            lista[1] = new Square(2);
            lista[2] = new Square(4);
            lista[3] = new Square(9);
            lista[4] = new Square(10);
        }
        catch (TooBigSquareException e) {
            e.printStackTrace();
        }


        for (Square a:lista){
            System.out.println(a);

        }
        System.out.println("----");
        Arrays.sort(lista);

        for (Square a:lista){

            System.out.println(a);

        }
    }
}
