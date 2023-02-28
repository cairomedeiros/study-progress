# Comandos básicos do git

### ````git init````
- Comando que criará uma subpasta para lidar com o versionamento de código
### ````git clone````
- Clona um repositório para a máquina local
### ````git add````
- Diz ao git quais alterações serão monitoradas para serem salvar na área de staging
### ````git status````
- Verifica o status dos arquivos, aqui você consegue ver suas alterações
### ````git commit````
- Salva os arquivos na área de staging, podendo adicionar um comentário utilizando a flag ````git commit -m "fix: ..." ````
### ````git diff````
- Serve para verificar as mudanças e comparar com o arquivo anteriormente
### ````git log````
- Ao clonar um repositório, com o uso deste comando você tem acesso ao histórico de commits
### ````git commit --amend````
- Após o git commit se você esquecer de adicionar alguma outra alteração você pode "commitar" com a flag --amend, ou seja ele permite que você combine alterações preparadas com o commit anterior em vez de criar um novo commit
### ````git reset HEAD <file>````
- Caso queira tirar da área de stage que é após o git add, basta usar esse comando para unstage a alteração
- Se você apenas modificou o arquivo e não executou git add, esse comando vai retirar as alterações do arquivo
- Ele atualiza a branch, removendo ou adicionando commits, essa operação muda o histórico de commits
### ````git restore --staged <file>/git restore <file>````
- Esse comando não atualiza a sua branch
- Modo de uso parecido com git reset
