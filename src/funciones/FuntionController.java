package funciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import pojo.GameData;

public class FuntionController extends AbstractFuntions implements InterfaceFuntions {

	@Override
	public ArrayList<GameData> readFile() {

		return null;
	}

	@Override
	public void writeFile(ArrayList<GameData> gameData) {

		File file = new File(path);

		try {
			FileOutputStream fi = new FileOutputStream(file, true);
			byte[] byteArray = new byte[gameData.size()];
			for (int i = 0; i < gameData.size(); i++) {
				byteArray[i] = (byte) (Byte.parseByte(gameData.get(i).getLocalGroup())
						+ Byte.parseByte(gameData.get(i).getVisitorGroup()) + gameData.get(i).getLocalGoal()
						+ gameData.get(i).getVisitorGoal() + Byte.parseByte(gameData.get(i).getPlace())
						+ Byte.parseByte(gameData.get(i).getGameDate()));
			}
			fi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
