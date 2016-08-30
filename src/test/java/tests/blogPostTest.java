package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.LoggedinPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Katun on 28/08/2016.
 */
public class blogPostTest {

    WebDriver dvr;

    @Test
    public void startABlogPost(){
        this.dvr = new FirefoxDriver();

        String PostBody = "Lorem ipsum dolor sit amet, sed id illud nostro similique, natum placerat perpetua quo ex, mea dolore nonumes cu. His an dicit recteque imperdiet. Vix id melius iudicabit. Pri minim eligendi dissentiunt eu, cetero electram et eos, utinam accusamus sententiae id nam. Ne harum movet appetere usu, ponderum accusamus appellantur ut cum, qui ei solet animal. Mentitum deseruisse nam at, cum id everti patrioque, vis labore eleifend iracundia ne.\n" +
                "\n" +
                "At nihil causae feugiat quo, qui ea novum possit, mea partem disputationi in. At per soleat assueverit, justo pertinax cum ut. Oratio fierent suavitate in eam, pro te nonumy partem constituam. Legere nostrud concludaturque sea ex, nusquam deterruisset mei et. In pro veniam tractatos.\n" +
                "\n" +
                "Te persius meliore mea, ius cibo omittantur at, at meis assum consectetuer nec. In eam cibo utinam facilisi, nec fastidii intellegebat eu. No mel utamur mentitum. Vix no primis aliquid sapientem. Fuisset quaerendum at est. Eu sea eius consetetur, nam detraxit repudiandae ea.\n" +
                "\n" +
                "Volumus philosophia his an. Mea aperiam maiorum honestatis ex, autem bonorum an pro. Id vim diam nonumy, an cibo dicunt partiendo nec, duo ne ubique molestie assentior. Est posse maiestatis efficiendi at, dolor recteque mediocrem vim et.\n" +
                "\n" +
                "At vel impetus molestie gubergren, eos mazim habemus fastidii an, homero recusabo eum no. Elitr prodesset adolescens ad vim, clita scaevola expetenda duo ei. Modus eruditi forensibus ex his, laudem intellegat eam no. Mundi phaedrum vim ex, te his quando complectitur. Reprimique deterruisset no mel.";

        this.dvr.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(dvr);
        LoggedinPage blogpostLogin = new LoggedinPage(dvr);

        loginPage.setUsername("chandru713");
        loginPage.setPassword("Chandr@713");
        loginPage.login();


        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.MySite();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.blogPost();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.addPost();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.addTitle("Title for the text below");

        dvr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        blogpostLogin.addBody(PostBody, dvr);

        dvr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        blogpostLogin.preview();

        blogpostLogin.publish();
        dvr.quit();
    }


}

