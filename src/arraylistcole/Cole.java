
package arraylistcole;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cole {
private String nome;
private int nota;

ArrayList<Cole>alum=new ArrayList<Cole>();
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
    public static int menu(){
    int opcion=Integer.parseInt(JOptionPane.showInputDialog("****MENU***\n"+"1->Crear Array\n"+"2->Amosar\n"+"3->engadir elemento\n"+"4->borrar elemento\n"+"5->Ordear\n"+"6->Sair do programa"));
    
    return opcion;
}
    
}
