package text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import net.java.sen.SenFactory;
import net.java.sen.StreamTagger;
import net.java.sen.StringTagger;
import net.java.sen.dictionary.Token;

public class GoSenSample {
	public static void main(String[] args) {
		try{
			StringTagger stringTagger = SenFactory.getStringTagger(null);
			Reader reader = new InputStreamReader(new FileInputStream("results_enquete_0,2,4,6,8,10,12,14,16,18,19,60,61,62.txt"), "utf-8");
			StreamTagger tagger = new StreamTagger(stringTagger, reader);

			while (tagger.hasNext()) {
			    Token token = tagger.next();
			    if(token.getMorpheme().getPartOfSpeech().contains("名詞") || token.getMorpheme().getPartOfSpeech().contains("形容詞"))
			    	System.out.println(token.getSurface());
			}
		}catch(IOException e){

		}
	}
}
