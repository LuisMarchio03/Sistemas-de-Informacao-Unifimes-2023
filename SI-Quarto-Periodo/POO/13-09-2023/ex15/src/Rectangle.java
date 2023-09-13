
public class Rectangle {
  private double width;
  private double height;

  public Rectangle() {
    this.width = 5.0;
    this.height = 3.0;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double calculateArea() {
    return width * height;
  }

  public double calculatePerimeter() {
    return 2 * (width + height);
  }

}
