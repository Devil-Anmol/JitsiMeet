plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.jitsimeet"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.jitsimeet"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
//    kapt("androidx.room:room-compiler:2.3.0")

//    implementation(libs.play.services.auth)
//    implementation(libs.play.services.basement)
//    implementation(libs.play.services.tasks)
//    implementation(libs.androidx.material)
//    implementation(libs.jitsi.meet.sdk)
//    implementation(libs.play.services.identity)
//    implementation(libs.androidx.privacysandbox)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    implementation("androidx.compose.runtime:runtime-livedata")

//    implementation("androidx.room:room-runtime:2.3.0")
//    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("androidx.room:room-runtime:2.4.2")
    implementation("androidx.core:core-ktx:1.12.0")
//    implementation(libs.room.ktx)
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
//    implementation("androidx.activity:activity-compose:1.8.2")
//    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
//    implementation("androidx.compose.ui:ui")
//    implementation("androidx.compose.ui:ui-graphics")
//    implementation("androidx.compose.ui:ui-tooling-preview")
//    implementation("androidx.compose.material3:material3")
    kapt("androidx.room:room-compiler:2.3.0")
    testImplementation("androidx.room:room-testing:2.3.0")

    implementation("org.jitsi.react:jitsi-meet-sdk:9.2.2")
    implementation(libs.firebase.common.ktx)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.auth)
//    implementation(libs.androidx.room.common)
//    implementation(libs.androidx.room.compiler)
//    implementation(libs.androidx.room.ktx)
//    implementation("androidx.room:room-runtime:2.4.2")
    testImplementation(libs.junit)
    testImplementation("androidx.room:room-testing:2.3.0")
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}