package level1;

public class TeaParty {

public String welcome(String lastName, boolean isWoman, boolean isKnighted)
    {
	   String answer;
       if (isWoman) {
    	   answer = "Hello " + "Ms. " + lastName;
       } else if (isKnighted) {
    	   answer = "Hello " + "Sir " + lastName;
       } else {
    	   answer = "Hello " + "Mr. " + lastName;
       }
       return answer;
    }

}


