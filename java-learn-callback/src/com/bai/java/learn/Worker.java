package com.bai.java.learn;

/*
*
* */
public interface Worker {

    public void work(String taskName);

    public void setRecevieReport(ReceiveReport boss);

    public void getReward(Double money);

    public String getName();
}
