<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.bignerdranch.android.heart">

<application
android:allowBackup="true"
        android:icon="@drawable/appicon"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
<!--欢迎界面-->
<activity android:name=".SplashActivity">
<intent-filter>
<action android:name="android.intent.action.MAIN" />
<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>

<!--主界面-->
<activity
android:name=".firstActivity">
</activity>

</application>

</manifest>