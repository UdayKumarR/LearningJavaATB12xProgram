package exam_12Xb_22062025_OOPsJava;

public class exam15_customExcepImplement {
    public static void main(String[] args){
        ageVerifier a1 = new ageVerifier();
        ageVerifier a2 = new ageVerifier();
        try{
            a1.validateAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try{
        a2.validateAge(25);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    class ageVerifier {
            public void validateAge(int age) throws InvalidAgeException {
            if (age < 18)
            {
                throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above. Provided age:  " + age);
            }
                System.out.print("Age is valid : " + age);
        }
    }
