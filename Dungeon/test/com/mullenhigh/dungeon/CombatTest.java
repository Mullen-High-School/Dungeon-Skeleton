package com.mullenhigh.dungeon;

import junit.framework.TestCase;

public class CombatTest extends TestCase
	{

	public int	amountOfDamage;
	public int	hitPointsOfMonster;

	public void testCombat()	//how do test System.out statements?
		{
		Monster testMonster = new Monster();
		testMonster.setHitPointsOfMonster(11);
		amountOfDamage = 11;
		
		assertEquals((hitPointsOfMonster <= 0), (testMonster.getHitPointsOfMonster()));
		}

	}
