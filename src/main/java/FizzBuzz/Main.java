package FizzBuzz;

/**
 * Created by edouard on 28/03/14.
 */
public class Main {
    public static void main(String[] args)
    {
        FizzBuzz jeuxFizzBuzz = new FizzBuzz();

        for(int tour=0; tour<101; tour++)
        {
            System.out.println(tour+"->"+jeuxFizzBuzz.CalculeResultat(tour));
        }
    }
}
