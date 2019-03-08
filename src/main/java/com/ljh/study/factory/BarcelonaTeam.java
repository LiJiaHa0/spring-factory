package com.ljh.study.factory;

/**
 * @description: 工厂模式-巴萨罗那足球队
 * @author: Jh Lee
 * @create: 2019-03-09 00:18
 **/
public class BarcelonaTeam implements FootballTeam {


    @Override
    public void game() {
        System.out.println("巴塞罗那西甲冠军！");
    }
}
