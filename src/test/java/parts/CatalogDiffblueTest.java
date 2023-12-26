package parts;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CatalogDiffblueTest {
    /**
     * Method under test: {@link Catalog#viewAllProducts()}
     */
    @Test
    public void testViewAllProducts() {
        // Arrange
        Catalog catalog = new Catalog();

        // Act
        catalog.viewAllProducts();

        // Assert that nothing has changed
        assertEquals(3, catalog.categories.size());
    }

    /**
     * Method under test: {@link Catalog#viewAllProducts()}
     */
    /*@Test
    @Ignore("TODO: Complete this test")
    public void testViewAllProducts2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Iterable.iterator()" because "iterable" is null
        //       at parts.Catalog.viewAllProducts(Catalog.java:37)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Catalog catalog = new Catalog();
        catalog.categories = null;

        // Act
        catalog.viewAllProducts();
    }*/
}
