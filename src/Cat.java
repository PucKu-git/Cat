import java.text.Format;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow(Double amount)
    {
        weight = weight - amount;
        System.out.println("Мяууу");
    }

    public double feed()
    {
        return weight = weight + Math.toIntExact(Math.round(Math.random()*200));
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Умер(ла)";
        }
        else if(weight > maxWeight) {
            return "Взорвался(ась)";
        }
        else if(weight > originWeight) {
            return "Спит";
        }
        else {
            return "Играет";
        }
    }
    public String toilet()
    {
        int toiletLimit = Math.toIntExact(Math.round(Math.random()*500));
        if (weight > originWeight + toiletLimit)
        {
            weight=weight-toiletLimit;
            return "Кошка сходла в туалет. Вес кошки = " +  weight;
        }
        return "Кошка ещё не сходила в туалет. Вес кошки = " + weight;
    }
    public String countEaten()
    {
        if (weight>originWeight)
        {
            return "Кошка съела = " + (weight-originWeight) + " г. ";
        }
        return "Кошка ещё не ела. Вес кошки = " + weight;
    }
}