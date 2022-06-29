create view contador_porcomenzar as select count(idruta) as porcomenzar from ruta where estado = 'Por comenzar';
create view contador_encurso as select count(idruta) as encurso from ruta where estado = 'En curso';
create view contador_llegadoalterminal as select count(idruta) as llegadoalterminal from ruta where estado = 'Llegado al terminal';
create view contador_demorado as select count(idruta) as demorado from ruta where estado = 'Demorado';
create view contador_finalizado as select count(idruta) as finalizado from ruta where estado = 'Finalizado';


- Contadores de estado de 
create view contadores as select * from contador_porcomenzar, contador_encurso,
contador_llegadoalterminal, contador_demorado, contador_finalizado;
