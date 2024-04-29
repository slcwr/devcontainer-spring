FROM mysql

EXPOSE 3306

COPY ./my.cnf /etc/mysql/my.cnf

RUN chmod 644 /etc/mysql/my.cnf

COPY ./sql_init /docker-entrypoint-initdb.d
