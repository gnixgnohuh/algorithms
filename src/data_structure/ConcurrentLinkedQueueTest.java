package data_structure;

import java.util.concurrent.*;

/**
 * @author: gnixgnohuh
 * @date : 18-3-7
 * @time : 上午10:03
 * @desc :
 */
public class ConcurrentLinkedQueueTest {

    private static final ExecutorService pool = new ThreadPoolExecutor(500, 500, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        CountDownLatch latch = new CountDownLatch(500);
        for (int i = 0; i < 500; i++) {
            pool.execute(() -> {
                queue.add(1);
                queue.add(2);
                queue.add(3);
                latch.countDown();
            });
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(queue.size());
    }
}
