package datadriventesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.actitime.generic.FileLib;

public class DemoGenericLib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    FileLib f = new FileLib();
	    System.out.println(f.getPropertyData("URL"));
	    System.out.println(f.getPropertyData("username"));
	    System.out.println(f.getPropertyData("password"));
        System.out.println(f.getExcelData("createcustomer",1,3));
        f.setExcelData("createcustomer",3,4,"Passed");
	}

}
