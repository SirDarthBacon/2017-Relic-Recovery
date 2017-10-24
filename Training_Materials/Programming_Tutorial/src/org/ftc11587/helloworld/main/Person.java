/*Introduction to Java Programming Part 1*/
/*FTC Team 11587 Starry Knights*/
/*June 2017*/

//COMMENTS//

/*Comments are notes you can add to your programming code to help you remember what you were thinking
 * when you wrote a particular part of your program.  It can also help others who read your code to 
 * understand what you were thinking at that point.  This is an example of a multi-line comment...if you
 * start the comment and hit <Return> to move to the next line, Eclipse will automatically close your
 * comment. 
 */

//This is an example of a single line comment.  Brandon will probably not even read this.//

package org.ftc11587.helloworld.main;

/*The 'package' notation is used to identify a group of Classes.  The name of the package is generally standardized
 * in the format "orgType.orgName.appName.compName".  You will notice this in the coming season's FTC programming
 * libraries.  Complying with the naming convention makes it easy to import elements of this packing into other
 * programming code that you may write, and is strongly recommended.
 */

public class Person {

/*Here we declare a Java class.  A class is simply an object which has attributes (name, age, gender, etc.) and
 * methods (Run, Jump, Walk, CryLikeABaby).  Attributes are typically assigned via variables (not everyone has
 * the same name), and methods are typically executed via functions.
 */

	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private int age;
	private int weight;
	private int height;
	
	/*The attributes of a class are usually declared first, as they often define the object we are trying to
	 * create.  Where it says 'private', this is the accessSpecifier...it determines whether the attribute will
	 * be available outside of this class or not...private indicates the attribute is only available in the
	 * class.  (However, you could have another 'firstName' attribute in the Dog class).
	 * 
	 * Notice you also have to declare an attribute's dataType.  Java uses the C/C++ convention of identifying
	 * what type of data the attribute holds.  In this case, our name attributes are 'String' and our numerical
	 * attributes are 'int'egers (whole numbers).  Types are important when it comes to methods...String age = "17"
	 * is completely different than int age = 17.  You can't multiply strings...but you can multiply integers.
	 */
}