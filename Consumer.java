public class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1500); // simulate consumption time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
