

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;
    private Muro muro1;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaF1 = new EntradaFoto("Jonas", "http://www.significadodelossueños.net/wp-content/uploads/2013/10/So%C3%B1ar-con-muchedumbre.gif", "Sueños");
        entradaF2 = new EntradaFoto("Aurora", "http://lapatriaenlinea.com/fotos/07_2016/263754_1_31.jpg", "Patria");
        entradaT1 = new EntradaTexto("Ana", "La noche del pasado.");
        entradaT2 = new EntradaTexto("Gemma", "Monta el caballo sin que se note");
        entradaU1 = new EntradaUnionAGrupo("Juán", "Los Amigos");
        entradaU2 = new EntradaUnionAGrupo("Susana", "Actorres");
        muro1 = new Muro();
        muro1.addEntradaTexto(entradaF1);
        muro1.addEntradaTexto(entradaF2);
        muro1.addEntradaTexto(entradaT1);
        muro1.addEntradaTexto(entradaT2);
        muro1.addEntradaTexto(entradaU1);
        muro1.addEntradaTexto(entradaU2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
