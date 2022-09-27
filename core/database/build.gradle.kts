import dependencies.Room

apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(Room.roomRuntime)
    "kapt"(Room.roomCompiler)
    "implementation"(Room.roomKtx)

    "implementation"(project(Modules.coreModel))
}