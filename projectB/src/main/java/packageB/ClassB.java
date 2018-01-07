package packageB;

import packageA.ClassA;

public class ClassB
{
	public ClassB()
	{
		new ClassA();
		System.out.println("Hello from class B!");
	}
}
