public class User {
    public static void main(String[] args) {
        iPhone phone = new iPhone();
        
        phone.play();
        phone.selectSong("Bruno Mars - Talking To The Moon");
        phone.pause();

        phone.call(123456789);
        phone.answer();
        phone.voiceMail();

        phone.displayPage("How to cook rice");
        phone.addNewTab("What to do in LA");
        phone.refreshPage();
        phone.seeOpenedTabs();
        phone.closeTab("How to cook rice");
        phone.closeTab("What to do in LA");
    }   
}
