package shape.shape;

public interface IShapeFactory {

    /**
     * return a shape object for a given type
     * The possible shapes are: circle, ellipse, parallelogram,
     * rectangle, square, and triangle.
     * @param type type of shape
     * @return A shape
     */
    IShape getShape(String type);
}
