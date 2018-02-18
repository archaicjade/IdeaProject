package com.bai.java.learn;

import java.util.ArrayList;
import java.util.List;

public class Boss implements ReceiveReport {

    //    老板管理的员工
    private List<Worker> workers = new ArrayList<>();

    //    顺序
    private volatile int index;

    /*
     * 添加员工
     * @param worker 员工
     * */
    public void addWorker(Worker worker) {
        workers.add(worker);
        worker.setRecevieReport(this);
    }

    /*
     * 下达任务
     * */

    public void sendTask(String task) {

        for (Worker worker : workers) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    worker.work(task);
                }
            }).start();
        }
    }

    @Override
    public void receiveReport(Worker worker, String report) {

        int index = ++this.index;
        System.out.println(worker.getName() + "获得第" + index + "名");
        if (index <= 3) {
            worker.getReward(10000.0 * (4 - index));
        }
    }
}
