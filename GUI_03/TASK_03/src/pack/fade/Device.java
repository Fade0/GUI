package pack.fade;

public abstract class Device {
    private String name;
    private String producer;
    private Double price;

    public Device(String name, String producer, Double price){
        this.name = name;
        this.producer = producer;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" + "name='" + name + '\'' + ", producer='" + producer + '\'' + ", price=" + price + '}';
    }
}
