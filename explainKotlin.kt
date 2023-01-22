What is this Kotlin code doing?
package com.example.automationframework

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.After
import org.junit.Before
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

open class Base {

    lateinit var driver: AndroidDriver<MobileElement>
    private val capabilities = DesiredCapabilities().apply {
        setCapability(MobileCapabilityType.APPIUM_VERSION, "1.14.2")
        setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
        setCapability(MobileCapabilityType.DEVICE_NAME, "Android")
        setCapability("appPackage", "com.google.samples.apps.sunflower")
        setCapability("appActivity", ".GardenActivity")
        setCapability("automationName", "uiautomator2")
        setCapability("skipDeviceInitialization", true)
        setCapability("noReset", true)
        setCapability("enableMultiWindows", true)
        setCapability("unlockType", "pin")
        setCapability("unlockKey", "0000")
        setCapability("newCommendTimeout", "120")
    }

    @Before
    fun setup() {
        driver = AndroidDriver(URL("http://127.0.0.1:4750/wd/hub"), capabilities)
        driver.manage()?.timeouts()?.implicitlyWait(30, TimeUnit.SECONDS)
    }

    @After
    fun tearDown() {
        driver.quit()
    }
}

This Kotlin code is setting up the base class for an automation framework, likely to be used for testing Android applications. It is setting up the desired capabilities for the Android driver and creating a set up () and tear down () function. The setup function is creating an instance of the Android driver, setting the implicit wait time, and the tear down function is quitting the driver instance.
