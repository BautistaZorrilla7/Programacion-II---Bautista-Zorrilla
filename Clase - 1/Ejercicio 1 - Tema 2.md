# Ejercicio 1 - Tema 2: Complejidad Big-O

Análisis de los cuatro fragmentos de la guía[cite: 6]:

- Fragmento (a): imprimir arr[0]
  - Complejidad: O(1)
  - Justificación: Accede de forma directa a una única posición fija, sin importar el tamaño del arreglo[cite: 6].

- Fragmento (b): para i de a n, para j de 0 a n, imprimir i, j
  - Complejidad: O(n^2)
  - Justificación: Tiene bucles anidados que multiplican las repeticiones en función de n[cite: 6].

- Fragmento (c): mientras n > 1, n = n / 2, contador++
  - Complejidad: O(log n)
  - Justificación: En cada paso el valor de n se reduce a la mitad, achicando el margen de operaciones rápidamente[cite: 6].

- Fragmento (d): para i de a n, para j de a n, para k de a n, imprimir i, j, k
  - Complejidad: O(n^3)
  - Justificación: Posee tres bucles anidados consecutivos que dependen directamente de n[cite: 6].