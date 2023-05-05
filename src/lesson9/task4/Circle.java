package lesson9.task4;

import java.util.Objects;

public class Circle {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public void setLength(double length) {
        this.radius = length / 2 / Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }
}
