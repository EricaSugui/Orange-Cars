# Orange-Cars :car: :orange_car: : orange:
Repositório do projeto de API-REST para controle de veículos de usuário.

## Primeiro Passo:
Construir um cadastro de usuários.  
- Nome - obrigatório  
- E-mail - único - obrigatório  
- CPF - único - obrigatório  
- Data de Nascimento - obrigatório
## Segundo Passo:
Criar um cadastro de veículos.  
- Marca - obrigatório  
- Modelo do veículo - obrigatório  
- Ano - obrigatório  

O serviço deve consumir a API da FIPE [Site da API](https://deividfortuna.github.io/fipe/) para obter os dados do valor do veículo baseado nas inormações inseridas.
## Terceiro Passo:
Criar um endpoint que retorne um usuário com a lista de todos os seus veículos cadastrados.  
Serão 3 endpoints:  
- Cadastro do Usuário  
- Cadastro do Veículo  
- Listagem dos veículos para um usuário específico  

No endpoint da lista de veículos, devemos considerar algumas configurações a serem exibidas para o usuário final.  
Criar dois novos atributos no objeto do carro:  
- Dia do rodízio desse carro, baseado no ÚLTIMO DÍGITO DO ANO DO VEÍCULO, considerando:
  - Final 0-1: segunda-feira
  - Final 2-3: terça-feira
  - Final 4-5: quarta-feira
  - Final 6-7: quinta-feira
  - Final 8-9: sexta-feira

- Atributo de rodízio ativo, que compara a data atual do sistema com as condicionais anteriores, quando for o dia do rodízio retorna 'true'; caso contrário, 'false'.
  - Exemplo A: Hoje é segunda-feira, o carro é da marca Fiat, modelo Uno do ano de 2001, ou seja, seu rodízio será às segundas-feiras e o atributo de rodízio ativo será 'TRUE'.
  - Exemplo B: Hoje é quinta-feira, o carro é da marca Hyundai, modelo HB20 do ano de 2021, ou seja, seu rodízio será às segundas-feiras e o atributo de rodízio ativo será 'FALSE'.

- Caso os cadastros estejam coretos, é necessário voltar o 'Status 201'. Caso hajam erros de preenchimento de dados, o Status deve ser '400'.
- Caso a busca esteja correta, é necessário voltar o status '200'. Caso haja erro na busca, retornar o status adequado e uma mensagem de erro amigável.

### EOF
Ericabot :)
