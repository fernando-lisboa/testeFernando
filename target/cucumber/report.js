$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/testeApi.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Validar busca de filmes na web",
  "description": "",
  "id": "validar-busca-de-filmes-na-web",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "############################################################################################################"
    },
    {
      "line": 5,
      "value": "# CT01.1 -TESTE DE API"
    },
    {
      "line": 6,
      "value": "############################################################################################################"
    }
  ],
  "line": 7,
  "name": "[Busca web] \"\u003cCenario\u003e\"-\"\u003cDescricaoDoCenario\u003e\"",
  "description": "",
  "id": "validar-busca-de-filmes-na-web;[busca-web]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\"",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 8,
  "name": "que eu efetue um post na url \"\u003curl\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "eu devo validar a mensagen de retorno",
  "keyword": "Entao "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validar-busca-de-filmes-na-web;[busca-web]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";",
  "rows": [
    {
      "cells": [
        "Cenario",
        "DescricaoDoCenario",
        "url"
      ],
      "line": 13,
      "id": "validar-busca-de-filmes-na-web;[busca-web]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;1"
    },
    {
      "cells": [
        "CT01.1",
        "Efetuar post na URL infomrada e verificar o retorno",
        "https://jsonplaceholder.typicode.com/todos/1"
      ],
      "line": 14,
      "id": "validar-busca-de-filmes-na-web;[busca-web]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 14,
  "name": "[Busca web] \"CT01.1\"-\"Efetuar post na URL infomrada e verificar o retorno\"",
  "description": "",
  "id": "validar-busca-de-filmes-na-web;[busca-web]-\"\u003ccenario\u003e\"-\"\u003cdescricaodocenario\u003e\";;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 8,
  "name": "que eu efetue um post na url \"https://jsonplaceholder.typicode.com/todos/1\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "eu devo validar a mensagen de retorno",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "https://jsonplaceholder.typicode.com/todos/1",
      "offset": 30
    }
  ],
  "location": "TesteDeApi.que_eu_efetue_um_post_na_url(String)"
});
formatter.result({
  "duration": 2090350525,
  "status": "passed"
});
formatter.match({
  "location": "TesteDeApi.eu_devo_validar_a_mensagen_de_retorno()"
});
formatter.result({
  "duration": 4354792,
  "status": "passed"
});
});