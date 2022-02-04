import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void init(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("PruebaDeSumaSimple")
    public void probarSuma(){
        assertEquals(25, calculadora.sumar(5.00, 20.00));
    }

    @Test
    @Disabled("No More")
    public void probarResta(){
        assertEquals(8, calculadora.restar(10, 2));
    }

    @Test
    public void probarDivision(){
        assertThrows(ArithmeticException.class, () -> {
            var division = 100/0;
        });
    }

    @Test
    @DisplayName("Prueba de la tabla de multiplicar")
    public void pruebaTablaMultiplicar(){
        assertAll("Tabla del 5",
                () -> {assertEquals(5, calculadora.multiplicar(5, 1));},
                () -> {assertEquals(10, calculadora.multiplicar(5, 2));},
                () -> {assertEquals(15, calculadora.multiplicar(5, 3));},
                () -> {assertEquals(20, calculadora.multiplicar(5, 4));},
                () -> {assertEquals(25, calculadora.multiplicar(5, 5));}
        );
    }

    @Test
    public void probarMultiplicacion(){
        assertEquals(3, calculadora.multiplicar(3, 1));
    }

}
