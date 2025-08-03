// build-logic/convention/build.gradle.kts
plugins {
    `kotlin-dsl` // 启用 Kotlin DSL 支持
}

repositories {
    // 添加必要的仓库
    google()
    mavenCentral()
    gradlePluginPortal() // 插件仓库
}

dependencies {
    // 添加构建所需的依赖
    implementation("com.android.tools.build:gradle:8.4.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
}