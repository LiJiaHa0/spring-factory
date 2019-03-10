package com.ljh.study.factory.simplefactory;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.RealMadridTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 简单工厂测试类
 * 简单工厂负责创建的对象较少
 * 客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 * 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 * 不易于扩展过于复杂的产品结构
 * @author: Jh Lee
 * @create: 2019-03-09 00:24
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //创建一个足球队制造的工厂，我们需要创建足球，直接传入我们相对应的参数
        FootballTeamFactory footballTeamFactory = new FootballTeamFactory();

        //使用足球队名称来创建
        FootballTeam barcelonaByName = footballTeamFactory.createByName("barcelona");
        barcelonaByName.game();
        FootballTeam realMadridByName = footballTeamFactory.createByName("realMadrid");
        realMadridByName.game();

        //使用足球队的包名+类名来创建
        FootballTeam barcelonaByClassName = footballTeamFactory.createByClassName("com.ljh.study.simplefactory.BarcelonaTeam");
        barcelonaByClassName.game();
        FootballTeam realMadridByClassName = footballTeamFactory.createByClassName("com.ljh.study.simplefactory.RealMadridTeam");
        realMadridByClassName.game();

        //使用足球队的class对象来创建
        FootballTeam barcelonaTeam1 = footballTeamFactory.createByClazz(BarcelonaTeam.class);
        barcelonaTeam1.game();
        FootballTeam realMadridTeam1 = footballTeamFactory.createByClazz(RealMadridTeam.class);
        realMadridTeam1.game();
    }
}
