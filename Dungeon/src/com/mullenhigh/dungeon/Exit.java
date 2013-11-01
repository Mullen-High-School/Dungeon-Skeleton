package com.mullenhigh.dungeon;

public class Exit
	{
	public static final String north = "north";
	public static final String south = "south";
	public static final String west = "west";
	public static final String east = "east";
	public static final String up = "up";
	public static final String down = "down";
	public static final String in = "in";
	public static final String out = "out";
	private Location leadsTo;
	private String direction;
	

public Exit (String directionToMove, Location leadsToLocation)
	{
	leadsTo = leadsToLocation;
	direction = directionToMove;
	}
public Location getLeadsTo()
	{
	return leadsTo;
	}
public String getDirection()
	{
	return direction;
	}
	}
