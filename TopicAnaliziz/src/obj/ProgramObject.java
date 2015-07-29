package obj;

public class ProgramObject {
	private static final int numFields = 78;

	public String id,
	title,
	title_ts,
	title_alt,
	serial_title,
	objective,
	curriculum_guideline,
	keywords,
	rights,
	operating_time,
	capacity,
	total_participants,
	main_target,
	summary,
	organizer_1,
	organizer_2,
	organizer_3,
	organizer_4,
	organizer_5,
	organizer,
	organizer_ts,
	organizer_alt,
	coorganizer_1,
	coorganizer_2,
	coorganizer_3,
	coorganizer_4,
	coorganizer_5,
	coorganizer,
	coorganizer_ts,
	coorganizer_alt,
	activity_objective,
	equipment,
	what_to_bring,
	entry_fee,
	itemized_cost,
	cost_per_participant,
	flow,
	material,
	viewpoint_for_generalize,
	diff,
	url,
	img_1,
	img_cpt_1,
	img_2,
	img_cpt_2,
	img_3,
	img_cpt_3,
	memo,
	a1,
	b1,
	c1,
	d1,
	e1,
	a2,
	b2,
	c2,
	d2,
	e2,
	a3,
	b3,
	c3,
	d3,
	e3,
	a4,
	b4,
	c4,
	d4,
	e4,
	public_scope,
	enforce_survey,
	publish,
	ver,
	created,
	modified,
	base_program,
	provider,
	editor,
	is_active;

	public ProgramObject(String[] csv){
		setParam(csv);
	}

	private void setParam(String[] csv){
		this.id = csv[0];
		this.title = csv[1];
		this.title_ts = csv[2];
		this.title_alt = csv[3];
		this.serial_title = csv[4];
		this.objective = csv[5];
		this.curriculum_guideline = csv[6];
		this.keywords = csv[7];
		this.rights = csv[8];
		this.operating_time = csv[9];
		this.capacity = csv[10];
		this.total_participants = csv[11];
		this.main_target = csv[12];
		this.summary = csv[13];
		this.organizer_1 = csv[14];
		this.organizer_2 = csv[15];
		this.organizer_3 = csv[16];
		this.organizer_4 = csv[17];
		this.organizer_5 = csv[18];
		this.organizer = csv[19];
		this.organizer_ts = csv[20];
		this.organizer_alt = csv[21];
		this.coorganizer_1 = csv[22];
		this.coorganizer_2 = csv[23];
		this.coorganizer_3 = csv[24];
		this.coorganizer_4 = csv[25];
		this.coorganizer_5 = csv[26];
		this.coorganizer = csv[27];
		this.coorganizer_ts = csv[28];
		this.coorganizer_alt = csv[29];
		this.activity_objective = csv[30];
		this.equipment = csv[31];
		this.what_to_bring = csv[32];
		this.entry_fee = csv[33];
		this.itemized_cost = csv[34];
		this.cost_per_participant = csv[35];
		this.flow = csv[36];
		this.material = csv[37];
		this.viewpoint_for_generalize = csv[38];
		this.diff = csv[39];
		this.url = csv[40];
		this.img_1 = csv[41];
		this.img_cpt_1 = csv[42];
		this.img_2 = csv[43];
		this.img_cpt_2 = csv[44];
		this.img_3 = csv[45];
		this.img_cpt_3 = csv[46];
		this.memo = csv[47];
		this.a1 = csv[48];
		this.b1 = csv[49];
		this.c1 = csv[50];
		this.d1 = csv[51];
		this.e1 = csv[52];
		this.a2 = csv[53];
		this.b2 = csv[54];
		this.c2 = csv[55];
		this.d2 = csv[56];
		this.e2 = csv[57];
		this.a3 = csv[58];
		this.b3 = csv[59];
		this.c3 = csv[60];
		this.d3 = csv[61];
		this.e3 = csv[62];
		this.a4 = csv[63];
		this.b4 = csv[64];
		this.c4 = csv[65];
		this.d4 = csv[66];
		this.e4 = csv[67];
		this.public_scope = csv[68];
		this.enforce_survey = csv[69];
		this.publish = csv[70];
		this.ver = csv[71];
		this.created = csv[72];
		this.modified = csv[73];
		this.base_program = csv[74];
		this.provider = csv[75];
		this.editor = csv[76];
		this.is_active = csv[77];
	}

	public void printData(){
		System.out.println(this.id);
		System.out.println(this.title);
		System.out.println(this.title_ts);
		System.out.println(this.title_alt);
		System.out.println(this.serial_title);
		System.out.println(this.objective);
		System.out.println(this.curriculum_guideline);
		System.out.println(this.keywords);
		System.out.println(this.rights);
		System.out.println(this.operating_time);
		System.out.println(this.capacity);
		System.out.println(this.total_participants);
		System.out.println(this.main_target);
		System.out.println(this.summary);
		System.out.println(this.organizer_1);
		System.out.println(this.organizer_2);
		System.out.println(this.organizer_3);
		System.out.println(this.organizer_4);
		System.out.println(this.organizer_5);
		System.out.println(this.organizer);
		System.out.println(this.organizer_ts);
		System.out.println(this.organizer_alt);
		System.out.println(this.coorganizer_1);
		System.out.println(this.coorganizer_2);
		System.out.println(this.coorganizer_3);
		System.out.println(this.coorganizer_4);
		System.out.println(this.coorganizer_5);
		System.out.println(this.coorganizer);
		System.out.println(this.coorganizer_ts);
		System.out.println(this.coorganizer_alt);
		System.out.println(this.activity_objective);
		System.out.println(this.equipment);
		System.out.println(this.what_to_bring);
		System.out.println(this.entry_fee);
		System.out.println(this.itemized_cost);
		System.out.println(this.cost_per_participant);
		System.out.println(this.flow);
		System.out.println(this.material);
		System.out.println(this.viewpoint_for_generalize);
		System.out.println(this.diff);
		System.out.println(this.url);
		System.out.println(this.img_1);
		System.out.println(this.img_cpt_1);
		System.out.println(this.img_2);
		System.out.println(this.img_cpt_2);
		System.out.println(this.img_3);
		System.out.println(this.img_cpt_3);
		System.out.println(this.memo);
		System.out.println(this.a1);
		System.out.println(this.b1);
		System.out.println(this.c1);
		System.out.println(this.d1);
		System.out.println(this.e1);
		System.out.println(this.a2);
		System.out.println(this.b2);
		System.out.println(this.c2);
		System.out.println(this.d2);
		System.out.println(this.e2);
		System.out.println(this.a3);
		System.out.println(this.b3);
		System.out.println(this.c3);
		System.out.println(this.d3);
		System.out.println(this.e3);
		System.out.println(this.a4);
		System.out.println(this.b4);
		System.out.println(this.c4);
		System.out.println(this.d4);
		System.out.println(this.e4);
		System.out.println(this.public_scope);
		System.out.println(this.enforce_survey);
		System.out.println(this.publish);
		System.out.println(this.ver);
		System.out.println(this.created);
		System.out.println(this.modified);
		System.out.println(this.base_program);
		System.out.println(this.provider);
		System.out.println(this.editor);
		System.out.println(this.is_active);
	}
}
