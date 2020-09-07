class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("ciko " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println("InterruptedException " + ex);
                    }
                }
            }
        });
        
        System.out.println("starting thread");
        thread.start();
        System.out.println("waiting for thread");
        thread.join();
        System.out.println("thread finished");
    }
}