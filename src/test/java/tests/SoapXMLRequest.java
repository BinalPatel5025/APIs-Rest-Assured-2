package tests;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import static io.restassured.RestAssured.baseURI;
import java.io.File;
import java.io.FileInputStream;



public class SoapXMLRequest {
	
	/*@Test
	public void valudatesoapXML() {
		
		File fl = new File("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl");
		FileInputStream f = new FileInputStream(fl);
		String requestBody = IOUtils.toString(FileInputStream,"UTF-8");
		
		baseURI = "http://www.thomas-bayer.com/axis2/services/BLZService?wsdl";
		
		given().
			contentType("text/xml").
			accept(ContentType.XML);
			;*/
			
	

}
