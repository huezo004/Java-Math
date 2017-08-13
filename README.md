# Java-Math

<strong>Integer Set</strong>

Filename: IntegerSet.java

• Create class IntegerSet in its own file

• An IntegerSet object holds integers in the range 0-100

• This is represented by an array of booleans. Array element i is set to
true if the integer i is in the set and false otherwise.

• Create these methods for the class (these should be the only public methods)
IntegerSet()

public IntegerSet union(IntegerSet iSet)

public IntegerSet intersection(IntegerSet iSet)

public IntegerSet insertElement(int data)

public IntegerSet deleteElement(int data)

public boolean isEqualTo(IntegerSet iSet)

public String toString()

• The constructor (no arguments) initializes the array to represent the ”empty
set” (no integers in the set)


Method union creates and returns a new set that is the set-theoretic
union of the two existing sets (the calling object and the parameter).

Anelement is in the union if it is in either of the two starting sets

• Method intersection creates and returns a new set that is the settheoretic
intersection fot he two existing sets. An element is in the intersection
if it’s in both of the starting sets.

• Method insertElement adds the argument(an integer) to the set (the
calling object) and should also return that set (this allows calls to be
cascaded)

• Method deleteElement removes the argument from the set and should
also return the set, to allow cascading

• Method isEqualTo returns true if the two sets are equal (if they have
all the same elements) and false otherwise

• Method toString returns a string containing the set elements as a list
of numbers in ascending order, separated by spaces. Include only the
elements present in the set. Use “—” to represent an empty set


<strong>Fraction class</strong>

public Fraction simplify()

public Fraction add(Fraction f)

public Fraction subtract(Fraction f)

public Fraction multiply(Fraction f)

public Fraction divide(Fraction f)

• The simplify method will return a simplified version of the calling object.
This method should return a new Fraction (simplified), but not
change the original one. The fractions in the form 0/N
should have a simplified form of 0/1. Any other fraction has the usual mathematical definition
of ”simplified form”. This will require finding the GCD of the numerator
and denominator. One useful algorithm for doing so is Euclid’s algorithm/the
Euclidean algorithm.

• Methods add, subtract, multiply, divide should take in a Fraction
as a parameter and perform the given computation between the calling
object and the parameter object (The calling object is always the first
operand). The result of each operation should always be a fraction returned
in simplified form. Example calls: f1.add(f2) means to return
the value f1 + f2, f1.divide(f2) means to return the value f1/f2.


In divide, if an attempt is made to divide by a fraction with the numerator
0, default the result to 0
1

This division is actually undefined, but we
need to return something from the method and this is a “sane” value

• Be sure that your new methods enforce the same rules on the data as
the original methods do – the denominator must always be non-negative
(negative fractions have the negative sign in the numerator) and the denominator
must never be zero



<img width="540" alt="screen shot 2017-08-13 at 6 10 14 pm" src="https://user-images.githubusercontent.com/16257714/29253704-efef4196-8052-11e7-9627-dedb4eb64223.png">
