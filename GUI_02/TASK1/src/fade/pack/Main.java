package fade.pack;

public class Main {

    public static void main(String[] args) {

        //Pojazd pojazd = new Pojazd();

        Pojazd samochod = new Samochod();
        samochod.showTypPojazdu();

        Pojazd rower = new Pojazd() {
            @Override
            public void showTypPojazdu() {
                System.out.println("Rower");
            }
        };
        rower.showTypPojazdu();
    }
}
