package web.model;

public class Car {
    private String maker;
    private int year;
    private String color;

    public Car(String maker, int year, String color) {
        this.maker = maker;
        this.year = year;
        this.color = color;
    }

    public String getMaker() {
        return maker;
    }


    public void setMaker(String model) {
        this.maker = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
