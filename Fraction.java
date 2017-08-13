// class Fraction
// Author:  Bob Myers
// For COP3252, Java Programming


// Denyse Huezo
//(added functions) 


public class Fraction
{
    private int numerator = 0;// numerator (and keeps sign)
    private int denominator = 1;// always stores positive value
        
    public Fraction()
    {}


    //Added by Denyse Huezo 
    public Fraction simplify(){		
	int small=0;

	int gcd=0;

	int newNumerator=0;
     
	int newDenominator=0;
        /* FLAGS will indicate:
            flag: fraction is already in lowest term
	    negative: if numerator is negative, it will be converted to positive 
	    in order to simplify correctly and then change it back to nehative 
	   
	 */ 
	boolean flag=false;

	boolean negative= false;

	boolean negatived=false;
	
	Fraction newFraction= new Fraction(); 
	
        if(numerator==0){
	   if(denominator > 0)
	      newFraction= new Fraction(0,1);
	   return newFraction; 
	}
	
	else{

	    if(numerator < 0){   
		negative= true;
	        numerator= numerator * -1;    
	    }
	    		
	    if(numerator < denominator) // get smaller number to find out gcd 

	     small = numerator;
	else 
	     small = denominator;

	    for(int i= small; i>0; --i){  // finding gcd of num. and den.
	    if(numerator % i==0 && denominator % i ==0){
		gcd= i;
		flag= true; 
	        break;
	    }
	}

	if(flag== false)  // fraction was already in simplest form
	    return this; 	     

	if(negative == true)  // if numerator was negative convert back to negative 
	    numerator = numerator * -1;
        		
	newNumerator= numerator/gcd;   // After getting gdc numerator gets simplified 

	newDenominator= denominator/gcd; // After getting gdc denominator  gets simplified 

	
        newFraction= new Fraction(newNumerator, newDenominator); // creating simplified fraction

	return newFraction;
	
	}
    }

    public Fraction(int n, int d){
	if (set(n,d)==false)
	    set(0,1);
    }

    public boolean set(int n, int d)
    {
	if (d > 0)
	    {
		numerator = n;
		denominator = d;
		return true;
	    }
	else
	    return false;
    }

    public String toString()
    {
	return (numerator + "/" + denominator);
    }

    public int getNumerator()
    {
	return numerator;
    }

    public int getDenominator()
    {
	return denominator;
    }

    public double decimal()
    {
	return (double)numerator / denominator;
    }

    //Added by Denyse Huezo 
    public Fraction  add(Fraction f){

	 //normal fraction algebra multiplication between denominators and numerators 

	int newDenominator= (denominator * f.denominator);     

	int newNumerator= (numerator * f.denominator)+ (denominator * f.numerator);
		
	Fraction newf= new Fraction(newNumerator, newDenominator);

        return newf.simplify();
	  	
    }

   //Added by Denyse Huezo 
   public Fraction subtract(Fraction f){

       //normal fraction algebra multiplication and subtraction between denominators and numerators 

       int newNumerator = (numerator * f.denominator)-(f.numerator * denominator);

       int newDenominator= denominator * f.denominator;

       Fraction newf= new Fraction(newNumerator, newDenominator);

       return newf.simplify();
	
    }

    //Added by Denyse Huezo 
    public Fraction multiply(Fraction f){

	 //normal fraction algebra multiplication between denominators and numerators 

	int newNumerator= numerator *f.numerator;

	int newDenominator= denominator *f.denominator;

	Fraction newf= new Fraction(newNumerator, newDenominator);
         
        return newf.simplify();
	
    }

    //Added by Denyse Huezo 
   
    public Fraction divide(Fraction f){

	 //normal fraction algebra multiplication between denominators and numerators
	// flips the fraction in the parameter 
         
	int newNumerator= numerator * f.denominator;

	int newDenominator= denominator * f.numerator;

        if( newDenominator < 0){
	    
	   newDenominator = newDenominator * -1;
	   newNumerator= newNumerator * -1; 
	}

	Fraction newf= new Fraction(newNumerator, newDenominator);

	return newf.simplify();
	
    }

}
