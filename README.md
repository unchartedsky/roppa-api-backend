# Roppa API Backend

Lightweight, general-purpose Java/Spring-based backend API framework.

## 📦 Tech Stack

- **Java**: 24 (requires JDK 24+)
- **Spring Boot**: 3.3.x or later *(required for Java 22+ support — ensure you are on the latest compatible version for Java 24)*
- **Build Tool**: Gradle
- **Database Access**: jOOQ (mutable POJO)
- **Embedded WAS**: Jetty 12 (Servlet 6.0 support)
- **Mapping**: MapStruct

## 🔍 Overview

- General-purpose API backend with clean layering and explicit repository boundaries.
- jOOQ is used **only** in the repository layer; no `Record` types leak upward.
- DTO ↔ POJO conversion is handled by MapStruct.
- Embedded container defaults to **Jetty 12**; Tomcat is excluded.

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

---

## 📄 License
MIT (follow the repository's LICENSE file).