package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class TestDemo {

    WebDriver driver;
    WebDriver wait;
    @Test
    public void test() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/nestedframes");
/*        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement heading =driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);

        driver.switchTo().parentFrame();

        List<WebElement> elementList = driver.findElements(By.cssSelector("div[id='framesWrapper']"));
        String paragraph = elementList.get(0).getText();
        System.out.println(paragraph);

        driver.switchTo().frame("frame2");
        WebElement heading2 =driver.findElement(By.id("sampleHeading"));
        String text2 = heading2.getText();
        System.out.println(text2);
*/
/*        WebElement adFrame = driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(adFrame);

        WebElement closeButton = driver.findElement(By.id("cbb"));
        closeButton.click();
*/
//        driver.switchTo().frame("frame1");
//
//        WebElement parentBody = driver.findElement(By.tagName("body"));
//        System.out.println(parentBody.getText());
//        driver.switchTo().frame(0);
//        WebElement p = driver.findElement(By.tagName("p"));
//        System.out.println(p.getText());
//        driver.switchTo().parentFrame();
//        driver.switchTo().parentFrame();
//        WebElement ilk = driver.findElement(By.id("framesWrapper"));
//        String ilkText = ilk.getText();
//        System.out.println(ilk.getText());

        // driver.get("https://demoqa.com/modal-dialogs");

//        WebElement smallModalButton = driver.findElement(By.id("showSmallModal"));
//        smallModalButton.click();
//
//        WebElement smallText = driver.findElement(By.cssSelector("div.modal-body"));
//        System.out.println(smallText.getText());
//
//        WebElement closeSmallButton = driver.findElement(By.id("closeSmallModal"));
//        closeSmallButton.click();

//        WebElement largeButton = driver.findElement(By.id("showLargeModal"));
//        largeButton.click();
//
//        WebElement largeText = driver.findElement(By.cssSelector("div.modal-body"));
//        System.out.println(largeText.getText());
//
//        WebElement largeClose = driver.findElement(By.id("closeLargeModal"));
//        largeClose.click();

//        driver.get("https://demoqa.com/accordian");
//
//        WebElement firstAccord = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
//        String className = firstAccord.getAttribute("class");
//        System.out.println(className);
//
//
//        driver.findElement(By.id("section1Heading")).click();
//
//
//        className = firstAccord.getAttribute("class");
//        System.out.println(className);
//
//        Thread.sleep(1000);
//        className = firstAccord.getAttribute("class");
//        System.out.println(className);
//
//        driver.findElement(By.id("section2Heading")).click();
//        Thread.sleep(2000);
//        className = firstAccord.getAttribute("class");
//        System.out.println(className);

//        driver.get("https://demoqa.com/auto-complete");
//
//        WebElement input = driver.findElement(By.id("autoCompleteSingleInput"));
//        input.sendKeys("R");
//
//        List<WebElement> suggestions = driver.findElements(By.cssSelector("div.auto-complete__option"));
//
//        for (WebElement suggestion : suggestions) {
//            System.out.println(suggestion.getText());
//        }

//        driver.get("https://demoqa.com/date-picker");
//
//        WebElement dateAndTime = driver.findElement(By.id("dateAndTimePickerInput"));
//        dateAndTime.click();
//
//        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-read-view--down-arrow"));
//        monthElement.click();
//
//        List<WebElement> monthsElements = driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__month-option')]"));
//
//        for (WebElement monthsElement : monthsElements) {
//            if (monthsElement.getText().equals("January")) {
//                monthsElement.click();
//                break;
//            }
//        }
//
//        driver.findElement(By.className("react-datepicker__year-read-view--down-arrow")).click();
//        List<WebElement> yearsElement = driver.findElements(By.className("react-datepicker__year-option"));
//
//        for (WebElement yearElement :yearsElement) {
//            String year = yearElement.getText();
//            if (year.equals("2001")){
//                System.out.println("burda");
//                yearElement.click();
//                break;
//            }
//        }
//
//
//        List<WebElement> daysElement = driver.findElements(By.cssSelector("div.react-datepicker__day"));
//
//        for (WebElement dayElement : daysElement) {
//            String text = dayElement.getText();
//            if (text.equals("28")) {
//                dayElement.click();
//                break;
//            }
//        }
//

//        selectDate("2001","January","28");
//
//    }
//    private  void selectDate(String year, String month, String day) {
//        WebElement selectButton = driver.findElement(By.id("datePickerMonthYearInput"));
//        selectButton.click();
//
//        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
//        Select select = new Select(monthElement);
//        select.selectByVisibleText(month);
//
//        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
//        select = new Select(yearElement);
//        select.selectByVisibleText(year);
//
//        List<WebElement> daysElement = driver.findElements(By.cssSelector("div.react-datepicker__day"));
//
//        for (WebElement dayElement : daysElement) {
//            String text = dayElement.getText();
//
//            if (text.equals(day)) {
//                dayElement.click();
//                break;
//            }
//
//        }

//        driver.get("https://demoqa.com/slider");
//
//        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(slider,10,0).perform();
//
//        WebElement sliderValue = driver.findElement(By.cssSelector(".range-slider__tooltip__label"));
//
//        String value = sliderValue.getText();
//        System.out.println("Recent Value: " + value);
//
//        WebElement sliderValues = driver.findElement(By.id("sliderValue"));
//        String sliderValuesText = sliderValues.getAttribute("value");
//        System.out.println("Slider Values : " + sliderValuesText);
//

//        driver.get("https://demoqa.com/progress-bar");
//
//        WebElement startStopButton = driver.findElement(By.id("startStopButton"));
//        startStopButton.click();
//
//        WebElement progressBar = driver.findElement(By.cssSelector("div[role='progressbar']"));
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.pollingEvery(Duration.ofMillis(100));
//
//        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("button[class='mt-3 btn btn-primary']"),"id","resetButton"));

//        wait.until(ExpectedConditions.attributeToBe(progressBar,"aria-valuenow","50"));
//        startStopButton.click();

        driver.get("https://demoqa.com/tool-tips");

        WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipButton).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

        WebElement toolTip =driver.findElement(By.className("tooltip-inner"));
        System.out.println("Text : " + toolTip.getText());




    }

    }

