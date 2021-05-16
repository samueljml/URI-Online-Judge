#include <stdio.h>
#include <math.h>

int main (){
	int qtd,i,j,num,total;
	int bd[10]={6,2,5,5,4,5,6,3,7,6};
	char n[1000000];
	
	scanf("%d ", &qtd);
	
	while(qtd--)
	{
		scanf("%s", &n);
		total=0;
		
		for(i=0;n[i]!='\0';i++)
		{
			num = n[i] - '0';
			for(j=0;j<10;j++)
			{
				if(num == j){
					total += bd[j];
					break;
				}
			}
			
		}
		printf("%d leds\n", total);
	}
	
	return 0;
}