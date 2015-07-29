package out;

import java.util.ArrayList;

import json.JSONObject;
import json.JSONResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class OutputJSON {
	private ArrayList<JSONObject> results = new ArrayList<JSONObject>();
	private String filename;

	public OutputJSON(String filename) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.filename = filename;
	}

	public void writeObject(JSONObject obj){
		this.results.add(obj);
	}

	public void writeArray(ArrayList<JSONObject> objList){
		this.results = objList;
	}

	public void outputJSON(){
		JSONResult json = new JSONResult(results);

		ObjectMapper mapper = new ObjectMapper();
		try {
			OutputData out = new OutputData(filename);

			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);

			out.write(jsonString);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
