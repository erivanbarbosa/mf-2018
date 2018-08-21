
# Linha de Comandos #

### Comando 1 ###
pwd
### Resultado 1 ###
<pre>
/home/aluno
</pre>
<hr>

### Comando 2 ###
/home/aluno
### Resultado 2 ###
<pre>
Diretorio "teste" criado em "/home/aluno"
</pre>
<hr>

### Comando 3 ###
ls
### Resultado 3 ###
<pre>
Android                   Downloads     node_modules       Vídeos
AndroidStudioProjects     ex6           package-lock.json  VirtualBox VMs
Área de Trabalho          IdeaProjects  PC2                workspace
BDIanBadan                Imagens       prog
BonitaBPMCommunity-7.3.1  Modelos       Público
Documentos                Música        teste
</pre>
<hr>

### Comando 4 ###
cd teste
### Resultado 4 ###
<pre>
~/teste$
</pre>
<hr>

### Comando 5 ###
pwd
### Resultado 5 ###
<pre>
/home/aluno/teste
</pre>
<hr>

### Comando 6 ###
mkdir novo-dir
### Resultado 6 ###
<pre>
Diretorio "novo-dir" criado em "/home/aluno/teste"
</pre>
<hr>

### Comando 7 ###
ls -l
### Resultado 7 ###
<pre>
total 4
drwxrwxr-x 2 aluno aluno 4096 Ago 20 21:05 novo-dir
</pre>
<hr>

### Comando 8 ###
cd ..
### Resultado 8 ###
<pre>
Retonardo ao diretorio "/home/aluno"
</pre>
<hr>

### Comando 9 ###
<pre>
ls -lt
</pre>
<hr>

### Resultado 9 ###
<pre>
total 100
drwxrwxr-x 3 aluno aluno 4096 Ago 20 21:05 teste
drwxr-xr-x 2 aluno users 4096 Jul 13 19:22 Área de Trabalho
drwxr-xrwx 2 aluno users 4096 Jul 13 19:01 Downloads
drwxr-xr-x 6 aluno users 4096 Jun 18 14:21 Documentos
drwsr-xr-x 4 aluno users 4096 Jun 14 20:27 VirtualBox VMs
drwxrwxr-x 2 aluno aluno 4096 Jun 11 12:57 PC2
-rwxrwxr-x 1 aluno aluno 8664 Mai 15 20:19 ex6
-rwxrwxr-x 1 aluno aluno 8720 Mai  7 15:36 prog
-rw-rw-r-- 1 aluno aluno 1871 Abr 23 21:59 BDIanBadan
drwxr-xr-x 2 aluno users 4096 Abr 17 21:05 Música
-rw-rw-r-- 1 aluno aluno   27 Dez 22  2017 package-lock.json
drwxrwxr-x 3 aluno aluno 4096 Dez 22  2017 node_modules
drwxrwxr-x 3 aluno users 4096 Ago  4  2017 AndroidStudioProjects
drwxrwxr-x 9 aluno users 4096 Abr  3  2017 BonitaBPMCommunity-7.3.1
drwxrwxr-x 4 aluno users 4096 Abr  3  2017 IdeaProjects
drwxr-xr-x 3 aluno users 4096 Mar 14  2017 Imagens
drwxrwxr-x 5 aluno users 4096 Jan 17  2017 workspace
drwxrwxr-x 3 aluno users 4096 Jan 16  2017 Android
drwxr-xr-x 2 aluno users 4096 Mai 30  2016 Modelos
drwxr-xr-x 2 aluno users 4096 Mai 30  2016 Público
drwxr-xr-x 2 aluno users 4096 Mai 30  2016 Vídeos
</pre>
<hr>

### Comando 10 ###
rm -fr diretorio
### Resultado 10 ###
<pre>
 Diretório "home/aluno/teste" removido
</pre>
<hr>

### Comando 11 ###
cp package-lock.json package-lock-copy.json
### Resultado 11 ###
<pre>
Android                   Downloads     node_modules            Vídeos
AndroidStudioProjects     ex6           package-lock-copy.json  VirtualBox VMs
Área de Trabalho          IdeaProjects  package-lock.json       workspace
BDIanBadan                Imagens       PC2
BonitaBPMCommunity-7.3.1  Modelos       prog
Documentos                Música        Público
</pre>
<hr>

### Comando 12 ###
less "Hello World"

### Resultado 12 ###
<pre>
Hello World!
Hello\ World (END)
</pre>
<hr>

### Comando 13 ###
find . -name "Hello World"
### Resultado 13 ###
<pre>
./Hello World
</pre>
<hr>

### Comando 14 ###
export MEU_NOME=Erivan

### Resultado 14 ###
<pre>
Varivel "MEU_NOME" criada
</pre>
<hr>


### Comando 15 ###
echo $MEU_NOME

### Resultado 15 ###
<pre>
Erivan
</pre>
<hr>

### Comando 16 ###
echo $?

### Resultado 16 ###
<pre>
0
</pre>
<hr>

### Comando 17 ###
expr 20 + 35

### Resultado 17 ###
<pre>
55
</pre>
<hr>

### Comando 18 ###
echo $0

### Resultado 18 ###
<pre>
bash
</pre>
<hr>


### Comando 19 ###
echo $SHELL

### Resultado 19 ###
<pre>
/bin/bash
</pre>
<hr>

### Comando 20 ###
curl http://ifconfig.co
### Resultado 20 ###
<pre>
200.137.197.69
</pre>
<hr>

### Comando 21 ###
curl http://ifconfig.co/country

### Resultado 21 ###
<pre>
Brazil
</pre>
<hr>

### Comando 22 ###
curl http://ifconfig.co/city

### Resultado 22 ###
<pre>
Senador Canedo (O comando respondeu isso)
</pre>
<hr>


### Comando 23 ###
vi

### Resultado 23 ###
<pre>
 VIM - Vi IMproved                                
~                                                                               
~                               version 7.4.1689                                
~                           by Bram Moolenaar et al.                            
~           Modified by pkg-vim-maintainers@lists.alioth.debian.org             
~                 Vim is open source and freely distributable                   
~                                                                               
~                        Help poor children in Uganda!                          
~                type  :help iccf<Enter>       for information                  
~                                                                               
~                type  :q<Enter>               to exit                          
~                type  :help<Enter>  or  <F1>  for on-line help                 
~                type  :help version7<Enter>   for version info                 
~                                                                               
~                        Running in Vi compatible mode                          
~                type  :set nocp<Enter>        for Vim defaults                 
~                type  :help cp-default<Enter> for info on this         
</pre>
<hr>
