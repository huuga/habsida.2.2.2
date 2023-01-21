package web.model;

public class Car {
    private String brand;
    private String model;
    private Color color;

    public Car(String brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
