package InOut;

/**
 * Ejemplo Singleton
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class Config {
	
	private static Config config = null;
	
	private Config() {}
	
	public static Config getInstance() {
		if (config==null) {
			config = new Config();
		}
		return config;
	}
	
}
