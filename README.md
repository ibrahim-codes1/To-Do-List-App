# ✅ To-Do List App — Android (Java)

A simple and clean Android To-Do List application built with **Java**. The app allows users to add tasks and mark them as complete with a strikethrough effect. It features a splash screen, a floating action button for adding tasks, and a RecyclerView to display all tasks.

---

# 📱 Screenshots

## Splash Screen

<img src="https://github.com/user-attachments/assets/e114f194-2239-45fd-9e3e-377ee049aaf0" alt="splashscreen" width="300" />


## Main Screen

<img width="1080" height="2412" alt="To-Do List" src="https://github.com/user-attachments/assets/7d26b437-a10f-4220-abd6-1584623b3949" />
<img width="1080" height="2412" alt="To-Do List2" src="https://github.com/user-attachments/assets/83907430-9f30-4bf3-9b9f-5d79961ab58e" />


---

# 📊 App Flow

```text
Splash Screen (3 seconds)
        ↓
Main Screen (Task List)
        ↓
[+ FAB Button] → Add Task Dialog → Task appears in list
        ↓
[Checkbox] → Mark task as Done (strikethrough text)
```

---

# 🚀 Features

- **Splash Screen** — Displays a branded launch screen for 3 seconds before opening the app
- **Add Tasks** — Tap the floating `+` button to create a new task
- **Mark as Done** — Completed tasks get a strikethrough effect
- **Unmark Tasks** — Uncheck a task to mark it incomplete again
- **RecyclerView List** — Smooth and scrollable task list
- **Input Validation** — Prevents empty tasks from being added

---

# 🏗️ Project Structure

```text
ToDoList/
├── screenshots/
│   ├── splash.png
│   └── main.png
│
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/to_dolist/
│           │   ├── SplashScreen.java
│           │   ├── MainActivity.java
│           │   ├── ToDoModel.java
│           │   └── ToDoAdapter.java
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_splash_screen.xml
│           │   │   ├── activity_main.xml
│           │   │   ├── add_new_task.xml
│           │   │   └── tasklayout.xml
│           │   │
│           │   ├── drawable/
│           │   │   └── logo.xml
│           │   │
│           │   └── values/
│           │       ├── colors.xml
│           │       ├── strings.xml
│           │       └── themes.xml
│           │
│           └── AndroidManifest.xml
│
└── build.gradle.kts
```

---

# 🧩 Class Descriptions

## `SplashScreen.java`

The launch screen shown when the app starts. Uses `Handler.postDelayed()` to wait 3 seconds before opening `MainActivity`.

---

## `MainActivity.java`

Handles the main task list screen. Sets up the `RecyclerView`, adapter, and floating action button.

---

## `ToDoModel.java`

A simple POJO model class containing:

- `task` → Task text
- `isDone` → Completion status

---

## `ToDoAdapter.java`

A custom `RecyclerView.Adapter` that binds tasks to the UI and handles checkbox interactions.

---

# ⚙️ Tech Stack

| Technology | Details |
|---|---|
| Language | Java |
| Platform | Android |
| Min SDK | 24 (Android 7.0 Nougat) |
| Target SDK | 36 |
| UI Components | RecyclerView, FloatingActionButton, Dialog, CheckBox |
| Libraries | AndroidX AppCompat, Material Components |
| Build System | Gradle (Kotlin DSL) |

---

# 🛠️ How to Run

## 1. Clone or Download the Project

```bash
git clone https://github.com/your-username/ToDoList.git
```

---

## 2. Open in Android Studio

- Open **Android Studio**
- Select **Open an Existing Project**
- Choose the `ToDoList` folder

---

## 3. Sync Gradle

Wait for Gradle dependencies to download and sync.

---

## 4. Run the Application

- Connect an Android device or start an emulator
- Click the **Run ▶** button

---

# 📌 How to Use

1. Launch the app
2. Wait for the splash screen
3. Tap the green `+` floating action button
4. Enter a task and press **Save**
5. Tap the checkbox to mark tasks as completed

---

# ⚠️ Known Limitations

- No persistent storage
- No delete functionality
- No edit functionality
- No categories or priorities

---

# 🔮 Future Improvements

- [ ] Add Room Database
- [ ] Add swipe-to-delete
- [ ] Add task editing
- [ ] Add reminders and due dates
- [ ] Add dark mode
- [ ] Add categories and labels

---

# 👨‍💻 Author

Built as a beginner Android development project using Java.

**Package Name:** `com.example.to_dolist`

---

# 📄 License

This project is open source and free to use for learning purposes.
