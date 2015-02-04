package arraylistcole;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCole {

    public static void main(String[] args) {
        Cole obx = new Cole();
        int op;
        do {

            op = Cole.menuSelect();
            switch (op) {
                case 1:
                    if (op == 1) {
                        obx.crearArray();
                    }
                    break;
                case 2:
                    if (op == 2) {
                        obx.amosar();
                    }
                    break;
                case 3:
                    if (op == 3) {

                        obx.engadir();
                    }
                    break;
                case 4:
                    if (op == 4) {
                        obx.borrar();
                    }
                    break;
                case 5:
                    if (op == 5) {
                        obx.ordear();
                    }
                    break;
                case 6:
                    if (op == 6 || op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 6 || op != 0);
    }
}
