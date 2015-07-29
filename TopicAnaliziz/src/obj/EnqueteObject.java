package obj;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EnqueteObject {
	private static final int numQuestions = 63;

	public String id;

	public String headline;
	public String member_id;
	public String gender;
	public String lives_in;
	public String survey_method;
	public Date survey_date;
	// q1	q2_1_t	q2_1_r	q2_2_t	q2_2_r	q2_3_t	q2_3_r	q2_4_t	q2_4_r	q2_5_t	q2_5_r	q2_6_t	q2_6_r	q2_7_t	q2_7_r	q2_8_t	q2_8_r	q2_9_t	q2_9_r	q3	q4_1_m	q4_2_m	q4_3_m	q4_4_m	q4_5_m	q4_1_a	q4_2_a	q4_3_a	q4_4_a	q4_5_a	q4_6_a	q4_7_a	q4_8_a	q4_9_a	q4_10_a	q5_1	q5_2	q6_1	q6_2	q6_3	q6_4	q6_5	q6_6	q6_7	q6_8	q6_9	q6_10	q6_11	q6_12	q6_13	q6_14	q6_15	q6_16	q7_1	q7_2	q7_3	q7_4	q7_5	q7_6	q7_7	q8_1	q8_2	q9
	public String[] questions = new String[numQuestions];
	public Integer respondent_generation;
	public Timestamp time_stamp;

	public EnqueteObject(String[] csv) {
		// TODO 自動生成されたコンストラクター・スタブ
		setParam(csv);
	}

	private void setParam(String[] csv){
		// EnqueteObject <<-- CSV data
		this.headline = csv[0];
		this.member_id = csv[1];
		this.gender = csv[2];
		this.lives_in = csv[3];
		this.survey_method = csv[4];
		try {
			this.survey_date =new SimpleDateFormat("yyyy-MM-dd").parse(csv[5]);
		} catch (ParseException e) {}
		for(int i=0; i < this.questions.length; i++){
			this.questions[i] = csv[i+6];
		}
		this.respondent_generation = Integer.parseInt(csv[csv.length-2]);
		try {
			this.time_stamp = new Timestamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(csv[csv.length-1]).getTime());
		} catch (ParseException e) {}

		this.id = member_id;
	}

	public void printData(){
		System.out.println(this.headline);
		System.out.println(this.member_id);
		System.out.println(this.gender);
		System.out.println(this.lives_in);
		System.out.println(this.survey_method);
		System.out.println(this.survey_date);
		System.out.println(this.questions.toString());
		System.out.println(this.respondent_generation);
		System.out.println(this.time_stamp);
	}
}
