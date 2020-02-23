package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class HouseConstruction {
    static Logger logger = LogManager.getLogger(HouseConstruction.class);

    Scanner s = new Scanner(System.in);
    int Choice;
    Float area;

    void Intro() {
        logger.info("Press 1 for Standard Material" + "\n"
                + "Press 2 for Above Standards " + "\n"
                + "Press 3 for High Standards" + "\n"
                + "Press 4 for Fully Automated" + "\n"
                + "Press 0 for Exiting the Application");
    }

    void Function() {
        logger.info("Enter area of the house");
        area = s.nextFloat();
        Intro();
        Choice = s.nextInt();
        while(Choice != 0) {
            if (Choice == 1) {
                Standard();
                Intro();
            }
            else if(Choice == 2) {
                AboveStandard();
                Intro();
            }
            else if(Choice == 3) {
                HighStandards();
                Intro();
            }
            else if(Choice == 4){
                FullyAutomated();
                Intro();
            }
            else {
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

    void FullyAutomated() {
        logger.trace(area * 2400);
    }

    void HighStandards() {
        logger.trace(area * 1800);
    }

    void AboveStandard() {
        logger.trace(area * 1500);
    }
    void Standard() {
        logger.trace(area * 1200);
    }
}
