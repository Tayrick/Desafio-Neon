#language: pt
#encoding: UTF-8
Funcionalidade: Deletar Cliente

  Contexto: 
    Dado que o usuario tenha dado as permissoes ao aplicativo
    
@ExcluirCliente
  Esquema do Cenario: Deletar cliente cadastrado
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
    E clicar no botao Ok
    E voltar para a tela inicial do aplicativo
    E clicar no cliente que deseja excluir
    E clicar no botao excluir
    E confirmar a exclusao do cliente
    Entao ele nao deve mais ser exibido na tela inicial do aplicativo

    Exemplos: 
      | nome               | rg          | cpf           | dataNascimento | endereco    | numero | bairro              | cep        | cidade         | estado | telefone1    | email                                         |
      | "Isadora Oliveira" | "424374705" | "20411801104" | "03052001"     | "Rua Bagda" | "563"  | "Jardim Presidente" | "79014050" | "Campo Grande" | "MS"   | "6738425542" | "juliana_esther_caldeira@systemsadvisers.com" |
