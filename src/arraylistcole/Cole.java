package arraylistcole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

    public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Crear Array", "Amosar", "engadir elemento", "borrar elemento", "Ordear", "Sair do programa"}, "Sair do programa");
        return opcion + 1;

    }

    public String pedirNome() {
        String nom = JOptionPane.showInputDialog("introduce nome");
        return nom;
    }

    public int pedirNota() {
        int nom = Integer.parseInt(JOptionPane.showInputDialog("introduce nota"));
        return nom;
    }

    public void crearArray() {
        String auxNome;
        int auxNota;
        auxNome = this.pedirNome();
        while (auxNome.compareToIgnoreCase("fin") != 0) {
            auxNota = this.pedirNota();
            alum.add(new Cole(auxNome, auxNota));
            auxNome = this.pedirNome();
        }
    }

    public void amosar() {

        String Saida = "";
        for (int i = 0; i < alum.size(); i++) {
            Saida += "\nNome : " + alum.get(i).getNome();
            Saida += "\nNota  : " + alum.get(i).getNota();
            Saida += "\n<------------------>";
        }
        JOptionPane.showMessageDialog(null, Saida);
    }

    public void engadir() {
        String auxNome;
        int auxNota;
        int pos = Integer.parseInt(JOptionPane.showInputDialog("introduce a posición na que queres engadir\n(posicións permitidas :(0," + alum.size() + "))"));
        auxNome = this.pedirNome();

        auxNota = this.pedirNota();
        alum.add(pos, new Cole(auxNome, auxNota));

    }

    public void borrar() {
        boolean buscador = false;
        String nomClean = JOptionPane.showInputDialog("introduce nome a borrar");
        Iterator<Cole> it = alum.iterator();
        while (it.hasNext()) {
            Cole elem = it.next();
            if (elem.nome.equalsIgnoreCase(nomClean)) {
                buscador = true;
                it.remove();
            }
        }

        if (buscador) {
            JOptionPane.showMessageDialog(null, nomClean + " borrado");
        } else {
            JOptionPane.showMessageDialog(null, nomClean + " non existe", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void ordear() {
        Collections.sort(alum, null);
    }
}
