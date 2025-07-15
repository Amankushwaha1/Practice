package DesignPatterns.Behavioral.Template;

public class InfoNotFoundException extends Exception {
    String msg;
    public InfoNotFoundException(String msg) {
        this.msg = msg;
        System.out.println("Data Not Found for "+msg);
    }

    private String foundInfo(){
        String foundInfo = "";

        return foundInfo;
    }
}
