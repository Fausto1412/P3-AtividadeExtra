# Atividade extra - Programação 3

## Utilizado
- `java.util.regex.Pattern`, usado para verificar se as expressões regulares estão corretas.

## Dependências
- JDK 16 ou superior;
- Maven 3 ou superior;
- SQLite (requisitado no `pom.xml`).

## Instalação
- Vá ao diretório do projeto e execute o comando: `mvn clean install`;
- Se tudo der certo, o projeto será instalado em `target/`;

## Utilização Prática
- Crie uma regra do tipo String para verificar se a expressão regular esta correta. Exemplo: "a[a]*b{1,2}", "a[a]+[b]+" e "(?:[ab]{4})+"
- Os sinais usados nos exemplos são comandos que podem ser achados nesse site: https://www.devmedia.com.br/iniciando-expressoes-regulares/6557
- Depois de criar a String usar o comando Pattern.matches(Regra, String a ser verificada), que retorna boolean
- Em caso da String estiver na regra vai retornar True e caso não estiver ele vai retornar False

##Questões Utilizadas como exemplo
- 1º) Começam com aa;
- 2º) Não terminam com bbb;
- 3º) Contém a subcadeia aabbb;
- 4º) Possuem comprimento maior ou igual a 3;
- 5º) Possuem comprimento diferente de 3;
- 6º) Possuem comprimento par;
- 7º) Possuem comprimento ímpar;
- 8º) Possuem comprimento múltiplo de 4;
- 9º) Possuem quantidade par de símbolos a;
- 10º) Possuem quantidade ímpar de símbolos b.
