import javacard.framework.APDU;
import javacard.framework.Applet;
import javacard.framework.ISOException;

public class Bank extends Applet {

	private Bank() {
	}

	public static void install(byte bArray[], short bOffset, byte bLength) throws ISOException {
		new Bank().register();
	}


	public void process(APDU arg0) throws ISOException {
		// TODO Auto-generated method stub

	}

}