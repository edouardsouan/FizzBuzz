import FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by edouard on 28/03/14.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void SetUpTheGame()
    {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void EstUnNombreNormal()
    {
        assertEquals("2",this.fizzbuzz.CalculeResultat(2));
    }

    @Test
    public void EstUnMultipleDeTrois()
    {
        assertEquals("FIZZ",this.fizzbuzz.CalculeResultat(3));
    }

    @Test
    public void EstUnMultipleDeCinq()
    {
        assertEquals("BUZZ",this.fizzbuzz.CalculeResultat(5));
    }

    @Test
    public void EstUnMultipleDesDeux()
    {
        assertEquals("FIZZBUZZ",this.fizzbuzz.CalculeResultat(15));
    }
        
}
