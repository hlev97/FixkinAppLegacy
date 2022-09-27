apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.featureAuthenticationDomain))
    "implementation"(project(Modules.coreUi))
}