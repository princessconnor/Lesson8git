public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int mark[]= new int [3]; 


 //constructor methods - 3 ways you can make a student

      public Student(){
		this("", 0, 0, 0);
	}

	//Additonal Constructor
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		mark[0] = t1;
		mark[1] = t2;
		mark[2] = t3;
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.mark[0], s.mark[1], s.mark[2]);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	if (whichmark == 1) {
    		mark[0] = number;
    	} else if (whichmark == 2) {
    		mark[1] = number;
    	} else{

    		mark[2] = number;
    	}
    }

    public int getAverage() {
    	int average = (mark[0] + mark[1] + mark[2]) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	if (whichmark == 1) return mark[0];
	else if (whichmark ==2) return mark[1];
	else return mark[2];
    }

    public int getHighscore() {
    	if (mark[0] > mark[1] && mark[0] > mark[2]) {
    		return mark[0];
    	}
    	else if (mark[1] > mark[0] && mark[1] > mark[2]){
    		return mark[3];

    	} else {
    		return mark[2];
    	}
    }

    public String toString() {
    	String result = "Name: " + name;
    	result += "\nMark 1:\t" + mark[0];
    	result += "\nMark 2:\t" + mark[1];
    	result += "\nMark 3:\t" + mark[2];
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (mark[0] < 0 || mark[0] > 100 || mark[1] < 0 || mark[1] > 100 || mark[2] < 0 || mark[2] > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	
	return message;
    	}
 }

