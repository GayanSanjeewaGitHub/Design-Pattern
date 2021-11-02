 
 /**
 *
 * @author GAYAN SANJEEWA
 */

  class Test {

    public static void main(String[] args) {
        Filter1 f1 = new Filter1();
        Filter2 f2 = new Filter2();
        Filter3 f3 = new Filter3();

        f1.setNext(f2);
        f2.setNext(f3);

        Request request = new Request("www.AAA.com/A.jsp");
        request.setParameters("username=aaa&password=111");
        f1.checkValidity(request);

    }

}

class Request {

    String url;
    String parameters;

    public Request(String url) {
        this.url = url;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getUrl() {
        return url;
    }

    public String getParameters() {
        return parameters;
    }

}

abstract class Filter {

    protected Filter filter;

    public void setNext(Filter filter) {
        this.filter = filter;
    }

    public abstract void checkValidity(Request request);
}

class Filter1 extends Filter {

    @Override
    public void checkValidity(Request request) {
        if (request.getUrl().contains(".jsp")) {
            filter.checkValidity(request);
        } else {
            System.out.println("not redirecting to the Jsp file");
        }
    }

}

class Filter2 extends Filter {

    @Override
    public void checkValidity(Request request) {
        String[] paraSet = request.getParameters().split("&");
        if (paraSet[0].contains("username") && paraSet[1].contains("password")) {
            filter.checkValidity(request);
        } else {
            System.out.println("wrong parameters, need to  contain 'username' and 'password'");
        }
    }
}

class Filter3 extends Filter {

    @Override
    public void checkValidity(Request request) {
        String[] paraSet = request.getParameters().split("&");
        String[] username = paraSet[0].split("=");
        String[] password = paraSet[1].split("=");
        if (username[1].equals("aaa") && password[1].contains("111")) {
            System.out.println("successfuly redirected");
        } else {
            System.out.println("invalid  details");
        }
    }

}