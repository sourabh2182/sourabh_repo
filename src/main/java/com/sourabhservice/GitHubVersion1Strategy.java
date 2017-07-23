package com.sourabhservice;
import org.springframework.stereotype.Component;

import com.sourabh.service.manager.VersionManager;

import java.util.Map;

@Component("github_v1")
public class GitHubVersion1Strategy implements VersionManager{

	@Override
	public String processRequest(String version, Map<String, Object> operationContext) {
		System.out.println("GitHubVersion1Strategy executed -- "+version);
		return version;
	}

	@Override
	public String processSchema(String operationName) {
		// TODO Auto-generated method stub
		return null;
	}


}
