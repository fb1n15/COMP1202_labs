public class Calculator { 
	Double x;
	/*
	* Chops up input on ' ' then decides whether to add or multiply.
	* If the string does not contain a valid format returns null.
	*/
	public Double x(String x){
		Double returnValue = 0.0;
		x = x.replaceAll("\\s", "");
		//If the string contains multiplication sign - parse the parts and call appropriate version of x method
		if(x.indexOf('x')>0) {
			//Parse first part and update x instance of the class
			this.x = Double.parseDouble(x.split("x")[0]);
			//Parse second part and cast it to double primitive while calling x method for multiplication
			returnValue = this.x((double) Double.parseDouble(x.split("x")[1]));
			return returnValue;
		}
		
		//If the string addition sign - parse the parts and call appropriate version of x method
		if(x.indexOf('+')>0) {
			//Parse first part and update x instance of the class
			this.x = Double.parseDouble(x.split("\\+")[0]);
			//Parse second part and cast it to Double object while calling x method for addition
			returnValue = this.x(new Double(Double.parseDouble(x.split("\\+")[1])));
			return returnValue;
		}
		return null;
	}
	
	/*
	* Adds the parameter x to the instance variable x and returns the answer as a Double.
	*/
	public Double x(Double x){
		System.out.println("== Adding ==");
		Double returnValue = this.x + x;
		return returnValue;
	}
	
	/*
	* Multiplies the parameter x by instance variable x and return the value as a Double.
	*/
	public Double x(double x){
		System.out.println("== Multiplying ==");
		Double returnValue = this.x * x;
		return returnValue;
	}	
}