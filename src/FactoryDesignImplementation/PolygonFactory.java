package FactoryDesignImplementation;

public class PolygonFactory {

    public static Polygon getInstance(int sides) {
        Polygon polygon = null;
        switch (sides) {
            case 3:
                polygon = new Triangle();
                break;
            case 4:
                polygon = new Square();
                break;
            case 5:
                polygon = new Pentagon();
                break;
            case 8:
                polygon = new Octagon();
                break;
            default:
                // throw exception
                break;
        }
        return polygon;
    }

}
