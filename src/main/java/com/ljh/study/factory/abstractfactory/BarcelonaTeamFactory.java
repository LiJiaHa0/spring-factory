package com.ljh.study.factory.abstractfactory;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 巴塞罗那足球队抽象工厂类
 * @author: Jh Lee
 * @create: 2019-03-09 01:47
 **/
public class BarcelonaTeamFactory implements FootballTeamFactory {
    @Override
    public FootballTeam createTeam() {
        return new BarcelonaTeam();
    }

    @Override
    public FootballTeamWoman createWomanTeam() {
        return new BarcelonaWomanTeam();
    }

    @Override
    public FootballTeamYouth createYouthTeam() {
        return new BarcelonaYouthTeam();
    }
}
