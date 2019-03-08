package com.ljh.study.factory.simplefactory;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.RealMadridTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 简单工厂测试类
 * @author: Jh Lee
 * @create: 2019-03-09 00:24
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //
        FootballTeamFactory footballTeamFactory = new FootballTeamFactory();

        FootballTeam footballTeam = footballTeamFactory.create("Barcelona");
        footballTeam.game();
        FootballTeam realMadrid = footballTeamFactory.create("realMadrid");
        realMadrid.game();

        FootballTeam barcelonaTeam = footballTeamFactory.create2("com.ljh.study.simplefactory.BarcelonaTeam");
        barcelonaTeam.game();
        FootballTeam realMadridTeam = footballTeamFactory.create2("com.ljh.study.simplefactory.RealMadridTeam");
        realMadridTeam.game();

        FootballTeam barcelonaTeam1 = footballTeamFactory.create3(BarcelonaTeam.class);
        barcelonaTeam1.game();

        FootballTeam realMadridTeam1 = footballTeamFactory.create3(RealMadridTeam.class);
        realMadridTeam1.game();
    }
}
