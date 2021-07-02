# DatingAppAndroid

💖💖💖💖 This repository is the source code for Dating App Android mobile. 💖💖💖💖

### 🖥 Description 🖥 ###

 ✔ Application used Java language, Gradle build tools, Firebase on Android platform.

- The app support sign-in, sign-up and confirm with Email (Firebase Authentication).

- Users will recommended matching that compatible with "Sex" and "Hobby".

- Matched users can send messages to each other.

* Version 1.0

### 👀 Set up guide 👀  ###

* S1 : Access https://console.firebase.google.com/  ,Create project and init Android app in this project.

* S2 : In Authentication, select "sign-in method" to "enable" authenticate function with "email/password".

* S3 : In FireStore database and Realtime database, database initialization .

* S4 : "Rule" in database.

  - With FireStore :change line "allow read, write: if false;" -> "allow read, write: if request.auth != null"

  - With Realtime : change (  ".read": true, ".write": true, )

* S5 : In project setting, download file "google-services.json" .Then, save dowloaded file into "app" folder of this application.


