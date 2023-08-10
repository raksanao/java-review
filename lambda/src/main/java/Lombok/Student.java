package Lombok;

import lombok.*;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Generated
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private final int age;

}