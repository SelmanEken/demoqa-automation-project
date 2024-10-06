package tests;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpClient;
import java.time.Duration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); // 1 saniye boyunca elementleri bekler

        driver.get("https://demoqa.com/text-box");

        WebElement nameElement = driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("Selman");

        WebElement email = driver.findElement(new By.ByCssSelector("input.mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("selman@gmail.com");

        WebElement address = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        address.click();
        address.sendKeys("caddesi mahallesi sokak no");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Selçuklu Konya");

        WebElement textButton = driver.findElement(new By.ByCssSelector("button.btn"));
        textButton.click();

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name= nameText.getText();
        System.out.println(name);

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String emails = emailText.getText();
        System.out.println(emails);

/*
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");


        String homeCheckBoxCssValue ="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox = driver.findElement(By.cssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();

        homeCheckBox = driver.findElement(By.cssSelector(homeCheckBoxCssValue));

        String homeCheckboxClassName = homeCheckBox.getAttribute("class");


        if(homeCheckboxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("checkbox checked");
        }else{
            System.out.println("checkbox not checked");
        }
*/
/*
        System.setProperty("WebDriver.Chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement sportcheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnable = sportcheckbox.isEnabled();
        System.out.println(isEnable);

        WebElement sportcheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if(isEnable) {
            try {
                System.out.println("Entered try block.");
                sportcheckbox.click();
            } catch (ElementClickInterceptedException e) {
                sportcheckboxLabel.click();
                System.out.println("Clicked on sport checkbox");
            }
        }

        boolean isSelected = sportcheckbox.isSelected();
        System.out.println(isSelected);

*/
/*
        System.setProperty("WebDriver.Chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButtonlabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnable = yesRadioButtonlabel.isEnabled();
        if(isEnable){
            yesRadioButtonlabel.click();
            System.out.println("Clicked yes button");
        }

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        boolean isSelected = yesRadioButton.isSelected();
        if(isSelected){
            System.out.println("Selected yes button");
        }
        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement noRadio = driver.findElement(By.id("noRadio"));
        System.out.println(noRadio.isEnabled());
*/
/*
        System.setProperty("WebDriver.Chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement doubleclickmebutton = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleclickmebutton).perform();


        WebElement doubleclicktext = driver.findElement(By.id("doubleClickMessage"));
        String text = doubleclicktext.getText();
        System.out.println(text);

        WebElement rightclickmebutton =driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightclickmebutton).perform();

        WebElement rightclicktext = driver.findElement(By.id("rightClickMessage"));
        String text2 = rightclicktext.getText();
        System.out.println(text2);


        WebElement clickmebutton = driver.findElement(By.xpath("//div/button[starts-with(text(),'Click Me')]"));
        //WebElement clickmebutton = driver.findElement(By.xpath("//div[last()]/button"));
        ////div/button[contains (text() , '')] dinamik elementler için kullanılanlar
        boolean clickme = clickmebutton.isEnabled();
        System.out.println(clickme);


        clickmebutton.click();

        WebElement clickmetext = driver.findElement(By.id("dynamicClickMessage"));
        String text3 = clickmetext.getText();
        System.out.println(text3);
*/
/*

        WebElement dynamictext = driver.findElement(By.xpath("//div/p"));
        String dytext = dynamictext.getText();
        System.out.println(dytext);

        WebElement enablebutton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));//tam sayının derleme hatasını düzeltmek için duration sınıfı kullanılır.
        wait.until(ExpectedConditions.elementToBeClickable(enablebutton));
        enablebutton.click();

        System.setProperty("WebDriver.Chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");

        WebElement colorChange = driver.findElement(By.id("colorChange"));
        String className = colorChange.getAttribute("class");
        System.out.println("Before change : " + className);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeToBe(colorChange, "class", "mt-4 text-danger btn btn-primary"));
        className = colorChange.getAttribute("class");
        System.out.println("After change : " + className);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();
*/
/*
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://demoqa.com");
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        HttpGet request2 = new HttpGet("https://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response2 = client.execute(request2);
        int statusCode2 = response2.getStatusLine().getStatusCode();
        System.out.println(statusCode2);


        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl = brokenImage.getAttribute("src");

        HttpGet request3 = new HttpGet(brokenImageUrl);
        HttpResponse response3 = client.execute(request3);
        int statusCode3 = response3.getStatusLine().getStatusCode();
        System.out.println(statusCode3);

        WebElement validImage = driver.findElement(By.xpath("//div/img[1]"));
        String validImageUrl = validImage.getAttribute("src");
        System.out.println(validImageUrl);

        HttpGet request4 = new HttpGet(validImageUrl);
        HttpResponse response4 = client.execute(request4);
        int statusCode4 = response4.getStatusLine().getStatusCode();
        System.out.println(statusCode4);
        if (statusCode4 == 200) {
            System.out.println("valid image");
        } else if (statusCode4 == 500) {
            System.out.println("broken image");
        }
*/
/*
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "C:\\Users\\eken_\\Downloads";
        String filename = "sampleFile.jpeg";
        Thread.sleep(2000);
        boolean isDownloaded = isFileDownloaded(path,filename);
        System.out.println(isDownloaded);

    }
    public static boolean isFileDownloaded(String downloadPath, String filename) {
        File file = new File(downloadPath);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().equals(filename)) {
                files[i].delete();
                return true;
            }
        }
        return false;

 */
 /*
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");

        WebElement chooseFileButton = driver.findElement(By.id("uploadFile"));
        chooseFileButton.sendKeys("C:\\Users\\eken_\\Downloads\\abc.png");
*/
/*
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        WebElement tabButton = driver.findElement(By.id("windowButton"));
        tabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.close();
*/
/*
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promtButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Selman");
        alert.accept();
*/

    }

}
