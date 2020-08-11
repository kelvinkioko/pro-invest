![](media/FoodiumHeader.png)

# Invest Like a pro 🍲 

**Invest Like a pro** is a education app to teach people the basics of investment

## About
It simply loads **Posts** data from API and stores it in persistence storage (i.e. SQLite Database). Posts will be always loaded from local database. Remote data (from API) and Local data is always synchronized. 
- This makes it offline capable 😃. 
- Clean and Simple Material UI.
- It supports dark theme too 🌗.

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
- [Moshi Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/moshi) - A Converter which uses Moshi for serialization to and from JSON.
- [Coil-kt](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - For writing Gradle build scripts using Kotlin.

## Lint ✅
This project uses [***GitHub Super Linter***](https://github.com/github/super-linter) which is Combination of multiple linters to install as a GitHub Action.

Following Linters are used internally by super linter (enabled for this project):
- XML: [LibXML](http://xmlsoft.org/)
- Kotlin: [ktlint](https://github.com/pinterest/ktlint)


## [`Dagger`](https://dagger.dev/) (Old) DI Version 🗡️
If you want to refer old way of Dependency Injetion using Dagger2, see branch [***`dagger2-di`***](https://github.com/PatilShreyas/Foodium/tree/dagger2-di)

[![Dagger2 Version](https://img.shields.io/static/v1?label=Foodium&message=Dagger2-DI&color=brightgreen&logo=android)](https://github.com/PatilShreyas/Foodium/tree/dev-hilt-android)


## [`Koin`](https://insert-koin.io/) DI Version 🗡️
If you want to use *Koin - Dependency Injection framework* in app then visit below repository.

[![Koin Version](https://img.shields.io/badge/PranayPatel512-Foodium-blue.svg?style=flat-square&logo=github)](https://github.com/pranaypatel512/Foodium)

**Contributed By:** [Pranay Patel](https://github.com/pranaypatel512/)


# Package Structure
    
    com.invest.proinvest    # Root Package
    .
    ├── data                             # For data handling.
    │   ├── dao                          # Local Persistence Database. Room (SQLite) database
    |   │   ├── LessonDap                # Data Access Object for Room   
    |   │   ├── LessonDetailsDao         # Data Access Object for Room 
    |   │   └── TopicDao                 # Data Access Object for Room 
    │   ├── model                        # Remote Data Handlers     
    |   │   ├── LessonData               # Entity table and parcable object for safeArgs.
    |   │   ├── LessonDetailsData        # Entity table and parcable object for safeArgs.
    |   │   └── TopicData                # Entity table and parcable object for safeArgs.
    │   └── repository                   # Single source of data.
    |   │   ├── LessonRepository         # Repository to handle data access to and from lesson and lesson details tables.
    |   │   └── TopicRepository          # Repository to handle data access to and from topic tables.
    |
    ├── dependency                       # Dependency Injection             
    │   ├── InvestApp                    # Activity Builder
    │   └── InvestModule                 # DI Components  
    |
    ├── ui                               # Activity/View layer
    │   ├── details                      # Details view package
    |   │   └── DetailsDialogFragment    # BottomSheet dialog fragment to display information.
    │   ├── home                         # Homepage view package
    |   │   ├── HomeFragment             # Main view for the list of topics available
    |   │   ├── HomeTopicsAdapter        # Adapter for RecyclerView to show list of topics
    |   │   └── HomeViewModel            # View model to manage finance topics and unidirectional data flow  
    │   ├── lessons                      # Lessons package with fragment, adapter and ViewModel
    |   │   ├── LessonAdapter            # Adapter for RecyclerView to show list of lessons
    |   │   ├── LessonFragment           # Main view for the list of lessons available
    |   │   └── LessonViewModel          # View model to manage lesson and unidirectional data flow 
    │   └── menu                         # Menu view package
    |   │   └── MainMenuDialog           # BottomSheet dialog fragment to display menu with actions.  
    |
    └── view               # Utility Classes / Kotlin extensions


## Architecture
This app uses [***MVI (Model View Intent)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

## Contact
If you need any help, you can connect with me.
