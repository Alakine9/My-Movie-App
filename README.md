Sizwe Letsoalo
ST10499349

MY MOVIE APP PRESENTATION
Slide 1: Title Slide

Title:
Movie Application Overview
Subtitle:
A simple Android application for managing movies, adding reviews, and viewing them.

Slide 2: Introduction

Title:
Introduction to the Movie App

Content:

The app allows users to:

Add movies with details like name, director, and rating.

View a list of movies and their reviews.

A simple and intuitive layout with interactive elements.

Slide 3: Layout Structure

Title:
App Layout Overview

Content:

The app's user interface is composed of several activities, each having its own layout.

Layouts in the app:

RelativeLayout (used for splash screen).

LinearLayout (used for buttons, input fields, and movie list).

The UI includes elements like buttons, text fields, and image views for displaying content.

Slide 4: Splash Screen Layout

Title:
Splash Screen Layout (RelativeLayout)

Content:

Purpose: This screen typically shows the app's logo while loading the app.

XML Components:

ImageView: Displays the logo of the app.

Centered in the screen using android:layout_centerInParent="true".

Code Example:

<ImageView
  android:id="@+id/logo"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:src="@drawable/logo"
  android:layout_centerInParent="true" />

Slide 5: Main Screen Layout

Title:
Main Screen Layout (LinearLayout)

Content:

Purpose: Main screen where users can navigate to add a movie or view reviews.

XML Components:

Buttons:

Add Movie button to open the "Add Movie" screen.

View Reviews button to open the reviews list.

Code Example:

<Button
  android:id="@+id/addMovieButton"
  android:text="Add Movie" />

<Button
  android:id="@+id/viewReviewsButton"
  android:text="View Reviews" />

Slide 6: Add Movie Screen Layout

Title:
Add Movie Screen Layout (LinearLayout)

Content:

Purpose: Allows users to input details for a new movie (name, director, rating).

XML Components:

EditText fields: For movie name, director, and rating.

Button: To save the movie details.

Code Example:

<EditText android:id="@+id/movieNameInput" android:hint="Movie Name"/>
<EditText android:id="@+id/directorInput" android:hint="Director"/>
<EditText android:id="@+id/ratingInput" android:hint="Rating (1-10)" android:inputType="numberDecimal"/>
<Button android:id="@+id/saveButton" android:text="Save Movie"/>

Slide 7: Movie List View Layout

Title:
Movie List View Layout (LinearLayout)

Content:

Purpose: Displays a list of saved movies.

XML Components:

ListView: To show the list of movies and reviews.

Code Example:

<ListView android:id="@+id/listView"/>

Slide 8: AndroidManifest.xml

Title:
Manifest File Overview

Content:

Purpose: Contains essential app configurations and defines the structure of the application.

Key Elements:

Activities: Defines each screen (SplashActivity, MainActivity, AddMovieActivity, ViewReviewsActivity).

Intent Filters: Specifies entry points for the app (e.g., the Splash screen is the launcher activity).

Code Example:

<activity android:name=".SplashActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>

Slide 9: Application Flow

Title:
App Flow and Navigation

Content:

Splash Screen → Main Screen → Add Movie / View Reviews

Flow Breakdown:

The app launches with the Splash Screen.

After the splash screen, the user can:

Go to the "Main Activity" where they can either add a movie or view reviews.

The "Add Movie" screen allows users to input movie details and save them.

The "View Reviews" screen displays a list of movies with reviews.

Slide 10: Conclusion

Title:
Conclusion and Next Steps

Content:

This app allows users to manage and view movie reviews easily.

The current design is basic, but you can expand it by adding features like:

Storing movies in a database.

Showing movie details when clicked.

User authentication for personalized features.

Next Steps: Improving UI design, handling data persistence (e.g., using SQLite), and adding more advanced features like movie search.
