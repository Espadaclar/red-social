

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EntradaUnionAGrupoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupoTest
{
    private EntradaUnionAGrupo entradaU1;

    /**
     * Default constructor for test class EntradaUnionAGrupoTest
     */
    public EntradaUnionAGrupoTest()
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
        entradaU1 = new EntradaUnionAGrupo("Juan", "dam1");
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
