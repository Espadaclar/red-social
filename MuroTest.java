

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
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaTexto entradaT3;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaFoto entradaF3;
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
        entradaT1 = new EntradaTexto("Ana", "Hola caracola");
        entradaT2 = new EntradaTexto("Eva", "Sol templado");
        entradaT3 = new EntradaTexto("Juan", "Media luna roja");
        entradaF1 = new EntradaFoto("Samuel", "http://www.significadodelossueños.net/wp-content/uploads/2013/10/So%C3%B1ar-con-muchedumbre.gif ", "Suennos");
        entradaF2 = new EntradaFoto("Clara", "http://lapatriaenlinea.com/fotos/07_2016/263754_1_31.jpg", "Patriotas");
        entradaF3 = new EntradaFoto("Ricardo", "http://www.atlantico.net/media/atlantico/images/2014/04/07/2014040708271091632.jpg", "Atlantico");
        muro1 = new Muro();
        muro1.addEntradaFoto(entradaF1);
        muro1.addEntradaFoto(entradaF2);
        muro1.addEntradaFoto(entradaF3);
        muro1.addEntradaTexto(entradaT1);
        muro1.addEntradaTexto(entradaT2);
        muro1.addEntradaTexto(entradaT3);
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
