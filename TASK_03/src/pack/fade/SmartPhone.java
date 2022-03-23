package pack.fade;

public class SmartPhone extends Device implements Call, Games, Internet,Text {
    private boolean simCard;
    private boolean internet;

    public SmartPhone(String name, String producer, Double price, boolean simCard, boolean internet){
        super(name,producer,price);
        this.simCard = simCard;
        this.internet = internet;
    }

    @Override
    public void call(Device device) {
        if (!simCard){
            System.out.println("No SimCard found!");
        }
        else{
            System.out.println(getName() + "is calling to " + device.getName());
        }
    }

    @Override
    public void text(Device device) {
        if (!simCard){
            System.out.println("No SimCard found!");
        }
        else{
            System.out.println(getName() + "is texting " + device.getName());
        }
    }

    @Override
    public void playGames() {
        System.out.println("You can play some games!");
    }

    @Override
    public void internet() {
        if(!internet){
            System.out.println("No internet connection!");
        }
        else{
            System.out.println("Go and surf the web!");
        }
    }

    public boolean isSimCard() {
        return simCard;
    }

    public void setSimCard(boolean simCard) {
        this.simCard = simCard;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "simCard=" + simCard + ", internet=" + internet + super.toString() + '}';
    }
}
