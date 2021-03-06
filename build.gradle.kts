buildscript {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "http://oss.sonatype.org/content/repositories/snapshots")
    }

    dependencies {
        classpath("com.android.tools.build", "gradle", Config.Dependency.gradlePlugin)
        classpath(kotlin("gradle-plugin", version = Config.Dependency.kotlin))
        classpath("androidx.navigation", "navigation-safe-args-gradle-plugin", Config.Dependency.navigation)
        classpath("com.github.dcendents", "android-maven-gradle-plugin", "2.1")
        classpath("com.google.android.gms", "oss-licenses-plugin", "0.10.3")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

tasks.register("generateChangelog") {
    doLast {
        try {
            exec { commandLine("git-chglog", "-o", "CHANGELOG.md") }
        } catch (e: Exception) {
            println(">> You don't have git-chglog installed, please visit https://github.com/git-chglog/git-chglog for installation instructions.")
        }
    }
}
