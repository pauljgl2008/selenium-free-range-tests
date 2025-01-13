package pages;

public class PaginaPrincipal extends BasePage {
    // Constructor de la clase
    public PaginaPrincipal() {
        // Llama al constructor de la clase BasePage
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navegarAFreeRangeTesters() {
        // Llama al método navigateTo de la clase BasePage
        navigateTo("https://www.freerangetesters.com");
    }    
}
