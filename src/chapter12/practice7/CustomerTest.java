package chapter12.practice7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CustomerTest {
    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("이순신", 40, 100));
        customers.add(new Customer("김유신", 20, 100));
        customers.add(new Customer("홍길동", 13, 50));

        Stream<Customer> stream1 = customers.stream();
        stream1.map(c-> c.getCustomerName()).forEach(s-> System.out.println(s));

        Stream<Customer> stream2 = customers.stream();
        int total = stream2.mapToInt(c-> c.getCost()).sum();
        System.out.println(total);

        customers.stream().filter(c->c.getAge() >= 20).map(c->c.getCustomerName())
                .sorted().forEach(s->System.out.println(s));
    }
}
