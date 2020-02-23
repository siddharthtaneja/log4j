package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleAndCompoundInterest {
    static Logger logger = LogManager.getLogger(SimpleAndCompoundInterest.class);
    Scanner s = new Scanner(System.in);
    double Principal;
    double Rate;
    double Amount;
    double Time;
    double res;
    void Intro(){
        logger.info("Enter 1 for Simple Interest " + "\n"
                + "Enter 2 for Compound Interest" + "\n"
                + "Enter 0 to exit the application");
    }
    void Principal(){
        logger.info("Enter Principal Amount");
    }
    void Time(){
        logger.info("Enter Time");
    }
    void rate(){
        logger.info("Enter rate of interest");
    }
    void SimpleOrCompound() {
        Intro();
        int Choice = s.nextInt();
        while(Choice != 0) {
            if (Choice == 1) {
                SimpleInterest();
                Intro();
            } else if (Choice == 2) {
                CompoundInterest();
                Intro();
            } else {
                try {
                throw new MyException();
                }
                catch (MyException e){
                    logger.warn(e.toString());
                }
                finally {
                    Intro();
                }

            }
            Choice = s.nextInt();
        }
    }

    void SimpleInterest() {
        Principal();
        Principal = s.nextDouble();
        rate();
        Rate = s.nextDouble();
        Time();
        Time = s.nextDouble();
        res =(Principal * Rate * Time)/100;
        logger.info("Simple Interest :" + res);
    }
    void CompoundInterest() {
        Principal();
        Principal = s.nextFloat();
        rate();
        Rate = s.nextFloat();
        Time();
        Time = s.nextFloat();
        Amount = Principal * ( Math.pow(1+(Rate/100),Time) );
        res = Amount - Principal;
        logger.info("Compound Interest :" + res);
    }
}
