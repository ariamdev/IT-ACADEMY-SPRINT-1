package deliverybrumm;

public class cliente {

    private String name;
    private String adress;

    public cliente(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "\n Adress: " + adress;
    }
}
