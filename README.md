# Estudo de Caso - Sistema de Cadastro para Service Desk em Java

## Visão Geral
Este projeto em Java visa atender às necessidades de uma empresa de Service Desk, fornecendo um sistema simples de cadastro de pessoas. O cadastro é dividido em três categorias: Clientes, Atendentes e Técnicos, cada uma com suas características específicas.

## Funcionalidades

### 1. Clientes
- Código do plano de atendimento (1-service desk local; 2-service desk virtual).
- Como conheceu a empresa.

### 2. Atendentes
- Área de atendimento e suporte (1-hardware; 2-software; 3-hardware e software).
- Serviços de atendimento ao cliente.

### 3. Técnicos
- Regime de contratação (1-CLT; 2-PJ).
- Certificações.

### Informações Armazenadas
## Diagrama de Classes

plantuml
@startuml
class Pessoa {
  - codigo: int
  - nome: String
  - endereco: String
  - email: String
  - telefone: String
}

class Cliente {
  - planoAtendimento: int
  - comoConheceu: String
}

class Atendente {
  - areaAtendimento: int
  - servicosAtendimento: String
}

class Tecnico {
  - regimeContratacao: int
  - certificacoes: String
}

Pessoa <|-- Cliente
Pessoa <|-- Atendente
Pessoa <|-- Tecnico
@enduml


## Objetivo do Projeto
O objetivo principal deste projeto é fornecer uma base para aprendizado em Java, demonstrando a implementação de um sistema de cadastro simples e funcional. Os conceitos abordados incluem estruturas de classe, herança e interação com o usuário.

## Instruções para Execução
1. Certifique-se de ter o ambiente Java configurado.
2. Faça o download do projeto.
3. Compile e execute o arquivo principal do programa.

## Contribuição
Este projeto é destinado a fins educativos. Se você tiver sugestões para melhorias ou correções, sinta-se à vontade para contribuir! Abra uma issue ou envie um pull request.

## Aviso
Este projeto é uma simulação educativa e não reflete completamente as complexidades do mundo real. Foi desenvolvido para fornecer uma introdução ao desenvolvimento em Java.

Divirta-se explorando o código e aprendendo mais sobre Java!
