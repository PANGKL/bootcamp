import java.util.Optional;


public class Practice {
    public static void main(String[] args) {
        Optional<Member> optional = getMemberByIdFromDB();
        optional.ifPresent(mem -> {
            System.out.println("Member name:" + mem.getName());
        });
    }

    public static Optional<Member> getMemberByIdFromDB() {
        boolean hasName = true;
        if (hasName) {
            return Optional.of(new Member());
        }
        return Optional.empty();
    }
}


class Member {
    private String name;

    
    public String getName() {
        return name;
    }

    // getter / setter
}
