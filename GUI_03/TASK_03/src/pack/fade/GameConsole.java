package pack.fade;

public class GameConsole extends Device implements Games, Internet{
    private boolean internet;

    public GameConsole(String name, String producer, Double price, boolean internet){
        super(name, producer, price);
        this.internet = internet;

    }

    @Override
    public void playGames() {
        if(!internet){
            System.out.println("Only offline mode!");

        }
        else{
            System.out.println("Go play some games!");

        }

    }

    @Override
    public void internet() {
        if(!internet){
            System.out.println("You have no internet connection!");
        }
        else{
            System.out.println("Go surf the web!");
        }
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isInternet() {
        return internet;
    }
}
