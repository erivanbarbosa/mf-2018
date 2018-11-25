package validator;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import java.net.URL;
import org.xml.sax.SAXException;

import java.io.File;
//import java.io.File; // if you use File
import java.io.IOException;

public class XMLValidator {

	public void validate() {
		URL schemaFile = null;
		Source xmlFile = null;
		
		try {
			schemaFile = new File("src/main/resources/xmls-schemas/comunicacao.xsd").toURI().toURL();
			File file = new File("src/main/resources/comunicacao.xml");
			xmlFile = new StreamSource(file);
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(schemaFile);
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
			System.out.println(xmlFile.getSystemId() + " is valid");
		} catch (SAXException e) {
			System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
		} catch (IOException e) {
		}

	}

}
