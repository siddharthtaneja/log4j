package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger =  LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        logger.info("Enter 1 to calculate Simple or Compound INterest"
                + "\n" + "Enter 2 to calculate House Construction cost"
                + "\n" + "Enter 0 to exit ");
        int choice = s.nextInt();

        SimpleAndCompoundInterest simpleAndCompoundInterest = new SimpleAndCompoundInterest();
        HouseConstruction houseConstruction = new HouseConstruction();
        while(choice != 0) {
            if (choice == 1) {
                simpleAndCompoundInterest.SimpleOrCompound();
            } else if (choice == 2) {
                houseConstruction.Function();
            } else {
                try {
                    throw new MyException();
                }
                catch (MyException e){
                    logger.warn(e.toString());
                }
            }
            logger.info("Enter 1 to calculate Simple or Compound INterest" + "\n" + "Enter 2 to calculate House Construction cost" + "\n" + "Enter 0 to exit ");
            choice = s.nextInt();
        }

    }
}
