//Denyse Huezo 


public class IntegerSet{
    // Data 
    boolean[] set; 
    int size; 

    IntegerSet(){
	size=101; // creates range up to 100 
        set= new boolean[size];	// all def. to false 
    }
    // will set array element to true if calling object or parameter have that element set to true 
    public IntegerSet union(IntegerSet iSet){
     IntegerSet newSet= new IntegerSet();		
	for(int i=0, j=0; i<iSet.size; i++, j++){
	    if(this.set[i]== true || iSet.set[j]== true )
		newSet.set[i]=true; 
	}
	return newSet; 
    }

    public IntegerSet insertElement(int data){
  	this.set[data]= true;  // changes array element to true with the integer given in parameter 
        return this; 
    }


    public IntegerSet deleteElement(int data){
  	this.set[data]= false; // changes array element to false with the integer given in parameter 
        return this; 
    }
	
    public IntegerSet intersection(IntegerSet iSet){ // sets arr ele to true if both objects have true 
        IntegerSet newSet= new IntegerSet();		
	for(int i=0, j=0; i<iSet.size; i++, j++){
	    if(this.set[i]== true && iSet.set[j]== true )
		newSet.set[i]=true; 
	}
	return newSet; 
    }


    public boolean isEqualTo(IntegerSet iSet){  // search both arrays and returns false as soon as one 
	// of the elements in either objects array is false 
	boolean flag= true;
	
	for(int i=0, j=0; i<iSet.size; i++, j++){
	    if(this.set[i]==true  && iSet.set[j]== true )
		flag=true;
	    else
		flag=false;
	    
	}
	return flag;
  
    }    

    public String toString(){
	String string=""; 
	
	boolean flag= true; // flag will tell is string has to be "---"

	int k;

	for(int i=0; i<this.size; ++i){
	    if(this.set[i]==true){
		flag= false;
		string=string.concat(String.valueOf(i)); // concat has int parameter and returns
		string=string.concat(" ");               // a new string. Old string  + int paramter
	    }
	 }
	
	 if(flag)
	     string="---";  // string is empty 

	  return string;
    }

}
