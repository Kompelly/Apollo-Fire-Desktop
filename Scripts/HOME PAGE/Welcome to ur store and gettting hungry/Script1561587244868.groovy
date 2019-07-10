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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/Welcome to ur stire'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/About Us'))

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/Shop collection'))

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/learn more about us'))

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/Getting hungry'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Welcome to our store/COntact us'))

