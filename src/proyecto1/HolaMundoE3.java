
package proyecto1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielhs, jahaziel y david
 */
public class HolaMundoE3 {

    public static void main(String[] args) {
         Logger logger;
        logger = Logger.getLogger(HolaMundoE3.class.getName());
        logger.log(Level.INFO, "Hola mundo");
    }
    
}
