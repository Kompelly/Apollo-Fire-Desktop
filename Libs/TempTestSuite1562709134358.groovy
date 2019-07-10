import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/0.5.5')

suiteProperties.put('name', '0.5.5')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/sumankompelly/Katalon Studio/APOLLO - FIRE/APOLLO - FIRE- DESKTOP/Reports/0.5.5/20190709_175214/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/0.5.5', suiteProperties, [new TestCaseBinding('Test Cases/COLLECTION PAGE/Sort', 'Test Cases/COLLECTION PAGE/Sort',  null), new TestCaseBinding('Test Cases/COLLECTION PAGE/Prouducts layout style', 'Test Cases/COLLECTION PAGE/Prouducts layout style',  null), new TestCaseBinding('Test Cases/COLLECTION PAGE/Filter', 'Test Cases/COLLECTION PAGE/Filter',  null), new TestCaseBinding('Test Cases/HOME PAGE/Welcome to ur store and gettting hungry', 'Test Cases/HOME PAGE/Welcome to ur store and gettting hungry',  null), new TestCaseBinding('Test Cases/HOME PAGE/Hero banner - CTA', 'Test Cases/HOME PAGE/Hero banner - CTA',  null), new TestCaseBinding('Test Cases/HOME PAGE/Burger menu - navigation links', 'Test Cases/HOME PAGE/Burger menu - navigation links',  null), new TestCaseBinding('Test Cases/HOME PAGE/Featured blog posts', 'Test Cases/HOME PAGE/Featured blog posts',  null), new TestCaseBinding('Test Cases/HOME PAGE/Featured collection', 'Test Cases/HOME PAGE/Featured collection',  null), new TestCaseBinding('Test Cases/HOME PAGE/Footer', 'Test Cases/HOME PAGE/Footer',  null), new TestCaseBinding('Test Cases/HOME PAGE/Cart flyout opening', 'Test Cases/HOME PAGE/Cart flyout opening',  null), new TestCaseBinding('Test Cases/HOME PAGE/Popular products', 'Test Cases/HOME PAGE/Popular products',  null), new TestCaseBinding('Test Cases/HOME PAGE/Follow us', 'Test Cases/HOME PAGE/Follow us',  null), new TestCaseBinding('Test Cases/PRODUCT PAGE/Social media icons', 'Test Cases/PRODUCT PAGE/Social media icons',  null), new TestCaseBinding('Test Cases/PRODUCT PAGE/Product chevron dropdowns', 'Test Cases/PRODUCT PAGE/Product chevron dropdowns',  null), new TestCaseBinding('Test Cases/PRODUCT PAGE/You might also like', 'Test Cases/PRODUCT PAGE/You might also like',  null), new TestCaseBinding('Test Cases/PRODUCT PAGE/Shop all products CTA', 'Test Cases/PRODUCT PAGE/Shop all products CTA',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Home page - add to bag CTA', 'Test Cases/CRITICAL PATH/Home page - add to bag CTA',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Increase quantity - cart page', 'Test Cases/CRITICAL PATH/Increase quantity - cart page',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Increase quantity - Cart flyout', 'Test Cases/CRITICAL PATH/Increase quantity - Cart flyout',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Adding diff prods to cart', 'Test Cases/CRITICAL PATH/Adding diff prods to cart',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Price comparison - cart page', 'Test Cases/CRITICAL PATH/Price comparison - cart page',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Decrease quantity - cart page', 'Test Cases/CRITICAL PATH/Decrease quantity - cart page',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Adding product - Search flyout', 'Test Cases/CRITICAL PATH/Adding product - Search flyout',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Adding product - home page', 'Test Cases/CRITICAL PATH/Adding product - home page',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Login and logout', 'Test Cases/CRITICAL PATH/Login and logout',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Decrease quantity - Cart flyout', 'Test Cases/CRITICAL PATH/Decrease quantity - Cart flyout',  null), new TestCaseBinding('Test Cases/CRITICAL PATH/Price comparison - Cart flyout', 'Test Cases/CRITICAL PATH/Price comparison - Cart flyout',  null)])
