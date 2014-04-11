package FizzBuzz;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;
/**
 * Created by edouard on 28/03/14.
 * Test avec CloudBees
 */
public class Main {
    public static void main(String[] args) {

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                String result="";
                FizzBuzz partie = new FizzBuzz();

                for(int num=0;num<101;num++)
                {
                    result += partie.CalculeResultat(num)+"<br/>";

                }
                return result;
            }
        });
    }
}
