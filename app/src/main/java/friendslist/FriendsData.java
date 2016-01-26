package friendslist;

import java.util.ArrayList;

/**
 * Created by Joo on 2016-01-26.
 */
public class FriendsData {
    String groupName;
    ArrayList<PersonData> person = new ArrayList<PersonData>();

    public FriendsData(){}

    public FriendsData(String groupName, ArrayList<PersonData> person) {
        this.groupName = groupName;
        this.person = person;
    }
}
