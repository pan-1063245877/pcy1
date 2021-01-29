package com.daniu101.chapter10.hw22;

public class Apple {
     String pinpai;
     private double chicun;
     private int status;

    @Override
    public String toString() {
        return "Apple{" +
                "pinpai='" + pinpai + '\'' +
                ", chicun=" + chicun +
                ", status=" + status +
                '}';
    }

    public void call(){
        System.out.println("打电话");
    }
    public void net(){
        System.out.println("上网");
    }
    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public double getChicun() {
        return chicun;
    }

    public void setChicun(double chicun) {
        this.chicun = chicun;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
