package err;

public class ObjectAlreadyExist extends Exception {

    public ObjectAlreadyExist(String objectName){
        super(objectName + " já existente!");
    }

    public ObjectAlreadyExist(){
        super("Objeto já existente!");
    }
}
