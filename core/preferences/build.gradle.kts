import dependencies.DataStore

apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(DataStore.dataStorePreferences)
}