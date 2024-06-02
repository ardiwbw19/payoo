

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.pinandu.payoo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.pinandu.payoo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding = true
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-android:2.8.0")
    implementation("androidx.paging:paging-common-android:3.3.0")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.exifinterface:exifinterface:1.3.7")
    implementation("androidx.compose.ui:ui-test-android:1.6.7")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    testImplementation("org.mockito:mockito-core:5.5.0")
    testImplementation("org.mockito:mockito-inline:5.2.0")
    testImplementation("org.robolectric:robolectric:4.5.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    implementation("androidx.activity:activity-ktx:1.8.0")
    implementation("androidx.paging:paging-runtime-ktx:3.2.1")
    implementation ("androidx.room:room-runtime:2.4.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.activity:activity:1.8.0")
    implementation("androidx.fragment:fragment-ktx:1.5.6")
    implementation("androidx.datastore:datastore-core-android:1.1.1")
    implementation("androidx.datastore:datastore-preferences-core-jvm:1.1.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.google.android.material:material:x.x.x")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.0")
    implementation ("androidx.navigation:navigation-ui-ktx:2.4.0")
    implementation("com.loopj.android:android-async-http:1.4.11")
    implementation("com.github.bumptech.glide:glide:4.15.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
}