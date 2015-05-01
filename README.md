**EZE TopUp**
=====================================================
App Description
----------------------------------------------------
**PROBLEM:**

Issue in entering wrong combination of top-up card pin numbers into the phone (for maximum 3 entering chances) may cause to deactivate the SIM service

**SOLUTION:**

EZE TOPUP is an Android app that enables the user to recharge/topup their mobile phone credit balance without entering reload card pin numbers manually after scratching. Basically this uses OCR technology (Tesseract API Library) to capture the pin number of the reload card and extract it to send to its relevant mobile service provider to recharge the phone credit balance. 
When we enter pin numbers from top-up cards to recharge the mobile balance, it has a 2^14 possibility of entering wrong number combinations as the pin number. So some service providers disconnect our service if the user enter maximum 3 wrong pin number combinations.
The user just needs to scratch the top-up card, open the EZE TOPUP app, focus to the pin numbers and tap the send button. The app allows to select which service provider that the user use for his mobile (is it Mobitel, Dialog, Etisalat or Airtel).

As an additional feature this app will track the expenses of phones' top-up amounts so that user can manage the credit expenses as well.

**APIs used:**

Tesseract OCR API

**Currently implemented:**

UI Designs, Datbase Implementation, Camera access and Dialer access by app

**Screenshots:**

![Alt text](https://github.com/AndroidJamSriLanka/EZETopUp/blob/master/UI%20Designs/UI%201.png "Splash Image")
![Alt text](https://github.com/AndroidJamSriLanka/EZETopUp/blob/master/UI%20Designs/UI%202.png "Service Provider Selection")
![Alt text](https://github.com/AndroidJamSriLanka/EZETopUp/blob/master/UI%20Designs/UI%203.png "Service Option Selection")
