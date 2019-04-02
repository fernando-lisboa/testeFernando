#language: pt
Funcionalidade: Validar busca de filmes na web

  ############################################################################################################
  # CT01.1 -TESTE DE API
  ############################################################################################################
  Esquema do Cenario: [Busca web] "<Cenario>"-"<DescricaoDoCenario>"
    Dado que eu efetue um post na url "<url>"
    Entao eu devo validar a mensagen de retorno

    @CT01.1
    Exemplos: 
      | Cenario | DescricaoDoCenario                                  | url                                          |
      | CT01.1  | Efetuar post na URL infomrada e verificar o retorno | https://jsonplaceholder.typicode.com/todos/1 |
