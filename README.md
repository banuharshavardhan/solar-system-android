# 🌌 Solar System App

A beautifully crafted **3D Solar System application** built using **Kotlin + Jetpack Compose + SceneView**, showcasing planetary motion, interactive exploration, and rich scientific data.

---

## 🚀 Features

### 🌞 3D Solar System Simulation
- Real-time planetary orbits around the Sun
- Planetary self-rotation
- Configurable orbital and rotation speeds
- Individual planet sizes and orbital distances
- Different starting positions for each planet
- Smooth frame-based animation

### 🪐 Interactive Experience
- Interactive 3D Solar System
- Camera control with gesture-based interaction
- Pan and zoom through the 3D scene
- Textured 3D planets
- Sun with a dedicated surface texture

### 🧭 Multiple View Modes
- 🌌 **Space View** → Fully interactive 3D Solar System
- 🧩 **Grid View** → Visual planet cards
- 📋 **List View** → Information-focused layout

### 📊 Rich Planet Data
Each planet includes:
- Mass and gravity
- Orbital speed and distance from the Sun
- Planetary radius
- Day and year length
- Atmosphere
- Planet type
- Number of moons
- Discovery details
- Surface area and volume
- Additional scientific information

---

## 🎥 Demo

### 🌌 Space View


https://github.com/user-attachments/assets/2829ad26-a0e5-4c82-948b-8c46d47dfd6e


### 🧩 Grid View

<img width="1080" height="2424" alt="Screenshot_20260808_094431" src="https://github.com/user-attachments/assets/26419e10-10ef-479f-a007-70f7753f8dd2" />

### 📋 List View

<img width="1080" height="2424" alt="Screenshot_20260808_094445" src="https://github.com/user-attachments/assets/b9c8446e-adac-4633-9e9b-86b66806a3ec" />

### 📊 Detail View

<img width="1080" height="2424" alt="Screenshot_20260808_094503" src="https://github.com/user-attachments/assets/a936c5d5-b9e9-42a7-9fba-14645dda0be2" />

---

## 🖼️ Screenshots

| Space View | Grid View |
|-----------|-----------|
| <img width="250" alt="Space" src="https://github.com/user-attachments/assets/a3456878-8720-4150-9e9d-b292652a7ef5" /> | <img width="250" alt="Grid" src="https://github.com/user-attachments/assets/26419e10-10ef-479f-a007-70f7753f8dd2" /> |

| List View | Detail View |
|----------|-------------|
| <img width="250" alt="List" src="https://github.com/user-attachments/assets/b9c8446e-adac-4633-9e9b-86b66806a3ec" /> | <img width="250" alt="Detail" src="https://github.com/user-attachments/assets/a936c5d5-b9e9-42a7-9fba-14645dda0be2" /> |

---

## 🧱 Project Architecture

The app follows a **modular + feature-based architecture**:

```text
SolarSystemApp/
├── MainActivity.kt
│
├── navigation/
│   ├── AppNavigation.kt
│   └── Destinations.kt
│
├── core/
│   ├── models/
│   │   └── Planet.kt
│   │
│   ├── data/
│   │   ├── Planets.kt
│   │   └── PlanetSceneResources.kt
│   │
│   └── components/
│       ├── SpaceNodeFactory.kt
│       ├── PlanetScene.kt
│       ├── PlanetGridCell.kt
│       ├── PlanetListCell.kt
│       ├── HeroSection.kt
│       ├── QuickStatCard.kt
│       ├── QuickStatSection.kt
│       ├── PhysicalPropertiesSection.kt
│       ├── EnvironmentSection.kt
│       ├── DiscoverySection.kt
│       ├── AboutSection.kt
│       ├── InfoRow.kt
│       └── SectionHeader.kt
│
├── features/
│   ├── home/
│   │   ├── HomeScreen.kt
│   │   ├── enums/
│   │   │   └── HomeSection.kt
│   │   ├── components/
│   │   │   ├── Segment.kt
│   │   │   ├── SegmentedControl.kt
│   │   │   └── SpaceTitle.kt
│   │   └── screens/
│   │       ├── SpaceSection.kt
│   │       ├── GridSection.kt
│   │       └── ListSection.kt
│   │
│   └── planetdetail/
│       └── PlanetDetailScreen.kt
│
└── ui/
    └── theme/
        ├── Color.kt
        ├── Theme.kt
        └── Type.kt
```

## ⚙️ Tech Stack

- **Kotlin** → Application development
- **Jetpack Compose** → UI & layout
- **SceneView** → 3D rendering and scene management
- **Filament** → 3D rendering engine
- **Navigation Compose** → Screen navigation
- **Material 3** → UI components and styling

---

## 🧠 Key Concepts Implemented

- 3D sphere rendering using planetary textures
- Reusable 3D node creation with `SpaceNodeFactory`
- Hierarchical node system for planetary orbits
- Planet self-rotation using frame-based animation
- Planet revolution around the Sun
- Individual orbital distances and speeds
- Configurable orbital starting angles
- Camera node and camera gesture manipulation
- Shared `Planet` data across Space, Grid, List, and Detail views
- Declarative UI with Jetpack Compose combined with 3D rendering

---

## 🎨 Design Highlights

- 🌑 Dark space-themed UI
- ✨ Clean planet cards
- 🪐 Consistent design across Space, Grid, List, and Detail views
- 🎯 Clear information hierarchy
- 🌌 Immersive 3D Solar System experience

---

## 📦 Assets

Planetary and solar textures are included for:

- Mercury
- Venus
- Earth
- Mars
- Jupiter
- Saturn
- Uranus
- Neptune
- Sun

---

## 🔮 Future Improvements

- 🪐 Orbit line visualization
- 🌗 Day/Night blending for Earth
- 💍 Enhanced Saturn ring system
- 🎥 Camera focus animation on planet selection
- 🌌 Advanced skybox & starfield
- 📡 Real-time NASA API integration
- 🔍 Zoom-to-planet transitions
- 🛰️ Moon systems support
- ⚛️ More accurate orbital physics

---

## 🛠️ Setup

1. Clone the repository

```bash
git clone https://github.com/banuharshavardhan/solar-system-android.git
```
2. Open the project in Android Studio
3. Sync the Gradle dependencies
4. Run the application on an Android Emulator or physical Android device

## 🙌 Acknowledgements

- Planetary data inspired by NASA public datasets
- Planetary textures from open astronomical sources
- Built and explored with the help of ChatGPT

---

## 📄 License

MIT License

---

## ⭐️ Support

If you like this project, give it a ⭐️ on GitHub!
