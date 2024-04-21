package system_design.design_patterns.behavioral.Chain_of_responsibility;

public class Main {


    public static void main(String[] args) {
    //https://notebook.zohopublic.in/public/notes/bietvc07e6ecf28d7409286145c16e623f9ed
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor
                (new ErrorLogProcessor(null)));


        logProcessor.log(LogProcessor.ERROR, "Exception occurred");
        logProcessor.log(LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(LogProcessor.INFO, "Just for Info");
    }

}
