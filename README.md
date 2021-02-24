# updateappOnplayStore

device information like your current location, aboutUs, ads, battery, device, memory, Network, Installation app in your device and contact list etc.

<img src="https://github.com/premsingh8171/updateappOnplayStore/blob/master/app/src/main/res/drawable/updateapp.jpeg" width="300" height="550" /> 



<h2>How to integrate the library in your app?</h2>
<b>Gradle dependency</b></br>

```gradle
dependencies {

	     implementation 'com.github.premsingh8171:updateappOnplayStore:1.0.0'

}
```

<b>Dependency</b></br>

```gradle
allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
```
#Using 

```java
 /* Rating on google playstore of ourApp */
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appRating(MainActivity.this);
            }
        });
```

```java
 /* share application to another */
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareApp(MainActivity.this, sms, url);
            }
        });
```

```java
/* update app */
        upadte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateversion("version update", sms_update_version, url, MainActivity.this, "Yes", "No");
            }
        });
```



| Value         | Function Name  |
| ------------- |:-------------:| 
| If apps were allowed to handle the rating themselves, then the developer could manipulate the app's rating any time. So there is no way you can handle the rating yourself. You can only prompt the user to your app page on Google Play and ask them to rate your app for more support.   | ```appRating()``` |
| If you want to share your app any other social media for promote application to more connect usser in our app.   | ```shareApp()``` |
| If you want update app of latest version so you want to follow updateversion().   | ```updateversion()``` |



<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>


