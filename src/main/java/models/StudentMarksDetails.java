package models;

//import practice.String;

public class StudentMarksDetails {
	
	    private int id;
	    private int mathMarks;
	    private int englishMarks;
	    private int itMarks;
	    private int scienceMarks;
		private int sscMarks;
		public StudentMarksDetails(int id, int mathMarks, int englishMarks, int itMarks, int scienceMarks,
				int sscMarks) {
		
			this.id = id;
			this.mathMarks = mathMarks;
			this.englishMarks = englishMarks;
			this.itMarks = itMarks;
			this.scienceMarks = scienceMarks;
			this.sscMarks = sscMarks;
		}
	
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getMathMarks() {
			return mathMarks;
		}
		public void setMathMarks(int mathMarks) {
			this.mathMarks = mathMarks;
		}
		public int getEnglishMarks() {
			return englishMarks;
		}
		public void setEnglishMarks(int englishMarks) {
			this.englishMarks = englishMarks;
		}
		public int getItMarks() {
			return itMarks;
		}
		public void setItMarks(int itMarks) {
			this.itMarks = itMarks;
		}
		public int getScienceMarks() {
			return scienceMarks;
		}
		public void setScienceMarks(int scienceMarks) {
			this.scienceMarks = scienceMarks;
		}
		public int getSscMarks() {
			return sscMarks;
		}
		public void setSscMarks(int sscMarks) {
			this.sscMarks = sscMarks;
		}
			
	
}