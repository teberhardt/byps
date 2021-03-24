package byps.gen.rest;

import byps.gen.api.GeneratorException;
import byps.gen.api.GeneratorProperties;

public class PropertiesRest extends GeneratorProperties {

  private static final long serialVersionUID = -4801873533782890716L;

  public PropertiesRest(GeneratorProperties defaultProps) {
    super(defaultProps);
  }
  
  public final static String OPT_PREFIX = "-genrest.";

  /**
	 * Destination directory for openapi.json file.
	 */
	public final static String DEST_DIR = OPT_PREFIX + "openapi-dir";

	/**
	 * File name for openapi.json. 
	 */
	public final static String OPENAPI_FILENAME = "openapi.json";
	
	/**
	 * Set this option if BASIC authentication is supported.
	 */
  public final static String AUTHENTICATION_SCHEME_BASIC = OPT_PREFIX + "auth-basic";
  
  /**
   * Set this option if Bearer authentication is supported.
   */
  public final static String AUTHENTICATION_SCHEME_BEARER = OPT_PREFIX + "auth-bearer";
  
  /**
   * Authentication scheme API-KEY.
   * 
   * The following parameter must define the header name.
   */
  public final static String AUTHENTICATION_SCHEME_API_KEY = OPT_PREFIX + "auth-api-key";
	
  @Override
  public int addArgs(String[] args, int idx) throws GeneratorException {
    String key = args[idx];
    switch (key) {
      case AUTHENTICATION_SCHEME_BASIC:
      case AUTHENTICATION_SCHEME_BEARER:
        put(key, "true");
        idx++;
        break;
      default:
        idx = super.addArgs(args, idx);
        break;
    }
    return idx;
  }

}
