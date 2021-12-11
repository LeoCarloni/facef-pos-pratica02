# facef-pos-pratica02
Projeto da atividade 02 da aula de Fundamentos das Técnicas e Práticas de Desenvolvimento - Pós graduação

● TDD - Prática de Testes Unitários e Mocks;

● Containers


## Setup
* java 11
* maven

## Execução
`mvn compile`

## Testes
`mvn test`

## Geração jar
`mvn clean package`

## Gerar imagem
`docker build -t nome:version .`

Fundamentos das Técnicas e Práticas de Desenvolvimento

Atividade 02

1. Crie repositório no github;
2. Crie um projeto Java com Maven (groupId: br.edu.unifacef; artifactId: atividade);
3. Escolha um assunto para projetar funcionalidades simples (por
exemplo: venda, conta corrente, comissões, etc)
4. Para o assunto escolhido crie 5 funcionalidades hipotéticas, no mínimo,
para operações, que contenham alguma lógica. A estrutura deverá conter 5 classes de camada business;
5. Crie classe main para execução das operações;
6. Para cada componente, crie ao menos 3 cenários de testes com mock.
7. Crie um Dockerfile para transformar o projeto em uma imagem Docker.
8. No arquivo Readme.md, coloque o passo a passo para a geração da imagem.
Inclua os seguintes prints (da sua máquina mesmo):

  ● comando e saída da geração da imagem docker;

  ● comando para criação/execução do container do projeto e suarespectiva saída no console.
