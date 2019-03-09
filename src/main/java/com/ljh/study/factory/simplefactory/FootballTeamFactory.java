package com.ljh.study.factory.simplefactory;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.RealMadridTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 设计模式-简单工厂模式，创建足球队的工厂
 *
 * 简单工厂负责创建的对象较少
 * 客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 * 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 * 不易于扩展过于复杂的产品结构
 * @author: Jh Lee
 * @create: 2019-03-09 00:23
 **/
public class FootballTeamFactory {

    /**
     * 通过足球队名创建足球队，缺点是名字需要严格要求，名字且容易传错。
     * @param name
     * @return
     */
    public FootballTeam createByName(String name){
        if("barcelona".equals(name)){
            return new BarcelonaTeam();
        }else if("realMadrid".equals(name)){
            return new RealMadridTeam();
        }
        else{
            return null;
        }
    }

    /**
     * 根据需要创建的足球队的名称来创建足球队，还是会有类名传错的风险
     * @param className
     * @return
     */
    public FootballTeam createByClassName(String className){
        try{
            if(!(null == className || "".equals(className))){
                return (FootballTeam)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据足球队的class对象来创建指定的足球队
     * @param clazz
     * @return
     */
    public FootballTeam createByClazz(Class clazz){
        try{
            if(null != clazz){
                return (FootballTeam)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
