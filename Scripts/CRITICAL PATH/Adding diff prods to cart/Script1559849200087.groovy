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

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Beef'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Beef skewers'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/2 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/3 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Chicken'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Grilled lemon chicken'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/2 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/3 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Pork'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/BBQ Ribs'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 lb'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

