package com.mullenhigh.dungeon;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests
	{

	public static Test suite()
		{
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(HeroTest.class);
		suite.addTestSuite(MonsterTest.class);
		//$JUnit-END$
		return suite;
		}

	}
