package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="New Record"                                
               , summary=""
               , connection="AccountManagerRole"
               , auraComponent="newRecord"
               , namespacePrefix=""
     )             
public class newRecord {

	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Item 1']/parent::span/parent::lightning-primitive-cell-checkbox/parent::td/following-sibling::th//button")
	public WebElement expandUSA;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Item 7']/parent::span/parent::lightning-primitive-cell-checkbox/parent::td/following-sibling::th//button")
	public WebElement expandNONPROFIT;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Item 11']/parent::span/parent::lightning-primitive-cell-checkbox/parent::td/following-sibling::th//button")
	public WebElement expandSOCIALSERVICES;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[@id='check-button-label-18-993']/span[1]")
	public WebElement selectItem18;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[@id='check-button-label-18-576']/span[1]")
	public WebElement selectItem181;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Expand BETTER BUSINESS BUREAU']")
	public WebElement expandBETTERBUSINESSBUREAU;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[@id='check-button-label-18-574']/span[1]")
	public WebElement selectItem182;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Continue']")
	public WebElement continue_;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Item 17']/parent::span/parent::lightning-primitive-cell-checkbox/parent::td/parent::tr/following-sibling::tr[1]//span[contains(@class,'slds-checkbox_faux')]")
	public WebElement selectItem183;
	
}
