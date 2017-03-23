

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EntradaTextoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntradaTextoTest
{
    private EntradaTexto entradaT1;

    /**
     * Default constructor for test class EntradaTextoTest
     */
    public EntradaTextoTest()
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
        entradaT1 = new EntradaTexto("Pepe", "hola pepe");
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
