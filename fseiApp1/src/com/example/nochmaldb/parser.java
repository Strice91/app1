package com.example.nochmaldb;

import java.util.Vector;

class parser{
	private static Vector<skriptData> parsedSkript = new Vector<skriptData>();
	
	
	
	public static void setList(Vector<skriptData> List){
		parsedSkript = List;
	}
	
	public static skriptData getSkript(int skriptNr){
		return parsedSkript.get(skriptNr);
	}
	
	public static Vector<skriptData> getList(){
		return parsedSkript;
	}
}