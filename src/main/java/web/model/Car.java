package web.model;


import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String series;

    public Car(int id, String model, String series) {
        this.id=id;
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car: " + model + " " + series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(model, car.model) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, series);
    }
}
