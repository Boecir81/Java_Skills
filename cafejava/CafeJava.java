
public class CafeJava {

    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String waitingMessage = "in the mean time ";
        String displayTotalMessage = "Your total is $ ";
        String wrongPrice = "you charged me for the worng coffe which is";
        String iOweYou = "i owe you";

        // Menu variables

        double mochaPrice = 3.5;
        double icedCoffe = 10.0;
        double blackCoffe = 4.44;
        double sum = blackCoffe + blackCoffe;
        double sum2 = icedCoffe - blackCoffe;

        // Customer name variables

        String customer1 = "Jessica";
        String customer2 = "Tina";
        String customer3 = "Nichole";

        // Order completions
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;

        System.out.println(generalGreeting);
        if (isReadyOrder1 == true) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting);
        if (isReadyOrder2 == false) {
            System.out.println(customer2 + pendingMessage);
        } else {
            System.out.println(customer2 + readyMessage + " " + displayTotalMessage +
                    icedCoffe);
        }

        System.out.println(generalGreeting);
        if (isReadyOrder3 == true) {
            System.out.println(
                    customer3 + pendingMessage + waitingMessage + displayTotalMessage + sum);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(generalGreeting);

        if (isReadyOrder1 == true) {
            System.out.println(customer1 + readyMessage + " " + displayTotalMessage +
                    sum);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting);

        if (isReadyOrder3 == true) {
            System.out.println(wrongPrice + " " + blackCoffe + " " + iOweYou + " " + sum2);
        } else {
            System.out.println(pendingMessage);
        }

    }

}