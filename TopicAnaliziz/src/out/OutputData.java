package out;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Date;

public class OutputData {
	String filename;
	public OutputData(String filename) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.filename = filename;
	}
	
	public void write(String str){
		File file = new File(filename);
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
			pw.println(str);
			
			pw.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}
