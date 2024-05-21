plugins {
    id("org.ajoberstar.reckon.settings") version "0.18.3"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

extensions.configure<org.ajoberstar.reckon.gradle.ReckonExtension> {
    setDefaultInferredScope("patch")
    stages("beta", "rc", "final")
    setScopeCalc(calcScopeFromProp().or(calcScopeFromCommitMessages()))
    setStageCalc(calcStageFromProp())
}

rootProject.name = "versiontest"

include("BetaProcessor")
include("testservice")

