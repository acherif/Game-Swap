package com.example.hamid.sharevid.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.hamid.sharevid.R;
import com.example.hamid.sharevid.constants.GameState;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamid on 26/06/2016.
 */
public class GameObject implements Parcelable {
    private int mData;

    private String name;
    private int year;
    private String style;
    private String state;
    private int photo;
private String description;
    public GameObject(String name, String state, int year, String style, int photo, String description) {
        this.name = name;
        this.state = state;
        this.year = year;
        this.style = style;
        this.photo = photo;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mData);
    }
    public static final Creator<GameObject> CREATOR = new Creator<GameObject>() {
        public GameObject createFromParcel(Parcel in) {
            return new GameObject(in);
        }

        public GameObject[] newArray(int size) {
            return new GameObject[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private GameObject(Parcel in) {
        mData = in.readInt();
    }

    public static List<GameObject> getListItemData(){
        List<GameObject> listViewItems = new ArrayList<>();
        listViewItems.add(new GameObject("Assasins Creed Syndicate", GameState.AsNew.getValue(), 2014, "Action Adventure", R.drawable.assasins_creed_syndicate, "Assassin's Creed Syndicate is an action-adventure video game developed by Ubisoft Quebec and published by Ubisoft. It was released on October 23, 2015, for the PlayStation 4 and Xbox One, and on November 19, 2015, for Microsoft Windows. It is the ninth major installment in the Assassin's Creed series, and the successor to 2014's Assassin's Creed Unity."));
        listViewItems.add(new GameObject("Fifa 16", GameState.AsNew.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));
        listViewItems.add(new GameObject("Metal Gear Solid 5", GameState.Bad.getValue(), 2015, "Action Infiltration", R.drawable.metal_gear_solid_4, "Metal Gear Solid V: The Phantom Pain[b] is an open world action-adventure stealth video game developed by Kojima Productions and published by Konami for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360 and Xbox One.[1][2] It was released worldwide on September 1, 2015.[3][4] It is the ninth and final installment in the series directed, written and designed by Hideo Kojima following Metal Gear Solid V: Ground Zeroes, a stand-alone prologue released the previous year,[5] as well as his final work prior to his departure from Konami. Set in 1984, nine years after the events of Ground Zeroes and a decade before the events of the original Metal Gear, the story follows mercenary leader Venom Snake as he ventures into Soviet-occupied Kabul and the Angola–Zaire border region to exact revenge on the people who destroyed his forces and came close to killing him during the climax of Ground Zeroes. It carries over the tagline of Tactical Espionage Operations first used in Metal Gear Solid: Peace Walker.[6]"));
        listViewItems.add(new GameObject("Metal Gear Solid 5", GameState.Medium.getValue(), 2015, "Action Infiltration", R.drawable.metal_gear_solid_4, "Metal Gear Solid V: The Phantom Pain[b] is an open world action-adventure stealth video game developed by Kojima Productions and published by Konami for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360 and Xbox One.[1][2] It was released worldwide on September 1, 2015.[3][4] It is the ninth and final installment in the series directed, written and designed by Hideo Kojima following Metal Gear Solid V: Ground Zeroes, a stand-alone prologue released the previous year,[5] as well as his final work prior to his departure from Konami. Set in 1984, nine years after the events of Ground Zeroes and a decade before the events of the original Metal Gear, the story follows mercenary leader Venom Snake as he ventures into Soviet-occupied Kabul and the Angola–Zaire border region to exact revenge on the people who destroyed his forces and came close to killing him during the climax of Ground Zeroes. It carries over the tagline of Tactical Espionage Operations first used in Metal Gear Solid: Peace Walker.[6]"));
        listViewItems.add(new GameObject("Metal Gear Solid 5", GameState.Medium.getValue(), 2015, "Action Infiltration", R.drawable.metal_gear_solid_4, "Metal Gear Solid V: The Phantom Pain[b] is an open world action-adventure stealth video game developed by Kojima Productions and published by Konami for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360 and Xbox One.[1][2] It was released worldwide on September 1, 2015.[3][4] It is the ninth and final installment in the series directed, written and designed by Hideo Kojima following Metal Gear Solid V: Ground Zeroes, a stand-alone prologue released the previous year,[5] as well as his final work prior to his departure from Konami. Set in 1984, nine years after the events of Ground Zeroes and a decade before the events of the original Metal Gear, the story follows mercenary leader Venom Snake as he ventures into Soviet-occupied Kabul and the Angola–Zaire border region to exact revenge on the people who destroyed his forces and came close to killing him during the climax of Ground Zeroes. It carries over the tagline of Tactical Espionage Operations first used in Metal Gear Solid: Peace Walker.[6]"));
        listViewItems.add(new GameObject("Assasins Creed Syndicate", GameState.Medium.getValue(), 2014, "Action Adventure", R.drawable.assasins_creed_syndicate, "Assassin's Creed Syndicate is an action-adventure video game developed by Ubisoft Quebec and published by Ubisoft. It was released on October 23, 2015, for the PlayStation 4 and Xbox One, and on November 19, 2015, for Microsoft Windows. It is the ninth major installment in the Assassin's Creed series, and the successor to 2014's Assassin's Creed Unity."));
        listViewItems.add(new GameObject("Fifa 16", GameState.Good.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));
        listViewItems.add(new GameObject("Fifa 16", GameState.Good.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));
        listViewItems.add(new GameObject("Fifa 16", GameState.AsNew.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));
        listViewItems.add(new GameObject("Fifa 16", GameState.Bad.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));
        listViewItems.add(new GameObject("Assasins Creed Syndicate", GameState.AsNew.getValue(), 2014, "Action Adventure", R.drawable.assasins_creed_syndicate, "Assassin's Creed Syndicate is an action-adventure video game developed by Ubisoft Quebec and published by Ubisoft. It was released on October 23, 2015, for the PlayStation 4 and Xbox One, and on November 19, 2015, for Microsoft Windows. It is the ninth major installment in the Assassin's Creed series, and the successor to 2014's Assassin's Creed Unity."));
        listViewItems.add(new GameObject("Fifa 16", GameState.AsNew.getValue(), 2015, "Sport", R.drawable.fifa_16_jaquette_antoine_griezmann, "FIFA 16 is an association football simulation video game developed by EA Canada and published by EA Sports for Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360, Xbox One, Android and iOS."));

        return listViewItems;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
