public class SmsNotifications extends  Notifications{
    public void connect() {
        System.out.println("Connecting to SMS server........");
    }
    @Override
    public void sendNotifications(String str) {
        connect();
        System.out.println(str);
    }
}
