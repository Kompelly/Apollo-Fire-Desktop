import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/1t/c55l8xzs6gq_q7skx3wcbvjr0000gn/T/Katalon/Test Cases/COLLECTION PAGE/Prouducts layout style/20190613_155926/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('CALL - URL'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Mens chevron'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Mens - Top Chevron'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shirts link'))

not_run: WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/layout less'))

WebUI.delay(2)

int a = WebUI.getPageHeight()

WebUI.comment('a=' + a)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/layout more'))

WebUI.delay(2)

int b = WebUI.getPageHeight()

WebUI.comment('b=' + b)

WebUI.verifyLessThan(b, a)

''', 'Test Cases/COLLECTION PAGE/Prouducts layout style', new TestCaseBinding('Test Cases/COLLECTION PAGE/Prouducts layout style',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
