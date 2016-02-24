/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;

/**
 *
 * @author vsantos
 */
public class SeleniumDEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vsantos\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://10.0.0.65:8045/ProPaySGO/SGO/Login.aspx");

        WebElement login = driver.findElement(By.id("txtLogin_I"));
        login.sendKeys("analista");

        WebElement senha = driver.findElement(By.id("txtSenha_I"));
        senha.sendKeys("123456");

        WebElement entrar = driver.findElement(By.id("btnEntrar_CD"));
        entrar.click();

        WebElement dtInicial = driver.findElement(By.id("ctl00_plhContent_dtpRequisicoesInicio_dateInput_text"));
        dtInicial.sendKeys("1/1/2016");

        WebElement dtFinal = driver.findElement(By.id("ctl00_plhContent_dtpRequisicoesFim_dateInput_text"));
        dtFinal.sendKeys("29/2/2016");

        WebElement pesquisar = driver.findElement(By.id("ctl00_plhContent_ibtnFiltrar"));
        pesquisar.click();

//        WebElement ordernum = driver.findElement(By.cssSelector("#ctl00_plhContent_grdRequisicoes_DXTGScol2 table tbody tr"));
//        ordernum.click();

        WebElement nextpage = driver.findElement(By.cssSelector("//div[@class='dxpButton_propay']"));
        Actions act = new Actions(driver);
        act.moveToElement(nextpage).click().perform();

    }
}
