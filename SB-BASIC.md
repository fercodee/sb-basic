# Life cyle
- compile -> test -> install

# Dependecy
- optional = true (don't go for production)

# @RequestMapping
params: method, path
obs: the default method is GET

- You can use @GetMapping
- You can use array of paths for same method

# @GetMapping
- "/{id}" -> represent Dynamic value
- @PathVariable -> get value of url
- @GetMapping("/sum/{a}/{b}") -> parameter order 

# Details
- Tomcat is shipped in Spring Boot
- The Java object is can represented for JSON
- HTTP METHODS: GET, POST, PUT (total alteration), PATCH (partial alteration), DELETE, OPTIONS (returns methods that url supported), TRACE (resquest of test "loop back and more"), HEAD (returns without response body)
- curiosity: GRAPHQL only use POST and GET method
- spring.jpa.hibernate.ddl-auto=update -> update db without drop datas
- Spring can get params of method and create one object based on params name
- Soft delete
- PagingAndSortingRepository -> give generics methods of crud together with methods of ordinations
- The the method for sorting return all data for building the pagination

- You can use methods of conventions in spring repository, ex: 
Iterable<Product> findByNameContaining(String namePart).
findBy - nameOfAttributive - ConstrainingQueryDeclarations
See: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details
Others examples:
findByNameIsContaining
findByNameIsContains
findByNameStartsWith
findByNameIsEndsWith
findByNameNotContaining

- You too can use JPQL for specific queries


# MVC
- Model: regras de negócios, entidades, camada de acesso a dados
- View: renderizar a resposta, template engine
- Controller: intermédio, coordenador
- Nem sempre o controller vai precisar se comunicar com o model (não há necessidade de dados)
- Controller se comunica com o model, o model retorna para o controller e ele chama a view... (em caso de necessidade de dados)

# MVC and Spring Boot
- Front Controller of SB is "DispatcherServlet"



# JPA AND SB
- model instead models (think in your application as a whole), is model of your app.
- @GeneratedValue(strategy = GenerationType.IDENTITY) -> the entity will have its own sequence of ids


- The objective of repository is create methods high level that will abstract all access to the datas
- DAO have focus in implementation, the Respository have focus in Interface of how abstract access to the datas.
- interface ProductRepository extends CrudRepository<EntityName, TypeOfIdNotCanPrimitiveType>, description:
CrudRepository is responsible add persistence methods (insert, delete, update...) of entity
- Integer represent type of object, not primitive.
- @Autowired: spring auto implement object instance
- @Transient: dont persist in DB

# Iversion Controller (I.C)
- Dependecy Injection (DI)
  - @Autowired: handle one class that is managed by Spring and and make DI (the class need owned some notation of spring, ex: @RestController)
- DI remove the responsibility of understand how is implementation the object

# Validations
- The object only be submit the rules of validation when use @Valid from javax.validation.
- Optional<Product>: can be that Product does not exist

OBS: PAUSE OF ASSIMILATION