package arraylistcole;

import javax.swing.JOptionPane;

public class ArrayListCole {

    public static void main(String[] args) {
        Cole obx = new Cole();
        int op;
        int creado=0;
        do {

            op = Cole.menuSelect();
            switch (op) {
                case 1:
                    if (op == 1) {
                        obx.crearArray();
                    creado=1;
                    }
                    break;
                case 2:
                    if (op == 2) {
                        if(1==creado)
                        obx.amosar();
                        else
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if (op == 3) {
                        if(1==creado)
                        obx.engadir();
                        else
                           JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 4:
                    if (op == 4) {
                       if(1==creado)
                        obx.borrar();
                       else
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 5:
                    if (op == 5) {
                       if(1==creado)
                        obx.ordear();
                       else
                            JOptionPane.showMessageDialog(null, "crea un array", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 6:
                    if (op == 6 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 6 && op!=0);
    }
}
