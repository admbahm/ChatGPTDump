// Write the base class of a selenium web testing framework using kotlin.

open class SeleniumBaseTest {
 
    lateinit var driver: WebDriver
 
    @Before
    fun setUp() {
        driver = DriverFactory.createDriver()
    }
 
    @After
    fun tearDown(){
        if(driver != null) {
            driver.quit()
        }
    }
 
    fun goToUrl(url: String){
        driver.get(url)
    }
 
    fun findElement(by: By): WebElement {
        return driver.findElement(by)
    }
 
    fun findElements(by: By): List<WebElement> {
        return driver.findElements(by)
    }
}
