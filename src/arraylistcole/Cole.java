package arraylistcole;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cole {

    private String nome;
    private int nota;

    ArrayList<Cole> alum = new ArrayList<Cole>();
    
    public Cole(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Cole() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Cole{" + "nome=" + nome + ", nota=" + nota + '}';
    }

    public int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Crear Array", "Amosar", "engadir elemento", "borrar elemento", "Ordear", "Sair do programa"}, "Sair do programa");
        return opcion + 1;

    }

    public void crearArray() {
        

    }

    

    public void opcions() {
       
         int op;
        do {

            op = this.menuSelect();
            switch (op) {
                case 1:
                    if (op == 1) {
                    int na;
                    String ne;
                    nome = JOptionPane.showInputDialog(null, "Escribe o nome: ");
                    nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe a nota: "));
                    alum.add(new Cole(nome, nota));
                        
                    }
                    break;
                case 2:
                    if (op == 2) {
                    
                       for( int i = 0 ; i  < alum.size(); i++)
                            System.out.println(alum.toString());
                    }
                    break;
                case 3:
                    if (op == 3) {
                        System.out.println("engadir");//this.engadir();
                    }
                    break;
                case 4:
                    if (op == 4) {
                        System.out.println("borrar");//this.borrar();
                    }
                    break;
                case 5:
                    if (op == 5) {
                        System.out.println("ordenar");//this.ordenar();
                    }
                    break;
                case 6:
                    if (op == 6) {
                        System.exit(0);
                    }
            }
        } while (op != 6 && op == -1);
        

    }
    }

  

