package com.mullenhigh.dungeon;

public class SpecificMonster2 extends Monster
	{
	public SpecificMonster2()
		{
		setNameOfMonster("Harpy");
		myAttackBehavior = new AttackWithSword();	
		setHitPointsOfMonster(1);
		}

	}
