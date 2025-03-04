/*
 * Copyright © The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */
@file:Suppress("UnstableApiUsage")

plugins {
  id("com.github.android-password-store.android-library")
  id("com.github.android-password-store.kotlin-android")
}

android {
  namespace = "app.passwordstore.ssh"
  buildFeatures { androidResources = true }
  sourceSets { getByName("test") { resources.srcDir("src/main/res/raw") } }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.kotlin.coroutines.android)
  implementation(libs.kotlin.coroutines.core)
  implementation(libs.thirdparty.sshj) { exclude(group = "org.bouncycastle") }
  implementation(libs.thirdparty.logcat)
  implementation(libs.androidx.security)
  implementation(libs.thirdparty.eddsa)
  implementation(libs.thirdparty.kotlinResult)
}
