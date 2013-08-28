/**
 * 
 */
package org.zkoss.util.cpr;

import org.springframework.core.io.Resource;

/**
 * @author Ian YT Tsai(zanyking)
 *
 */
public interface ResourceAllocator<T> {

	/**
	 * invocation
	 * @param resource
	 * @return
	 */
	public void allocate(Resource resource, ResourceVisitor<T> visitor);
}
