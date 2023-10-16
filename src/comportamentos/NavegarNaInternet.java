package comportamentos;

public interface NavegarNaInternet {
    public void displayPage(String pageName);
    public void addNewTab(String pageName);
    public void seeOpenedTabs();
    public void closeTab(String pageName);
    public void refreshPage();
}
