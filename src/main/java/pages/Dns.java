package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data.MainframeCharacter;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertEquals;

public class Dns {
    private Logger log = Logger.getLogger(Dns.class.getName());
    private List<MainframeCharacter> characters = new ArrayList();

    @Given("^Open (.*) page$")
    public void openPage(String url) {
        log.info("Opening " + url);

        open(url);
        getWebDriver().manage().window().maximize();
    }

    @When("^Click on (.*)$")
    public void click(String linkName) {
        log.info("Click on: " + linkName);

        $(By.linkText(linkName)).click();
    }

    @And("^Sort by (.*)$")
    public void sortBy(String sort) {
        log.info("Sorting by: " + sort);

        $(By.className("top-filter__icon")).click();

        String xpathSort = String.format("//span[text()= \"%s\"]", sort);
        $(By.xpath(xpathSort)).click();
    }

    @And("^Find (\\d)* item from (.*)$")
    public void findItem(int itemNumber, String position) throws InterruptedException {
        log.info("Looking for " + itemNumber + " element from " + position);

        if (position.equals("ending")) {
            Thread.sleep(1000);
            itemNumber = $$(By.xpath("//*[@class=\"catalog-items-list view-simple\"]/div")).size() - itemNumber;
            if (itemNumber <= 0) {
                log.info("There is no " + itemNumber + "element. Go to the previous page");

                $(By.xpath("//a[@class=\"pagination-widget__page-link pagination-widget__page-link_prev \"]")).click();
                Thread.sleep(1000);

                itemNumber += $$(By.xpath("//*[@class=\"catalog-items-list view-simple\"]/div")).size();
            }
        }

        String itemXpath = String
                .format("//*[@id=\"catalog-items-page\"]//div[%d]/div/div[1]/div[1]/div/div[2]/div[1]/a", itemNumber);

        Thread.sleep(1000);
        $(By.xpath(itemXpath)).click();
    }


    @And("^Save mainframe character$")
    public void saveMainframeCharacter() {
        MainframeCharacter character = new MainframeCharacter();

        String name = $(By.xpath("//*[@id=\"product-page\"]/h1")).getText().replaceAll("Характеристики ПК ", "");
        character.setName(name);
        log.info("Name: " + name);

        String price = $(By.xpath("//div[@class=\"clearfix\"]//span[@class=\"current-price-value\"]")).getText();
        character.setPrice(price);
        log.info("Price: " + price);

        String warranty = $(By.xpath("//*[@id=\"product-page\"]/div[4]//div[1]/p[2]/span[2]")).getText();
        character.setWarranty(warranty);
        log.info("Warranty: " + warranty);

        String operationSystem = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Операционная система \"]/../../../td[2]")).getText();
        character.setOperationSystem(operationSystem);
        log.info("Operation System : " + operationSystem);

        String cpuModel = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Модель процессора \"]/../../../td[2]")).getText();
        character.setCpuModel(cpuModel);
        log.info("CPU model: " + cpuModel);

        String cpuNumber = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Количество ядер процессора \"]/../../../td[2]")).getText();
        character.setCpuNumber(cpuNumber);
        log.info("CPU number: " + cpuNumber);

        String cpuClockSpeed = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Частота процессора \"]/../../../td[2]")).getText();
        character.setCpuClockSpeed(cpuClockSpeed);
        log.info("CPU Clock Speed : " + cpuClockSpeed);

        String videoCardModel = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Модель дискретной видеокарты \"]/../../../td[2]")).getText();
        character.setVideoCardModel(videoCardModel);
        log.info("Video card model: " + videoCardModel);

        String videoCardMemory = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Объем видеопамяти \"]/../../../td[2]")).getText();
        character.setVideoCardMemory(videoCardMemory);
        log.info("Video card memory: " + videoCardMemory);

        String ramType = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Тип оперативной памяти \"]/../../../td[2]")).getText();
        character.setRamType(ramType);
        log.info("RAM type: " + ramType);

        String ramSize = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Размер оперативной памяти \"]/../../../td[2]")).getText();
        character.setRamSize(ramSize);
        log.info("RAM size: " + ramSize);

        String hddSize = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Суммарный объем жестких дисков (HDD) \"]/../../../td[2]")).getText();
        character.setHddSize(hddSize);
        log.info("HDD size: " + hddSize);

        String sddSize = $(By.xpath("//*[@id=\"characteristics\"]//div/span[text()=\" Объем твердотельного накопителя (SSD) \"]/../../../td[2]")).getText();
        character.setSddSize(sddSize);
        log.info("SDD size: " + sddSize);

        characters.add(characters.size(), character);
    }

    @When("^Go to the last page$")
    public void goToTheLastPage() {
        log.info("Open the last page");

        SelenideElement lastPageLink = $(By.xpath("//a[@class=\"pagination-widget__page-link pagination-widget__page-link_last \"]"));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);",  lastPageLink);
        lastPageLink.click();
    }

    @Then("^Compare (\\d) and (\\d) mainframe characters$")
    public void compareMainframeCharacters(int firstIndex, int secondIndex) {
        assertEquals("Names are different",
                characters.get(firstIndex - 1).getName(), (characters.get(secondIndex - 1)).getName());

        assertEquals("Prices are different",
                characters.get(firstIndex - 1).getPrice(), (characters.get(secondIndex - 1)).getPrice());

        assertEquals("Warranties are different",
                characters.get(firstIndex - 1).getWarranty(), (characters.get(secondIndex - 1)).getWarranty());

        assertEquals("Operation Systems are different",
                characters.get(firstIndex - 1).getOperationSystem(), (characters.get(secondIndex - 1)).getOperationSystem());

        assertEquals("Cpu models are different",
                characters.get(firstIndex - 1).getCpuModel(), (characters.get(secondIndex - 1)).getCpuModel());

        assertEquals("Cpu numbers are different",
                characters.get(firstIndex - 1).getCpuNumber(), (characters.get(secondIndex - 1)).getCpuNumber());

        assertEquals("Cpu clock speeds are different",
                characters.get(firstIndex - 1).getCpuClockSpeed(), (characters.get(secondIndex - 1)).getCpuClockSpeed());

        assertEquals("Video card models are different",
                characters.get(firstIndex - 1).getVideoCardModel(), (characters.get(secondIndex - 1)).getVideoCardModel());

        assertEquals("Video card memories are different",
                characters.get(firstIndex - 1).getVideoCardMemory(), (characters.get(secondIndex - 1)).getVideoCardMemory());

        assertEquals("Ram types are different",
                characters.get(firstIndex - 1).getRamType(), (characters.get(secondIndex - 1)).getRamType());

        assertEquals("Ram sizes are different",
                characters.get(firstIndex - 1).getRamSize(), (characters.get(secondIndex - 1)).getRamSize());

        assertEquals("Hdd Sizes are different",
                characters.get(firstIndex - 1).getHddSize(), (characters.get(secondIndex - 1)).getHddSize());

        assertEquals("Sdd Sizes are different",
                characters.get(firstIndex - 1).getSddSize(), (characters.get(secondIndex - 1)).getSddSize());

        log.info("Characters are matches!");
    }

}
