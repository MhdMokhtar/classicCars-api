package inholland.classicCarsapi.model;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String release;

    public Car() {
    }

    public Car(int id, String brand, String model, String release) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.release = release;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", release='").append(release).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
