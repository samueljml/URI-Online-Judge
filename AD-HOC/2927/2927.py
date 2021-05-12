qtdAlunos, qtdComputadores, qtdComputadoresQueimados, qtdComputadoresSemCompilador = map(int, input().split())
qtdComputadoresFuncionais = qtdComputadores - qtdComputadoresQueimados - qtdComputadoresSemCompilador

if(qtdComputadoresFuncionais <= qtdAlunos):
    if(qtdComputadoresQueimados > qtdComputadoresSemCompilador/2):
        print("Caio, a culpa eh sua!")
    else:
        print("Igor bolado!")
else:
    print("Igor feliz!")