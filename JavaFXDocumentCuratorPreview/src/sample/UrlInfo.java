package sample;
/**
 * Created by vitthalsrinivasan on 11/10/15.
 */
public class UrlInfo {

    private String url;
    private String headline;
    private String summary;

    public UrlInfo(String url) {
        this.url = url;
        this.headline = url;
        this.summary = "";
    }

    // Copy Constructor
    public UrlInfo(UrlInfo urlInfo) {
        this.url = urlInfo.getUrl();
        this.headline = urlInfo.getHeadline();
        this.summary = urlInfo.getSummary();

        // btw: note that although we use the 'getters' in the
        // UrlInfo object passed in, we could have chose to access
        // the member variables directly (even though they are private)
        // because all objects can access private member variables of
        // other objects of the same class.
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
