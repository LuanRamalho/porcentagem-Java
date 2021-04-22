import java.util.Scanner;
public class Porcentagem 
{
    Scanner ler = new Scanner(System.in);
    
    void Acréscimo_Percentual() 
    {
        int i = 1;
        double num, P, R;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
            System.out.println("Digite o valor do acréscimo/decréscimo percentual: "); 
            P = ler.nextDouble();
            R = num + (num * P) / 100;

            System.out.println("");
            System.out.printf("Resultado: %.2f", R);

            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            i = ler.nextInt();
        }
    }
    
    void Valor_Percentual() 
    {
        int i = 1;
        double num1, num2, R;
        while(i>0)
        {
            System.out.println("Digite o 1º/2º número: ");
            num1 = ler.nextDouble();
            System.out.println("Digite o 2º/2º número: ");
            num2 = ler.nextDouble();
            R = (num1 / num2) * 100;

            System.out.println("");
            System.out.printf("Resultado: %.2f%%" , R);

            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            i = ler.nextInt();
        }
    }
    
    void Valor_Numérico() 
    {
        int i = 1;
        double num, P, R;
        while(i>0)
        {
            System.out.println("Digite um número qualquer: ");
            num = ler.nextDouble();
            System.out.println("Digite o valor do percentual: "); 
            P = ler.nextDouble();
            R = (num * P) / 100;

            System.out.println("");
            System.out.printf("Resultado: %.2f" , R);

            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            i = ler.nextInt();
        }
    }
    

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        Porcentagem a =  new Porcentagem();
        int op;
        System.out.println("Digite 1 para fazer Acréscimo/Descrécimo percentual: ");
        System.out.println("Digite 2 para descobrir o valor percentual: ");
        System.out.println("Digite 3 para descobrir o valor do número de acordo com a percentagem : ");
        op = ler.nextInt();
        if (op==1)
            a.Acréscimo_Percentual();
        if (op==2)
            a.Valor_Percentual();
        if (op==3)
            a.Valor_Numérico();

    }
    
}
