
package arraylistcole;

public class ArrayListCole {

    public static void main(String[] args) {
        Cole obx=new Cole();
   int op;
        do{
        op = Cole.menu();
    switch(op){
            case 1:crearArray();
            break;
            case 2:ver();
            break;
            case 3:engadir();
            break;
            case 4:borrar();
            break;
            case 5:ordenar();
            break;
            case 6:System.exit(0);
    }
        }while(op!=6);
    }
    
}
