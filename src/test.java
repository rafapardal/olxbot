import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "checkbox_accept-terms")
    @CacheLookup
    private WebElement aceitoOsTermosDeUtilizao;

    @FindBy(css = "#activateme a.link")
    @CacheLookup
    private WebElement activarSeleccionados1;

    @FindBy(css = "#activatemelimited a.link")
    @CacheLookup
    private WebElement activarSeleccionados2;

    @FindBy(css = "a[title='Ajuda']")
    @CacheLookup
    private WebElement ajuda;

    @FindBy(id = "login-box-ads")
    @CacheLookup
    private WebElement anncios;

    @FindBy(id = "login-box-observed-ads")
    @CacheLookup
    private WebElement anncios2;

    @FindBy(id = "postNewAdLink")
    @CacheLookup
    private WebElement anunciarEVender1;

    @FindBy(css = "a.button.big4.br3.add.cfff.large.rel")
    @CacheLookup
    private WebElement anunciarEVender2;

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/archive/']")
    @CacheLookup
    private WebElement arquivados;

    @FindBy(css = "a[href='https://www.olx.pt/contactos/']")
    @CacheLookup
    private WebElement atravsDoFormulrioDeContacto;

    @FindBy(css = "a.closeVerification.link")
    @CacheLookup
    private WebElement cancelarOProcessoDeVerificao;

    @FindBy(css = "a.fright.button.cfff.br3.x-large")
    @CacheLookup
    private WebElement carregarConta;

    @FindBy(css = "a[title='Carreiras no OLX']")
    @CacheLookup
    private WebElement carreirasNoOlx;

    @FindBy(css = "a.link.gray.nowrap")
    @CacheLookup
    private WebElement comoFunciona;

    @FindBy(css = "a[title='Compra Segura']")
    @CacheLookup
    private WebElement compraSegura;

    @FindBy(css = "#confirmme a.link")
    @CacheLookup
    private WebElement confirmarSeleccionados;

    @FindBy(id = "globalCheckbox")
    @CacheLookup
    private WebElement contaPrateadaComBrilhantesCompatvel;

    @FindBy(css = "a[title='Contacte-nos']")
    @CacheLookup
    private WebElement contactenos;

    @FindBy(css = "input.close")
    @CacheLookup
    private WebElement continuar;

    @FindBy(css = "a.continueVerification.link-primary")
    @CacheLookup
    private WebElement continuarVerificao;

    @FindBy(css = "a[href='https://www.olx.pt/account/register/']")
    @CacheLookup
    private WebElement crieUmaContaParaGuardar;

    @FindBy(id = "login-box-settings")
    @CacheLookup
    private WebElement dadosPessoais1;

    @FindBy(id = "se_accountShop")
    @CacheLookup
    private WebElement dadosPessoais2;

    @FindBy(css = "a.close.link")
    @CacheLookup
    private WebElement decidirMaisTarde;

    @FindBy(id = "userEmailRegister")
    @CacheLookup
    private WebElement desejoReceberTodasAsNovidadesDo1;

    @FindBy(id = "userPassRegister")
    @CacheLookup
    private WebElement desejoReceberTodasAsNovidadesDo2;

    @FindBy(id = "checkbox_accept-newsletter")
    @CacheLookup
    private WebElement desejoReceberTodasAsNovidadesDo3;

    @FindBy(id = "promoteAdRow")
    @CacheLookup
    private WebElement destacar1;

    @FindBy(id = "promoteAdRow")
    @CacheLookup
    private WebElement destacar2;

    @FindBy(css = "#promoteme a.link")
    @CacheLookup
    private WebElement destacarSeleccionados;

    @FindBy(css = "a[title='Destaques']")
    @CacheLookup
    private WebElement destaques;

    @FindBy(css = "a[href='https://www.olx.pt/anunciar/edit/535441377/?bs=myaccount_edit&ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index']")
    @CacheLookup
    private WebElement editar1;

    @FindBy(css = "a[href='https://www.olx.pt/anunciar/edit/535441227/?bs=myaccount_edit&ref%5B0%5D%5Baction%5D=myaccount&ref%5B0%5D%5Bmethod%5D=index']")
    @CacheLookup
    private WebElement editar2;

    @FindBy(css = "a[href='https://www.olx.pt/account/?origin=observepopup']")
    @CacheLookup
    private WebElement efectueOSeuLogin1;

    @FindBy(id = "login_tab")
    @CacheLookup
    private WebElement efectueOSeuLogin2;

    @FindBy(id = "se_userLogin")
    @CacheLookup
    private WebElement efectueOSeuLogin3;

    @FindBy(id = "footerAppIphone")
    @CacheLookup
    private WebElement emAppstoreDownloadNaAppstore;

    @FindBy(id = "footerAppAndroid")
    @CacheLookup
    private WebElement emGooglePlayFaaDownload;

    @FindBy(id = "footerAppIphone")
    @CacheLookup
    private WebElement emWindowsstoreDownloadWindowsPhone;

    @FindBy(css = "a.link.resendCode.hidden")
    @CacheLookup
    private WebElement enviarCdigoNovamente;

    @FindBy(css = "a.link.enterPhone")
    @CacheLookup
    private WebElement escolherOutroNmeroDeTelefone;

    @FindBy(id = "synchronizeObservedConfirm")
    @CacheLookup
    private WebElement guardar;

    @FindBy(css = "a[href='https://www.olx.pt/anuncio/leaflet/conta-prateada-com-brilhantes-compatvel-com-pandora-IDAeELf.html']")
    @CacheLookup
    private WebElement imprimir1;

    @FindBy(css = "a[href='https://www.olx.pt/anuncio/leaflet/conta-prateada-com-brilhantes-compatvel-com-pandora-IDAeEIP.html']")
    @CacheLookup
    private WebElement imprimir2;

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/settings/#ma']")
    @CacheLookup
    private WebElement indicarConta;

    @FindBy(name = "verification[code]")
    @CacheLookup
    private WebElement introduzaOCdigo;

    @FindBy(name = "verification[countryCode]")
    @CacheLookup
    private WebElement introduzaOSeuNmeroDeTelemvel1;

    @FindBy(name = "verification[phone]")
    @CacheLookup
    private WebElement introduzaOSeuNmeroDeTelemvel2;

    @FindBy(id = "userEmail")
    @CacheLookup
    private WebElement lembrarmeDaPassword1;

    @FindBy(id = "userPass")
    @CacheLookup
    private WebElement lembrarmeDaPassword2;

    @FindBy(id = "checkbox_user-remember")
    @CacheLookup
    private WebElement lembrarmeDaPassword3;

    @FindBy(css = "#adsTable tbody.tbody tr:nth-of-type(2) td table.table tbody tr td:nth-of-type(3) table.table.table-stats tbody tr td:nth-of-type(2) div.nowrap.rel.statsviewscloud div.suggesttitlebottom.abs.zi2.br3.normal.small.lheight14.hidden div.suggesttext.tleft a.link.clearViews")
    @CacheLookup
    private WebElement limpar1;

    @FindBy(css = "#adsTable tbody.tbody tr:nth-of-type(5) td table.table tbody tr td:nth-of-type(3) table.table.table-stats tbody tr td:nth-of-type(2) div.nowrap.rel.statsviewscloud div.suggesttitlebottom.abs.zi2.br3.normal.small.lheight14.hidden div.suggesttext.tleft a.link.clearViews")
    @CacheLookup
    private WebElement limpar2;

    @FindBy(id = "login-box-logout")
    @CacheLookup
    private WebElement logOut;

    @FindBy(id = "fblogin")
    @CacheLookup
    private WebElement loginComFacebook1;

    @FindBy(css = "#registerForm a.login-button.login-button--facebook")
    @CacheLookup
    private WebElement loginComFacebook2;

    @FindBy(css = "a.login-button.login-button--email")
    @CacheLookup
    private WebElement loginComPassword;

    @FindBy(css = "a[title='Mapa do site']")
    @CacheLookup
    private WebElement mapaDoSite;

    @FindBy(css = "#addFlagAds a.link")
    @CacheLookup
    private WebElement marcarComoRecomendadoNoMinisite1;

    @FindBy(id = "renderCheckbox1-1")
    @CacheLookup
    private WebElement marcarComoRecomendadoNoMinisite2;

    @FindBy(id = "renderCheckbox1-2")
    @CacheLookup
    private WebElement marcarComoRecomendadoNoMinisite3;

    @FindBy(id = "login-box-answers")
    @CacheLookup
    private WebElement mensagens1;

    @FindBy(id = "se_accountAnswers")
    @CacheLookup
    private WebElement mensagens2;

    @FindBy(id = "footerLinkMobileApps")
    @CacheLookup
    private WebElement mobileApps;

    @FindBy(name = "reson")
    @CacheLookup
    private List<WebElement> no1;

    @FindBy(name = "reson")
    @CacheLookup
    private List<WebElement> no2;

    @FindBy(name = "reson")
    @CacheLookup
    private List<WebElement> no3;

    @FindBy(name = "reson")
    @CacheLookup
    private List<WebElement> no4;

    @FindBy(css = "#saveFavDiv div:nth-of-type(2) p.margin20_0.large.lheight18 a.link")
    @CacheLookup
    private WebElement noObrigado1;

    @FindBy(id = "synchronizeObservedCancel")
    @CacheLookup
    private WebElement noObrigado2;

    @FindBy(name = "title")
    @CacheLookup
    private WebElement noTemDeMomentoAnnciosActivos;

    @FindBy(css = "a[href='http://www.olx.co.ao']")
    @CacheLookup
    private WebElement olxCoAo;

    @FindBy(css = "a[href='http://olx.co.mz']")
    @CacheLookup
    private WebElement olxCoMz;

    @FindBy(css = "a.inlblk.icon.appstore")
    @CacheLookup
    private WebElement olxPtAppstore;

    @FindBy(css = "a.inlblk.icon.googleplay")
    @CacheLookup
    private WebElement olxPtGoogleplay;

    @FindBy(css = "a.inlblk.icon.windowsstore")
    @CacheLookup
    private WebElement olxPtWindowsstore;

    @FindBy(id = "headerLogo")
    @CacheLookup
    private WebElement olxSeValeXOlx;

    @FindBy(css = "#mandatoryLoginDiv div.mandatory-login.clr div:nth-of-type(2) div.login-box div.login-tabs ul.login-tabs__content li:nth-of-type(1) div.login-form p.login-form__terms a")
    @CacheLookup
    private WebElement osTermosECondies;

    @FindBy(css = "a.login-form__othermethods")
    @CacheLookup
    private WebElement outrasOpesDeLogin;

    @FindBy(id = "changePeriod")
    @CacheLookup
    private WebElement pacoteDeParaOTopo1;

    @FindBy(id = "pushup_chart_link")
    @CacheLookup
    private WebElement pacoteDeParaOTopo2;

    @FindBy(id = "se_accountWallet")
    @CacheLookup
    private WebElement pagamentos;

    private final String pageLoadedText = "Faça a gestão de todos os seus anúncios";

    private final String pageUrl = "/myaccount/";

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/moderated/']")
    @CacheLookup
    private WebElement paraEdio;

    @FindBy(id = "footerPartners")
    @CacheLookup
    private WebElement parceiros;

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/waiting/']")
    @CacheLookup
    private WebElement pendentes;

    @FindBy(css = "input.vtop.fright.icon")
    @CacheLookup
    private WebElement pesquisar;

    @FindBy(id = "login-box-observed-search")
    @CacheLookup
    private WebElement pesquisas9;

    @FindBy(css = "a[title='Pesquisas populares']")
    @CacheLookup
    private WebElement pesquisasPopulares;

    @FindBy(css = "a[title='Portugal']")
    @CacheLookup
    private WebElement portugal;

    @FindBy(id = "topLoginLink")
    @CacheLookup
    private WebElement rafapardal07;

    @FindBy(css = "#realEstateDiv div:nth-of-type(2) p:nth-of-type(2) a.link")
    @CacheLookup
    private WebElement realestatelayercancel;

    @FindBy(css = "a[href='https://www.olx.pt/payment/multipay/?index%5B0%5D=15&subscriptionCategoryId=1']")
    @CacheLookup
    private WebElement realestatelayersubmit;

    @FindBy(css = "a.login-form__lostpassword")
    @CacheLookup
    private WebElement recuperarPassword;

    @FindBy(id = "register_tab")
    @CacheLookup
    private WebElement registarNoOlx1;

    @FindBy(id = "button_register")
    @CacheLookup
    private WebElement registarNoOlx2;

    @FindBy(css = "#removeme a.link")
    @CacheLookup
    private WebElement remover1;

    @FindBy(id = "deactivate535441377")
    @CacheLookup
    private WebElement remover2;

    @FindBy(id = "deactivate535441227")
    @CacheLookup
    private WebElement remover3;

    @FindBy(css = "#deactivateme a.link")
    @CacheLookup
    private WebElement removerAnncios;

    @FindBy(id = "loadReplices")
    @CacheLookup
    private WebElement respostas;

    @FindBy(css = "#removeFlagAds a.link")
    @CacheLookup
    private WebElement retirarDeRecomendadoNoMinisite;

    @FindBy(css = "a.inlblk.tdnone.lheight22")
    @CacheLookup
    private WebElement saberMaisSobreOsLimites;

    @FindBy(css = "a.olx-button.olx-button--primary.olx-button-medium.js-close-reason-popup")
    @CacheLookup
    private WebElement saibaMais1;

    @FindBy(css = "a.link.tdnone.cookiesBarClose")
    @CacheLookup
    private WebElement saibaMais2;

    @FindBy(css = "a[title='Tarifário']")
    @CacheLookup
    private WebElement tarifrio;

    @FindBy(css = "a[title='Termos de utilização']")
    @CacheLookup
    private WebElement termosDeUtilizao;

    @FindBy(css = "a[title='Termos e Condições']")
    @CacheLookup
    private WebElement termosECondies;

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/?order=asc&orderType=title']")
    @CacheLookup
    private WebElement ttulo;

    @FindBy(css = "#smsVerificationStep2Form fieldset div.fblock.clr div.focusbox input:nth-of-type(2)")
    @CacheLookup
    private WebElement verificar;

    @FindBy(css = "a[href='https://www.olx.pt/myaccount/points/']")
    @CacheLookup
    private WebElement verificarDataDeExpiraoDosPontos;

    @FindBy(id = "loadViews")
    @CacheLookup
    private WebElement visualizaes;

    @FindBy(id = "preview535441377")
    @CacheLookup
    private WebElement visualizarAnncio1;

    @FindBy(id = "preview535441227")
    @CacheLookup
    private WebElement visualizarAnncio2;

    @FindBy(css = "a.close.margin20_30")
    @CacheLookup
    private WebElement voltarAosMeusAnncios;

    @FindBy(css = "#adsTable tbody.tbody tr:nth-of-type(2) td table.table tbody tr td:nth-of-type(3) table.table.table-stats tbody tr td:nth-of-type(5) div.nowrap span:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement widget1;

    @FindBy(css = "#adsTable tbody.tbody tr:nth-of-type(5) td table.table tbody tr td:nth-of-type(3) table.table.table-stats tbody tr td:nth-of-type(5) div.nowrap span:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement widget2;

    @FindBy(id = "header-banner-close")
    @CacheLookup
    private WebElement x;

    public test() {
    }

    public test(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public test(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public test(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Activar Seleccionados Link.
     *
     * @return the test class instance.
     */
    public test clickActivarSeleccionados1Link() {
        activarSeleccionados1.click();
        return this;
    }

    /**
     * Click on Activar Seleccionados Link.
     *
     * @return the test class instance.
     */
    public test clickActivarSeleccionados2Link() {
        activarSeleccionados2.click();
        return this;
    }

    /**
     * Click on Ajuda Link.
     *
     * @return the test class instance.
     */
    public test clickAjudaLink() {
        ajuda.click();
        return this;
    }

    /**
     * Click on Anncios 2 Link.
     *
     * @return the test class instance.
     */
    public test clickAnncios2Link() {
        anncios2.click();
        return this;
    }

    /**
     * Click on Anncios Link.
     *
     * @return the test class instance.
     */
    public test clickAnnciosLink() {
        anncios.click();
        return this;
    }

    /**
     * Click on Anunciar E Vender Link.
     *
     * @return the test class instance.
     */
    public test clickAnunciarEVender1Link() {
        anunciarEVender1.click();
        return this;
    }

    /**
     * Click on Anunciar E Vender Link.
     *
     * @return the test class instance.
     */
    public test clickAnunciarEVender2Link() {
        anunciarEVender2.click();
        return this;
    }

    /**
     * Click on Arquivados Link.
     *
     * @return the test class instance.
     */
    public test clickArquivadosLink() {
        arquivados.click();
        return this;
    }

    /**
     * Click on Atravs Do Formulrio De Contacto Link.
     *
     * @return the test class instance.
     */
    public test clickAtravsDoFormulrioDeContactoLink() {
        atravsDoFormulrioDeContacto.click();
        return this;
    }

    /**
     * Click on Cancelar O Processo De Verificao Link.
     *
     * @return the test class instance.
     */
    public test clickCancelarOProcessoDeVerificaoLink() {
        cancelarOProcessoDeVerificao.click();
        return this;
    }

    /**
     * Click on Carregar Conta Link.
     *
     * @return the test class instance.
     */
    public test clickCarregarContaLink() {
        carregarConta.click();
        return this;
    }

    /**
     * Click on Carreiras No Olx Link.
     *
     * @return the test class instance.
     */
    public test clickCarreirasNoOlxLink() {
        carreirasNoOlx.click();
        return this;
    }

    /**
     * Click on Como Funciona Link.
     *
     * @return the test class instance.
     */
    public test clickComoFuncionaLink() {
        comoFunciona.click();
        return this;
    }

    /**
     * Click on Compra Segura Link.
     *
     * @return the test class instance.
     */
    public test clickCompraSeguraLink() {
        compraSegura.click();
        return this;
    }

    /**
     * Click on Confirmar Seleccionados Link.
     *
     * @return the test class instance.
     */
    public test clickConfirmarSeleccionadosLink() {
        confirmarSeleccionados.click();
        return this;
    }

    /**
     * Click on Contactenos Link.
     *
     * @return the test class instance.
     */
    public test clickContactenosLink() {
        contactenos.click();
        return this;
    }

    /**
     * Click on Continuar Button.
     *
     * @return the test class instance.
     */
    public test clickContinuarButton() {
        continuar.click();
        return this;
    }

    /**
     * Click on Continuar Verificao Link.
     *
     * @return the test class instance.
     */
    public test clickContinuarVerificaoLink() {
        continuarVerificao.click();
        return this;
    }

    /**
     * Click on Crie Uma Conta Para Guardar Os Favoritos Link.
     *
     * @return the test class instance.
     */
    public test clickCrieUmaContaParaGuardarLink() {
        crieUmaContaParaGuardar.click();
        return this;
    }

    /**
     * Click on Dados Pessoais Link.
     *
     * @return the test class instance.
     */
    public test clickDadosPessoais1Link() {
        dadosPessoais1.click();
        return this;
    }

    /**
     * Click on Dados Pessoais Link.
     *
     * @return the test class instance.
     */
    public test clickDadosPessoais2Link() {
        dadosPessoais2.click();
        return this;
    }

    /**
     * Click on Decidir Mais Tarde Link.
     *
     * @return the test class instance.
     */
    public test clickDecidirMaisTardeLink() {
        decidirMaisTarde.click();
        return this;
    }

    /**
     * Click on Destacar Link.
     *
     * @return the test class instance.
     */
    public test clickDestacar1Link() {
        destacar1.click();
        return this;
    }

    /**
     * Click on Destacar Link.
     *
     * @return the test class instance.
     */
    public test clickDestacar2Link() {
        destacar2.click();
        return this;
    }

    /**
     * Click on Destacar Seleccionados Link.
     *
     * @return the test class instance.
     */
    public test clickDestacarSeleccionadosLink() {
        destacarSeleccionados.click();
        return this;
    }

    /**
     * Click on Destaques Link.
     *
     * @return the test class instance.
     */
    public test clickDestaquesLink() {
        destaques.click();
        return this;
    }

    /**
     * Click on Editar Link.
     *
     * @return the test class instance.
     */
    public test clickEditar1Link() {
        editar1.click();
        return this;
    }

    /**
     * Click on Editar Link.
     *
     * @return the test class instance.
     */
    public test clickEditar2Link() {
        editar2.click();
        return this;
    }

    /**
     * Click on Efectue O Seu Login Link.
     *
     * @return the test class instance.
     */
    public test clickEfectueOSeuLogin1Link() {
        efectueOSeuLogin1.click();
        return this;
    }

    /**
     * Click on Efectue O Seu Login Link.
     *
     * @return the test class instance.
     */
    public test clickEfectueOSeuLogin2Link() {
        efectueOSeuLogin2.click();
        return this;
    }

    /**
     * Click on Efectue O Seu Login Button.
     *
     * @return the test class instance.
     */
    public test clickEfectueOSeuLogin3Button() {
        efectueOSeuLogin3.click();
        return this;
    }

    /**
     * Click on Em Appstore Download Na Appstore Link.
     *
     * @return the test class instance.
     */
    public test clickEmAppstoreDownloadNaAppstoreLink() {
        emAppstoreDownloadNaAppstore.click();
        return this;
    }

    /**
     * Click on Em Google Play Faa Download Google Play Link.
     *
     * @return the test class instance.
     */
    public test clickEmGooglePlayFaaDownloadLink() {
        emGooglePlayFaaDownload.click();
        return this;
    }

    /**
     * Click on Em Windowsstore Download Windows Phone Link.
     *
     * @return the test class instance.
     */
    public test clickEmWindowsstoreDownloadWindowsPhoneLink() {
        emWindowsstoreDownloadWindowsPhone.click();
        return this;
    }

    /**
     * Click on Enviar Cdigo Novamente Link.
     *
     * @return the test class instance.
     */
    public test clickEnviarCdigoNovamenteLink() {
        enviarCdigoNovamente.click();
        return this;
    }

    /**
     * Click on Escolher Outro Nmero De Telefone Link.
     *
     * @return the test class instance.
     */
    public test clickEscolherOutroNmeroDeTelefoneLink() {
        escolherOutroNmeroDeTelefone.click();
        return this;
    }

    /**
     * Click on Guardar Link.
     *
     * @return the test class instance.
     */
    public test clickGuardarLink() {
        guardar.click();
        return this;
    }

    /**
     * Click on Imprimir Link.
     *
     * @return the test class instance.
     */
    public test clickImprimir1Link() {
        imprimir1.click();
        return this;
    }

    /**
     * Click on Imprimir Link.
     *
     * @return the test class instance.
     */
    public test clickImprimir2Link() {
        imprimir2.click();
        return this;
    }

    /**
     * Click on Indicar Conta Link.
     *
     * @return the test class instance.
     */
    public test clickIndicarContaLink() {
        indicarConta.click();
        return this;
    }

    /**
     * Click on Limpar Link.
     *
     * @return the test class instance.
     */
    public test clickLimpar1Link() {
        limpar1.click();
        return this;
    }

    /**
     * Click on Limpar Link.
     *
     * @return the test class instance.
     */
    public test clickLimpar2Link() {
        limpar2.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the test class instance.
     */
    public test clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Login Com Facebook Link.
     *
     * @return the test class instance.
     */
    public test clickLoginComFacebook1Link() {
        loginComFacebook1.click();
        return this;
    }

    /**
     * Click on Login Com Facebook Link.
     *
     * @return the test class instance.
     */
    public test clickLoginComFacebook2Link() {
        loginComFacebook2.click();
        return this;
    }

    /**
     * Click on Login Com Password Link.
     *
     * @return the test class instance.
     */
    public test clickLoginComPasswordLink() {
        loginComPassword.click();
        return this;
    }

    /**
     * Click on Mapa Do Site Link.
     *
     * @return the test class instance.
     */
    public test clickMapaDoSiteLink() {
        mapaDoSite.click();
        return this;
    }

    /**
     * Click on Mensagens Link.
     *
     * @return the test class instance.
     */
    public test clickMensagens1Link() {
        mensagens1.click();
        return this;
    }

    /**
     * Click on Mensagens Link.
     *
     * @return the test class instance.
     */
    public test clickMensagens2Link() {
        mensagens2.click();
        return this;
    }

    /**
     * Click on Mobile Apps Link.
     *
     * @return the test class instance.
     */
    public test clickMobileAppsLink() {
        mobileApps.click();
        return this;
    }

    /**
     * Click on No Obrigado Link.
     *
     * @return the test class instance.
     */
    public test clickNoObrigado1Link() {
        noObrigado1.click();
        return this;
    }

    /**
     * Click on No Obrigado Link.
     *
     * @return the test class instance.
     */
    public test clickNoObrigado2Link() {
        noObrigado2.click();
        return this;
    }

    /**
     * Click on Olx.co.ao Link.
     *
     * @return the test class instance.
     */
    public test clickOlxCoAoLink() {
        olxCoAo.click();
        return this;
    }

    /**
     * Click on Olx.co.mz Link.
     *
     * @return the test class instance.
     */
    public test clickOlxCoMzLink() {
        olxCoMz.click();
        return this;
    }

    /**
     * Click on Olx.pt Appstore Link.
     *
     * @return the test class instance.
     */
    public test clickOlxPtAppstoreLink() {
        olxPtAppstore.click();
        return this;
    }

    /**
     * Click on Olx.pt Googleplay Link.
     *
     * @return the test class instance.
     */
    public test clickOlxPtGoogleplayLink() {
        olxPtGoogleplay.click();
        return this;
    }

    /**
     * Click on Olx.pt Windowsstore Link.
     *
     * @return the test class instance.
     */
    public test clickOlxPtWindowsstoreLink() {
        olxPtWindowsstore.click();
        return this;
    }

    /**
     * Click on Olx Se Vale X Olx Link.
     *
     * @return the test class instance.
     */
    public test clickOlxSeValeXOlxLink() {
        olxSeValeXOlx.click();
        return this;
    }

    /**
     * Click on Os Termos E Condies Link.
     *
     * @return the test class instance.
     */
    public test clickOsTermosECondiesLink() {
        osTermosECondies.click();
        return this;
    }

    /**
     * Click on Outras Opes De Login Link.
     *
     * @return the test class instance.
     */
    public test clickOutrasOpesDeLoginLink() {
        outrasOpesDeLogin.click();
        return this;
    }

    /**
     * Set default value to Pacote De Para O Topo Drop Down List field.
     *
     * @return the test class instance.
     */
    public test clickPacoteDeParaOTopo1Link() {
        return clickPacoteDeParaOTopo1Link(data.get("PACOTE_DE_PARA_O_TOPO"));
    }

    /**
     * Click on Pacote De Para O Topo At 4 Vezes Mais Respostas Actualize Automaticamente O Seu Anncio A Cada 24h Durante 7 14 Ou 28 Dias Quanto Maior For O Nmero De Actualizaes Que Fizer Menor Ser O Preo A Pagar Por Actualizao Para O Topo Link.
     *
     * @return the test class instance.
     */
    public test clickPacoteDeParaOTopo1Link(String pacoteDeParaOTopoValue) {
        new Select(pacoteDeParaOTopo1).selectByVisibleText(pacoteDeParaOTopoValue);
        return this;
    }

    /**
     * Click on Pacote De Para O Topo At 4 Vezes Mais Respostas Actualize Automaticamente O Seu Anncio A Cada 24h Durante 7 14 Ou 28 Dias Quanto Maior For O Nmero De Actualizaes Que Fizer Menor Ser O Preo A Pagar Por Actualizao Para O Topo Link.
     *
     * @return the test class instance.
     */
    public test clickPacoteDeParaOTopo2Link() {
        pacoteDeParaOTopo2.click();
        return this;
    }

    /**
     * Click on Pagamentos Link.
     *
     * @return the test class instance.
     */
    public test clickPagamentosLink() {
        pagamentos.click();
        return this;
    }

    /**
     * Click on Para Edio Link.
     *
     * @return the test class instance.
     */
    public test clickParaEdioLink() {
        paraEdio.click();
        return this;
    }

    /**
     * Click on Parceiros Link.
     *
     * @return the test class instance.
     */
    public test clickParceirosLink() {
        parceiros.click();
        return this;
    }

    /**
     * Click on Pendentes Link.
     *
     * @return the test class instance.
     */
    public test clickPendentesLink() {
        pendentes.click();
        return this;
    }

    /**
     * Click on Pesquisar Button.
     *
     * @return the test class instance.
     */
    public test clickPesquisarButton() {
        pesquisar.click();
        return this;
    }

    /**
     * Click on Pesquisas9 Link.
     *
     * @return the test class instance.
     */
    public test clickPesquisas9Link() {
        pesquisas9.click();
        return this;
    }

    /**
     * Click on Pesquisas Populares Link.
     *
     * @return the test class instance.
     */
    public test clickPesquisasPopularesLink() {
        pesquisasPopulares.click();
        return this;
    }

    /**
     * Click on Portugal Link.
     *
     * @return the test class instance.
     */
    public test clickPortugalLink() {
        portugal.click();
        return this;
    }

    /**
     * Click on Rafapardal07 Link.
     *
     * @return the test class instance.
     */
    public test clickRafapardal07Link() {
        rafapardal07.click();
        return this;
    }

    /**
     * Click on Realestatelayercancel Link.
     *
     * @return the test class instance.
     */
    public test clickRealestatelayercancelLink() {
        realestatelayercancel.click();
        return this;
    }

    /**
     * Click on Realestatelayersubmit Link.
     *
     * @return the test class instance.
     */
    public test clickRealestatelayersubmitLink() {
        realestatelayersubmit.click();
        return this;
    }

    /**
     * Click on Recuperar Password Link.
     *
     * @return the test class instance.
     */
    public test clickRecuperarPasswordLink() {
        recuperarPassword.click();
        return this;
    }

    /**
     * Click on Registar No Olx Button.
     *
     * @return the test class instance.
     */
    public test clickRegistarNoOlx1Button() {
        registarNoOlx1.click();
        return this;
    }

    /**
     * Click on Registar No Olx Button.
     *
     * @return the test class instance.
     */
    public test clickRegistarNoOlx2Button() {
        registarNoOlx2.click();
        return this;
    }

    /**
     * Click on Remover Link.
     *
     * @return the test class instance.
     */
    public test clickRemover1Link() {
        remover1.click();
        return this;
    }

    /**
     * Click on Remover Link.
     *
     * @return the test class instance.
     */
    public test clickRemover2Link() {
        remover2.click();
        return this;
    }

    /**
     * Click on Remover Link.
     *
     * @return the test class instance.
     */
    public test clickRemover3Link() {
        remover3.click();
        return this;
    }

    /**
     * Click on Remover Anncios Link.
     *
     * @return the test class instance.
     */
    public test clickRemoverAnnciosLink() {
        removerAnncios.click();
        return this;
    }

    /**
     * Click on Respostas Link.
     *
     * @return the test class instance.
     */
    public test clickRespostasLink() {
        respostas.click();
        return this;
    }

    /**
     * Click on Retirar De Recomendado No Minisite Link.
     *
     * @return the test class instance.
     */
    public test clickRetirarDeRecomendadoNoMinisiteLink() {
        retirarDeRecomendadoNoMinisite.click();
        return this;
    }

    /**
     * Click on Saber Mais Sobre Os Limites De Anncios... Link.
     *
     * @return the test class instance.
     */
    public test clickSaberMaisSobreOsLimitesLink() {
        saberMaisSobreOsLimites.click();
        return this;
    }

    /**
     * Click on Saiba Mais Link.
     *
     * @return the test class instance.
     */
    public test clickSaibaMais1Link() {
        saibaMais1.click();
        return this;
    }

    /**
     * Click on Saiba Mais Link.
     *
     * @return the test class instance.
     */
    public test clickSaibaMais2Link() {
        saibaMais2.click();
        return this;
    }

    /**
     * Click on Tarifrio Link.
     *
     * @return the test class instance.
     */
    public test clickTarifrioLink() {
        tarifrio.click();
        return this;
    }

    /**
     * Click on Termos De Utilizao Link.
     *
     * @return the test class instance.
     */
    public test clickTermosDeUtilizaoLink() {
        termosDeUtilizao.click();
        return this;
    }

    /**
     * Click on Termos E Condies Link.
     *
     * @return the test class instance.
     */
    public test clickTermosECondiesLink() {
        termosECondies.click();
        return this;
    }

    /**
     * Click on Ttulo Link.
     *
     * @return the test class instance.
     */
    public test clickTtuloLink() {
        ttulo.click();
        return this;
    }

    /**
     * Click on Verificar Button.
     *
     * @return the test class instance.
     */
    public test clickVerificarButton() {
        verificar.click();
        return this;
    }

    /**
     * Click on Verificar Data De Expirao Dos Pontos Link.
     *
     * @return the test class instance.
     */
    public test clickVerificarDataDeExpiraoDosPontosLink() {
        verificarDataDeExpiraoDosPontos.click();
        return this;
    }

    /**
     * Click on Visualizaes Link.
     *
     * @return the test class instance.
     */
    public test clickVisualizaesLink() {
        visualizaes.click();
        return this;
    }

    /**
     * Click on Visualizar Anncio Link.
     *
     * @return the test class instance.
     */
    public test clickVisualizarAnncio1Link() {
        visualizarAnncio1.click();
        return this;
    }

    /**
     * Click on Visualizar Anncio Link.
     *
     * @return the test class instance.
     */
    public test clickVisualizarAnncio2Link() {
        visualizarAnncio2.click();
        return this;
    }

    /**
     * Click on Voltar Aos Meus Anncios Link.
     *
     * @return the test class instance.
     */
    public test clickVoltarAosMeusAnnciosLink() {
        voltarAosMeusAnncios.click();
        return this;
    }

    /**
     * Click on Widget Link.
     *
     * @return the test class instance.
     */
    public test clickWidget1Link() {
        widget1.click();
        return this;
    }

    /**
     * Click on Widget Link.
     *
     * @return the test class instance.
     */
    public test clickWidget2Link() {
        widget2.click();
        return this;
    }

    /**
     * Click on X Link.
     *
     * @return the test class instance.
     */
    public test clickXLink() {
        x.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the test class instance.
     */
    public test fill() {
        setNoTemDeMomentoAnnciosActivosTextField();
        setContaPrateadaComBrilhantesCompatvelCheckboxField();
        setMarcarComoRecomendadoNoMinisite2CheckboxField();
        setMarcarComoRecomendadoNoMinisite3CheckboxField();
        clickPacoteDeParaOTopo1Link();
        setLembrarmeDaPassword1PasswordField();
        setLembrarmeDaPassword2PasswordField();
        setLembrarmeDaPassword3CheckboxField();
        setDesejoReceberTodasAsNovidadesDo1PasswordField();
        setDesejoReceberTodasAsNovidadesDo2PasswordField();
        setAceitoOsTermosDeUtilizaoCheckboxField();
        setDesejoReceberTodasAsNovidadesDo3CheckboxField();
        setIntroduzaOSeuNmeroDeTelemvel1TextField();
        setIntroduzaOSeuNmeroDeTelemvel2TextField();
        setIntroduzaOCdigoTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the test class instance.
     */
    public test fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Aceito Os Termos De Utilizao Do Site Olx Portugal. Checkbox field.
     *
     * @return the test class instance.
     */
    public test setAceitoOsTermosDeUtilizaoCheckboxField() {
        if (!aceitoOsTermosDeUtilizao.isSelected()) {
            aceitoOsTermosDeUtilizao.click();
        }
        return this;
    }

    /**
     * Set Conta Prateada Com Brilhantes Compatvel Checkbox field.
     *
     * @return the test class instance.
     */
    public test setContaPrateadaComBrilhantesCompatvelCheckboxField() {
        if (!contaPrateadaComBrilhantesCompatvel.isSelected()) {
            contaPrateadaComBrilhantesCompatvel.click();
        }
        return this;
    }

    /**
     * Set default value to Desejo Receber Todas As Novidades Do Olx. Password field.
     *
     * @return the test class instance.
     */
    public test setDesejoReceberTodasAsNovidadesDo1PasswordField() {
        return setDesejoReceberTodasAsNovidadesDo1PasswordField(data.get("DESEJO_RECEBER_TODAS_AS_NOVIDADES_DO_1"));
    }

    /**
     * Set value to Desejo Receber Todas As Novidades Do Olx. Password field.
     *
     * @return the test class instance.
     */
    public test setDesejoReceberTodasAsNovidadesDo1PasswordField(String desejoReceberTodasAsNovidadesDo1Value) {
        desejoReceberTodasAsNovidadesDo1.sendKeys(desejoReceberTodasAsNovidadesDo1Value);
        return this;
    }

    /**
     * Set default value to Desejo Receber Todas As Novidades Do Olx. Password field.
     *
     * @return the test class instance.
     */
    public test setDesejoReceberTodasAsNovidadesDo2PasswordField() {
        return setDesejoReceberTodasAsNovidadesDo2PasswordField(data.get("DESEJO_RECEBER_TODAS_AS_NOVIDADES_DO_2"));
    }

    /**
     * Set value to Desejo Receber Todas As Novidades Do Olx. Password field.
     *
     * @return the test class instance.
     */
    public test setDesejoReceberTodasAsNovidadesDo2PasswordField(String desejoReceberTodasAsNovidadesDo2Value) {
        desejoReceberTodasAsNovidadesDo2.sendKeys(desejoReceberTodasAsNovidadesDo2Value);
        return this;
    }

    /**
     * Set Desejo Receber Todas As Novidades Do Olx. Checkbox field.
     *
     * @return the test class instance.
     */
    public test setDesejoReceberTodasAsNovidadesDo3CheckboxField() {
        if (!desejoReceberTodasAsNovidadesDo3.isSelected()) {
            desejoReceberTodasAsNovidadesDo3.click();
        }
        return this;
    }

    /**
     * Set default value to Introduza O Cdigo Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOCdigoTextField() {
        return setIntroduzaOCdigoTextField(data.get("INTRODUZA_O_CDIGO"));
    }

    /**
     * Set value to Introduza O Cdigo Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOCdigoTextField(String introduzaOCdigoValue) {
        introduzaOCdigo.sendKeys(introduzaOCdigoValue);
        return this;
    }

    /**
     * Set default value to Introduza O Seu Nmero De Telemvel Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOSeuNmeroDeTelemvel1TextField() {
        return setIntroduzaOSeuNmeroDeTelemvel1TextField(data.get("INTRODUZA_O_SEU_NMERO_DE_TELEMVEL_1"));
    }

    /**
     * Set value to Introduza O Seu Nmero De Telemvel Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOSeuNmeroDeTelemvel1TextField(String introduzaOSeuNmeroDeTelemvel1Value) {
        introduzaOSeuNmeroDeTelemvel1.sendKeys(introduzaOSeuNmeroDeTelemvel1Value);
        return this;
    }

    /**
     * Set default value to Introduza O Seu Nmero De Telemvel Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOSeuNmeroDeTelemvel2TextField() {
        return setIntroduzaOSeuNmeroDeTelemvel2TextField(data.get("INTRODUZA_O_SEU_NMERO_DE_TELEMVEL_2"));
    }

    /**
     * Set value to Introduza O Seu Nmero De Telemvel Text field.
     *
     * @return the test class instance.
     */
    public test setIntroduzaOSeuNmeroDeTelemvel2TextField(String introduzaOSeuNmeroDeTelemvel2Value) {
        introduzaOSeuNmeroDeTelemvel2.sendKeys(introduzaOSeuNmeroDeTelemvel2Value);
        return this;
    }

    /**
     * Set default value to Lembrarme Da Password Password field.
     *
     * @return the test class instance.
     */
    public test setLembrarmeDaPassword1PasswordField() {
        return setLembrarmeDaPassword1PasswordField(data.get("LEMBRARME_DA_PASSWORD_1"));
    }

    /**
     * Set value to Lembrarme Da Password Password field.
     *
     * @return the test class instance.
     */
    public test setLembrarmeDaPassword1PasswordField(String lembrarmeDaPassword1Value) {
        lembrarmeDaPassword1.sendKeys(lembrarmeDaPassword1Value);
        return this;
    }

    /**
     * Set default value to Lembrarme Da Password Password field.
     *
     * @return the test class instance.
     */
    public test setLembrarmeDaPassword2PasswordField() {
        return setLembrarmeDaPassword2PasswordField(data.get("LEMBRARME_DA_PASSWORD_2"));
    }

    /**
     * Set value to Lembrarme Da Password Password field.
     *
     * @return the test class instance.
     */
    public test setLembrarmeDaPassword2PasswordField(String lembrarmeDaPassword2Value) {
        lembrarmeDaPassword2.sendKeys(lembrarmeDaPassword2Value);
        return this;
    }

    /**
     * Set Lembrarme Da Password Checkbox field.
     *
     * @return the test class instance.
     */
    public test setLembrarmeDaPassword3CheckboxField() {
        if (!lembrarmeDaPassword3.isSelected()) {
            lembrarmeDaPassword3.click();
        }
        return this;
    }

    /**
     * Set Marcar Como Recomendado No Minisite Checkbox field.
     *
     * @return the test class instance.
     */
    public test setMarcarComoRecomendadoNoMinisite1CheckboxField() {
        marcarComoRecomendadoNoMinisite1.click();
        return this;
    }

    /**
     * Set Marcar Como Recomendado No Minisite Checkbox field.
     *
     * @return the test class instance.
     */
    public test setMarcarComoRecomendadoNoMinisite2CheckboxField() {
        if (!marcarComoRecomendadoNoMinisite2.isSelected()) {
            marcarComoRecomendadoNoMinisite2.click();
        }
        return this;
    }

    /**
     * Set Marcar Como Recomendado No Minisite Checkbox field.
     *
     * @return the test class instance.
     */
    public test setMarcarComoRecomendadoNoMinisite3CheckboxField() {
        if (!marcarComoRecomendadoNoMinisite3.isSelected()) {
            marcarComoRecomendadoNoMinisite3.click();
        }
        return this;
    }

 
    /**
     * Set default value to No Tem De Momento Anncios Activos Text field.
     *
     * @return the test class instance.
     */
    public test setNoTemDeMomentoAnnciosActivosTextField() {
        return setNoTemDeMomentoAnnciosActivosTextField(data.get("NO_TEM_DE_MOMENTO_ANNCIOS_ACTIVOS"));
    }

    /**
     * Set value to No Tem De Momento Anncios Activos Text field.
     *
     * @return the test class instance.
     */
    public test setNoTemDeMomentoAnnciosActivosTextField(String noTemDeMomentoAnnciosActivosValue) {
        noTemDeMomentoAnnciosActivos.sendKeys(noTemDeMomentoAnnciosActivosValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the test class instance.
     */
    public test submit() {
        clickVerificarButton();
        return this;
    }

    /**
     * Unset Aceito Os Termos De Utilizao Do Site Olx Portugal. Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetAceitoOsTermosDeUtilizaoCheckboxField() {
        if (aceitoOsTermosDeUtilizao.isSelected()) {
            aceitoOsTermosDeUtilizao.click();
        }
        return this;
    }

    /**
     * Unset Conta Prateada Com Brilhantes Compatvel Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetContaPrateadaComBrilhantesCompatvelCheckboxField() {
        if (contaPrateadaComBrilhantesCompatvel.isSelected()) {
            contaPrateadaComBrilhantesCompatvel.click();
        }
        return this;
    }

    /**
     * Unset Desejo Receber Todas As Novidades Do Olx. Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetDesejoReceberTodasAsNovidadesDo3CheckboxField() {
        if (desejoReceberTodasAsNovidadesDo3.isSelected()) {
            desejoReceberTodasAsNovidadesDo3.click();
        }
        return this;
    }

    /**
     * Unset Lembrarme Da Password Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetLembrarmeDaPassword3CheckboxField() {
        if (lembrarmeDaPassword3.isSelected()) {
            lembrarmeDaPassword3.click();
        }
        return this;
    }

    /**
     * Unset Marcar Como Recomendado No Minisite Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetMarcarComoRecomendadoNoMinisite2CheckboxField() {
        if (marcarComoRecomendadoNoMinisite2.isSelected()) {
            marcarComoRecomendadoNoMinisite2.click();
        }
        return this;
    }

    /**
     * Unset Marcar Como Recomendado No Minisite Checkbox field.
     *
     * @return the test class instance.
     */
    public test unsetMarcarComoRecomendadoNoMinisite3CheckboxField() {
        if (marcarComoRecomendadoNoMinisite3.isSelected()) {
            marcarComoRecomendadoNoMinisite3.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the test class instance.
     */
    public test verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the test class instance.
     */
    public test verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}