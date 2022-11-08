package Demo11;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) throws Throwable {

		FileInputStream fs = new FileInputStream("");

		Properties p = new Properties();

		p.load(fs);

		p.get("URL").toString();

		List<WebELement> flightEle = driver.findElements(By.Xpath("//Table[@table='Name']/tr"));
		List<WebELement> priceEle = driver.findElements(By.Xpath("//Table[@table='price']tr/td"));
		
		

		List<String> flighName = new ArrayList<>();
		List<Double> price=new ArrayList<>();
		
		for (WebELement double1 : priceEle) {
			
			price.add(double1.getText());
			
		}

		for (WebELement webELement : flightEle) {
			
			
			flighName.add(webELement.getText());
			

		}

		

		TreeMap<String, Double> hsmao = new TreeMap<>(flighName, price);

	}

}
