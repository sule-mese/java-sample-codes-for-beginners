
public class Selam {

	String ad="herkes";
	
	public String selamS�yle(String kime)
	{
		String cevap;
		if(kime=="")
	     cevap = "selam" + " " + ad;
		else
		cevap = "selam" + " " + kime;
		return cevap;
	}
}
