

public class MyMood {
     String msg;
	
	public MyMood(String msg) {
		
		this.msg = msg;
	}

	
	public String analyzeMood() throws MoodAnalyserException {
		// TODO Auto-generated method stub
		
		try {
			if(msg.contains("sad"))
			{
				return "sad";
			}
			else 
			{
				return "Happy";
			}
		}
			catch(Exception e) {
				throw new MoodAnalyserException("invalid user input");
				
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MyMood mood=new MyMood(null);
          try {
        	  System.out.println(mood.analyzeMood());
        	  
        		  
        	  }
          catch(MoodAnalyserException e)
          {
        	  e.printStackTrace();
          }
	}
          
	}

	

	


