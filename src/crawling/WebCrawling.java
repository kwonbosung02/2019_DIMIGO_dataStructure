package crawling;

/*public class WebCrawling {
    public static void main(String[] args) {
        try{

             Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
             Elements result = doc.select("[realtimeRankFavorite]").select( "li" ).select( "a" );
            List<String> list  = result.eachText();
            int i = 0;
            for(String title : list){
                System.out.printf("%d. %s\n",+i,title);
            }

        }
        catch (Exception e){

            e.printStackTrace();
        }

    }
}
*/