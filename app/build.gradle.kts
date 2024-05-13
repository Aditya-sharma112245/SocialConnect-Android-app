plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}
android {
    namespace = "com.example.socialapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.socialapp"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        exclude ("META-INF/atomicfu.kotlin_module")
    }

}
    // Define variables
    val appCompatVersion = "1.4.0"
    val activityVersion = "1.4.0"
    val constraintLayoutVersion = "2.1.2"
    val coreTestingVersion = "2.1.0"
    val coroutines = "1.5.2"
    val lifecycleVersion = "2.4.0"
    val materialVersion = "1.6.0"
    val roomVersion = "2.5.0"
    val junitVersion = "4.13.2"
    val espressoVersion = "3.4.0"
    val androidxJunitVersion = "1.1.3"
    val kotlin_version = "1.5.0"

    dependencies {
        implementation("androidx.appcompat:appcompat:$appCompatVersion")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines")

        // UI
        implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
        implementation("com.google.android.material:material:$materialVersion")

        /* coroutines support for firebase operations */
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")

        // Import the BoM for the Firebase platform
        implementation(platform("com.google.firebase:firebase-bom:26.1.0"))
        implementation("com.google.firebase:firebase-firestore")
        implementation("com.google.firebase:firebase-auth-ktx")
        implementation("com.firebaseui:firebase-ui-firestore:7.2.0")

        implementation("com.google.android.gms:play-services-auth:19.0.0")

        implementation("com.github.bumptech.glide:glide:4.11.0")
        implementation("androidx.compose.foundation:foundation-android:1.6.2")
        implementation("com.google.firebase:firebase-firestore-ktx:24.11.1")
        implementation("com.google.firebase:firebase-common-ktx:20.4.3")
        kapt("com.github.bumptech.glide:compiler:4.11.0")

        // Testing
        testImplementation("junit:junit:$junitVersion")
        androidTestImplementation("androidx.arch.core:core-testing:$coreTestingVersion")
        androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion") {
            exclude(group = "com.android.support", module = "support-annotations")
        }
        androidTestImplementation("androidx.test.ext:junit:$androidxJunitVersion")
    }





