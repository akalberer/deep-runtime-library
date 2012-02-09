package ch.ntb.inf.deep.runtime.mpc555.test;

import java.io.PrintStream;

import ch.ntb.inf.deep.runtime.mpc555.driver.SCI2;

public class ArrayTest4 {

	static {
		SCI2.start(9600, SCI2.NO_PARITY, (short)8);
		System.out = new PrintStream(SCI2.out);
		System.out.println("start");
		
		Object a1 = null;
		System.out.println("Object a1 = null");
		if (a1 instanceof A) System.out.println("a1 is A"); else System.out.println("a1 is not A");
		if (a1 instanceof AA) System.out.println("a1 is AA"); else System.out.println("a1 is not AA");
		if (a1 instanceof short[]) System.out.println("a1 is [S"); else System.out.println("a1 is not [S");
		if (a1 instanceof A[]) System.out.println("a1 is [A"); else System.out.println("a1 is not [A");
		if (a1 instanceof Object) System.out.println("a1 is Object"); else System.out.println("a1 is not Object");
		if (a1 instanceof Object[]) System.out.println("a1 is [Object"); else System.out.println("a1 is not [Object");
		System.out.println();
			
		Object a2 = new A();
		System.out.println("Object a2 = new A()");
		if (a2 instanceof A) System.out.println("a2 is A"); else System.out.println("a2 is not A");
		if (a2 instanceof AA) System.out.println("a2 is AA"); else System.out.println("a2 is not AA");
		if (a2 instanceof short[]) System.out.println("a2 is [S"); else System.out.println("a2 is not [S");
		if (a2 instanceof A[]) System.out.println("a2 is [A"); else System.out.println("a2 is not [A");
		if (a2 instanceof Object) System.out.println("a2 is Object"); else System.out.println("a2 is not Object");
		if (a2 instanceof Object[]) System.out.println("a2 is [Object"); else System.out.println("a2 is not [Object");
		System.out.println();
			
		Object a3 = new AA();
		System.out.println("Object a3 = new AA()");
		if (a3 instanceof A) System.out.println("a3 is A"); else System.out.println("a3 is not A");
		if (a3 instanceof AA) System.out.println("a3 is AA"); else System.out.println("a3 is not AA");
		if (a3 instanceof short[]) System.out.println("a3 is [S"); else System.out.println("a3 is not [S");
		if (a3 instanceof A[]) System.out.println("a3 is [A"); else System.out.println("a3 is not [A");
		if (a3 instanceof A[][]) System.out.println("a3 is [[A"); else System.out.println("a3 is not [[A");
		if (a3 instanceof AA[]) System.out.println("a3 is [AA"); else System.out.println("a3 is not [AA");
		if (a3 instanceof Object) System.out.println("a3 is Object"); else System.out.println("a3 is not Object");
		if (a3 instanceof Object[]) System.out.println("a3 is [Object"); else System.out.println("a3 is not [Object");
		System.out.println();
			
		Object a4 = new short[2];
		System.out.println("Object a4 = new short[2]");
		if (a4 instanceof A) System.out.println("a4 is A"); else System.out.println("a4 is not A");
		if (a4 instanceof AA) System.out.println("a4 is AA"); else System.out.println("a4 is not AA");
		if (a4 instanceof short[]) System.out.println("a4 is [S"); else System.out.println("a4 is not [S");
		if (a4 instanceof short[][]) System.out.println("a4 is [[S"); else System.out.println("a4 is not [[S");
		if (a4 instanceof byte[]) System.out.println("a4 is [B"); else System.out.println("a4 is not [B");
		if (a4 instanceof A[]) System.out.println("a4 is [A"); else System.out.println("a4 is not [A");
		if (a4 instanceof A[][]) System.out.println("a4 is [[A"); else System.out.println("a4 is not [[A");
		if (a4 instanceof Object) System.out.println("a4 is Object"); else System.out.println("a4 is not Object");
		if (a4 instanceof Object[]) System.out.println("a4 is [Object"); else System.out.println("a4 is not [Object");
		System.out.println();		

		Object a5 = new A[2];
		System.out.println("Object a5 = new A[2]");
		if (a5 instanceof A) System.out.println("a5 is A"); else System.out.println("a5 is not A");
		if (a5 instanceof short[]) System.out.println("a5 is [S"); else System.out.println("a5 is not [S");
		if (a5 instanceof A[]) System.out.println("a5 is [A"); else System.out.println("a5 is not [A");
		if (a5 instanceof A[][]) System.out.println("a5 is [[A"); else System.out.println("a5 is not [[A");
		if (a5 instanceof AA[]) System.out.println("a5 is [AA"); else System.out.println("a5 is not [AA");
		if (a5 instanceof Object) System.out.println("a5 is Object"); else System.out.println("a5 is not Object");
		if (a5 instanceof Object[]) System.out.println("a5 is [Object"); else System.out.println("a5 is not [Object");
		System.out.println();		

		Object a6 = new AA[2];
		System.out.println("Object a6 = new AA[2]");
		if (a6 instanceof A) System.out.println("a6 is A"); else System.out.println("a6 is not A");
		if (a6 instanceof short[]) System.out.println("a6 is [S"); else System.out.println("a6 is not [S");
		if (a6 instanceof A[]) System.out.println("a6 is [A"); else System.out.println("a6 is not [A");
		if (a6 instanceof A[][]) System.out.println("a6 is [[A"); else System.out.println("a6 is not [[A");
		if (a6 instanceof AA[]) System.out.println("a6 is [AA"); else System.out.println("a6 is not [AA");
		if (a6 instanceof Object) System.out.println("a6 is Object"); else System.out.println("a6 is not Object");
		if (a6 instanceof Object[]) System.out.println("a6 is [Object"); else System.out.println("a6 is not [Object");
		System.out.println();		

		Object a7 = new short[2][3];
		System.out.println("Object a7 = new short[2][3]");
		if (a7 instanceof A) System.out.println("a7 is A"); else System.out.println("a7 is not A");
		if (a7 instanceof AA) System.out.println("a7 is AA"); else System.out.println("a7 is not AA");
		if (a7 instanceof short[]) System.out.println("a7 is [S"); else System.out.println("a7 is not [S");
		if (a7 instanceof short[][]) System.out.println("a7 is [[S"); else System.out.println("a7 is not [[S");
		if (a7 instanceof byte[]) System.out.println("a7 is [B"); else System.out.println("a7 is not [B");
		if (a7 instanceof A[]) System.out.println("a7 is [A"); else System.out.println("a7 is not [A");
		if (a7 instanceof A[][]) System.out.println("a7 is [[A"); else System.out.println("a7 is not [[A");
		if (a7 instanceof Object) System.out.println("a7 is Object"); else System.out.println("a7 is not Object");
		if (a7 instanceof Object[]) System.out.println("a7 is [Object"); else System.out.println("a7 is not [Object");
		if (a7 instanceof Object[][]) System.out.println("a7 is [[Object"); else System.out.println("a7 is not [[Object");
		System.out.println();		

		Object a8 = new AA[2][3];
		System.out.println("Object a8 = new AA[2][3]");
		if (a8 instanceof A) System.out.println("a8 is A"); else System.out.println("a8 is not A");
		if (a8 instanceof short[]) System.out.println("a8 is [S"); else System.out.println("a8 is not [S");
		if (a8 instanceof A[]) System.out.println("a8 is [A"); else System.out.println("a8 is not [A");
		if (a8 instanceof A[][]) System.out.println("a8 is [[A"); else System.out.println("a8 is not [[A");
		if (a8 instanceof AA[]) System.out.println("a8 is [AA"); else System.out.println("a8 is not [AA");
		if (a8 instanceof Object) System.out.println("a8 is Object"); else System.out.println("a8 is not Object");
		if (a8 instanceof Object[]) System.out.println("a8 is [Object"); else System.out.println("a8 is not [Object");
		if (a8 instanceof Object[][]) System.out.println("a8 is [[Object"); else System.out.println("a8 is not [[Object");
		if (a8 instanceof Object[][][]) System.out.println("a8 is [[[Object"); else System.out.println("a8 is not [[[Object");
		System.out.println();		

	}
}


class A {}
class AA extends A {}

