package builder_pattern;

public class User {
    private String name;
    private String email;
    private int age;
    private String phone;
    private String city;
    private String address;
    private String gender;

    public User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.city = builder.city;
        this.address = builder.address;
        this.gender = builder.gender;
    }

    public static class Builder{
        private String name;
        private String email;
        private int age;
        private String phone;
        private String city;
        private String address;
        private String gender;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
        
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
    
}
