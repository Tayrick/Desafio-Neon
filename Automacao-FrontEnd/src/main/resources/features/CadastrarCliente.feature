#language: pt
#encoding: UTF-8
Funcionalidade: Cadastrar novo cliente

  Contexto: 
    Dado que o usuario tenha dado as permissoes ao aplicativo

  @CadastrarNovoCliente
  Esquema do Cenario: Adicionar novo cliente
    Quando o usuario clicar no botao com o simbolo de + na tela
    E clicar na opcao "Cadastrar novo"
    E informar o nome <nome>
    E informar o RG <rg>
    E informar o CPF <cpf>
    E informar a data de nascimento <dataNascimento>
    E informar o endereco <endereco>
    E informar o numero <numero>
    E informar o bairro <bairro>
    E informar o cep <cep>
    E informar a cidade <cidade>
    E selecionar o estado <estado>
    E informar o telefone <telefone1>
    E informar o email <email>
    E clicar no botao Salvar
    Entao deve ser exibido a mensagem "Cadastro efetuado com sucesso"

    Exemplos: 
      | nome           | rg          | cpf           | dataNascimento | endereco            | numero | bairro                | cep        | cidade         | estado | telefone1    | email                                 |
      | "Thales Fabio" | "370960749" | "76623310916" | "11042002"     | "Rua Jardim Bonito" | "555"  | "Jardim Centro Oeste" | "79073185" | "Campo Grande" | "MS"   | "6728197555" | "thales-barbosa93@tokiomarine.com.br" |

  @ValidarTiposCadastros
  Cenario: Validar opcao cadastro Basico e Completo
    Quando o usuario clicar no botao com o simbolo de + na tela
    E clicar na opcao "Cadastrar novo"
    Entao deve ser exibido as opcoes "Básico" e "Completo"

  