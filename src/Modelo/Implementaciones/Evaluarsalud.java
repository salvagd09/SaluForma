
package Modelo.Implementaciones;

import Modelo.Interfaces.Evaluar_Estado_Nutricional;
import Modelo.Interfaces.Hallar_IMC;
import Modelo.Interfaces.Metabolismo_biomasal;

public class Evaluarsalud implements Hallar_IMC,Evaluar_Estado_Nutricional,Metabolismo_biomasal {
    @Override
    public double calcularIMC(double peso,double altura) {
        double IMC=peso/Math.pow(altura, 2);
        return IMC;
    }
    @Override
    public String establecer_estado_Nutricional(double peso,double altura) {
        double IMC=calcularIMC(peso,altura);
        if(IMC<18.5){
          return "Bajo peso";
        }
        else if(IMC<25){
            return "Peso normal";
        }
        else if(IMC<30){
            return "Sobrepeso";
        }
        else{
            return "Obesidad";
        }
    }

    @Override
    public double establecer_metabolismo_masal(String genero,double peso,double altura,int edad) {
        double mb=0;
        if(genero.equals("femenino") || genero.equals("Femenino")){
           mb=10*peso+6.25*altura-5*edad-161;
        }
        else if(genero.equals("masculino") || genero.equals("Masculino")){
            mb=10*peso+6.25*altura-5*edad+5;
        }
        else{
            System.out.println("Su genero no existe.");
        }
        return mb;
    }
    
    
}
