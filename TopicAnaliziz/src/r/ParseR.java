package r;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import json.JSONObject;
import out.OutputJSON;

public class ParseR {
	public static void main(String[] args) {
		//String filename = "R_seikihind_enquete";
		String filename = "R_seikihind_program";

		File file = new File(filename+".txt");
		try {
			OutputJSON out = new OutputJSON(filename+".json");

			BufferedReader br = new BufferedReader(new FileReader(file));

			String line1, line2;
			while((line1 = br.readLine()) != null){
				line2 = br.readLine();

				ArrayList<String> name = new ArrayList<String>();
				ArrayList<Integer> value = new ArrayList<Integer>();

				for(String str  : line1.split(" "))
					if(!str.isEmpty()) name.add(str);

				for(String str  : line2.split(" "))
					if(!str.isEmpty()) value.add(Integer.valueOf(str));

				for(int i = 0; i < name.size(); i++)
					out.writeObject(new JSONObject(name.get(i), value.get(i), ""));
			}

			out.outputJSON();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}