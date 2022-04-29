package edu.wright.airviewer2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PPTConversionTest {
	//Here object will be initialized
	static PPTConversion obj = null;
	/**
	 * @throws Exception
	 */
	@BeforeAll
	public static void setUp() throws Exception {
		//Here pdf file path will be given to test the file
		obj = new PPTConversion("C:/Users/a.pdf");
	}
	/**
	 * @throws Exception
	 */
	@AfterAll
	public static void tearDown() throws Exception {
		//Here object will be initialized to null
		obj = null;
	}
	/**
	 * testing method
	 */
	@org.junit.jupiter.api.Test
	public void test() {
		try{
			
			assertEquals(true,obj.pptConversion());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}