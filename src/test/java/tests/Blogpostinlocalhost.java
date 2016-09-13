package tests;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.Pageafterpostsclick;
import pageobjects.Secondpageafterlogin;

public class Blogpostinlocalhost extends BaseTest {

    String titleforthepost = "Radio Gaga!";

    String forBodyContent = "Lorem ipsum dolor sit amet, liber platonem eam no, solum dignissim vel id. Sea dicta insolens recteque no. No eos ponderum scriptorem. Has munere integre honestatis in. Vix ea eligendi qualisque, ut duo ipsum corpora electram. Sit dicunt principes theophrastus ne, qui id labitur dolorum.\n" +
            "\n" +
            "No pro definiebas reprimique, ad eligendi delicatissimi cum. Vix tantas nominati percipitur id, pro te dico assum, menandri gubergren repudiandae his in. Ei facer possim duo, oportere salutandi his ad, fabulas iracundia vel an. Ut vel ubique perfecto, qui errem sententiae eu. Ad vide sale est, an cum tollit reprehendunt, modus prompta ullamcorper vis ex.\n" +
            "\n" +
            "Mei at urbanitas suscipiantur vituperatoribus, qui te imperdiet abhorreant, magna perfecto liberavisse ex sed. Vel possit aliquip diceret ei. Ipsum congue sea ea, eam movet veniam an. At justo scribentur sed. Quo cetero alterum vituperata at, ceteros efficiantur ullamcorper in sea, mei at postulant salutatus.\n" +
            "\n" +
            "Usu euismod delenit cu. No sea torquatos forensibus theophrastus, mea ad modo liberavisse. No quo unum ubique iudicabit. Ei usu choro scripserit repudiandae, sale intellegat ad eam, ad has primis adipisci. Semper laoreet veritus no ius, eos percipitur consectetuer te.\n";

    @Test
    public void gotothePosts() throws InterruptedException {
        Secondpageafterlogin afterlogin = new Secondpageafterlogin(driver);
        Pageafterpostsclick afterpostsclick = new Pageafterpostsclick(driver);

        Assert.assertEquals("Home",afterlogin.checkforhome());
        System.out.println("Home button found.");
        Assert.assertEquals("Users", afterlogin.checkforusersoption());
        System.out.println("Users option found.");

        afterlogin.clickthePosts();

        Assert.assertEquals("All Posts",afterpostsclick.checkforAllpostoption());
        System.out.println("Found (y)");
        Assert.assertEquals("Add New",afterpostsclick.checkforAddnewoption());
        System.out.println("Found (y)");
        afterpostsclick.addnewpost();

        Assert.assertEquals("Add New Post", afterpostsclick.checkforaddnewpostlabel());
        System.out.println("Found (y)");

        afterpostsclick.setThetitle(titleforthepost);
        System.out.println("Title is Set");
        afterpostsclick.selectvisualoption();
        afterpostsclick.setThebody(forBodyContent);
        afterpostsclick.savethepost();
        System.out.println("Clicked Saved!");
        afterpostsclick.trashthepost(driver);

        afterlogin.movetohowdyadminandlogout();

    }
}
