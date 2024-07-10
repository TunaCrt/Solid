package SingleResponsibility.before;

public class User {
    //SingleResponsibility prensibine göre bir sınıfın sadece bir görevi olmalı o yüzden
    //şu anda bu oluşturduğumuz sınıfta login işlemleri ve change adres için farklı bir sınıf oluşturulmalı
    //bu sınıfta sadece user bilgileri olmalı
    private Long id;
    private String name;
    private String street;
    private String city;
    private String username;

    //Getters, setters

    public void changeAddress(String street,String city) {
        //logic
    }

    public void login(String username) {
        //logic
    }

    public void logout(String username) {
        //logic
    }
}
