package lk.ijse.log_management;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;


public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    String getLogger(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        try {
            throw new RuntimeException("Hello... I'm an exception");
        } catch (Exception e) {
            logger.error("You have caught RuntimeException", e.getMessage());
        }

        return "Log message generated";
    }
}
