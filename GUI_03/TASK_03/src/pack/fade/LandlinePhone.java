package pack.fade;

public class LandlinePhone extends Device implements Call{
    private boolean simCard;

    public LandlinePhone(String name, String producer, Double price, boolean SimCard){
        super(name, producer,price);
        this.simCard = simCard;

    }

    @Override
    public void call(Device device) {
        if(!simCard){
            System.out.println(" No SimCard found!");
        }
        else{
            System.out.println((getName() + " is calling " + device.getName()));
        }
    }

    public void setSimCard(boolean simCard) {
        this.simCard = simCard;
    }

    public boolean isSimCard() {
        return simCard;
    }

    @Override
    public String toString() {
        return "LandlinePhone{" + "simCard=" + simCard + super.toString() + "}";
    }
}
