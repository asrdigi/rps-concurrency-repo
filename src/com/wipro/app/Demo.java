package com.wipro.app;

import java.util.Arrays;
import java.util.Comparator;
import com.wipro.model.Person;
/*
* The current values in the instance variables of an object is called object state.
*/
public class Demo {
	public static void main(String[] args) {
		
		//Anonymous inner class
		(new Object(){
			public void greeting() {
				System.out.println("Welcome to anonymous inner class");
			}
			
		}).greeting();
		//com.wipro.model.Person@63961c42
		//63961c42 is hexa-decimal representation of the object's hashCode
		Person person = new Person(123456783465L,"Smith",9876879879L);
		
		/* To display object state rather than reference, we need to
		 * override toString() method which returns String representation
		 * of the object
		 */
		System.out.println(person);
		System.out.println(person.hashCode()); //1670782018
		
		
		Person [] persons= new Person[] {
				new Person(423456783465L,"Smith",9876879879L),
				new Person(523456783495L,"Clarke",7876879855L),
				new Person(323456783405L,"Jones",8876879870L)
		};
		
		
		System.out.println("After sorting based on adhar cards...");
		Arrays.sort(persons);
		
		System.out.println(Arrays.toString(persons));
		
		System.out.println("After sorting based on person names...");
		/*
		 * the second argument is an anonymous inner class that
		 * implements Comparator interface
		 */
		Arrays.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
			
		});
		
		
		System.out.println(Arrays.toString(persons));
		
		
		
	}
}
