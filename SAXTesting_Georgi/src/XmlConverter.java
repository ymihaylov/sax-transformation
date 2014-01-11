import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class XmlConverter {
	public static String iFileName = "zaneacademy.xml";
	public static String oFileName = "result.xml";
	
	public static void main(String[] args) throws IOException, SAXException {
		XMLReader p=XMLReaderFactory.createXMLReader();
		p.setContentHandler(new XmlConverterHandler());
		p.parse(iFileName);
	}

}
