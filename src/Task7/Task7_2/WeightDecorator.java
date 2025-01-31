package Task7.Task7_2;

public class WeightDecorator extends AbstractHandlerDecorator{
    public WeightDecorator(IHandlerDecorator decorator) {
        super(decorator);
    }

    @Override
    public String getDescription(Transport transport) {
        return super.getDescription(transport) + " (Категорія: " + getWeightCategory(transport) + ")";
    }

    @Override
    public int getRegistrationFee(Transport transport) {
        return super.getRegistrationFee(transport) + getExtraFee(transport);
    }

    public String  getWeightCategory(Transport transport){
        int weight = transport.getWeight();
        if (weight < 1500) return "Легковий";
        if (weight < 3500) return "Грузовий";
        return "Тяжкий транспорт";
    }

    public int getExtraFee(Transport transport){
        if (transport.getWeight() >= 3500) return 2000;
        return 0;
    }
}
