plugins {
    alias(libs.plugins.udemycourse.android.library)
    alias(libs.plugins.udemycourse.android.library.compose)
}

android {
    namespace = "com.sawrose.udemycourse.designsystem"
}

dependencies {
    implementation(libs.androidx.material3)
}
