package FizzBuzz;

/**
 * Created by edouard on 28/03/14.
 */
public class FizzBuzz {

    private String resultat="";

    public String CalculeResultat(int nombre) {

        EstQuelquonque(nombre);
        EstIlFizz(nombre);
        EstIlUnBuzz(nombre);
        EstUnFizzBuzz(nombre);

        return resultat;
    }

    private String EstQuelquonque(int nombre) {
        if(nombre%5 != 0 && nombre%3 !=0)
            resultat = String.valueOf(nombre);
        return resultat;
    }

    private String EstUnFizzBuzz(int nombre) {

        if(nombre%3 == 0 && nombre%5 ==0)
            resultat = "FIZZBUZZ";
        return resultat;
    }

    private String EstIlUnBuzz(int nombre) {
        if(nombre%5 == 0)
            resultat = "BUZZ";
        return resultat;
    }

    private String EstIlFizz(int nombre) {
        if(nombre%3 == 0 )
             resultat = "FIZZ";
        return resultat;
    }

}
