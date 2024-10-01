package enums;

public enum Status {

    NOT_STARTED(1), // O status da tarefa ainda não foi iniciado
    IN_PROGRESS(2), // O status da tarefa está em andamento
    COMPLETED(3);// A tarefa foi concluída


    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Status valueOf(int code){
        for (Status value : Status.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Status code");
    }
}






