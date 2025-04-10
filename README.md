# 📱 Level SuperMind App Automation

This project contains automation scripts for testing the [Level SuperMind](https://level.game/) mobile application using **Java**, **Selenium**, and **Appium**. The automation focuses on verifying the login functionality with phone number, email, and OTP, including both positive and negative test cases.

---

## 📂 Project Structure

LevelAppAutomation/ ├── README.md ├── LevelA/ │ └── Caps.java # Appium capabilities and driver setup ├── LevelApp/ │ └── LevelApp.java # Test scenarios for login and OTP verification


---

## 🧰 Tools & Technologies Used

- Java  
- Selenium  
- Appium  
- TestNG  
- AndroidDriver  
- Real Android Device / Emulator  

---

## 🔧 Setup Instructions

1. **Install Prerequisites**
   - Java JDK
   - Android Studio or Emulator
   - Appium Server
   - TestNG (through your IDE or Maven)

2. **Connect Device or Start Emulator**
   - Ensure your test device is connected or an emulator is running.

3. **Start Appium Server**
   - The server should be running at `http://0.0.0.0:4723/wd/hub`.

4. **Open Project**
   - Open the project in your preferred IDE (e.g., IntelliJ or Eclipse).
   - Ensure necessary dependencies are added if you're using Maven or Gradle.

---

## ✅ Positive Test Cases

- Login with a valid phone number  
- Login with a valid email  
- Submit a valid OTP for verification  

---

## ❌ Negative Test Cases

- Attempt login with an invalid phone number  
- Submit an invalid OTP and verify error behavior  

---

## 🚀 How to Run the Tests

- Make sure Appium is running and the device is ready.
- Run test cases from the IDE using TestNG annotations.
- You can also run tests via the TestNG suite XML (if set up).

---

## 📝 Notes

- OTPs must be manually updated before execution to match what the app sends.
- Consider using **explicit waits** instead of thread sleeps for production-grade reliability.
- You can further enhance the framework by integrating with CI/CD tools and reporting libraries.

---

## 📧 Contact

**Author**: Rohit Chouhan  
**Email**: rohitchouhankgn11@gmail.com  

---

