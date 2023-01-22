"""Write the base class of a selenium web testing framework using python."""

class BaseSeleniumTest:
    """Base class for all selenium web testing framework using python"""
    def __init__(self, driver):
        self.driver = driver

    def setUp(self):
        """Method to set up the environment for the test"""
        pass

    def tearDown(self):
        """Method to tear down the environment for the test"""
        pass

    def navigate(self, url):
        """Method to navigate to the given url"""
        self.driver.get(url)

    def find_element_by_xpath(self, xpath):
        """Method to find an element by xpath"""
        return self.driver.find_element_by_xpath(xpath)

    def find_elements_by_xpath(self, xpath):
        """Method to find multiple elements by xpath"""
        return self.driver.find_elements_by_xpath(xpath)

    def find_element_by_id(self, element_id):
        """Method to find an element by id"""
        return self.driver.find_element
