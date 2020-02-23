package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyException extends Exception {
    public String toString(){
        return "Invalid input";
    }
}
