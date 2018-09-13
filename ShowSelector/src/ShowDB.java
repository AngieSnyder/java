
public class ShowDB {
	
	//This method will get an instance of Show for the searchCriteria and 
	// searchValue
	public static Show getShow(String sCriteria, String sValue) {
		Show s = null;
		
		if (sCriteria.equalsIgnoreCase("g")) {// genre
			if (sValue.equalsIgnoreCase("comedy")) {
				s = new Show("Seinfeld", "comedy", 30, "Netflix")
			}
			else if (sValue.equalsIgnoreCase("drama")) {
				s = new Show("West Wing", "drama", 60, "ABC")
			}
			else if (sValue.equalsIgnoreCase("sci-fi")) {
				s = new Show("Star Trek", "sci-fi", 6`0, "Hulu")
			}
			else if (sValue.equalsIgnoreCase("reality")) {
				s = new Show("Survivor", "reality", 30, "CBS")
			}
		}
		else if (sCriteria.equalsIgnoreCase("l")) {// length
			if (sValue.equalsIgnoreCase("comedy")) {
				s = new Show("Seinfeld", "comedy", 30, "Netflix")
			}
			else if (sValue.equalsIgnoreCase("drama")) {
				s = new Show("West Wing", "drama", 60, "ABC")
			}
			else if (sValue.equalsIgnoreCase("sci-fi")) {
				s = new Show("Star Trek", "sci-fi", 6`0, "Hulu")
			}
			else if (sValue.equalsIgnoreCase("reality")) {
				s = new Show("Survivor", "reality", 30, "CBS")
			}
		}
		else if (sCriteria.equalsIgnoreCase("n")) {// network
			if (sValue.equalsIgnoreCase("comedy")) {
				s = new Show("Seinfeld", "comedy", 30, "Netflix")
			}
			else if (sValue.equalsIgnoreCase("drama")) {
				s = new Show("West Wing", "drama", 60, "ABC")
			}
			else if (sValue.equalsIgnoreCase("sci-fi")) {
				s = new Show("Star Trek", "sci-fi", 6`0, "Hulu")
			}
			else if (sValue.equalsIgnoreCase("reality")) {
				s = new Show("Survivor", "reality", 30, "CBS")
			}
		}
		return s;
	}
	
}
