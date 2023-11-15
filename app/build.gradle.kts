plugins {
    id("com.android.application") // Apply the Android application plugin
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") // Apply the google maps plugin
    id("com.google.gms.google-services") // Apply the Google services Gradle plugin
}

android {
    namespace = "com.example.EPL498Luxzio"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.EPL498Luxzio"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    // AndroidX AppCompat library
    implementation("androidx.appcompat:appcompat:1.6.1")
    // Material Design components
    implementation("com.google.android.material:material:1.9.0")
    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // Navigation fragment
    implementation("androidx.navigation:navigation-fragment:2.5.3")
    // Navigation UI components
    implementation("androidx.navigation:navigation-ui:2.5.3")
    // JUnit for unit testing
    testImplementation("junit:junit:4.13.2")
    // AndroidX JUnit extensions
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    // Espresso for UI testing
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation("androidx.camera:camera-camera2:1.3.0-alpha04")
    implementation("androidx.camera:camera-lifecycle:1.3.0-alpha04")
    implementation("androidx.camera:camera-view:1.3.0-alpha04")
    implementation("androidx.camera:camera-extensions:1.3.0-alpha04")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    implementation("com.google.android.gms:play-services-maps:18.1.0")

    //////////////////////////


    // AndroidX AppCompat library
    implementation("androidx.appcompat:appcompat:1.6.1")
    // Material Design components
    implementation("com.google.android.material:material:1.8.0")
    // Google Play services for location [This wasn't added by default]
    implementation("com.google.android.gms:play-services-location:21.0.1")
    // Google Play services for maps [This wasn't added by default]
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // Navigation fragment
    implementation("androidx.navigation:navigation-fragment:2.5.3")
    // Navigation UI components
    implementation("androidx.navigation:navigation-ui:2.5.3")
    // JUnit for unit testing
    testImplementation("junit:junit:4.13.2")
    // AndroidX JUnit extensions
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    // Espresso for UI testing
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    // TODO: Add the dependencies for Firebase products you want to use
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")
    // Add the dependencies for any other desired Firebase products
    // https://firebase.google.com/docs/android/setup#available-libraries

    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-firestore")

    implementation("com.google.firebase:firebase-analytics:21.3.0")
    implementation("com.google.firebase:firebase-messaging:23.2.1")
    implementation("com.google.firebase:firebase-storage:20.2.1")

    // Firebase Packages
    // Cloud Firebase Packages
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-firestore")

    implementation("com.google.firebase:firebase-analytics:21.3.0")
    implementation("com.google.firebase:firebase-messaging:23.2.1")
    implementation("com.google.firebase:firebase-storage:20.2.1")

}