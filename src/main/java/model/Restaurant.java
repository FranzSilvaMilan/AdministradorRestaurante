package model;

import javax.swing.*;

public class Restaurant {
    private String name;
    private String place;
    char tablesAvaibles[][];
    public Restaurant(){
    }



    public void main(){
       // boolean ban=true; //para ejecutar programa
//        do{
////            int opcion=(int)Integer.parseInt(JOptionPane.showInputDialog("\nMenu:\n"+
////                    "1.- Ver estado de la Sala.\n"+
////                    "2.- Asignar lugar disponible\n"+
////                    "3.- Seleccionar lugar especifico\n"+
////                    "Cualquier otra.- Salir del Sistema"));
//
//
//            switch(option){
//                case 1: display(tablesAvaibles); break;
//                case 2: tablesAvaibles =asignarLugar();break;
//                case 3: tablesAvaibles =escogerLugar();break;
//                default: ban=false;
//            }
//        }while(ban);
        display();
    }

    public char[][] create(int size){
        char matriz[][]=new char[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                matriz[i][j]='v';
        return matriz;
    }

    public void display(){
        String cad="";
        for(int i=0;i<tablesAvaibles.length;i++){
            for(int j=0; j<tablesAvaibles[i].length; j++){
                cad+=tablesAvaibles[i][j]+" ";
            }
            cad+="\n";
        }
        //JOptionPane.showMessageDialog(null,cad);
        System.out.println(cad);
    }

    public char[][] asignarLugar(){
        //char matriz[][]=mat;
        for(int i=0;i<tablesAvaibles.length;i++){
            for(int j=0;j<tablesAvaibles[i].length;j++){
                if(tablesAvaibles[i][j]=='v'){
//                    JOptionPane.showMessageDialog(null,"Lugar asignado en la fila "+(i+1)+
//                            " y columna "+(j+1));
                    System.out.println("Lugar asignado en la fila "+(i+1)+
                           " y columna "+(j+1));
                    tablesAvaibles[i][j]='x';
                    return tablesAvaibles;
                }else continue;
            }
        }
        return tablesAvaibles;
    }

    public char[][] escogerLugar(int fila, int columna){
        //char matriz[][]=mat;
        do{
//            int fila=(int)Integer.parseInt(JOptionPane.showInputDialog("Selecciona la fila:"));
//            int columna=(int)Integer.parseInt(JOptionPane.showInputDialog("Selecciona la Columna:"));
            //if(tablesAvaibles[fila-1][columna-1]=='x') JOptionPane.showMessageDialog(null,"Vuelve a seleccionar, ese lugar ya se encuentra ocupado");
            if(tablesAvaibles[fila-1][columna-1]=='x') System.out.println("Vuelve a seleccionar, ese lugar ya se encuentra ocupado");
            else{
                //JOptionPane.showMessageDialog(null,"Lugar asignado a la fila "+fila+" y columna "+columna);
                System.out.println("Lugar asignado a la fila "+fila+" y columna "+columna);
                tablesAvaibles[fila-1][columna-1]='x';
                break;
            }
        }while(1==1);
        return tablesAvaibles;
    }

    public void availebleTable() {
        System.out.println("1.- Ver estado de la Restaurant.\n"+
                "2.- Asignar lugar disponible\n"+
                "3.- Seleccionar lugar especifico\n"+
                "Cualquier otra.- Salir del Sistema");
    }
}
