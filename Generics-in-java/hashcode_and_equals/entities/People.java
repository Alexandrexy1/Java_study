package entities;


public class People {
    private String name;
    private Integer age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        People other = (People) obj;
        
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (age == null) {
            if (other.age != null) return false;
        } else if (!age.equals(other.age)) return false;

        return true;
    }
}
