package com.ljh.study.factory.factorymethod;

import com.ljh.study.factory.FootballTeam;

/**
 * @description: 工厂方法模式测试类
 * 创建需要大量重复的代码
 * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。一个类通过其子类来指定创建哪个对象
 * 用户只关心所需产品对应的工厂，无需关心创建细节。
 * 加入新产品符合开闭原则，提高了系统的可扩展性。
 *
 * 缺点：类的个数容易过多，增加了代码结构的复杂度。
 * 增加了系统的抽象性和理解难度
 * @author: Jh Lee
 * @create: 2019-03-09 01:10
 **/
public class FootballTeamFactoryTest {

    public static void main(String[] args) {

        //创建一个巴塞罗那足球队的制造工厂
        FootballTeamFactory footballTeamFactory = new BarcelonaTeamFactory();
        //使用工厂创建对应的足球队
        FootballTeam team = footballTeamFactory.createTeam();
        team.game();

        //创建一个皇家马德里足球队的制造工厂
        FootballTeamFactory  realMadrid = new RealMadridTeamFactory();
        //使用工厂创建对应的足球队
        FootballTeam realMadridTeam = realMadrid.createTeam();
        realMadridTeam.game();
    }
}
