import org.gradle.api.artifacts.dsl.DependencyHandler

object Config {

    object Android {
        const val compileSdk = 29
        const val targetSdk = 29
        const val minSdk = 24
    }

    object Dependency {
        const val kotlin = "1.3.72"
        const val kotlinCoroutines = "1.3.8"
        const val material = "1.1.0-rc02"
        const val room = "2.1.0"
        const val navigation = "2.1.0-alpha06"
        const val glide = "4.9.0"
        const val constraintLayout = "2.0.0-beta4"
        const val gradlePlugin = "4.1.3"
        const val koin = "2.0.1"
        const val retrofit = "2.6.0"
        const val retrofitCoroutines = "0.9.2"
        const val okhttp = "4.0.0"
        const val moshi = "1.8.0"
        const val kotpref = "2.8.0"
        const val timber = "4.7.1"
        const val teanity = "0.+"
        const val viewPager2 = "1.0.0-rc01"
        const val work = "2.5.0"
        const val ossLicenses = "17.0.0"
    }

    object Build {
        object Dimen {
            const val DEFAULT = "default"
        }

        object Type {
            const val RELEASE = "release"
            const val DEBUG = "debug"
            const val MOCK = "mock"
        }
    }

    object Sign {
        const val DEFAULT = "default-config"
        const val DEBUG = "debug-config"
        const val ALPHA = "alpha-config"
        const val BETA = "beta-config"
    }

}

fun DependencyHandler.teanity(version: String = Config.Dependency.teanity): Any =
    "com.github.skoumalcz:teanity:$version"
