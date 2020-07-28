import org.openqa.selenium.chrome.ChromeDriver;


public class testCase {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.ro/");

		String title = driver.getTitle();
		System.out.println(title);


	}

}
