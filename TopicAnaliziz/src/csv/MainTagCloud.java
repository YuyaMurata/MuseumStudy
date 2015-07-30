package csv;

import out.OutputData;


public class MainTagCloud {
	public static void main(String[] args) {
		ReadCSV csv = new ReadCSV();

		OutputData out = new OutputData("results.txt");

		// Only EnqueteObject

		MargeCSV map =  (MargeCSV) csv.read("20150516.csv");

		//Integer[] questionNo = {0,2,4,6,8,10,12,14,16,18,19,60,61,62};
		Integer[] questionNo = {2,4,6,8,10,12,14,16,18,19};
		//map.printEnqueteData("928");
		out.write(map.formingEnqueteData(questionNo));
		//System.out.println(map.formingData(questionNo));


		//Only ProgramObject
		/*
		MargeCSV map =  (MargeCSV) csv.read("db.program_20150612111942.csv");
		//map.printProgramData("2");
		//OutputData out = new OutputData("results.txt");
		//out.write(map.formingProgramData());
		System.out.println(map.formingProgramData());
		*/
	}
}
