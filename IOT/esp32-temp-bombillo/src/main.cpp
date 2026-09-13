#include <Arduino.h>
#include <DHT.h>

// --- Profe ahí esta bombillo y sensor de temperatura ---
// --- Configuración de pines ---
#define DHTPIN 4      
#define DHTTYPE DHT22
#define LED_PIN 2        

// --- Parámetros del circuito ---
const float TEMP_UMBRAL = 20.0;  // Temperatura (°C) a partir de la cual se enciende el bombillo, 20.0 para que el bombillo encienda por temperatura alta, 28.0 estandar

DHT dht(DHTPIN, DHTTYPE);

void setup() {
  Serial.begin(115200);
  pinMode(LED_PIN, OUTPUT);
  digitalWrite(LED_PIN, LOW);

  dht.begin();

  Serial.println("=================================================");
  Serial.println(" Sistema de monitoreo de temperatura - ESP32");
  Serial.println(" Sensor: DHT22 | Actuador: Bombillo (LED + R)");
  Serial.println("=================================================");
}

void loop() {
  delay(2000); // El DHT22 necesita al menos 2s entre lecturas

  float temperatura = dht.readTemperature();
  float humedad = dht.readHumidity();

  if (isnan(temperatura) || isnan(humedad)) {
    Serial.println("Error: no se pudo leer el sensor DHT22");
    return;
  }

  Serial.print("Temperatura: ");
  Serial.print(temperatura);
  Serial.print(" °C  |  Humedad: ");
  Serial.print(humedad);
  Serial.println(" %");

  if (temperatura > TEMP_UMBRAL) {
    digitalWrite(LED_PIN, HIGH);
    Serial.println(">> Bombillo ENCENDIDO (temperatura alta)");
  } else {
    digitalWrite(LED_PIN, LOW);
    Serial.println(">> Bombillo apagado");
  }

  Serial.println("-------------------------------------------------");
}
