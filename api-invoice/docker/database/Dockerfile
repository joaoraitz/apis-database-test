FROM mariadb:10.3

ENV MYSQL_ROOT_USER sa
ENV MYSQL_ROOT_PASSWORD sa

COPY ./V0.1.0_initial_invoice.sql /docker-entrypoint-initdb.d/

#COPY ./V0.2.0_sample_clinicamedica.sql /docker-entrypoint-initdb.d/

