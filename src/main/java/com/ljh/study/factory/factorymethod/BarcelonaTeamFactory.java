package com.ljh.study.factory.factorymethod;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 巴塞罗那足球队的工厂类
 *
 * 我想要创建一个巴塞罗那足球队，就有此子类来进行创建
 * @author: Jh Lee
 * @create: 2019-03-09 01:05
 **/
public class BarcelonaTeamFactory implements FootballTeamFactory {
    @Override
    public FootballTeam createTeam() {
        return new BarcelonaTeam();
    }
}
