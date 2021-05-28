package FactoryDesignImplementation;

public class Client {

    public static void main(String[] args) {
        // triangle
        Polygon triangle = PolygonFactory.getInstance(3);
        System.out.println(triangle.getType());
        // square
        Polygon square = PolygonFactory.getInstance(4);
        System.out.println(square.getType());
        // pentagon
        Polygon pentagon = PolygonFactory.getInstance(5);
        System.out.println(pentagon.getType());
        // octagon
        Polygon octagon = PolygonFactory.getInstance(8);
        System.out.println(octagon.getType());
    }

}
