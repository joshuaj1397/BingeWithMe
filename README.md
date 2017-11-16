# **Binge With Me**
A social platform for friends and family to keep track of what they are watching, how many episodes deep they're in, and chat about an episode after they finish it! 📺

## Getting Started
### Prerequisites
* [Android Studio](https://developer.android.com/studio/index.html) 🤖
* [Butter Knife](http://jakewharton.github.io/butterknife/) 🔪
* [Amazon Web Services Account](aws.amazon.com) 🌴🕸🔧

### Installing
**Installing the codestyle**
1) Download the [codestyle xml file](https://drive.google.com/open?id=1X5HlyATpo2-s7iCTnMvCNgm5-FPOB6on)
2) Put the file in {User}/.AndroidStudio2.3/config/codestyles
3) Open the project in Android Studio
4) Navigate to File>Settings>Editor>Codestyle then click Manage, choose AndroidStyle, Close, Apply, Ok.

**Installing Butterknife**
1) Navigate to Gradle Scripts/build.gradle (Module: app)
2) Add the following lines to the dependencies section at the bottom
```
compile 'com.jakewharton:butterknife:8.8.1'
annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
```

**Installing AWS S3**
1) Navigate to Gradle Scripts/build.gradle (Module: app)
2) Add the following lines to the dependencies section at the bottom
```
compile 'com.amazonaws:aws-android-sdk-core:2.2.+'
compile 'com.amazonaws:aws-android-sdk-s3:2.2.+'
```
3) Navigate to manifests/AndroidManifest.xml
4) Add the following to above the <application> tag
```
<uses-permission android:name="android.permission.INTERNET" />
```
## Built With
[Android Studio](https://developer.android.com/studio/index.html) - IntelliJ based IDE specifically for creating Android apps

[IMDb Datasets](http://www.imdb.com/interfaces/) - Movie and show information

[Butter Knife](http://jakewharton.github.io/butterknife/) - View binding made easy using annotations

[AWS S3](https://aws.amazon.com/s3/) - file storage
## Authors
* Joshua Johnson
* Adriana Holley
* Darrel Donald
* Misael Aguayo
