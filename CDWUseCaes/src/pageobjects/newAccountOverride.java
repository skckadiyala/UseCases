package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="New Account Override"                                
               , summary=""
               , connection="CDWSalesforce"
               , auraComponent="newAccountOverride"
               , namespacePrefix=""
     )             
public class newAccountOverride {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Customer Name']/following-sibling::div//input")
	public WebElement customerName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Primary AM']/following-sibling::div//input")
	public WebElement primaryAM;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Secondary AM']/following-sibling::div//input")
	public WebElement secondaryAM;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='House Account']/following-sibling::div[1]//input")
	public WebElement houseAccount;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Customer Phone']/following-sibling::div[1]//input")
	public WebElement customerPhone;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Customer Fax']/following-sibling::div//input")
	public WebElement customerFax;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Website']/following-sibling::div//input")
	public WebElement website;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Account Status']/following-sibling::div//button")
	public WebElement accountStatus;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Type']/following-sibling::div//button")
	public WebElement type;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Business Segment']/following-sibling::div//button")
	public WebElement businessSegment;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Company Code']/following-sibling::div//button")
	public WebElement companyCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Customer Source']/following-sibling::div//button")
	public WebElement customerSource;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Partial Delivery']/following-sibling::div//button")
	public WebElement partialDelivery;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Asset Tag']/following-sibling::div//button")
	public WebElement assetTag;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Software Indemnity']/following-sibling::div//input")
	public WebElement softwareIndemnity;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='UPS Consignment Ship']/following-sibling::div//input")
	public WebElement uPSConsignmentShip;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='GLN Code']/following-sibling::div//input")
	public WebElement gLNCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Packing List Preference']/following-sibling::div//button")
	public WebElement packingListPreference;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Fee Display Preference']/following-sibling::div//button")
	public WebElement feeDisplayPreference;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Attn To']/following-sibling::div//input")
	public WebElement billingAttnTo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Street']/following-sibling::div//textarea")
	public WebElement billingStreet;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing City']/following-sibling::div//input")
	public WebElement billingCity;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing State/Province']/following-sibling::div//input")
	public WebElement billingStateProvince;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Zip/Postal Code']/following-sibling::div//input")
	public WebElement billingZipPostalCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Billing Country']/following-sibling::div//input")
	public WebElement billingCountry;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Payment Terms']/following-sibling::div//button")
	public WebElement paymentTerms;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='*Account Code Path']/parent::lightning-input/parent::slot/parent::lightning-layout-item/following-sibling::lightning-layout-item//button")
	public WebElement selectAccountCode;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Validate Address and Save']")
	public WebElement validateAddressAndSave;
	
}
