package com.sourabh.service.manager;

import java.util.Map;

/**
 * @author Sourabh Sharma
 *
 */
public interface VersionManager {

	/**
	 * Method to process request per version provided.
	 * @param version
	 * @return String
	 */
	String processRequest(String operationName, Map<String, Object> operationContext);

	/**
	 * Method to return schema
	 * @return String
	 */
	String processSchema(String operationName);

}
