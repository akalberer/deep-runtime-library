package ch.ntb.inf.deep.runtime.ppc32;

import ch.ntb.inf.deep.unsafe.US;

/*changes:
 * 12.3.2014	NTB/Urs Graf	creation
 */

public class ProgramExc extends PPCException implements Ippc32 {
	public static int nofProgExceptions;
	public static int type;
	public static int a;
	public static int b;

	static void programExc(Exception e) {
		nofProgExceptions++;
		int addr = US.GETSPR(SRR0);
		int instr = US.GET4(addr);
		int opCode = instr >> 21;
		if (opCode == 0x3ff) {	// tw, TOalways -> user defined exception
			e.message = "custom";
			a = 10;
		} else if (opCode == 0x3e5) {	// tw, TOifgeU -> ArrayIndexOutOfBounds
			e = new ArrayIndexOutOfBoundsException();
			e.message = "ArrayIndexOutOfBoundsException";
			a = 20;
		} else if (opCode == 0x64) {	// twi, TOifequal
			int nextInstr = US.GET4(addr + 4);
			b = nextInstr;
			int nextOpCode = nextInstr >> 21;
			if (nextOpCode == 0x3e4) {	// divw -> ArithmeticException
				a = 30;
			} else {	// NullPointer
				e = new NullPointerException();
				e.message = "NullPointerException";
				a = 40;
			}
		} else if (opCode == 0x3f8) {	// tw, TOifnequal
			a = 50;
		} else {	
			a = 100;
		}
		e.addr = addr;

		US.PUTGPR(R2, US.REF(e));	// copy to volatile register
		US.PUTGPR(R3, addr);	// copy to volatile register
	}

}
