Proyecto educativo

Practica de consumo y conexion de bases de datos sql y nosql,

En este caso se trabajo con las pase de datos de postgres (Empleados) y con mongodb(Eventons)

En este proyecto se busca registrar los eventos que se pueda presentar en al universidad del poli, donde se busca registrar la informacion para este como titulo, descripcion, asistentes, facilitadores, entre otros.

Para la construcción de este proyecto se trabjaron con tecnologias como:

- Sprintboot
- driver de conexion para mongo y postgres
- servidor local para postgres y mongo
- postman

Para iniciar la base de datos de mongo se debe utilizar los siguientes comando:

para crear la bd: use eventos_poli_bd
para crear la collection: db.createCollection("eventos")
para la inserccion se realizo desde este proyecto propiamente.

Para la contruccion de las base de datos de postgres, en el apartado de resources encontrara una carpeta (scripts) y en esta el script para crear la bd y algunos inserts

Como gestor de dependencias se utilizo gradle

para la creación del proyecto se utilizo spring initializr