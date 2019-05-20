/**
 * @Classname Main
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/9 16:44
 */
public class Main {
    public static void main(String[]args){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }


}
