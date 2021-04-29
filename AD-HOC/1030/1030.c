#include <stdio.h>
#include <stdlib.h>

typedef struct no_duplo{
	int info;
	struct no_duplo * proximo;
	struct no_duplo * anterior;
} No_Duplo;

typedef struct {
	No_Duplo * primeiro;
} lista_dupla;

void inicia_lista_dupla(lista_dupla * ld){
	ld->primeiro = NULL;
}

int lista_dupla_vazia(lista_dupla * ld){
	return !ld->primeiro;
}

No_Duplo * cria_no_duplo (int i){
	No_Duplo * nd = (No_Duplo *) malloc(sizeof(No_Duplo));
	if(nd){
		nd->proximo = nd;
		nd->anterior = nd;
		nd->info = i;
	}
	return nd;
}

int insere_fim_dupla(int i, lista_dupla * ld){
	No_Duplo * novo = cria_no_duplo(i);
	if(novo){
		if(!lista_dupla_vazia(ld)){
			novo->anterior = ld->primeiro->anterior;
			novo->proximo = ld->primeiro;
			novo->anterior->proximo = novo;
			novo->proximo->anterior = novo;
		}
		else{
			ld->primeiro=novo;
		}
		return 1;
	}
}

int remove_inicio_dupla(int * i,lista_dupla *ld){
	No_Duplo * aux;

	if(lista_dupla_vazia) return 0;

	*i = ld->primeiro->info;
	aux = ld->primeiro;

	if(ld->primeiro == ld->primeiro->proximo) // tem um só
		ld->primeiro = NULL;

	else{
		ld->primeiro->anterior->proximo = ld->primeiro->proximo;
		ld->primeiro->proximo->anterior = ld->primeiro->anterior;
		ld->primeiro = ld->primeiro->proximo;
	}
	free(aux);
	return 1;
}

int remove_fim_dupla(int *i,lista_dupla *ld){
	No_Duplo * aux;

	if(lista_dupla_vazia) return 0;

	*i = ld->primeiro->anterior->info;
	aux = ld->primeiro->anterior;

	if(ld->primeiro == ld->primeiro->proximo) // tem um só
		ld->primeiro = NULL;

	else{
		ld->primeiro->anterior->anterior->proximo = ld->primeiro;
		ld->primeiro->anterior = ld->primeiro->anterior->anterior;
	}
	free(aux);
	return 1;
}

No_Duplo * retira_meio_dupla(lista_dupla * ld, No_Duplo * n){
	No_Duplo * aux;
	aux = n->proximo;
	
	if(ld->primeiro == n){
		ld->primeiro = aux;
	}
	n->proximo->anterior = n->anterior;
	n->anterior->proximo = n->proximo;
	free(n);
	return aux;
}

int main (){
	int qtd_testes,qtd_pessoas,pulo,i, quantidade_de_mortes, aux_do_print=1;
	int * pessoa_que_morreu, val_aleatorio;
	No_Duplo * campo;
	lista_dupla * ld = (lista_dupla*) malloc (sizeof(lista_dupla));

	scanf("%d", &qtd_testes);

	while(qtd_testes--){
		
		scanf("%d%d", &qtd_pessoas, &pulo);
		quantidade_de_mortes = 0;

		// Iniciando Lista dupla
		inicia_lista_dupla(ld);

		//Criando um loop para adicionar totas as pessoas com seus respectivos numeros
		for(i=1; i <= qtd_pessoas ;i++)
			insere_fim_dupla(i, ld); //Inserindo sempre no fim, para manter a sequencia			
		
		campo = ld->primeiro; //Pega o endereço do Primeiro nó
		
		while(quantidade_de_mortes < qtd_pessoas-1){ //até restar somente 1
           
            for(i=0; i<pulo-1; i++){
            	campo = campo->proximo;
			}
			campo = retira_meio_dupla(ld, campo);
			quantidade_de_mortes++;
		}

		printf("Case %d: %d\n", aux_do_print++, ld->primeiro->info);
		remove_inicio_dupla(&i,ld);
	}
	return 0;
}
