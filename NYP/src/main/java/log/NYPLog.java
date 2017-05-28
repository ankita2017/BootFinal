package log;

import utility.TestLogger;

/**
 * Created by mrahman on 5/14/17.
 */
public class NYPLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");

    }
}
