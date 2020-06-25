import Version.annotationsVersion
import Version.appcompatVersion
import Version.archLifecycleVersion
import Version.constraintLayoutVersion
import Version.coroutinesVersion
import Version.espressoVersion
import Version.extJunitVersion
import Version.glideVersion
import Version.gsonVersion
import Version.junitVersion
import Version.kotlinVersion
import Version.ktxVersion
import Version.legacySupportVersion
import Version.materialVersion
import Version.multidexVersion
import Version.navigationVersion
import Version.okhttpLoggingVersion
import Version.recyclerViewVersion
import Version.retrofitVersion
import Version.roomVersion
import Version.rxAndroidVersion
import Version.rxJavaVersion
import Version.rxKotlinVersion

object Version {
    const val kotlinVersion = "1.3.72"

    const val appcompatVersion = "1.1.0"

    const val ktxVersion = "1.2.0"

    const val constraintLayoutVersion = "1.1.3"

    const val junitVersion = "4.12"

    const val extJunitVersion = "1.1.1"

    const val espressoVersion = "3.2.0"

    const val materialVersion = "1.1.0"

    const val recyclerViewVersion = "1.1.0"

    const val annotationsVersion = "1.1.0"

    const val coroutinesVersion = "1.2.1"

    const val roomVersion = "2.2.5"

    const val archLifecycleVersion = "2.2.0"

    const val navigationVersion = "2.2.0-rc02"

    const val multidexVersion = "2.0.1"

    const val legacySupportVersion = "1.0.0"

    const val retrofitVersion = "2.9.0"

    const val okhttpLoggingVersion = "3.11.0"

    const val gsonVersion = "2.8.5"

    const val rxJavaVersion = "2.2.19"

    const val rxAndroidVersion = "2.1.1"

    const val rxKotlinVersion = "2.4.0"

    const val glideVersion = "4.11.0"
}

object AppDependencies {
    const val kotlinCore = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"

    const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"

    const val ktx = "androidx.core:core-ktx:$ktxVersion"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    const val material = "com.google.android.material:material:$materialVersion"

    const val recyclerView = "androidx.recyclerview:recyclerview:$recyclerViewVersion"

    const val androidXAnnotation = "androidx.annotation:annotation:$annotationsVersion"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"

    const val room = "androidx.room:room-runtime:$roomVersion"

    const val roomAnnotation = "androidx.room:room-compiler:$roomVersion"

    const val roomKtx = "androidx.room:room-ktx:$roomVersion"

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:$archLifecycleVersion"

    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$archLifecycleVersion"

    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$archLifecycleVersion"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"

    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationVersion"

    const val multidex = "androidx.multidex:multidex:$multidexVersion"

    const val legacySupport = "androidx.legacy:legacy-support-v4:$legacySupportVersion"

    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"

    const val gsonConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"

    const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpLoggingVersion"

    const val gson = "com.google.code.gson:gson:$gsonVersion"

    const val rxJava = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"

    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"

    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion"

    const val glide = "com.github.bumptech.glide:glide:$glideVersion"

    const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"
}

object TestDependencies {
    const val junit = "junit:junit:${junitVersion}"

    const val extJunit = "androidx.test.ext:junit:${extJunitVersion}"

    const val espresso = "androidx.test.espresso:espresso-core:${espressoVersion}"

}
