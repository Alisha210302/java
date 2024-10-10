public class Toy {

    // Instance variables
    private int id;                // Unique identifier for the toy
    private String name;           // Name of the toy
    private float price;           // Price of the toy
    private int age;               // Recommended age for the toy
    private int pmonth;            // Month of production
    private int pyear;             // Year of production
    private String category;       // Category of the toy (e.g., educational, battery operated)
    private int rating;            // User rating for the toy

    // Constructor to initialize the Toy object
    public Toy(int id, String name, float price, int age, int pmonth, int pyear, String category, int rating) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.age = age;
        this.pmonth = pmonth;
        this.pyear = pyear;
        this.category = category;
        this.rating = rating;
    }

    // Override toString method to provide a string representation of the Toy object
    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", price=" + price + ", age=" + age + ", pmonth=" + pmonth
                + ", pyear=" + pyear + ", category=" + category + ", rating=" + rating + "]";
    }

    // Getter and setter methods for each instance variable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPmonth() {
        return pmonth;
    }

    public void setPmonth(int pmonth) {
        this.pmonth = pmonth;
    }

    public int getPyear() {
        return pyear;
    }

    public void setPyear(int pyear) {
        this.pyear = pyear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
