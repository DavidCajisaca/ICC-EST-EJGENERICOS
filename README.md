Uso de Clases Genéricas en Java:
------------------------------------------------
En Java, cuando definimos una nueva clase, debemos conocer el tipo de dato con el que trabajaremos. Si queremos realizar una operación específica dentro de esta nueva clase, sea cual sea el tipo de datos que va a recibir, podemos hacer uso de los tipos genéricos. Este tipo genérico asumirá el tipo de dato que realmente le pasaremos a la clase.

Aquí, < T > denota que puede referirse a cualquier tipo.

En este proyecto, utilizamos datos de varios tipos (Integer, String) para demostrar cómo las clases genéricas pueden manejar y almacenar información de manera flexible y segura.


Definición de Clases Genéricas
-------------------------------------------------
Una clase genérica en Java es una estructura de datos que utiliza tipos de parámetros para definir una plantilla flexible y reutilizable. En lugar de especificar un tipo concreto (como int o String), las clases genéricas permiten trabajar con cualquier tipo de dato definido en tiempo de compilación.

Interpretación de Datos y Clases Genéricas
------------------------------------------------
Usamos diferentes tipos de datos para mostrar cómo las clases genéricas pueden encajar en diferentes escenarios sin tener que crear una clase separada para cada tipo de datos.

Clases Genéricas
Las clases genéricas le permiten crear estructuras de datos y métodos que no se limitan a un solo tipo. 
ventaja:
Flexibilidad: Una misma categoría puede manejar cualquier tipo de material. Seguridad de la compilación: los errores de tipo se detectan antes de ejecutar el programa. 
Reutilización de código: reduzca la necesidad de categorías duplicadas para manejar diferentes tipos de datos.