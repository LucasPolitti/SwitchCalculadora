public class Switch {

    public static void main(String[] args) {

        int posicao=5;
        int n1, n2, res;
        String op="+";

        n1=5; n2=10;

        
        
      /*  if(posicao == 1){

          }else if(posicao==2){

        } */



        switch(op){
            
            case "+":
            res=n1+n2;
            break;

            case "-":
            res=n1-n2;
            break;

            case "*":
            res=n1*n2;
            break;

            case "/":
            res=n1/n2;
            break;

            default:
            res=0;
            System.out.printf("%s%n", "Operação inválida");
            break;

        }

        System.out.printf("Operação: %s : resultado %d%n",op,res);
    }
}