Create project with maven archetype

```bash
mvn archetype:generate \
    -Dversion=1.0 \
    -DgroupId=com.maryanto.dimas.example \
    -DartifactId=reducing-builderplate-code \
    -DarchetypeCatalog='Internal'
```

## Referensi

- [reducing-boilerplate-code-in-java-pojos-dont-type-getters-setters-and-get-to-set-mappings](https://medium.com/@qasim.lodhi/reducing-boilerplate-code-in-java-pojos-dont-type-getters-setters-and-get-to-set-mappings-5eab302ecf6b)
- [project lombok setter and getter](https://projectlombok.org/features/GetterSetter)