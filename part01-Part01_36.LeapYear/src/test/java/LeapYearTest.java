import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class LeapYearTest {

    int[] leapYear = {1600, 1604, 1608, 1612, 1616, 1620, 1624, 1628, 1632, 1636, 1640, 1644, 1648, 1652, 1656, 1660, 1664, 1668, 1672, 1676, 1680, 1684, 1688, 1692, 1696, 1704, 1708, 1712, 1716, 1720, 1724, 1728, 1732, 1736, 1740, 1744, 1748, 1752, 1756, 1760, 1764, 1768, 1772, 1776, 1780, 1784, 1788, 1792, 1796, 1804, 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844, 1848, 1852, 1856, 1860, 1864, 1868, 1872, 1876, 1880, 1884, 1888, 1892, 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104, 2108};

    @Test
    public void recognizesCorrectYears() {
        for (int year : leapYear) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }

    @Test
    public void failsIncorrectYears() {
        for (int year = 1600; year < 2108; year++) {
            if (leapYear(year)) {
                continue;
            }
            assertFalse(LeapYear.isLeapYear(year));
        }
    }


    private boolean leapYear(int year) {

        for (int v : leapYear) {
            if (year == v) {
                return true;
            }
        }
        return false;
    }
}
