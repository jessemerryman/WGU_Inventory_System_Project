package Model;

/**
 * @author jesse merryman
 */

public class Product {

    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    /**
     *
     * @param id
     * @param name
     * @param price
     * @param stock
     * @param min
     * @param max
     */

    public Product(int id, String name, double price, int stock, int min, int max) {

        this.id = id;
        this.name = name;
        this.price = price;
        this. stock = stock;
        this.min = min;
        this.max = max;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     *
     * @return
     */
    public int getMin() {
        return min;
    }

    /**
     *
     * @param mind
     */
    public void getMin(int mind) {
        this.min = min;
    }

    /**
     *
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     *
     * @param max
     */
    public void getMax(int max) {
        this.max = max;
    }

}
