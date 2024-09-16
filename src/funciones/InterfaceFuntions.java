package funciones;

import java.util.ArrayList;

import pojo.GameData;

public interface InterfaceFuntions {
		
	public ArrayList<GameData> readFile();
	public void  writeFile(ArrayList<GameData> gameData);
}
