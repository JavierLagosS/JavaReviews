import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres ={"javier","Liam","Pedro","juan","lala","lolo"};
        int count= nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("javier") ||
                nombres[i].equalsIgnoreCase("lala")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre , ejemplo \"Pepe\" o \"maria\"");
        System.out.println("buscar = " + buscar);
        
        boolean encontrado =false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar+ " Fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar+ " no fue encontrado");
        }
    }
}
