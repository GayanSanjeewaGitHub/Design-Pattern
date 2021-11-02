package pkg14_builder.designpattern;

/**
 *
 * @author GAYAN SANJEEWA
 */
class User {

    private int id;
    private String name;
    private String email;

    public User(UserBuilder ub) {

    }

    static class Builder {

        private int id;
        private String name;
        private String email;

        Builder setId(int id) {
            this.id=id;
            return this;
        }
        
        Builder setName(String name) {
            this.name=name;
            return this;
        }
        
        Builder setEmail(String email) {
            this.email=email;
            return this;
        }

          User   build() {
            return new User(this);
        }

    }
}

public class DesignPattern {

    public static void main(String[] args) {
        User.UserBuilder ub = new User.UserBuilder();
        ub.setId();
    }

}
