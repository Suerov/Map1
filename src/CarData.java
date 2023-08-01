

public class CarData {
    private String yearofissue;
    private  String model;
    private Integer price;
    private String color;

    public CarData(String yearofissue, String model, Integer price, String color) {
        this.yearofissue = yearofissue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getYearofissue() {
        return yearofissue;
    }

    public void setYearofissue(String yearofissue) {
        this.yearofissue = yearofissue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarData:" +
                " yearofissue: " + yearofissue +
                ", model: " + model +
                ", price: " + price +
                ", color: " + color;
    }
}
