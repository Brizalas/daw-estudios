package punto2d;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPunto2D {

    @Test
    public void testSetGetX() {
        Punto2D punto = new Punto2D();
        punto.setx(5.5);
        // Verifica que getx devuelve el valor asignado
        assertEquals(5.5, punto.getx(), 0.001);
    }

    @Test
    public void testSetGetY() {
        Punto2D punto = new Punto2D();
        punto.sety(3.3);
        // Verifica que gety devuelve el valor asignado
        assertEquals(3.3, punto.gety(), 0.001);
    }

    @Test
    public void testMoverX() {
        Punto2D punto = new Punto2D();
        punto.moverX(2.0);
        // Verifica que moverX suma correctamente al valor inicial (0)
        assertEquals(2.0, punto.getx(), 0.001);
    }

    @Test
    public void testMoverY() {
        Punto2D punto = new Punto2D();
        punto.moverY(4.0);
        // Verifica que moverY suma correctamente al valor inicial (0)
        assertEquals(4.0, punto.gety(), 0.001);
    }

    @Test
    public void testProductoEscalar() {
        Punto2D punto = new Punto2D();
        punto.setx(3.0);
        punto.sety(2.0);
        // Verifica que producto_escalar devuelve x*y
        assertEquals(6.0, punto.producto_escalar(), 0.001);
    }
}