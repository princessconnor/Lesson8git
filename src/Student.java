public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int test[]= new int [3]; 


 //constructor methods - 3 ways you can make a student

      public Student(String nm, int t[]){
		name = nm;
                test = t;
	}

	//Additonal Constructor
	public Student(Student other) {
		this (other.name, other.test);
	}

	//Another constructor
	

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }
public void setScore (int i, int score) {
    test[i-1] = score;
}
public int getScore (int i)
{
    return test [i-1];
}

    public void setMark(int whichmark, int number){
    	if (whichmark == 1) {
    		test[0] = number;
    	} else if (whichmark == 2) {
    		test[1] = number;
    	} else{

    		test[2] = number;
    	}
    }

    public int getAverage() {
    	int average = (test[0] + test[1] + test[2]) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	if (whichmark == 1) return test[0];
	else if (whichmark ==2) return test[1];
	else return test[2];
    }

    public int getHighscore() {
    	if (test[0] > test[1] && test[0] > test[2]) {
    		return test[0];
    	}
    	else if (test[1] > test[0] &&test[1] > test[2]){
    		return test[3];

    	} else {
    		return test[2];
    	}
    }

    public String toString() {
    	String str;
        str = "NAme:\t\t" + name + "\n";
        str += "" + getAverage();
        return str;
     }

    public String getName() {
    	return name;
    }

    //validate data
   public String validateData ()
    {
        String errormessage = null;
        if (name.length() < 2)
        {
         errormessage = "name is required\n";   
        }
        if (test[0] <0 || test[0] >100 || test[1] <0 || test[1] >100 ||test[2] >100)
        {
          errormessage += ("At least one mark is not within acceptable range");  
        }
        if (errormessage !=null)
        {
          errormessage += ("\n Please re-enter all data.  ");
        }
        return errormessage;
        
    }
}

