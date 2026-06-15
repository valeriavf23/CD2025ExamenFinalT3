# Exercicio: Probas unitarias dunha clase

O proxecto ten unha clase que permite xestionar contas bancarias.

## Tarefas

1. Crea unha clase de probas chamada `CuentaBancariaTest`.

2. Implementa probas unitarias con JUnit 5 para comprobar o correcto funcionamento da clase.

3. As probas deben cubrir:

   * creación correcta dunha conta bancaria
   * ingreso válido
   * ingreso cunha cantidade negativa
   * ingreso cunha cantidade 0
   * retirada válida
   * retirada utilizando parte do límite de descuberto
   * retirada superior ao saldo dispoñible
   * retirada cunha cantidade negativa
   * retirada cunha cantidade 0
   * cálculo correcto do saldo dispoñible

4. Engade tamén probas de valores límite utilizando:

   * `saldo = 0`
   * `saldo = Double.MAX_VALUE`

5. Entrega:

* Captura da execución das probas en **Maven** en `/docs`.
* Captura do informe de JaCoCo cunha cobertura do 100% en `/docs`.
* Explicación do feito no ficheiro `explicacion.md` en `/docs`.