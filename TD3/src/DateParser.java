import java.util.Hashtable;


public class DateParser {
	String chaine;
	
	public DateParser(String chaineAParser)
	  {
		chaine = chaineAParser;
	  }
	
	public String parseDate()
	{
	//	chaine.replaceAll("(.*)le(\\s[\\d]{1,2}\\s['janvier'|'fevrier'|'mars'|'avril'|'mai'|'juin'|'juillet'|'aout'|'septembre'|'octobre'|'novembre'|'decembre'].*?[\\d]{4}.*)", "$1en$2");		
		chaine.replaceAll("(.*)le(.*)", "$1en$2");		
		
		
		return chaine;
		/*if(chaine.matches(regex1))
		{
			return "true";
		}
		else
			return "false";*/
	}
}
