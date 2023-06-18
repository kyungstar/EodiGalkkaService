/*
package com.eodi.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrawlerService {

    public static List<AbstractReadWriteAccess.Item> crawlerList(int travelSeq, String targetKeyword, String sort, int page) {
        try {
            // travelCountUpdateResult 변수 선언 및 초기화
            boolean travelCountUpdateResult = DB.Executer(QM.Update("t_travel", new String[]{
                    "today_view_cnt = \\today_view_cnt + 1",
                    "total_view_cnt = \\total_view_cnt + 1"
            }, new String[]{
                    "travel_seq = " + travelSeq
            }));

            if (!travelCountUpdateResult)
                return JustFalse("TN0");

            // Item 클래스 정의
            class Item {
                private int itemSeq;
                private String title;
                private int price;
                private String image;
                private String mallProductUrl;
                private int mobileItemPrice;

                // Getter and Setter methods
            }

            // target 변수 인코딩
            String target = java.net.URLEncoder.encode(targetKeyword, "UTF-8");

            String targetUrl = "https://search.shopping.naver.com/search/all?frm=NVSCTAB&origQuery=" +
                    target + "&pagingIndex=" + page + "&productSet=total&query=" +
                    target + "&sort=" + sort + "&timestamp=&viewType=list";

            Document doc = Jsoup.connect(targetUrl).get();

            List<Item> items = new ArrayList<>();

            Elements scriptTags = doc.select("script#__NEXT_DATA__");

            if (scriptTags.isEmpty())
                return JustFalse("WN0");

            String scriptTag = scriptTags.first().html();
            JSONObject scriptData = new JSONObject(scriptTag);
            JSONArray productList = scriptData.getJSONObject("props")
                    .getJSONObject("pageProps")
                    .getJSONObject("initialState")
                    .getJSONObject("products")
                    .getJSONArray("list");

            for (int i = 0; i < productList.length(); i++) {
                JSONObject productData = productList.getJSONObject(i).getJSONObject("item");

                int itemSeq = productData.getInt("id");
                String itemUrl = productData.getString("productName");
                String itemPrice = productData.getString("price");
                int mobileItemPrice = productData.getInt("mobileLowPrice");
                String itemImage = productData.getString("imageUrl");
                String mallProductUrl = productData.optString("mallProductUrl");

                // 예외 처리
                if (mallProductUrl.isEmpty())
                    mallProductUrl = productData.getString("adcrUrl");

                Item item = new Item();
                item.setItemSeq(itemSeq);
                item.setTitle(itemUrl);
                item.setPrice(Integer.parseInt(itemPrice));
                item.setImage(itemImage);
                item.setMallProductUrl(mallProductUrl);
                item.setMobileItemPrice(mobileItemPrice);

                items.add(item);
            }

            if (!items.isEmpty())
                return ObjTrue("WN0", List.of(items));
            else
                return JustFalse("WN0");

        } catch (IOException e) {
            return JustErr(e);
        }
    }

}
*/
