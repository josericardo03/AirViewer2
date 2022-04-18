package edu.wright.airviewer2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*; 
/**
 * @author RavaliSatla
 *
 */
public class TestMergePdf {
	//Here object will be initialized
	static MergePdf mergepdfobj = null;
	/**
	 * @throws Exception
	 */
	@BeforeAll
	public static void setUp() throws Exception {
		//Here pdf file path will be given to test the file
		mergepdfobj = new MergePdf("C:/Users/wsucatslabs/Desktop/Amazon/resume.pdf");
	}
	/**
	 * @throws Exception
	 */
	@AfterAll
	public static void tearDown() throws Exception {
		//Here object will be initialized to null
		mergepdfobj = null;
	}
	/**
	 * testing method
	 */
	@org.junit.jupiter.api.Test
	public void test() {
		/*
		 Here the functionality will be tested and returns the test case results
		 */
		try{
			/*
			 * here a call to the method will take place
			 */
			assertEquals(true,mergepdfobj.mergepdf());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} 