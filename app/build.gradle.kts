plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.fitnexis"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.fitnexis"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation (libs.appcompat.v120)
    implementation (libs.material.v130)
    implementation (libs.constraintlayout.v204)
    implementation (libs.legacy.support.v4)
    testImplementation (libs.junit)
    androidTestImplementation (libs.junit.v112)
    androidTestImplementation (libs.espresso.core.v330)

    implementation (libs.parse)

    // for logging API calls to LogCat
    implementation (libs.logging.interceptor)

    implementation (libs.appcompat)
    implementation (libs.material)

    implementation (libs.recyclerview)

    implementation (libs.material.v100)
    implementation (libs.gson)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)

    implementation (libs.glide)
    // Glide v4 uses this new annotation processor -- see https://bumptech.github.io/glide/doc/generatedapi.html
    annotationProcessor (libs.compiler)
    implementation (libs.animatoo)

    implementation (libs.parceler.api)
    annotationProcessor (libs.parceler)
    implementation (libs.cardview)
    implementation (libs.material.v121)
}