import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

 class TestEcho {
    @Test
    void shouldData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hello"));
    }
}
