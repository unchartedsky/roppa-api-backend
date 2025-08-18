# Roppa API Backend

Lightweight, general-purpose Java/Spring-based backend API framework.

## 📦 Tech Stack

- **Java**: 24 (requires JDK 24+)
- **Spring Boot**: 3.3.x or later *(required for Java 22+ support — ensure you are on the latest compatible version for Java 24)*
- **Build Tool**: Gradle
- **Database Access**: jOOQ (mutable POJO)
- **Embedded WAS**: Jetty 12 (Servlet 6.0 support)
- **Mapping**: MapStruct
<br><br>
## 🔍 Overview

- General-purpose API backend with clean layering and explicit repository boundaries.
- jOOQ is used **only** in the repository layer; no `Record` types leak upward.
- DTO ↔ POJO conversion is handled by MapStruct.
- Embedded container defaults to **Jetty 12**; Tomcat is excluded.
<br><br>
## 📋 Development Notes

### 1) Mutable POJO Considerations
- Loss of immutability → avoid modifying shared instances.
- Concurrency → use within request scope; do not cache mutable entities as map keys.
- jOOQ is not an ORM: mutating POJOs does **not** auto-persist; call explicit `update` queries.

### 2) MapStruct
- Update `@Mapping` whenever field names change.
- Consider `nullValuePropertyMappingStrategy` if you need strict null-handling.

### 3) Jetty
- Jetty 12 is standardized for Servlet 6.0 & HTTP/3.
<br><br>
## 🚀 Build & Run

```bash
./gradlew clean build
./gradlew bootRun
```

### Rancher Desktop

You can also run the project using **Rancher Desktop** with containerd or dockerd backends.

Advantages:
- Cross-platform (macOS, Linux, Windows)
- Lightweight compared to Docker Desktop
- Kubernetes integration out of the box (if needed)

---

## 📄 License
MIT (follow the repository's LICENSE file).