#language: pt
Funcionalidade: Validar busca de filmes na web

  ############################################################################################################
  # CT01.1 - Busca de filmes
  ############################################################################################################
  Esquema do Cenario: [Busca web] "<Cenario>"-"<DescricaoDoCenario>"
    Dado que eu tenha os nomes dos filmes a ser consultado "<jsonFilmes>"
    E efetue abusca no site do google"<ct>"
    Então tevo ter o resultado de acordo como nome do diretor e do filme

    @CT01.1
    Exemplos: 
      | Cenario | DescricaoDoCenario                      | jsonFilmes    | filme    | ct |
      | CT01.1  | Efetuar busca de filmes Web  - Avangers | cadastro.json | Avangers |  0 |

    @CT01.2
    Exemplos: 
      | Cenario | DescricaoDoCenario                      | jsonFilmes    | filme    | ct |
      | CT01.1  | Efetuar busca de filmes Web  - Avangers | cadastro.json | Avangers |  1 |

    @CT01.3
    Exemplos: 
      | Cenario | DescricaoDoCenario                      | jsonFilmes    | filme    | ct |
      | CT01.1  | Efetuar busca de filmes Web  - Avangers | cadastro.json | Avangers |  2 |
