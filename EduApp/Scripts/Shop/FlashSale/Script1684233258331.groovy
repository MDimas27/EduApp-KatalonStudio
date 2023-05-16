import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('mobileapp/HappyDayShopping_1.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Shop/FlashSale/flash-sale_menu'), 0)

Mobile.tap(findTestObject('Shop/FlashSale/product_flash-sale'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Shop/FlashSale/quantity-5_input'), '5', 0)

Mobile.tap(findTestObject('Shop/FlashSale/AddToBag_button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Shop/FlashSale/AddMore_button'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/FlashSale/YourBag_button'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/FlashSale/Checkout_button'), 0)

Mobile.getText(findTestObject('Object Repository/Shop/FlashSale/text-assertion-after-checkout'), 0)

Mobile.closeApplication()

