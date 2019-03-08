package com.ljh.study.factory;

/**
 * @description: 工厂模式-皇家马德里足球队
 * @author: Jh Lee
 * @create: 2019-03-09 00:18
 **/
public class RealMadridTeam implements FootballTeam {


    @Override
    public void game() {
        System.out.println("皇家马德里被巴塞双杀！");
    }
}
