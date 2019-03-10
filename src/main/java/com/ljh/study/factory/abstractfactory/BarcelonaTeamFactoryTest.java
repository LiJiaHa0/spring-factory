package com.ljh.study.factory.abstractfactory;

import com.ljh.study.factory.FootballTeam;

/**
 * @description: 抽象工厂模式测试类
 * @author: Jh Lee
 * @create: 2019-03-09 01:53
 **/
public class BarcelonaTeamFactoryTest {

    public static void main(String[] args) {
        //创建一个巴塞罗那工厂
        FootballTeamFactory factory = new BarcelonaTeamFactory();

        //创建巴塞罗那足球队男队
        FootballTeam team = factory.createTeam();
        team.game();

        //创建巴塞罗那女队
        FootballTeamWoman womanTeam = factory.createWomanTeam();
        womanTeam.game();

        //创建巴塞罗那青年队
        FootballTeamYouth youthTeam = factory.createYouthTeam();
        youthTeam.game();
    }
}
