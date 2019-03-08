package com.ljh.study.factory.simplefactory;

import com.ljh.study.factory.BarcelonaTeam;
import com.ljh.study.factory.RealMadridTeam;
import com.ljh.study.factory.FootballTeam;

/**
 * @description: 创建足球队的工厂
 * @author: Jh Lee
 * @create: 2019-03-09 00:23
 **/
public class FootballTeamFactory {

    /**
     * 通过足球队名创建足球队，缺点是名字需要严格要求，名字且容易传错。
     * @param name
     * @return
     */
    public FootballTeam create(String name){
        if("Barcelona".equals(name)){
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
    public FootballTeam create2(String className){
        try{
            if(!(null == className || "".equals(className))){
                return (FootballTeam)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public FootballTeam create3(Class clazz){
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
