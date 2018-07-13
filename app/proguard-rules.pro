#ProGuard
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable
-keep public class * extends java.lang.Exception

#Crashlytics
-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

#Model classes
-keepnames @kotlin.Metadata class pl.skamycki.circleci.model.**
-keep class pl.skamycki.circleci.model.** { *; }
-keepclassmembers class pl.skamycki.circleci.model.** { *; }
