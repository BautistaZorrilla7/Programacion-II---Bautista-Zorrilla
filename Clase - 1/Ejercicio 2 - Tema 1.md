# Ejercicio 2: Clasificación de triángulos

## Análisis y error encontrado
El pseudocódigo original clasifica los triángulos según sus lados[cite: 6], pero tiene una falla lógica importante: **no valida si los valores ingresados realmente pueden formar un triángulo**[cite: 6]. 
* **Caso de fallo:** Si ingresamos por ejemplo `a = 1`, `b = 2` y `c = 10`, el algoritmo va a evaluar los condicionales y va a terminar diciendo que es "Escaleno", cuando en la realidad geométrica esos lados no pueden formar un triángulo (la suma de dos lados siempre tiene que ser mayor al tercer lado).

## Pseudocódigo corregido
Algoritmo clasificarTriangulo
    Leer a, b, c
    
    // Validamos primero la desigualdad triangular
    Si (a + b > c) Y (a + c > b) Y (b + c > a) Entonces
        Si a == b Y b == c Entonces
            Escribir "Equilátero"
        Sino Si a == b O b == c O a == c Entonces
            Escribir "Isósceles"
        Sino
            Escribir "Escaleno"
        FinSi
    Sino
    Escribir "No es un triángulo válido"
    FinSi
FinAlgoritmo