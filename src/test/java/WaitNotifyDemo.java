public class WaitNotifyDemo {
    public static void main(String[] args) {
        String message = "111";
        String message2 = "111";

        // 等待线程
        Thread waiterThread = new Thread(() -> {
            synchronized (message.intern()) {
                System.out.println("Waiter: Waiting for notification");
                try {
                    message.wait(); // 等待通知
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Waiter: Got the notification, Message: " + message);
            }
        }, "Waiter");
        waiterThread.start();

        // 通知线程
        Thread notifierThread = new Thread(() -> {
            synchronized (message2.intern()) {
                System.out.println("Notifier: Preparing to notify");
                message2.notify(); // 发送通知
                System.out.println("Notifier: Notification sent");
            }
        }, "Notifier");
        notifierThread.start();
    }


}