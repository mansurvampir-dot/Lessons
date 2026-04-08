package OOP_PRINCIP.homework2.task7;

import java.util.Objects;

class ColoredPoint extends Point {
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColoredPoint cp = (ColoredPoint) o;
        return x == cp.x && y == cp.y &&
                Objects.equals(color, cp.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
