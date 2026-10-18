# BeykentMobileApp2

The second iteration of an Android campus app prototype for Beykent University: every screen for students, academics and staff, with static content and demo logins.

## Overview

A Java Android app that opens on a role picker (Student, Academic, Staff). Each role has a login screen and a home menu that leads to its own screens. In this version the screens are laid out but not connected to a backend: logins check hardcoded demo credentials and the content is static. The UI is in Turkish.

It is the middle step of the same project:

1. [BeykentMobilApp](https://github.com/mertcaneren0/BeykentMobilApp): first UI skeleton (role picker and three empty home screens)
2. **BeykentMobileApp2** (this repo): full screen set with static content
3. [BeykentUniversitesiMobil](https://github.com/mertcaneren0/BeykentUniversitesiMobil): final version, wired to Firebase Auth and Realtime Database, with an admin panel

## Screens

**Student**
- Grades (`Not Bilgileri`), attendance (`Devamsızlık`), course schedule, exam place and time
- Notifications from academics, academic appointment screen
- Transcript screen
- Library: a searchable list of books
- Link to Beykent Radio (opens the radio website)

**Academic**
- Appointments, send notification, library search, radio link

**Staff**
- Exam places, grade editing, course schedule, notifications

## Tech

- Java, Android SDK (compileSdk / targetSdk 29, minSdk 21, build tools 29.0.2)
- Android Gradle Plugin 3.5.3
- AndroidX AppCompat 1.1.0, ConstraintLayout 1.1.3
- No backend or third-party libraries

## Project structure

```
app/
  build.gradle
  src/main/java/com/mertcaneren/beykentmobilapp/
    MainActivity.java            role picker
    ogrenci*.java, notBilgileri, transkript   student screens
    akademisyen*.java            academic screens
    personel*.java               staff screens
    kutuphane.java, radyo*.java  library search, radio link
  src/main/res/                  layouts, drawables, custom font
BeykentMobileApp/                older copy of the first iteration
```

## Build and run

1. Clone the repo and open the root folder in Android Studio.
2. Let Gradle sync. The project uses an old Gradle/AGP setup (AGP 3.5.x), so a recent Android Studio may ask you to upgrade the Gradle wrapper or plugin.
3. Run on an emulator or device with Android 5.0 (API 21) or newer. The demo login values are in the `*GirisLogin.java` files.

## Notes

This is a student/learning project and not an official Beykent University app.

---

Built by [Mertcan Eren](https://github.com/mertcaneren0)
