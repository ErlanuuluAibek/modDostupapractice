public class Phone {
    private String model;
    private String madein;
    private int price;
    public static  int koll=0;
    public Phone(String model, String madein, int price) {
        this.model = model;
        this.madein = madein;
        this.price = price;
       koll++;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", madein='" + madein + '\'' +
                ", price=" + price+
                '}';
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
