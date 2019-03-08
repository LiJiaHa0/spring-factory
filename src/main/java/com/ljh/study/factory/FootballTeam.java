package com.ljh.study.factory;

/**
 * @description: 设计模式-简单工厂模式，足球队接口
 * 简单工厂负责创建的对象较少
 * 客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 *
 * 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 * 不易于扩展过于复杂的产品结构
 * @author: Jh Lee
 * @create: 2019-03-09 00:15
 **/
public interface FootballTeam {

    //每个足球队比赛
    public void game();
}
