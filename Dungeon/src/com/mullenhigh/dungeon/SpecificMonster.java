package com.mullenhigh.dungeon;

public class SpecificMonster extends Monster
	{
		public SpecificMonster()
			{
			setNameOfMonster("Sabre-tooth Tiger");
			myAttackBehavior = (AttackBehavior) new AttackWithTeeth();
			setHitPointsOfMonster(2);
			}

		
	}
