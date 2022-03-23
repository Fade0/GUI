
package pack.fade;
public class MobilePhone extends Device implements Call,Text {
    private boolean simCard;

    public MobilePhone(String name, String producer, Double price, boolean simCard){
        super(name,producer,price);
        this.simCard = simCard;

    }

    @Override
    public void call(Device device) {
        if (!simCard){
            System.out.println(" No SimCard found!");
        }
        else{
            System.out.println(getName() + " is calling to " + device.getName());
        }
    }
    @Override
    public void text(Device device) {
        if (!simCard){
            System.out.println("No SimCard found!");
        }
        else{
            System.out.println(getName() + " is texting " + device.getName());
        }
    }

    @Override
    public String toString() {
        return "MobilePhone{" + "simCard=" + simCard + super.toString() + "}";
    }
}
