import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    private Calculadora calc;

    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }


    @ParameterizedTest
    @CsvSource({"1,1,2","2,2,4","4,4,8"})
    @DisplayName("teste")
    public void testeSomar(int a, int b, int resultaEsperado){

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(a , b);
        assertEquals(resultaEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","8,2,4","12,4,3"})
    @DisplayName("testeDivisao")
    public void testeDivisao(int a, int b, int resultadoEsperado){

        double resultado = calc.dividir(a , b);
        assertEquals(resultadoEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({"10,2,8","8,2,6","12,4,8"})
    @DisplayName("teste")
    public void testeSubtrair(int a, int b, int resultadoEsperado){

        int resultado = calc.subtrair(a , b);
        assertEquals(resultadoEsperado, resultado);
    }


    @ParameterizedTest
    @CsvSource({"10,2,100","8,2,16","5,4,20"})
    @DisplayName("teste")
    public void testeMultiplicar(int a, int b, int resultadoEsperado){


        int resultado = calc.multiplicar(a , b);
        assertEquals(resultadoEsperado, resultado);
    }


}
