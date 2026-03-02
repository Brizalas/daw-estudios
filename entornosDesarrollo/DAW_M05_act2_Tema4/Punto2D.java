package punto2d;

public class Punto2D {
    private double x;
    private double y;

    public Punto2D() {
        x = 0;
        y = 0;
    }

    public void moverX(double l) {
        x = x + l;
    }

    public void moverY(double l) {
        y = y + l;
    }

    public double producto_escalar() {
        return x * y;
    }

    public void print() {
        System.out.print("(" + x + "," + y + ")");
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public void setx(double a) {
        x = a;
    }

    public void sety(double b) {
        y = b;
    }
}
