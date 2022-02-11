

package caixaloja;

// aluno:brendow cavalcante
// cesmac 
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.util.Scanner;

public class CaixaLoja {

    
   
    public static void main(String[] args) {
               Scanner scan=new Scanner(System.in);
               boolean LoginCorreto = false;
               int valor;
               int valor2;
               
              
     
          while(LoginCorreto != true){
               // cores de fundo da caixa de login e senha
                  UIManager UI=new UIManager(); 
            UIManager.put("OptionPane.background", Color.YELLOW);
            UIManager.put("OptionPane.messagebackground", Color.YELLOW);
            UIManager.put("Panel.background", Color.YELLOW);
               
                // login e senha
             JLabel labe2 = new JLabel("Login:");
             JTextField bcn= new JTextField();
              
             JLabel labe0 = new JLabel("Senha:");
             JPasswordField jpf = new JPasswordField();
             
             
              JOptionPane.showConfirmDialog(null,
             new Object []{labe2,bcn,labe0,jpf}, "  * CAIXA DA LOJA MACEIÓ *  ",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
              
              String logindigitado = new String(bcn.getText());
              String senhadigitada = new String(jpf.getPassword());
            
          

           // caso as credenciais sejam corretas
        if(logindigitado.equals("brendowcavalcante") && senhadigitada.equals("147258")){
           System.out.println("O login foi realizado com sucesso!");
           LoginCorreto = true; 
           break; 
         }
          else{  //caso as credenciais sejam incorretas
           System.out.println("Login ou senha incorreta, tente novamente.");
          }
        }

            System.out.println("Você está logado... bom trabalho!");
             
              
                  // aréa do valor e pagamento
              System.out.println("QUAL O VALOR DA VENDA?");
              valor=scan.nextInt();
              System.out.printf("Seu valor de venda é: %d %n %n",valor);
              
              System.out.println("SELECIONE A FORMA DE PAGAMENTO:");
              String[] pagamento=new String[5];
              
              pagamento[0]="Cartão de crédito";
              pagamento[1]="Cartão de débito";
              pagamento[2]="PIX";
              pagamento[3]="Sair";
              System.out.println("[0]Cartão de crédito\n[1]Cartão de débito\n[2]PIX\n[3]Sair");
              System.out.print("Selecione aqui:");
              valor2=scan.nextInt();
              
              if(valor2==0){
                  // cartão de crédito = não acréscimo e nem decréscimo
                   System.out.printf("Valor a pagar:%d %n", valor);
               }else if(valor2==1){
                   // débito = terá desconto de 2,5%   
                   System.out.printf("Valor a pagar:%d %n", (valor-25));
               }else if(valor2==2){
                   // pix = terá desconto de 5%
                   System.out.printf("Valor a pagar:%d %n", (valor-50));
               }else if(valor2==3){
                   // sair
                     System.out.println("Sessão encerrada!");
               }
              
            
             
              
              
              
               
        
        
    }
    
}
