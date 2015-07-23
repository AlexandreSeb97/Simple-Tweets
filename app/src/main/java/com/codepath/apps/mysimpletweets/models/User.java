package com.codepath.apps.mysimpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MDE on 7/22/2015.
 */
public class User {
    // list attributes
    private long uid;
    private String screenName;
    private String profileImageUrl;
    private String name;

    public String getName() {
        return name;
    }
    public long getUid() {
        return uid;
    }
    public String getScreenName() {
        return screenName;
    }
    public String getProfileImageUrl() {
        return profileImageUrl;
    }
    // deserialize the user json
    public static User fromJSON(JSONObject json) {
        User u = new User();
        // Extract and fills the values
        try {
            u.name = json.getString("name");
            u.uid = json.getLong("id");
            u.screenName = json.getString("screen name");
            u.profileImageUrl = json.getString("profile_image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        // Return a user
        return u;
    }
}
