package com.user.User.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private int salary;
}

class driver {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> e = List.of(Employee.builder().age(23).name("Jassi").gender("M").department("Tech Team").salary(82811).build(),
                Employee.builder().age(29).name("bassi").gender("F").department("IT").salary(98911).build());
        e.remove(1);
/*

        employees.add(Employee.builder().age(23).name("Jassi").gender("M").department("Tech Team").salary(82811).build());
        employees.add(Employee.builder().age(29).name("bassi").gender("F").department("IT").salary(98911).build());
        employees.add(Employee.builder().age(30).name("vicky").gender("F").department("PO").salary(67543).build());
        employees.add(Employee.builder().age(27).name("Diku").gender("M").department("IT").salary(60000).build());
//        print distinct departments
//        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
//        print count in each departments
        Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        map.forEach((key, value) -> System.out.println(key + " - " + value));

//        average age of female n male employees
        Map<String, Double> ageAvgMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//        ageAvg.forEach((key, value) -> System.out.println(key + " - " + value));
//        employees from IT
        employees.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.toList());
//        average age
        Integer avgAge = employees.stream().collect(Collectors.averagingInt(Employee::getAge)).intValue();
//        System.out.println(avgAge);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(7);
        integerList.add(89);
        integerList.add(21);
        integerList.add(8);
        integerList.add(14);
        integerList.add(12);
//        print even number
//        integerList.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
        integerList.add(12);
        integerList.add(12);
        integerList.add(7);
        integerList.add(12);
        HashSet<Integer> hs = new HashSet<>();
//        System.out.println("Duplicate");
//        integerList.stream().filter(integer -> !hs.add(integer)).distinct().forEach(System.out::println);
//        System.out.println("Sorting");
        integerList.stream().distinct().sorted((o1, o2) -> {
            if (o1 < o2) {
                return 1;
            } else
                return -1;
        }).collect(Collectors.toList());
// 2nd highest salary using steam
//        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).stream().skip(0).findFirst());

        Map<String, Integer> salaryMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        salaryMap.entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).forEach(s -> System.out.println(s));

        System.out.println(salaryMap.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1));
//        sorting the map

*/
    }
}
