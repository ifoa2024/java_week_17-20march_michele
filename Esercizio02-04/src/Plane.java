public class Plane {
    String model;
    Number capacity;


    public Plane(String model, Number capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public Number getCapacity() {
        return capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(Number capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane [model=" + model + ", capacity=" + capacity + "]";
    }
}
