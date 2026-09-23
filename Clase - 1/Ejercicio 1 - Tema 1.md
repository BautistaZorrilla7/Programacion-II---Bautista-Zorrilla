# Ejercicio 1: Número Primo

## Análisis
Un número primo es un número entero mayor a 1 que solo se puede dividir por 1 y por sí mismo. Para averiguar si un número es primo, hay que comprobar si tiene algún divisor exacto entre 2 y ese número menos uno. 
* Restricciones: Los números menores o iguales a 1 (0, 1 y negativos) no se consideran primos.

## Pseudocódigo
Algoritmo esPrimo
    Leer n
    Si n <= 1 Entonces
        Escribir "No es primo"
    Sino
        Definir primo como Verdadero
        Para i desde 2 hasta n - 1
            Si n MOD i == 0 Entonces
                primo = Falso
            FinSi
        FinPara
        Si primo Entonces
            Escribir "Es primo"
        Sino
            Escribir "No es primo"
        FinSi
    FinSi
FinAlgoritmo

## Casos de prueba
* **Caso 1 (Normal - Primo):** Entrada: `7`. Resultado esperado: Es primo (no encuentra divisores entre 2 y 6).
* **Caso 2 (Normal - No primo):** Entrada: `4`. Resultado esperado: No es primo (4 es divisible por 2).
* **Caso 3 (Límite positivo):** Entrada: `2`. Resultado esperado: Es primo (caso base límite).
* **Caso 4 (Límite 1):** Entrada: `1`. Resultado esperado: No es primo (entra en la validación inicial de $\le 1$).
* **Caso 5 (Límite 0):** Entrada: `0`. Resultado esperado: No es primo.
* **Caso 6 (Error / Negativo):** Entrada: `-5`. Resultado esperado: No es primo / número no válido.