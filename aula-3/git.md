# Exercicios - GIT #

<ol>
<li><b> Qual o comando para obter a versão instalada do Git? </b></li>
<p>git --version</p>

<li><b> Qual o efeito da execução de cada um dos comandos abaixo? </b>
<ol type="a">
<li><b> git help </b></li>
<p>Exibe uma lista de comandos disponíveis no GIT, além de um pequeno guia para orientar a compreensão da sintaxe usada para executar commandos GIT.</p>

<li><b> git help reset </b></li>
<p>Exibe o guia do GIT para o comando reset, descrevendo qual a utilidade do comando, como ele pode ser utilizado e fornecendo exemplos de sua aplicação.</p>

<li><b> git init </b></li>
<p>Cria um novo repositório GIT vázio dentro do diretório corrente.</p>

<li><b> git add --all </b></li>
<p>Adiciona todos as mudanças no repositório local à <i>staging area</i></p>

<li><b> git add -u </b></li>
<p>Adiciona apenas as remoções e alterações no repositório local à <i>staging area</i>, ignorando novos arquivos.</p>

<li><b> git config -l </b></li>
<p>Lista as configurações presentes no respositório local.</p>

<li><b> git mv a.txt b.txt </b></li>
<p>Renomeia o arquivo <i>a.txt</i> para <i>b.txt</i>, adicionando o segundo ao index e removendo o primeiro.</p>

<li><b> git reset --hard </b></li>
<p>Reverte o ponteiro HEAD para o commit anterior, descartando todas as mudanças existentes na staging area e no diretório de trabalho</p>

<li><b> git log -27 </b></li>
<p>Exibe os 27 ultimos commits</p>
</ol>
</li>


<li><b> O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo? </b></li>
<p>Os arquivos podem ser adicionados utilizando o comando git add <nome do arquivo> para cada arquivo ou o comando git add * para adicionar automaticamente todos os arquivos.</p>
 <p>O commit pode ser realizado utilizando o comando git commit -m "<mensagem do commit>".</p>

<li><b> Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”? </b></li>
<p>git diff HEAD^ HEAD</p>

<li><b> Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, untracked, podem ser exibidos/identificados com que comando? </b></li>
<p>git status</p>

<li><b> Qual o comando para efetuar um commit? </b></li>
<p>git commit</p>

<li><b> Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo? </b></li>
<p>git checkout -- file</p>

<li><b> O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por .gitignore </b></li>
<p>Deve ser criado um arquivo sem nome com a extensão .gitignore na raiz do repositório e dentro dele devem ser inclusos os nomes do arquivos e/ou diretórios que se deseja excluir do controle de versão.</p>

<li><b> O que acontece se o seu repositório local for acidentalmente removido? </b></li>
<p>A cópia local do repositório é perdida, porém ainda é possivel clonar novamente o repositório do repositório central.</p>

<li><b> Como clonar um repositório remoto? </b></li>
<p>git clone <url do repositório></p>

<li><b> Em alguns cenários git log pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
 </b></li>
<p>git log --pretty=oneline</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>

<li><b> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA </b></li>
<p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
<ol>
