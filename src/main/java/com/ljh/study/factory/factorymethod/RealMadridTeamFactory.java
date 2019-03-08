package com.ljh.study.factory.factorymethod;

import com.ljh.study.factory.FootballTeam;
import com.ljh.study.factory.RealMadridTeam;

/**
 * @description: 皇家马德里足球队的工厂类
 * @author: Jh Lee
 * @create: 2019-03-09 01:09
 **/
public class RealMadridTeamFactory implements FootballTeamFactory {
    @Override
    public FootballTeam createTeam() {
        return new RealMadridTeam();
    }
}
