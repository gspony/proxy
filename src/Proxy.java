/**
 * @Classname Proxy
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/9 16:47
 */
public class Proxy implements GiveGift {
    Pursuit	gg;

    public Proxy(SchoolGirl mm)
    {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveChocolate()
    {

        gg.giveChocolate();
    }

    @Override


    public void giveDolls()
    {

        gg.giveDolls();
    }

    @Override
    public void giveFlowers()
    {

        gg.giveFlowers();
    }
}
