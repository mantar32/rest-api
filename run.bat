@echo off
echo Starting Spring Boot Application...
echo.

REM Java sürümünü kontrol et
java -version
if errorlevel 1 (
    echo Java bulunamadı! Lütfen Java'nın yüklü olduğundan ve PATH'te olduğundan emin olun.
    pause
    exit /b 1
)

echo.
echo Compiling application...

REM Basit compile komutu
javac -cp "." -d "target/classes" src/main/java/com/example/restapi/*.java src/main/java/com/example/restapi/controller/*.java src/main/java/com/example/restapi/model/*.java src/main/java/com/example/restapi/repository/*.java src/main/java/com/example/restapi/service/*.java

echo.
echo Starting application on port 8080...
echo MongoDB bağlantısı için MongoDB'nin çalıştığından emin olun.
echo.
echo Press Ctrl+C to stop the application
echo.

java -cp "target/classes" com.example.restapi.RestApiApplication

pause
