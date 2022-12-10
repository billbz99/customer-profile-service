package com.company.org.customerprofileservice;

import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookup;
import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookupId;
import com.company.org.customerprofileservice.repository.ViewCustomerProfileLookupRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ViewCustomerProfileLookupRepositoryTest {

    @Autowired
    private ViewCustomerProfileLookupRepository underTest;

    @Test
    void itShouldFindPersonAttributes() {
        // Given
        ViewCustomerProfileLookupId id = new ViewCustomerProfileLookupId("Bill", "Baquerizo", "1234");

        ViewCustomerProfileLookup viewCustomerProfileLookup = new ViewCustomerProfileLookup(id, "USA", "1234", "123 Main St", "Weehawken",
                "NJ", "USA", "123 Main St", "Weehawken",
                  "NJ", "USA", "6461234", "myname@gmail.com", "12345");

        // When
        underTest.save(viewCustomerProfileLookup);

        // Then
        Optional<ViewCustomerProfileLookup> optionalViewCustomerProfileLookups = underTest.findPersonAttributes("Bill", "Baquerizo", "1234");

        assertThat(optionalViewCustomerProfileLookups)
                .isPresent()
                .hasValueSatisfying(c -> {
                    assertThat(c.getId().getPersonFirstName()).isEqualTo("Bill");
                    assertThat(c.getId().getPersonLastName()).isEqualTo("Baquerizo");
                    assertThat(c.getId().getSsn()).isEqualTo("1234");
                });
    }
}
