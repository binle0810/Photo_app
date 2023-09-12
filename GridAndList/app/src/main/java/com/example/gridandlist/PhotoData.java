package com.example.gridandlist;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://d3nfwcxd527z59.cloudfront.net/content/uploads/2023/07/05101755/Nassr-ronaldo-752x428.jpg", "Ronaldo", "Anh 7"));
        photos.add(new Photo(1, "https://library.sportingnews.com/styles/crop_style_16_9_mobile_2x/s3/2023-07/Lionel%20Messi%20Inter%20Miami%20debut%20goal%20072423.jpg?h=920929c4&itok=HgXsmO4Z", "Messi  ", "GOAT"));
        photos.add(new Photo(2, "https://cly.1cdn.vn/2016/01/02/congly-vn_ronaldobeo.jpg", "Ro béo", "Ngưòi ngoài hành tinh"));
        photos.add(new Photo(3, "https://i.pinimg.com/originals/79/c9/18/79c91802fbf973c92d62ad098cdef327.jpg", "Neymar", ""));
        photos.add(new Photo(4, "https://www.daleeeel.com/f/res/h08/articles-photos/000/822/0082279-343-rinnoo-3bacf1bad1cc4079a924b819fe98e74f.jpg", "Halland", ""));
        photos.add(new Photo(5, "https://e00-marca.uecdn.es/deporte/futbol/100-jugadores-2017/imgs/jugadores/harry-kane.JPG", "Kane", ""));
        photos.add(new Photo(6, "https://www.shropshirestar.com/resizer/6T9wDQh3I_ZaYg1jOR3Lkcdbb34=/1200x0/cloudfront-us-east-1.images.arcpublishing.com/mna/HL2MTFQZURHRVBDKNS7ET73EQU.jpg", "Robert Lewandowski", ""));
        photos.add(new Photo(7, "https://images2.minutemediacdn.com/image/fetch/w_2000,h_2000,c_fit/https://mancitysquare.com/wp-content/uploads/getty-images/2017/07/1276982320.jpeg", "Kevin", ""));
        photos.add(new Photo(8, "https://lh5.googleusercontent.com/-seOMyUwPj38/TXCTeGUo_yI/AAAAAAAAAaE/wYukdAGI-NY/s1600/85765088.jpg", "Beck", ""));
        photos.add(new Photo(9, "https://www.gannett-cdn.com/-mm-/7c46291249001549c2624dc4cd6c153d66fd4648/c=0-34-724-443&r=x1683&c=3200x1680/local/-/media/2018/01/17/USATODAY/USATODAY/636518268389723579-AFP-AFP-WY4L3-96648265.JPG", "Ronaldinho", ""));
        return photos;

    }
    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++)
            if(phs.get(i).getId() == id)
                return  phs.get(i);
        return null;
    }
}
