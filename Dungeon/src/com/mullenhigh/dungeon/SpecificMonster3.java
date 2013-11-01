package com.mullenhigh.dungeon;

public class SpecificMonster3  extends Monster
	{
	public SpecificMonster3()
		{
		setNameOfMonster("Mountain Troll");
		myAttackBehavior = (AttackBehavior) new AttackWithFist();
		setHitPointsOfMonster(1);
		}
	}


