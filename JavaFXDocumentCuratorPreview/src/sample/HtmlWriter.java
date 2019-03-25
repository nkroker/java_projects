package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by vitthalsrinivasan on 11/10/15.
 */
public class HtmlWriter {

    // recall that HTML = HyperText Markup Language is a way to display text and images in browsers
    // HTML files have a hierarchy of nested tags, for instance <html> and </html> act as the outermost
    // tags.

    public static void writeToHTML(String htmlFileName, Collection<UrlInfo> summaries) {
        BufferedWriter htmlWriter = null;
        try{
            File htmlFile = new File(htmlFileName);
            if (htmlFile.exists()) {
                // we overwrite this file without prompting, a bit rude, but OK for this example!
                htmlFile.delete();
            }
            htmlFile.createNewFile();
            htmlWriter = new BufferedWriter(new FileWriter(htmlFile));

            // now that we have split the 'getting HTML' and 'saving to file', let's just use
            // the HTML getter while saving the file.
            htmlWriter.write(getHtmlRepresentation(summaries));


        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                htmlWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String getHtmlRepresentation(Collection<UrlInfo> summaries) {
        // RIght now, the HtmlWriter class assembles the HTML and writes it to file
        // in a single function. Let's change that so that the 'getting HTML' and 'saving to file'
        // are two different operations. That will allow us to get the HTML in real-time for our
        // preview pane
        StringBuilder stringBuilder = new StringBuilder
                ("<html><body>Hi, <br/> Here are the some interesting snippets <br/><ul/>");

        for (UrlInfo urlInfo : summaries) {
            String body = "<li><b><a href=\"" + urlInfo.getUrl() + "\" target=\"blank\" a>"
                    + urlInfo.getHeadline() + "</a></b>"
                    + urlInfo.getSummary() + "</li>";
            stringBuilder.append("<br/>" + body);
        }

        // what did we do in the loop above: create the html for each URL with a nice link
        // and with some formatting (bullet points, bold for the headline). Note also how the
        // target = "blank" is specified to make sure that the links open in a new window. Also
        // note how the double quotes are escaped (embedded inside a string which itself is
        // delimited by double quotes) using the preceding backslash

        stringBuilder.append("</ul><br/></body></html>");
        return stringBuilder.toString();
    }


}
