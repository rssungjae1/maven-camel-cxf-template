# maven-camel-cxf-template
spring boot, maven, camel cxf

## wsdl2java command에 대해서
wsdl파일에 대한 java파일을 자동적으로 빌드업 해준다.

```
wsdl2java {wsdl의url}
```

 - 사용 할 수 있는 상세태그 중 자주 쓸만한 것은 아래와 같다.
   - -o : Output file location. This is where the files would be copied once the code generation is done.
   - -p : The target package name.
   - -encoding : 파일 형식 인코딩, 웃긴건 지금까지 공식문서에 문서화 되지 않고 있다고 한다.

```
wsdl2java -o {생성파일위치}} -p {package구조} -encoding {utf-8} {wsdl위치}
```
