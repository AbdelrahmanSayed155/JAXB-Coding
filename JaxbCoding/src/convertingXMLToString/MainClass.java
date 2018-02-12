package convertingXMLToString;


import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class MainClass {

	
	public static String convertXML2String(/*PrepaidServiceClassDTO req*/) {
		String filePath = "ChangePrepaidServiceClassReq.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filePath);
			Node packagIdNode = doc.getElementsByTagName("PackageID").item(0);
			packagIdNode.setTextContent(/*req.getPackageId()*/"1");
			System.out.println("packagIdNode: " + packagIdNode.getTextContent());
			Node msisdnNode = doc.getElementsByTagName("MSISDN").item(0);
			int index = 2;
//			if (req.getMsisdn().startsWith("0"))
//				index = 1;
//			String newmsisdn = req.getMsisdn().substring(index, req.getMsisdn().length());
			msisdnNode.setTextContent(/*newmsisdn*/"01122074031");
			System.out.println("msisdnNode: " + msisdnNode.getTextContent());
			Node clientIdNode = doc.getElementsByTagName("ClientID").item(0);
			clientIdNode.setTextContent(/*req.getClientId()*/"14200");
			System.out.println("clientIdNode: " + clientIdNode.getTextContent());
			Node serviceIdNode = doc.getElementsByTagName("ServiceID").item(0);
			serviceIdNode.setTextContent(/*req.getServiceId()*/"go");
			System.out.println("serviceIdNode: " + serviceIdNode.getTextContent());
			Node actionNode = doc.getElementsByTagName("Action").item(0);
			actionNode.setTextContent(/*req.getAction()*/"f");
			System.out.println("actionNode: " + actionNode.getTextContent());
			Node migrationFeesNode = doc.getElementsByTagName("MIGRATION_FEES").item(0);
			migrationFeesNode.setTextContent(/*req.getMigrationFees()*/"soam");
			System.out.println("migrationFeesNode: " + migrationFeesNode.getTextContent());
			Node colorNode = doc.getElementsByTagName("RATEPLAN_COLOR").item(0);
			colorNode.setTextContent(/*req.getRateplancolor()*/"maly");
			System.out.println("colorNode: " + colorNode.getTextContent());
			StringWriter sw = new StringWriter();
			Transformer serializer = TransformerFactory.newInstance().newTransformer();
			serializer.transform(new DOMSource(doc), new StreamResult(sw));
			System.out.println("sw.toString(): " + sw.toString());
			return sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		String xmlAsString =  convertXML2String();
        System.out.println("printing xml as string \n"+xmlAsString);
	}

}
