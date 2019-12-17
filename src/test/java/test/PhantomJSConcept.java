package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


public class PhantomJSConcept {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("phantomjs.binary.path",
				"C:\\Users\\subham\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

		WebDriver driver = new PhantomJSDriver();

		driver.get("https://www.kiposcollective.com/#/");

		Thread.sleep(4000);

		String title = driver.getTitle();

		System.out.println(title);

	}
}
