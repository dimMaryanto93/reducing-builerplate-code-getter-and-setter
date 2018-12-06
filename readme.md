Create project with maven archetype

```bash
mvn archetype:generate \
    -Dversion=1.0 \
    -DgroupId=com.maryanto.dimas.example \
    -DartifactId=reducing-builderplate-code \
    -DarchetypeCatalog='Internal'
```

Dependencies

edit `pom.xml` add this line

```xml
<dependencies>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct-processor</artifactId>
        <version>1.2.0.Final</version>
    </dependency>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct-jdk8</artifactId>
        <version>1.2.0.Final</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.4</version>
    </dependency>
</dependencies>
```

## Referensi

- [reducing-boilerplate-code-in-java-pojos-dont-type-getters-setters-and-get-to-set-mappings](https://medium.com/@qasim.lodhi/reducing-boilerplate-code-in-java-pojos-dont-type-getters-setters-and-get-to-set-mappings-5eab302ecf6b)
- [project lombok setter and getter](https://projectlombok.org/features/GetterSetter)