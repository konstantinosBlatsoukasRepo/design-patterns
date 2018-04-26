package kon.blats.design.patterns.creational.abstractfactory;

import kon.blats.design.patterns.creational.abstractfactory.autobots.Autobot;
import kon.blats.design.patterns.creational.abstractfactory.autobots.Autobots;
import kon.blats.design.patterns.creational.abstractfactory.autobots.AutobotsFactory;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.Decepticon;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.Decepticons;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.DecepticonsFactory;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public class TestAbstractFactory {

  public static void main(String[] args) {
    //here you using a the abstract factory in order to retrieve an autobots factory
    AutobotsFactory autobotsFactory = (AutobotsFactory) TransformersAbstractFactory.get(Transformers.AUTOBOTS);
    //after the factory instantiation you creating the optimus prime and bumblebbe
    Autobot optimus = autobotsFactory.get(Autobots.OPTIMUS_PRIME);
    optimus.sayHello();
    Autobot bumblebbe = autobotsFactory.get(Autobots.BUMBLEBEE);
    bumblebbe.sayHello();

    //here you using a the abstract factory in order to retrieve an decepticons factory
    DecepticonsFactory decepticonsFactory = (DecepticonsFactory) TransformersAbstractFactory.get(Transformers.DECEPTICONS);
    //after the factory instantiation you creating the megatron and starscream
    Decepticon megatron = decepticonsFactory.get(Decepticons.MEGATRON);
    megatron.sayHello();
    Decepticon starscream = decepticonsFactory.get(Decepticons.STARSCREAM);
    starscream.sayHello();
  }
}
