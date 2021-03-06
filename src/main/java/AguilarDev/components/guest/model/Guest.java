package AguilarDev.components.guest.model;

import AguilarDev.components.contactInfo.model.ContactInfo;
import AguilarDev.components.song.model.Song;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Guest {
    @Id
    public String id;

    private ContactInfo contactInfo;
    private String attending;
    private String plusOne;
    private List<String> mealChoice;
    private List<Song> songRequests;

    public Guest() {
    }

    public String getId() {
        return id;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public String getPlusOne() {
        return plusOne;
    }

    public List<String> getMealChoice() {
        return mealChoice;
    }

    public List<Song> getSongRequests() {
        return songRequests;
    }

    public String getAttending() {
        return attending;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setPlusOne(String plusOne) {
        this.plusOne = plusOne;
    }

    public void setMealChoice(List<String> mealChoice) {
        this.mealChoice = mealChoice;
    }

    public void setSongRequests(List<Song> songRequests) {
        this.songRequests = songRequests;
    }

    public void setAttending(String attending) {
        this.attending = attending;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id='" + id + '\'' +
                ", contactInfo=" + contactInfo +
                ", attending='" + attending + '\'' +
                ", plusOne=" + plusOne +
                ", mealChoice=" + mealChoice +
                ", songRequests=" + songRequests +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guest guest = (Guest) o;

        if (id != null ? !id.equals(guest.id) : guest.id != null) return false;
        if (contactInfo != null ? !contactInfo.equals(guest.contactInfo) : guest.contactInfo != null) return false;
        if (attending != null ? !attending.equals(guest.attending) : guest.attending != null) return false;
        if (plusOne != null ? !plusOne.equals(guest.plusOne) : guest.plusOne != null) return false;
        if (mealChoice != null ? !mealChoice.equals(guest.mealChoice) : guest.mealChoice != null) return false;
        return songRequests != null ? songRequests.equals(guest.songRequests) : guest.songRequests == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (attending != null ? attending.hashCode() : 0);
        result = 31 * result + (plusOne != null ? plusOne.hashCode() : 0);
        result = 31 * result + (mealChoice != null ? mealChoice.hashCode() : 0);
        result = 31 * result + (songRequests != null ? songRequests.hashCode() : 0);
        return result;
    }
}
