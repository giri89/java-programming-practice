package recursion;

/*
Day 4 Topic: Method Call Stack / Method Activation Record

Theory:

1. Caller Method
A method is called a caller method if it invokes another method.

2. Called Method
A method that is invoked by another method is called a called method.

Example:
If method m1() calls m2(), then:
m1 → caller method
m2 → called method

3. Method Activation Record / Method Stack Trace
Whenever a method is called, a stack frame (activation record) is created
in the method call stack. When the method execution completes,
its stack frame is removed from the stack.

Execution Flow of This Program:

main() → m1() → m2() → m3()

Stack execution order:
main
 └ m1
     └ m2
         └ m3

Output:
m3
m2
m1
Main
*/

public class MethodCallStackDemo {

	public static void main(String[] args) {

		m1();

		System.out.println("Main");

	}

	static void m1() {

		m2();

		System.out.println("m1");

	}

	static void m2() {

		m3();

		System.out.println("m2");

	}

	static void m3() {

		System.out.println("m3");

	}

}