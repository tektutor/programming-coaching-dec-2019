import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Iterator;

public class MyFile implements Iterator<Integer> {

	private FileReader file = null;
	private BufferedReader reader = null;
	private String strValue = null;
	private int value = 0;

	public MyFile ( String name ) throws Exception {
		file = new FileReader( name );
		reader = new BufferedReader ( file );
	}

	public boolean hasNext( ) {
	    try {
		strValue = reader.readLine();
	    }
	    catch(Exception e ) {
		strValue = null;
	    }
            return ( strValue != null );	
	}

	public Integer next() {
		value = Integer.parseInt ( strValue ); 
		return value;
	}  

	public void reset() {
		reader = new BufferedReader ( file );
	} 

	public void print() throws Exception {
		while ( hasNext() ) {
			System.out.println ( next() );
		}
		
/*

		while ( strValue != null ) {
			value = Integer.parseInt ( strValue );
			System.out.println (value );
			strValue = reader.readLine();
		} 

		reader.close();
*/

	}

	public static void main ( String[] args ) throws Exception {

		MyFile file = new MyFile("numbers.txt");

		file.print();
		file.reset();
		file.print();

	}

}
