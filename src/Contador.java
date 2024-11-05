import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
        
        try{
            int cont = contador(parametroUm, parametroDois);
            for(int j = 0; j < cont; j++){
                System.out.println(j + 1);
            }
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static int contador(int a1, int a2) throws ParametrosInvalidosException {
        if(a2 > a1){
            throw new ParametrosInvalidosException();
        }
        int contador = a1 - a2;

        return contador;
    }

}