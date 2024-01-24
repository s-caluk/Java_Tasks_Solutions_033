package day07_class_objects_part1;

import com.sun.jdi.request.ClassUnloadRequest;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();

        address1.buildingNumber = 7925;
        address1.street ="Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        System.out.println(address1);

        System.out.println("------------------------");

        Address address2 = new Address();
        address2.buildingNumber = 20;
        address2.street ="Friedrich";
        address2.city = "Erlangen";
        address2.state = "BA";
        address2.zipCode = 91058;

        System.out.println(address2);

    }
}
