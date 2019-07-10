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

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Collection - sides'), 0)

WebUI.delay(4)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Collection - sides'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Sides - shop collection'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Asparagus salad'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Adding product - home page/Personal'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Adding product - home page/Small'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Adding product - home page/Medium'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Adding product - home page/Large'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Adding product - home page/Family'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

