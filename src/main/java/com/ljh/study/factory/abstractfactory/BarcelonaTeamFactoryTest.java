package com.ljh.study.factory.abstractfactory;

/**
 * @description: 抽象工厂模式测试类
 * @author: Jh Lee
 * @create: 2019-03-09 01:53
 **/
public class BarcelonaTeamFactoryTest {

    public static void main(String[] args) {
        //创建一个产品工厂
        FootballTeamFactory factory = new BarcelonaTeamFactory();
        factory.createTeam().game();
        factory.createWomanTeam();
        factory.createYouthTeam();
    }
}
