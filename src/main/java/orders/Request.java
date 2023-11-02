package orders;

import parts.Product;

public class Request {

    private Product product;
    private String customerName;
    private String carMake;
    private String carModel;
    private String preferredDate;
    private boolean confirmed;

    //public Request()


    public Request(Product p, String cName, String carMak, String carModl, String preferDate, boolean b) {

        product = p;
        customerName = cName;
        carMake = carMak;
        carModel = carModl;
        preferredDate = preferDate;
        confirmed = b;

    }
}
