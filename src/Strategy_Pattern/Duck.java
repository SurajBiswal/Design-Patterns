package Strategy_Pattern;

abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setPerformFly(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

    abstract void display();
}


