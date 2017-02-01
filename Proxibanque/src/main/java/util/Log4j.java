package util;

import org.apache.log4j.Logger;

/**
 * Classe de gestion des Logs
 * 
 * @author Xavier/Camille
 *
 */
public class Log4j {

	private static Logger logger = Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {

	logger.debug("msg de debogage");

	logger.info("msg d'information");

	logger.warn("msg d'avertissement");

	logger.error("msg d'erreur");
	
	logger.fatal("msg d'erreur fatale");  

	}

	}
	
	