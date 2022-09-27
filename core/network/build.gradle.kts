import dependencies.Retrofit

apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.okHttp)
}