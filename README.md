e<!-- ============== -->
<h1 align="center">🌦️ 3D Weather App (Spring Boot)</h1>
<!-- ================= -->

<p align="center">
  <img src="https://cdn.dribbble.com/users/1708950/screenshots/5933942/forecast.gif" width="400"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk"/>
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/badge/Build-Maven-blue?style=for-the-badge&logo=apachemaven"/>
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge"/>
</p>

--

## 🚀 Project Description   

This **3D Weather App**, built with **Spring Boot**, provides real-time weather information such as **temperature, humidity, wind speed**, and **conditions** based on user input (city name or coordinates).  
It integrates seamlessly with external weather APIs to deliver structured **JSON responses** or display weather data through a clean **animated 3D UI**.  
The app features **exception handling**, **API response mapping**, and **optional caching** for better performance and reduced redundant API calls.

<p align="center">
  <img src="https://i.pinimg.com/originals/42/88/9e/42889ee4b7d9377e6b723c737c29e6f1.gif" width="600"/>
</p>

---

## 🧩 Features
- 🌍 Real-time weather by city name or coordinates  
- ⚡ RESTful API integration  
- 🧠 DTO-based architecture for clean data flow  
- 🔄 Optional caching for faster performance  
- 🚨 Centralized exception handling  
- 💡 Easy configuration via `application.properties`  
- 🎨 Elegant web interface using Bootstrap + 3D animations  

---

## 🛠️ Tech Stack
| Layer | Technology |
|-------|-------------|
| **Backend** | Spring Boot, Spring Web |
| **Language** | Java 17+ |
| **HTTP Client** | RestTemplate / WebClient |
| **Build Tool** | Maven |
| **Frontend (optional)** | HTML, CSS, Bootstrap, Thymeleaf |
| **Testing** | JUnit, Mockito |

---

## ⚙️ Configuration

Set your API key and base URL in the `application.properties` file:

```properties
weather.api.key=your_api_key_here


| Method | Endpoint                       | Description                |
| ------ | ------------------------------ | -------------------------- |
| `GET`  | `/api/weather?city={cityName}` | Get weather by city        |
| `GET`  | `/api/weather/{lat}/{lon}`     | Get weather by coordinates |
| `GET`  | `/ui`                          | Simple animated web UI     |

Sample Response:
{
  "city": "Chennai",
  "temperature": 30.4,
  "feelsLike": 32.1,
  "humidity": 75,
  "windSpeed": 10.2,
  "description": "Light Rain",
  "sunrise": "06:02",
  "sunset": "18:05"
}


🏃 Steps

# 1️⃣ Clone the repository
git clone https://github.com/yourusername/weather-app.git

# 2️⃣ Navigate into the project
cd weather-app

# 3️⃣ Build the project
mvn clean package

# 4️⃣ Run the application
java -jar target/weather-app.jar


src/
 ├─ main/
 │  ├─ java/com/cfs/Weather_App/
 │  │   ├─ controller/
 │  │   ├─ dto/
 │  │   ├─ service/
 │  │   └─ WeatherAppApplication.java
 │  └─ resources/
 │       ├─ static/
 │       ├─ templates/
 │       └─ application.properties
 └─ test/




weather.api.url=https://api.openweathermap.org/data/2.5/weather
server.port=8080...
