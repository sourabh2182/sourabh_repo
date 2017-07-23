package com.sourabh.service.factory;

import com.sourabh.service.manager.VersionManager;

public interface VersionManagerStrategyFactory {
	/**
	 * factory method to get instance of implementation of version manager
	 * @param version
	 * @return VersionManager
	 */
	VersionManager getVersionManagerObject(String version);
}
