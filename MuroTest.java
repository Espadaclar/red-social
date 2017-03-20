

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
        entradaF1 = new EntradaFoto("María", "http://lapatriaenlinea.com/fotos/07_2016/263754_1_31.jpg", "PATRIA");
        entradaF2 = new EntradaFoto("Luis", "http://www.atlantico.net/media/atlantico/images/2014/04/07/2014040708271091632.jpg", "Atlantico");
        entradaT1 = new EntradaTexto("María", "Con cien cañones.");
        entradaT2 = new EntradaTexto("Atlantico", "quedan cosas por ver.");
        entradaU1 = new EntradaUnionAGrupo("Ana", "Los Ammigos");
        muro1 = new Muro();
        muro1.zzMuestraDatos();
        muro1.zzMuestraDatos();
        muro1.addEntradaTexto(entradaF1);
        muro1.addEntradaTexto(entradaF2);
        muro1.addEntradaTexto(entradaU1);
        muro1.addEntradaTexto(entradaT1);
        muro1.addEntradaTexto(entradaT2);
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
