# 📋 Simple ListView Android App (Kotlin)

This is a basic Android app built in **Kotlin** that demonstrates how to use a `ListView` with clickable items. When an item is clicked, a `Toast` message displays the selected item.

## 🚀 Features

- Displays a list of items using `ListView`
- Shows a `Toast` message when a list item is clicked
- Uses an `ArrayAdapter` to bind data

## 🧱 Built With

- Kotlin
- Android SDK
- Android Studio

## 🖼️ UI Preview

<img src="https://developer.android.com/images/ui/layout/listview.png" alt="ListView example" width="300" />

## 📂 Project Structure

com.example.listview/
├── MainActivity.kt # Main logic for setting up the ListView
└── res/
└── layout/
└── activity_main.xml # Layout with a ListView (id: lvItems)

## 🧑‍💻 How it Works

- The app defines an array of list items in `MainActivity.kt`.
- A `ListView` from the layout file (`activity_main.xml`) is linked using `findViewById`.
- An `ArrayAdapter` binds the string array to the `ListView`.
- Clicking on a list item shows a `Toast` message displaying the item name.

## 📦 Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/listview-kotlin-app.git
Open in Android Studio.

Build and run the app on an emulator or physical device.

📝 Example Output
When clicking on “Learn Kotlin”, the app will display:

You have clicked on: Learn Kotlin

📄 License
This project is open-source and free to use under the MIT License.
