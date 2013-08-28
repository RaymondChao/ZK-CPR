/**
 * 
 */
package org.zkoss.util.cpr;

import java.util.regex.Pattern;

/**
 * @author Ian YT Tsai(zanyking)
 *
 */
public class Consts {
	public static final String PACKAGE_SEGMENT_REGEX = "[\\w\\$&&[^0-9]][\\w\\$]*";
	public static final String PACKAGE_REGEX = PACKAGE_SEGMENT_REGEX+"([\\.]"+PACKAGE_SEGMENT_REGEX+")*";
	
	public static final Pattern JAVA_PACKAGE_PTN = Pattern.compile(PACKAGE_REGEX);
}
