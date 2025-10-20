## Ejercicio 6 – Programación Concurrente

Este ejercicio forma parte del módulo **Programación Multiproceso**.  
El objetivo es aprender cómo ejecutar varios procesos a la vez (concurrencia) usando la clase `ProcessBuilder` en Java.

## Descripción

Se crean dos clases:

- **Palabra.java:**  
  Recibe una palabra como argumento y, por cada carácter, muestra la fecha y hora junto con su tipo:  
  si es letra mayúscula, minúscula, número u otro carácter.

- **Principal.java:**  
  Lanza tres procesos que ejecutan la clase `Palabra`, pasando las palabras:
    - `Proceso`
    - `Cocodrilo`
    - `Java16`

Cada proceso genera su salida en un archivo de texto distinto:
- `palabra1.txt`
- `palabra2.txt`
- `palabra3.txt`

De esta manera se puede comprobar que los tres procesos se ejecutan de forma **concurrente**.

## Archivos incluidos

- `src/Palabra.java`
- `src/Principal.java`
- `palabra1.txt`
- `palabra2.txt`
- `palabra3.txt`

## Ejecución

1. Compilar el proyecto en IntelliJ (Build → Build Project).
2. Ejecutar la clase **Principal.java**.
3. Verificar que se crean los tres archivos de texto en la carpeta del proyecto.
4. Abrir los archivos y observar cómo los procesos se ejecutaron al mismo tiempo.

## Ejemplo de salida real

Este es un fragmento de una de las salidas generadas por el programa (archivo `palabra1.txt`):

```2025-10-20T18:42:47.959241 ---- letra mayúscula
2025-10-20T18:42:48.507813600 ---- letra minúscula
2025-10-20T18:42:49.020017500 ---- letra minúscula
2025-10-20T18:42:49.527956900 ---- letra minúscula
2025-10-20T18:42:50.034997900 ---- letra minúscula
2025-10-20T18:42:50.540561200 ---- letra minúscula
2025-10-20T18:42:51.045336800 ---- letra minúscula


Cada línea muestra:
- **la fecha y hora exacta** de ejecución, y
- **el tipo de carácter** analizado por el proceso.

Este resultado confirma que la ejecución se realiza de manera **concurrente**, ya que cada proceso genera su propio archivo de salida con tiempos que se solapan entre si.

## Conclusión

Este ejercicio muestra cómo ejecutar varios programas Java simultáneamente.  
Cada proceso trabaja por separado, pero todos se ejecutan en paralelo, demostrando el funcionamiento básico de la **programación concurrente en Java**.
