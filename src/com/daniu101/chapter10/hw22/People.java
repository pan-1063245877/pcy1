package com.daniu101.chapter10.hw22;

public class People {
    String name;
    private double tall;
    private int age;

    public void setTall(double tall) {
        if (tall>=0.5&&tall<3.0){
            System.out.println("身高不符合标准");
            this.tall = tall;
        }
        System.out.println("tall不符合标准");

    }
    public double getTall(){
        return tall;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", tall='" + tall + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<=150){
            this.age = age;
        }
        System.out.println("age不符合年龄");

    }
    public void eat(){
        System.out.println("用碗筷吃饭");
    }
    public void run(){
        System.out.println("每秒五十米");
    }
}
