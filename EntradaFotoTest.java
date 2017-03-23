

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EntradaFotoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntradaFotoTest
{
    private EntradaFoto entradaF1;

    /**
     * Default constructor for test class EntradaFotoTest
     */
    public EntradaFotoTest()
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
        entradaF1 = new EntradaFoto("JOSE", "HTPP// ÑKÑÁ", "somatines");
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
