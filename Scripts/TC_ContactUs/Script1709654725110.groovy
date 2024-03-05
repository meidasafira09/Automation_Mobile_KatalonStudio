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

Mobile.startApplication('/home/meida/Downloads/DemoApp.apk', true)

Mobile.tap(findTestObject('Object Repository/ContactUs_PageObject/menu_ContactUs'), 0)

Mobile.setText(findTestObject('Object Repository/ContactUs_PageObject/field_EnterName'), 'test name', 0)

Mobile.setText(findTestObject('Object Repository/ContactUs_PageObject/field_EnterEmail'), GlobalVariable.email_testing, 
    0)

Mobile.setText(findTestObject('Object Repository/ContactUs_PageObject/field_EnterAddress'), 'Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/ContactUs_PageObject/field_EnterMobileNo'), GlobalVariable.MobileNo, 0)

Mobile.tap(findTestObject('Object Repository/ContactUs_PageObject/btn_submitContactUs'), 0)

WebUI.delay(2)

Mobile.verifyElementExist(findTestObject('Object Repository/ContactUs_PageObject/TextView_Name'), 0)

Mobile.closeApplication()

