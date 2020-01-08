#include <stdio.h>

int main()
{
	int testes, i, j, desloca;
	char c[51];
	
	scanf("%d", &testes);
	
	for(i=0;i<testes;i++)
	{
		scanf("%s", c);
		do
		{
			scanf("%d", &desloca);
		}
		while(desloca < 0 || desloca >25);
		for(j=0;c[j] != '\0';j++)
		{
			c[j] = c[j] - desloca;
			if(c[j] < 65)
			{
				c[j] += 26;
			}
			
		}
		for(j=0;c[j] != '\0';j++)
		{
			printf("%c", c[j]);
		}
		printf("\n");
	}
	
	return 0;
}
