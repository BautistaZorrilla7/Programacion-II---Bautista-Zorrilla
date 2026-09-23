# Ejercicio 2 - Tema 2: Detección de duplicados en un arreglo

## Algoritmo 1: Fuerza Bruta
Consiste en comparar cada elemento del arreglo con todos los demás mediante bucles anidados, sin usar estructuras auxiliares.

- Pseudocódigo:
  Para i desde 0 hasta N - 1
      Para j desde i + 1 hasta N - 1
          Si arr[i] == arr[j] Entonces
              Retornar "Tiene duplicados"
          FinSi
      FinPara
  FinPara

- Complejidad: O(n^2) (Cuadrática).

## Algoritmo 2: Ordenar y recorrer
Consiste en ordenar primero el arreglo de menor a mayor y luego recorrerlo una sola vez comparando elementos contiguos.

- Pseudocódigo:
  Ordenar(arr)
  Para i desde 0 hasta N - 2
      Si arr[i] == arr[i + 1] Entonces
          Retornar "Tiene duplicados"
      FinSi
  FinPara

- Complejidad: O(n log n) (Dominada por el ordenamiento).

## Justificación para 1.000.000 de elementos
Para un arreglo de 1.000.000 de elementos, **es preferible el segundo algoritmo (ordenar y recorrer)**[cite: 4]. 
La fuerza bruta O(n^2) requeriría alrededor de un billón de operaciones ($10^{12}$), lo cual tardaría muchísimo tiempo o bloquearía la PC. En cambio, O(n log n) reduce drásticamente las operaciones a unos pocos millones, resolviéndose en un par de segundos.