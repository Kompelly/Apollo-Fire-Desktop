import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CALL - URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Account icon'))

WebUI.delay(1)

WebUI.setText(findTestObject('APOLLO- Desktop/Home page/Email address'), 'suman.kompelly@diffagency.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('APOLLO- Desktop/Home page/Password'), '5xx1bkCcAlw=')

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Sign in button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/address page'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/orders page'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Details page'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Logout'))

