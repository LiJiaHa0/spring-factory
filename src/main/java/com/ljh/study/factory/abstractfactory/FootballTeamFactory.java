package com.ljh.study.factory.abstractfactory;

import com.ljh.study.factory.FootballTeam;

/**
 * @description: 抽象工厂的创建足球队的工厂
 * 要求所有的子工厂都实现这个工厂
 *
 * 客户端（应用层）不依赖于产品类型实例如何被创建、实现等细节。
 * 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量的代码
 * 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。
 * 具体产品在应用层代码隔离，无须关心创建细节
 *
 * 将一系列的产品族统一到一起创建
 * 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 增加了系统的抽象性和理解难度
 *
 *
 * 抽象工厂模式不符合开闭原则，但是易于扩展，例如下面，我们如果需要每个足球队创建一个足球女队以及青年足球队，我们则需要修改代码，且每个实现了这个接口的工厂类都需要改变代码
 * 不过我们每一个软件或者系统都是通过一代一代迭代而来，允许一定阶段之内修改一次，以及代码的升级。
 * @author: Jh Lee
 * @create: 2019-03-09 01:40
 **/
public interface FootballTeamFactory {

    FootballTeam createTeam();

    FootballTeamWoman createWomanTeam();

    FootballTeamYouth createYouthTeam();


}
