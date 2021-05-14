package Model;

/**
 * @author jesse merryman
 */

public class InHouse extends Part {

    private int machineId;


    /**
     * @param id
     * @param name
     * @param price
     * @param stock
     * @param min
     * @param max
     */

    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineId() {
        return machineId;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void setStock(int stock) {

    }

    @Override
    public int getMin() {
        return 0;
    }

    @Override
    public void setMin(int min) {

    }

    @Override
    public int getMax() {
        return 0;
    }

    @Override
    public void setMax(int max) {

    }
}
