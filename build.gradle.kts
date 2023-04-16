buildscript {
    dependencies {
        classpath(libs.google.services)
        classpath (libs.secrets.gradle.plugin)

    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.com.android.application) apply false
    id ("org.jetbrains.kotlin.android") version ("1.7.20") apply false
}