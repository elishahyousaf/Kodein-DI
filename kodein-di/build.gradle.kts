plugins {
    id("org.kodein.library.mpp")
}

repositories {
    maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
}

kodein {
    kotlin {

        common {
            main.dependencies {
                api("org.kodein.type:kodein-type:1.4.0-snapshot-js-ir-crash-94")
            }
            test.dependencies {
                implementation(project(":test-utils"))
            }
        }
        add(kodeinTargets.jvm.jvm) {
            target.setCompileClasspath()
        }
        add(kodeinTargets.js.both)
        add(kodeinTargets.native.all)

    }
}

kodeinUpload {
    name = "Kodein-DI"
    description = "KODEIN Dependency Injection Core"
}
