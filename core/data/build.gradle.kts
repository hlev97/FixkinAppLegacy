apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.coreDatabase))
    "implementation"(project(Modules.coreNetwork))
    "implementation"(project(Modules.corePreferences))
    "implementation"(project(Modules.coreModel))
}