package com.mullenhigh.dungeon;

import junit.framework.TestCase;

public class MonsterTest extends TestCase
	{
	public void testNameOfMonster()
		{
		Monster testMonster = new Monster();
		testMonster.setNameOfMonster("Troll");
		
		assertEquals("Troll", testMonster.getNameOfMonster());
		}
	
	public void testMonsterHitPoints()
		{
		Monster testMonster = new Monster();
		testMonster.setHitPointsOfMonster(11);
		
		assertEquals(11, testMonster.getHitPointsOfMonster());
		}
	

	public void testMonsterAttackBehavior()
		{
		Monster testMonster = new Monster();
		AttackBehavior testAttack = new AttackWithTeeth();
		testMonster.setAttackBehavior(testAttack);
	
		assertEquals(testAttack, testMonster.getAttackBehavior());
		}

	}

