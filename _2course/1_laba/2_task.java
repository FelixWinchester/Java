// Java Class Main (1)
public class Main {
    public static void main(String[] args) {
        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        SimpleUrl parsedUrl = SimpleUrl.parseUrl(url);

        System.out.println(parsedUrl);
    }
}

// Java Class SimpleUrl
public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;
    private int intParam;
    private double doubleParam;
    private String textParameter;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    public void setWebPageExtension(String webPageExtension) {
        this.webPageExtension = webPageExtension;
    }

    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public String getTextParameter() {
        return textParameter;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    @Override
    public String toString() {
        return "protocol = " + protocol + "\n" +
                "address = " + address + "\n" +
                "domainZone = " + domainZone + "\n" +
                "siteName = " + siteName + "\n" +
                "webpageName = " + webpageName + "\n" +
                "webPageExtension = " + webPageExtension + "\n" +
                "intParam = " + intParam + "\n" +
                "doubleParam = " + doubleParam + "\n" +
                "textParameter = " + textParameter;
    }

    public static SimpleUrl parseUrl(String url) {
        SimpleUrl simpleUrl = new SimpleUrl();

        // Разбиваем URL на части
        String[] urlParts = url.split("\\?");
        String basePart = urlParts[0];
        String paramPart = urlParts.length > 1 ? urlParts[1] : "";

        // Разбор базовой части URL
        String[] baseSections = basePart.split("://");
        simpleUrl.setProtocol(baseSections[0]);

        String[] addressParts = baseSections[1].split("/", 3);
        simpleUrl.setAddress(addressParts[0]);

        String[] domainParts = addressParts[0].split("\\.");
        simpleUrl.setSiteName(domainParts[0]);
        simpleUrl.setDomainZone(domainParts[domainParts.length - 1]);

        String[] webpageParts = addressParts[2].split("\\.");
        simpleUrl.setWebpageName(webpageParts[0]);
        simpleUrl.setWebPageExtension(webpageParts[1]);

        if (!paramPart.isEmpty()) {
            String[] params = paramPart.split("&");
            for (String param : params) {
                String[] keyValue = param.split("=");
                String key = keyValue[0];
                String value = keyValue[1];

                switch (key) {
                    case "intParam":
                        simpleUrl.setIntParam(Integer.parseInt(value));
                        break;
                    case "doubleParam":
                        simpleUrl.setDoubleParam(Double.parseDouble(value));
                        break;
                    case "textParameter":
                        simpleUrl.setTextParameter(value);
                        break;
                }
            }
        }

        return simpleUrl;
    }
}

