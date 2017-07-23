package com.sourabh.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sourabh.service.factory.VersionManagerStrategyFactory;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class GitHubVersion1StrategyTest{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	// @Autowired
	 private VersionManagerStrategyFactory versionManagerFactory;
	 
	@Before
    public void init(){
		versionManagerFactory = (VersionManagerStrategyFactory) context.getBean("versionManagerFactory");
        if(null != versionManagerFactory ){
            System.out.println("init Elastic client finish!");
        }
    }
	

  
 @Test
 public void printStrategyFactoryTest(){
	 String version = "gitv1";
	 versionManagerFactory.getVersionManagerObject(version).processRequest(version, null);
 }
}