package com.mullenhigh.dungeon;

import java.util.Scanner;
import java.util.Vector;

public class PlayGame 
	{
	static Vector<Location> map;
	private static Hero hero;
	static Location currentLocation;
	private static double monsterDensity = 0.5;

	public static void main(String[] args)
		{
		createMap();
		populateMonsters();
		hero = GenerateHero.generateHero();
		
		while(true)
		{
		System.out.println("Your HP = " + hero.getHitPointsOfHero());
		System.out.println("You're in " + currentLocation.getTitle());
		System.out.println(currentLocation.getDescription());
		System.out.println();
		
		if(currentLocation.getLair() != null)
			{
			System.out.println("You also see a " + currentLocation.getLair().getNameOfMonster());
			resolveCombat(hero, currentLocation.getLair());
			}
		
		System.out.println();
		System.out.println("Which direction would you like to go?");
		
		
		for(Exit exit : currentLocation.getExits())
			{
			System.out.println(exit.getDirection());
			}
  
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		
		for(Exit exit : currentLocation.getExits())
			{
			if(exit.getDirection().equals(choice))
				{
				currentLocation = exit.getLeadsTo();
				}
			}
		
		}
	}
	
		public static void createMap()
			{
			map = new Vector<Location>(5);
	
			Location location1 = new Location("the southwest room.","You see doors to the north and east.");
			Location location2 = new Location("the southeast room.","You see doors to the north and west.");
			Location location3 = new Location("the northwest room.","You see doors to the south and east and a trapdoor leading down.");
			Location location4 = new Location("the northeast room.","You see doors to the south and west.");
			Location location5 = new Location("the basement.","You see a ladder leading back up.");

			map.addElement(location1);
			map.addElement(location2);
			map.addElement(location3);
			map.addElement(location4);
			map.addElement(location5);
			
			location1.addExit(new Exit(Exit.north, location3));
			location1.addExit(new Exit(Exit.east, location2));
			location2.addExit(new Exit(Exit.north, location4));
			location2.addExit(new Exit(Exit.west, location1));
			location3.addExit(new Exit(Exit.south, location1));
			location3.addExit(new Exit(Exit.east, location4));
			location3.addExit(new Exit(Exit.down, location5));
			location4.addExit(new Exit(Exit.west, location3));
			location4.addExit(new Exit(Exit.south, location2));
			location5.addExit(new Exit(Exit.up, location3));
			
			currentLocation = location1;				
			}
	   
		public static void populateMonsters()
			{
			for (Location nextRoom : map)
				{
				double randomNumber = Math.random();	
				if (randomNumber <= monsterDensity)
					{
					switch ((int) ((randomNumber * 10) %3 + 1))
						{
						case 1: 
						nextRoom.lair= new SpecificMonster();
						break;
						case 2: 
						nextRoom.lair= new SpecificMonster2();
						break;
						case 3: 
						nextRoom.lair= new SpecificMonster3();
						break;
						}
					}
				}
			}
			
		public static void resolveCombat(Hero heroCombatant, Monster monsterCombatant)
			{
			while(monsterCombatant.getHitPointsOfMonster()>0)
			{
			System.out.println("The monster's HP = " + monsterCombatant.getHitPointsOfMonster());
			monsterCombatant.setHitPointsOfMonster(monsterCombatant.getHitPointsOfMonster() - heroCombatant.performAttack());
			heroCombatant.setHitPointsOfHero(heroCombatant.getHitPointsOfHero() - monsterCombatant.performAttack());
			System.out.println("The monster now has " + monsterCombatant.getHitPointsOfMonster() + " HP.");
			System.out.println("You now have " + heroCombatant.getHitPointsOfHero() + " HP.");
			
			if (monsterCombatant.getHitPointsOfMonster() <= 0)
					{
					System.out.println("The monster dies.");
					}
			
			if (heroCombatant.getHitPointsOfHero() <= 0)
					{
					System.out.println("You die a failure.");
					System.exit(0);
					}
			
			}
			}
					
				

			
	}
		