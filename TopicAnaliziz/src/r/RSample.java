package r;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
public class RSample
{
	public static void main(String[] args)
	{
		Rengine engine = new Rengine(new String[]{"--no-save"}, false, null);
		engine.assign("a", new int[]{36});
		REXP result = engine.eval("sqrt(a)");
		System.out.println(result.asDouble());
		engine.end();
	}
}