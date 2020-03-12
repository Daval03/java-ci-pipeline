package Estructuras_de_datos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class calculadoraTest {
    calculadora calc=new calculadora();
    @Test
    public void resta() {
        //Object assertEcuals;
        assertSame(50,calc.resta(100,50));
        assertSame(-40,calc.resta(20,60));
    }
    @Test
    public void suma(){
        assertSame(101,calc.suma(100,1));
        assertSame(90,calc.suma(40,50));
    }
    @Test
    public void division(){
        assertSame(10,calc.Division(50,5));
        assertSame(11,calc.Division(70,6));
    }
    @Test
    public void multiplicacion(){
        assertSame(25,calc.Multiplicacion(5,5));
        assertSame(120,calc.Multiplicacion(2,60));
    }
}