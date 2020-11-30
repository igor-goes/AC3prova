#!/bin/bash

echo "Verificando se possue java"

which java | grep /bin/java

if [[ $? = 0 ]]
	then
	echo "Java encontrado"
	echo "Executando arquivo do projeto"
	java -jar projeto-ac3-1.0-SNAPSHOT-jar-with-dependencies.jar
else	
	echo "Java não encontrado"
	echo "Instalando o java"
	sudo apt install curl
	curl -s "https://get.sdkman.io" | bash
	source "$HOME/.sdkman/bin/sdkman-init.sh"
	sdk install java 8.0.275.j9-adpt
	echo "Executando arquivo do projeto"
	java -jar projeto-ac3-1.0-SNAPSHOT-jar-with-dependencies.jar	 	
fi


