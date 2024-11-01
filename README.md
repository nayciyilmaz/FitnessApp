## Features

- **Modern UI Design**: A modern and user-friendly design using Material3 components.
- **TopAppBar**: The top app bar with a simple title provides easy access for users.
- **Animated Cards**: Displays exercise information with animated cards for each day. Users can tap on the cards to view exercise details.
- **Dynamic Content Visibility**: Each exercise card opens or closes with an animation when the user taps on it to view additional details.

## Project Structure

- `MainActivity.kt`: The entry point of the app, including the main theme and UI components.
- `OneWeekApp()`: Sets up the general app structure using Scaffold to organize content areas and add the TopAppBar component.
- `ExerciseList()`: Component displaying the list of daily exercises. The list is efficiently managed using LazyColumn.
- `ExerciseCard()`: Expandable card component for each exercise. When the user taps on a card, the content expands to provide more exercise information.
- `TopAppBar()`: The top section of the app containing the app’s title bar.

## Technologies Used

- **Kotlin**: The primary programming language used for Android app development.
- **Jetpack Compose**: A modern Android UI toolkit used for defining the user interface.
- **Material Design 3**: Components that follow Material Design principles to ensure visual consistency and accessibility.
- **Animation API**: Used for the opening and closing animations on the cards.

