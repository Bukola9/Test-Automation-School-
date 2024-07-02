from appium import webdriver
def main():
    desired_caps = {
        'platformName': 'Android',
        'platformVersion': '12',
        'deviceName': 'Android Emulator',  # Replace with your device identifier
        'appPackage': 'com.google.android.apps.youtube.music',  # Replace with your app's package
        'appActivity': 'activities.MusicActivity',  # Replace with your app's activity
        'noSign':True
    }
    # Initialize the driver
    driver = webdriver.Remote(command_executor='', desire_capabilities=desired_caps)
    driver.quit()

    if __name__ =='__main__':
        main()
        