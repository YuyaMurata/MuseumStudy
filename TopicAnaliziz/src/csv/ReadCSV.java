package csv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import obj.EnqueteObject;

public class ReadCSV {
	public ReadCSV() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public MargeCSV read(String filename) {
		try {
			File csv = new File(filename); // CSVデータファイル
			BufferedReader br = new BufferedReader(new FileReader(csv));

			MargeCSV csvMap = new MargeCSV();

			//SettingKey
			String line = br.readLine();
			String[] keyList = line.split("\t");

			while ((line = br.readLine()) != null) {
				// 1行をデータの要素に分割
				String[] str = line.split("\t");

				//Set HashMap
			csvMap.setData(new EnqueteObject(str));
			//	csvMap.setData(new ProgramObject(str));
			}

			br.close();

			return csvMap;
		} catch (FileNotFoundException e) {
			// Fileオブジェクト生成時の例外捕捉
			e.printStackTrace();
		} catch (IOException e) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			e.printStackTrace();
		}

		return null;
	}
}
