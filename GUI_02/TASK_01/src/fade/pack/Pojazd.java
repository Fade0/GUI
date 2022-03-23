package fade.pack;

public abstract class Pojazd {
    private String name;

    public abstract void showTypPojazdu();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
