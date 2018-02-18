package com.bai.java.learn;

import sun.jvm.hotspot.debugger.ThreadAccess;

import java.util.Random;

public class Employee implements Worker {

    private ReceiveReport boss;
    //    员工姓名
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void work(String taskName) {
        System.out.println(name + " is doing works：" + taskName);

        Random random = new Random();
        Integer time = random.nextInt(10000);
        try {
            Thread.sleep(time);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String report = "顺利完成任务！！";
        boss.receiveReport(this, report);
    }

    @Override
    public void setRecevieReport(ReceiveReport boss) {
        this.boss = boss;
    }

    @Override
    public void getReward(Double money) {
        System.out.println(name + "由于表现突出，获得¥" + money + "现金奖励！");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
