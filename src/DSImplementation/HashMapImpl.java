package DSImplementation;


import java.util.HashMap;

public class HashMapImpl {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");
        map.put("javax.persistence.jdbc.driver", "oracle.jdbc.OracleDriver");
        map.put("javax.persistence.jdbc.url", "jdbc:oracle:thin:@//localhost:1521/ORCL");
        map.put("javax.persistence.jdbc.user", "myuser");
        map.put("javax.persistence.jdbc.password", "mypassword");
        map.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");

        // Retrieve values
        System.out.println(map.get("name")); // Output: John Doe
        System.out.println(map.get("age")); // Output: 30

        System.out.println(map.get("city"));
        System.out.println(map.get("javax.persistence.jdbc.driver"));
        System.out.println(map.get("javax.persistence.jdbc.url"));
        System.out.println(map.get("javax.persistence.jdbc.user"));
        System.out.println(map.get("javax.persistence.jdbc.password"));
        System.out.println(map.get("hibernate.dialect"));

        // Update a value
        map.put("age", "31");
        System.out.println(map.get("age")); // Output: 31

        // Remove a key-value pair
        map.remove("city");
        System.out.println(map.containsKey("city")); // Output: false

        // Check size and emptiness
        System.out.println(map.size()); // Output: 2
        System.out.println(map.isEmpty()); // Output: false

        // Clear the map
        map.clear();
        System.out.println(map.isEmpty()); // Output: true
    }
}