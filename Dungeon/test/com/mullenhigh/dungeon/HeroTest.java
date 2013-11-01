package com.mullenhigh.dungeon;

import junit.framework.TestCase;

public class HeroTest extends TestCase
	{
	public void testNameOfHero()
		{
		Hero testHero = new Hero();
		testHero.setNameOfHero("Dirk McSteel");
		
		assertEquals("Dirk McSteel", testHero.getNameOfHero());
		}
	
	public void testHeroAttackBehavior()
		{
		Hero testHero = new Hero();
		AttackBehavior testAttackBehavior = new AttackWithFist();
		testHero.setAttackBehavior(testAttackBehavior);
		
		assertEquals(testAttackBehavior, testHero.getAttackBehavior());
		}


	
	}
