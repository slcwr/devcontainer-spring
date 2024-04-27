FROM wanminny/5.7.30-linux-arm64v8

EXPOSE 3306

COPY ./my.cnf /etc/mysql/my.cnf

RUN chmod 644 /etc/mysql/my.cnf

COPY ./sql_init /docker-entrypoint-initdb.d
