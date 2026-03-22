package OOP_PRINCIP.homeWork.task11;
/*
class Rectangle {
    protected int width;
    protected int height;

    void setWidth(int width) { this.width = width; }
    void setHeight(int height) { this.height = height; }

    int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

void test(Rectangle rect) {
    rect.setWidth(5);
    rect.setHeight(4);
    System.out.println(rect.getArea());  // Что напечатается для Rectangle? А для Square?
}
*/
//для прямоугольника напечатается 20
//для квадрата 16
/*проблема из-за того что квадрат не наследуется от прямоугольника это разные объекты,
что бы решить эту проблему можно просто создать два отдельных класса или создать один интерфейс для них

 */