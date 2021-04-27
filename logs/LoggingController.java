package logs;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggingController {
 
	private static final Logger logger = LogManager.getLogger(LoggingController.class);

 
   
    public static void main(String[] args) {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
 
       
    }
}