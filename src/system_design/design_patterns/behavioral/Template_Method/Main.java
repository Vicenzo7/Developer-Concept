package system_design.design_patterns.behavioral.Template_Method;

public class Main {

    // https://notebook.zohopublic.in/public/notes/bietvc07e6ecf28d7409286145c16e623f9ed
    public static void main(String[] args) {

        /*
            When we want all classes to follow specific step to perform a task, but
            also provide flexibility to each class to have their own logic in each step.
        */



        PaymentFlow friendFlow = new PayToFriendFlow();
        PaymentFlow merchantFlow = new PayToMerchantFlow();

        friendFlow.sendMoney();
        System.out.println("-----------------TEST-------------------");
        merchantFlow.sendMoney();
    }
}
