package hus.oop.lab8.countrymanager.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }
        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[i].getPopulation()) {
                    min_idx = j;
                }
                Country tmp = newArray[min_idx];
                newArray[min_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int max_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[i].getPopulation()) {
                    max_idx = j;
                }
                Country tmp = newArray[max_idx];
                newArray[max_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getArea() < newArray[i].getArea()) {
                    min_idx = j;
                }
                Country tmp = newArray[min_idx];
                newArray[min_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int max_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getArea() > newArray[i].getArea()) {
                    max_idx = j;
                }
                Country tmp = newArray[max_idx];
                newArray[max_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getGdp() < newArray[i].getGdp()) {
                    min_idx = j;
                }
                Country tmp = newArray[min_idx];
                newArray[min_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int max_idx = i;
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[j].getGdp() > newArray[i].getGdp()) {
                    max_idx = j;
                }
                Country tmp = newArray[max_idx];
                newArray[max_idx] = newArray[i];
                newArray[i] = tmp;
            }
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> res = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                res.add(country);
            }
        }
        return res;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
    }

    public NorthAmericaCountry filterNorthAmericaCountry() {
        /* TODO */
    }

    public OceaniaCountry filterOceaniaCountry() {
        /* TODO */
    }

    public SouthAmericaCountry filterSouthAmericaCountry() {
        /* TODO */
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
