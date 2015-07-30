package csv;

import java.util.HashMap;

import obj.EnqueteObject;
import obj.ProgramObject;

public class MargeCSV {
	private HashMap<String, EnqueteObject> map = new HashMap<>();
	private HashMap<String, ProgramObject> programMap = new HashMap<>();

	public void setData(EnqueteObject obj){
		this.map.put(obj.id, obj);
	}

	public void setData(ProgramObject obj){
		this.programMap.put(obj.id, obj);
	}

	public void printEnqueteData(String key){
		map.get(key).printData();
	}

	public void printProgramData(String key){
		programMap.get(key).printData();
	}

	public String formingEnqueteData(Integer[] qNo){
		StringBuilder data = new StringBuilder();
		for(Integer q : qNo){
			//data.append("Question No:"+q+"\n");
			data.append("key:"+q+"\n");
			for(String id : map.keySet()){
				if(map.get(id).questions[q].length() > 0){
					data.append(map.get(id).questions[q]);
					data.append("\n");
				}
			}
		}
		return data.toString();
	}

	public String formingProgramData(){
		StringBuilder data = new StringBuilder();
		for(String id : programMap.keySet()){
			data.append(programMap.get(id).title);
			data.append("\n");
			data.append(programMap.get(id).objective);
			data.append("\n");
			data.append(programMap.get(id).summary);
			data.append("\n");
			data.append(programMap.get(id).flow);
			data.append("\n");
		}

		return data.toString();
	}
}
