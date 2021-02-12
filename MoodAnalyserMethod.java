
public class MoodAnalyserMethod {

	 String usermood;
	

	public MoodAnalyserMethod(String usermood) {
		// TODO Auto-generated constructor stub
		// super();
		this.usermood = usermood;
	} 
	public MoodAnalyserMethod() {
		// TODO Auto-generated constructor stub
		// super();
		this.usermood = usermood;
	} 
	
	
	
	public static String moodSwings()
	  {
		MoodAnalyserMethod mood = new MoodAnalyserMethod(null);
		try {

			if(mood.usermood.equals("i am in sad mood")) {
			//if (mood.usermood.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "happy always...!!!";
		}

	  }
	      
		

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=moodSwings();
		System.out.println(st);
		
	}

}
