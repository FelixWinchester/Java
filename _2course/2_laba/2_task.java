abstract class Shape {
    public abstract double getVolume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Container {
    private double totalVolume;
    private double remainingVolume;

    public Container(double totalVolume) {
        this.totalVolume = totalVolume;
        this.remainingVolume = totalVolume;
    }

    public void add(Shape shape) {
        double shapeVolume = shape.getVolume();

        if (shapeVolume <= remainingVolume) {
            remainingVolume -= shapeVolume;
            System.out.println("Фигура добавлена. Остаток объема: " + remainingVolume);
        } else {
            System.out.println("Недостаточно места для добавления фигуры. Остаток объема: " + remainingVolume);
        }
    }

    public double getRemainingVolume() {
        return remainingVolume;
    }
}

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);
        Shape cylinder = new Cylinder(2, 4);

        container.add(sphere);
        container.add(cube);
        container.add(cylinder);
    }
}
