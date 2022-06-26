# [DaveLibrary](https://github.com/davidnjau/DavidLibrary) Android Library v2 [![Build Status](https://drone.DaveLibrary.com/api/badges/DaveLibrary/android-library/status.svg)](https://drone.DaveLibrary.com/DaveLibrary/android-library) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/d9f94f04e0f447a6b21c0ae08f6f7594)](https://www.codacy.com/app/DaveLibrary/android-library?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=DaveLibrary/android-library&amp;utm_campaign=Badge_Grade)

## Introduction
Using DaveLibrary Android library it will be the easiest way to communicate with DaveLibrary servers.
Add this library in your project and integrate your application with DaveLibrary seamlessly.

The Library has a list of Kenyan counties and sub counties

## Use Library
In the repository it is not only the library project but also the example project "sample_client"; 
thanks to it you will learn how to use the library.

*There are different ways of adding this library to your code*

### Gradle / Maven dependency
At the moment we do not have a publishing mechanism to a maven repository so the easiest way to add the library to your app is via a JitPack Dependency [![](https://jitpack.io/v/DaveLibrary/android-library.svg)](https://jitpack.io/#DaveLibrary/android-library)

```
Settings.gradle

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { url 'https://jitpack.io' }
    }
}

build.gradle

dependencies {
    ...
	    implementation 'com.github.davidnjau:DavidLibrary:v1.0.0'
```

##  License

DaveLibrary Android Library is available under MIT license. See [LICENSE.md](https://github.com/DaveLibrary/android-library/blob/master/LICENSE.md) with the full license text. 

### Third party libraries
```
DaveLibrary Android Library uses Apache JackRabbit, version 2.12.4. 
Copyright (C) 2004-2010 The Apache Software Foundation. 
Licensed under Apache License, Version 2.0.
```

```
Apache JackRabbit depends on Commons HTTPClient version 3.1 and SLF4j version 1.7.5; both included also. 
Copyright (C) 2004-2010 The Apache Software Foundation. 
Licensed under Apache License, Version 2.0.
```
