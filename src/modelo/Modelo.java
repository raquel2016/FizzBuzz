/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Raquel Lugo
 */
public class Modelo {
    
     public void fizzBuzz() {
        
        for(int i=1; i <= 100; i++){
            String aux = "";
          
            if(divisible3(i)){ aux ="Fizz"; }
              if(divisible5(i)){ aux += "Buzz"; }
                if(aux.length()==0 ){ aux = String.valueOf(i);}
            
            System.out.println(aux);
        } 
    }
    
    public boolean divisible3(int num){
       return (num % 3 == 0) ;
    }
    
    public boolean divisible5(int num){
       return (num % 5 == 0) ;
    }
    
}
