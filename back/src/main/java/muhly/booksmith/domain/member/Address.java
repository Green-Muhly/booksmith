package muhly.booksmith.domain.member;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {
    private String city;
    private String gu;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String gu, String street, String zipcode) {
        this.city = city;
        this.gu = gu;
        this.street = street;
        this.zipcode = zipcode;
    }
}
