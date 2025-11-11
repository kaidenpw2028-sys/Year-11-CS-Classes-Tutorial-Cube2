# Year 11CS - Classes and Objects - Lab - Cube II

Your job is to create a class called ```Cube2```.  You need to have finished the Cube I lab first.

You should pass all of the tests in the ```Cube2Tester``` class (provided).

Add the "Cube.java" file from your <b>Cube I lab</b> to the src folder, and write your code inside the provided "Cube2.java" file. 

The ```Cube2``` class has the following members: (some are already provided)
* a Cube2 property called ```basicCube``` representing the original cube functionality (given)
* a String property called ```color``` to store the color of the cube
* a getter method called ```getSide()``` (given)
* a setter method called ```setSide(int side)```
* a getter method called ```getColor()```
* a setter method called ```setColor(String color)```
* a method that returns the surface area of the cube called ```calculateSurfaceArea()```
* a method that returns the volume of the cube called ```calculateVolume()```
* a ```toString``` method that returns a String in the following format (see example):
```
Cube2 c = new Cube2(4, "red");
System.out.println(c.toString());   //this will print:   Cube{side=4, color="red"}
```

* an ```add``` method that takes another ```Cube2``` object as a parameter and returns a new ```Cube2``` that represents a cube that has the same total surface as the two original cubes.  Two cubes can be added together in this manner if their side lengths form a Pythagorean triple, otherwise throw an IllegalArgumentException. The color of the new Cube2 object will be the same as the first cube (the one that initiated the ```add``` method call).
```
Cube2 firstCube = new Cube2(3, "red");
Cube2 secondCube = new Cube2(4);

Cube2 thirdCube = firstCube.add(secondCube);
System.out.println(thirdCube);                  //should print Cube{side=5, color="red"}
Cube2 fourthCube = firstCube.add(thirdCube);    //should throw an IllegalArgumentException
```

* a ```minus``` method that takes another ```Cube2``` object as a parameter and returns a new ```Cube2``` that represents a cube whose surface area is equal to the difference in surface area between the two original cubes.  Two cubes can be subtracted in this manner if the cubes' side lengths form a Pythagorean triple (together with the resulting cube's side length), otherwise throw an IllegalArgumentException. The color of the new ```Cube2``` object will be the same as the first cube (the one that initiated the ```minus``` method call).


The ```Cube2``` class also has three constructors. 
* One takes no arguments (has no parameters) and sets ```side``` to 1.
* One will take a single integer argument that is used to initialize the ```side``` property.
* One will take an integer argument that is used to initialize the ```side``` property, as well as a String argument that is used to initialize the ```color``` property.

```color``` defaults to "black".  No error checking is required for ```color```.

Side should never be less than 1. If a user attempts to create a Cube with a side length less than 1, an IllegalArgumentException will be thrown. The message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs. If a user attempts to change the side length of an already existing ```Cube``` object to a value less than 1, again, an IllegalArgumentException will be thrown, and the message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs.

```
if (side < 1) {
  throw new IllegalArgumentException(“A cube’s side length must be equal to or greater than 1!”);
}
```

Note: Learning how to throw exceptions will be useful in the completion of this lab. There are many different types of exceptions in Java. You may have encountered an ```IOException``` or ```FileNotFoundException``` when  were working with files, or an ```ArithmeticException``` if you divide by zero. For instance, if someone was using your ```Cube``` class and passed -1 to the Cube constructor (the user attempts to create a Cube of side length -1) they could handle this exception in their program by using the ```try-catch``` statement and return an informative message to the user. In this lab, you are not expected to catch and handle the thrown ```IllegalArgumentException```.
