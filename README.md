# Spring Boot REST API with MongoDB

Bu proje, Spring Boot ve MongoDB kullanılarak geliştirilmiş bir REST API örneğidir.

## Özellikler

- **CRUD İşlemleri**: Kullanıcı oluşturma, okuma, güncelleme ve silme
- **MongoDB Entegrasyonu**: NoSQL veritabanı ile veri saklama
- **Data Validation**: Giriş verilerinin doğrulanması
- **RESTful API**: Standart HTTP metodları (GET, POST, PUT, DELETE)
- **Error Handling**: Hata yönetimi ve uygun HTTP status kodları

## Gereksinimler

- Java 17 veya üzeri
- Maven 3.6 veya üzeri
- MongoDB 4.0 veya üzeri

## Kurulum

1. **MongoDB'yi başlatın:**
   ```bash
   mongod
   ```

2. **Projeyi derleyin:**
   ```bash
   mvn clean install
   ```

3. **Uygulamayı çalıştırın:**
   ```bash
   mvn spring-boot:run
   ```

Uygulama `http://localhost:8080` adresinde çalışacaktır.

## API Endpoints

### Kullanıcılar

| Method | Endpoint | Açıklama |
|--------|----------|----------|
| GET | `/api/users` | Tüm kullanıcıları listele |
| GET | `/api/users/{id}` | ID'ye göre kullanıcı getir |
| GET | `/api/users/email/{email}` | Email'e göre kullanıcı getir |
| GET | `/api/users/search?name={name}` | İsme göre kullanıcı ara |
| POST | `/api/users` | Yeni kullanıcı oluştur |
| PUT | `/api/users/{id}` | Kullanıcı güncelle |
| DELETE | `/api/users/{id}` | Kullanıcı sil |

### Örnek Kullanım

**Yeni kullanıcı oluşturma:**
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "123456",
    "phone": "555-1234"
  }'
```

**Tüm kullanıcıları listeleme:**
```bash
curl -X GET http://localhost:8080/api/users
```

**Kullanıcı güncelleme:**
```bash
curl -X PUT http://localhost:8080/api/users/{id} \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Jane Doe",
    "email": "jane@example.com",
    "phone": "555-5678"
  }'
```

**Kullanıcı silme:**
```bash
curl -X DELETE http://localhost:8080/api/users/{id}
```

## Proje Yapısı

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── restapi/
│   │               ├── RestApiApplication.java
│   │               ├── controller/
│   │               │   └── UserController.java
│   │               ├── model/
│   │               │   └── User.java
│   │               ├── repository/
│   │               │   └── UserRepository.java
│   │               └── service/
│   │                   └── UserService.java
│   └── resources/
│       └── application.properties
└── test/
```

## Teknolojiler

- **Spring Boot 3.2.0**
- **Spring Data MongoDB**
- **Spring Boot Starter Web**
- **Spring Boot Starter Validation**
- **Maven**

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır.
#   r e s t - a p i  
 