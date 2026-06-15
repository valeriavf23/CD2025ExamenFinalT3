# Exercicio: Probas unitarias dun método

O proxecto ten unha clase cun método que permite comprobar se un número é perfecto.
Un **número perfecto** é un número enteiro positivo que é igual á suma dos seus divisores positivos propios, é dicir, todos os divisores excepto el mesmo.

### Exemplos

* **6** é un número perfecto porque os seus divisores propios son:

  ```
  1, 2, 3
  ```

  e:

  ```
  1 + 2 + 3 = 6
  ```

* **28** tamén é un número perfecto porque os seus divisores propios son:

  ```
  1, 2, 4, 7, 14
  ```

  e:

  ```
  1 + 2 + 4 + 7 + 14 = 28
  ```

Polo tanto, un número é perfecto cando a suma de todos os seus divisores propios coincide co propio número.


## Tarefas

1. Crea unha clase de probas chamada `NumeroPerfectoTest`.

2. Implementa probas unitarias con JUnit 5 para comprobar o correcto funcionamento do método `esPerfecto`.

3. As probas deben cubrir:

   * números negativos
   * o valor 0
   * o valor 1
   * un número perfecto
   * outro número perfecto maior
   * un número non perfecto maior que 1

4. Engade tamén probas de valores límite utilizando:

   * `Integer.MIN_VALUE`
   * `Integer.MAX_VALUE`

5. Entrega:

- Captura da execución das probas en **Maven** en `/docs`.
- Captura do informe de JaCoCo cunha cobertura do 100% en `/docs`.
- Explicación do feito no ficheiro `explicacion.md` en `/docs`.