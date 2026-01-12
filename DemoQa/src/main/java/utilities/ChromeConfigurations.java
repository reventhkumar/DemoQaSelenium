package utilities;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeConfigurations extends AutoUtilities{

	public ChromeConfigurations(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static ChromeOptions setDefaultDownloadLocation() {
		String downloadPath = System.getProperty("./downloads") + File.separator + "downloads";
		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		return options.setExperimentalOption("prefs", chromePrefs);
		
	}

}
