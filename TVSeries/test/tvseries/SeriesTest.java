/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tvseries;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author lab_services_student
 */
public class SeriesTest {
 
    public Series series;

    @BeforeEach
    public void setUp() {
        series = new Series();
    }

    @Test
    public void testAddAndSearchSeries() {
        SeriesModel s1 = new SeriesModel();
        s1.seriesID = 1;
        s1.seriesName = "Test Series";
        s1.seriesAge = 12;
        s1.noOfEpi = 5;

        series.addSeries(s1);

        SeriesModel result = series.searchSeries(1);
        assertNotNull(result, "Series should be found");
        assertEquals("Test Series", result.seriesName);
        assertEquals(12, result.seriesAge);
        assertEquals(5, result.noOfEpi);
    }

    @Test
    public void testSearchSeriesNotFound() {
        SeriesModel result = series.searchSeries(999);
        assertNull(result, "Series should not be found");
    }

    @Test
    public void testUpdateAge() {
        SeriesModel s1 = new SeriesModel();
        s1.seriesID = 2;
        s1.seriesName = "Age Test Series";
        s1.seriesAge = 10;
        s1.noOfEpi = 3;

        series.addSeries(s1);

        s1.seriesAge = 15;
        SeriesModel updated = series.searchSeries(2);

        assertEquals(15, updated.seriesAge, "Series age should be updated to 15");
    }

    @Test
    public void testDeleteSeries() {
        SeriesModel s1 = new SeriesModel();
        s1.seriesID = 3;
        s1.seriesName = "Delete Series";
        s1.seriesAge = 8;
        s1.noOfEpi = 6;

        series.addSeries(s1);
        assertNotNull(series.searchSeries(3));

        series.deleteSeries(3);
        assertNull(series.searchSeries(3), "Series should be deleted");
    }


}
