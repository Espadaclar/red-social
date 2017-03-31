

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
    private EntradaUnionAGrupo entradaU1;
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT1;
    private Muro muro1;
    private EntradaFoto entradaF2;

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
        entradaU1 = new EntradaUnionAGrupo("Ana", "Las Amigas");
        entradaF1 = new EntradaFoto("Jonas.", "https://i2.wp.com/www.fierasdelaingenieria.com/wp-content/uploads/2013/08/tren-rapido.jpg?resize=720%2C340", "Yendo a Barcelona.");
        entradaT1 = new EntradaTexto("Enar", "Para mañana por la mañana.");
        muro1 = new Muro();
        entradaF2 = new EntradaFoto("Gemma", "http://puzzles.tuspuzzles.es/images/original/avion-al-atardecer-54b2aeb58f8bb.jpg", "Volando voy");
        muro1.addEntradaTexto(entradaU1);
        muro1.addEntradaTexto(entradaF1);
        muro1.addEntradaTexto(entradaT1);
        muro1.addEntradaTexto(entradaF2);
        //muro1.mostrarMuroEnNavegador();
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
