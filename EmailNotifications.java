public class EmailNotifications extends Notifications{
    @Override
    public void connect() {
        System.out.println("Connecting to mail server........");
    }

    @Override
    public void sendNotifications(String str) {
        connect();
        System.out.println(str);
    }
}
