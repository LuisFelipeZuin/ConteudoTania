
public class ExercMatriz {

    public static void main (String[] args) {
            

        int [] [] botoesXcamisa = {{3,1,3},{6,5,5}};      
        int [] [] camisasXmes = {{100,50},{50,100},{50,50}};
        int [] [] botoesXmeses = new int [2][2];
        
        for (int i =0;i<2;i++){
            for (int j=0;j<2;j++){
                for (int k=0;k<3;k++){
                botoesXmeses[i][j] += botoesXcamisa[i][k] * camisasXmes[k][j];  
            
             }
        }
    }
        
    System.out.println("Matriz resultante:");
    System.out.println(" "); 
     for (int i =0;i<2;i++){
          for (int j=0;j<2;j++){
            System.out.print(botoesXmeses[i][j] + " " );      
          }
        }         
      }    
     }