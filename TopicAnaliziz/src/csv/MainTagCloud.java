package csv;

import out.OutputData;


public class MainTagCloud {
	public static void main(String[] args) {
		ReadCSV csv = new ReadCSV();

		/**
		 *  0 あなたが「PCALi（ピ☆カ☆リ）」に参加しようと思った理由は何ですか。自由に書いてください。
		 *  2 総合博物館利用の理由
		 *  4 科学博物館利用の理由
		 *  6 歴史博物館利用の理由
		 *  8 美術博物館利用の理由
		 *  10 野外博物館利用の理由
		 *  12 動物園利用の理由
		 *  14 植物園利用の理由
		 *  16 動植物園利用の理由
		 *  18 水族館利用の理由
		 *  19 あなたのおすすめの博物館活用法は何ですか。誰にどんな活用法をすすめたいですか。
		 *  60 ７で、参加した方にお尋ねします。何のプログラムにいつどこで参加しましたか。
		 *  61 ７で、企画した方にお尋ねします。何のプログラムにいつどこでどのような関わり方をしましたか。
		 *  62 「PCALi（ピ☆カ☆リ）」について、意見・感想などを自由に書いてください。
		 */

		OutputData out = new OutputData("results.txt");

		// Only EnqueteObject

		MargeCSV map =  (MargeCSV) csv.read("20150516.csv");

		Integer[] questionNo = {0,2,4,6,8,10,12,14,16,18,19,60,61,62};
		//map.printEnqueteData("928");
		//out.write(map.formingData(questionNo));
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
