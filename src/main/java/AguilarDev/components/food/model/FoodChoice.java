package AguilarDev.components.food.model;

import java.util.List;

/**
 * Created by peteraguilar on 3/14/17.
 */
public class FoodChoice {
    private String firstName;
    private String lastName;
    private List<String> mealChoice;

    public FoodChoice(String firstName, String lastName, List<String> mealChoice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mealChoice = mealChoice;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getMealChoice() {
        return mealChoice;
    }

    @Override
    public String toString() {
        return "FoodChoice{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", mealChoice=" + mealChoice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodChoice that = (FoodChoice) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return mealChoice != null ? mealChoice.equals(that.mealChoice) : that.mealChoice == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (mealChoice != null ? mealChoice.hashCode() : 0);
        return result;
    }
}
