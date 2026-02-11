
PN = "man-db"
PE = "0"
PV = "2.12.0"
PR = "8.el10"
PACKAGES = "man-db man-db-cron"


URI_man-db = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/man-db-2.12.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:man-db = "/bin/sh ( ) /usr/sbin/update-alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libz.so.1()(64bit) ( ) grep ( ) libgdbm.so.6()(64bit) ( ) gzip ( ) less ( ) groff-base ( ) libpipeline.so.1()(64bit) ( )"
RPROVIDES:man-db = "bundled(gnulib) ( ) libman-2.12.0.so()(64bit) ( ) libmandb-2.12.0.so()(64bit) ( ) config(man-db) ( =  2.12.0-8.el10) man ( =  2.12.0) man-db ( =  2.12.0-8.el10) man-db(x86-64) ( =  2.12.0-8.el10) man-pages-reader ( =  2.12.0)"

URI_man-db-cron = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/man-db-cron-2.12.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:man-db-cron = "/usr/bin/bash ( ) crontabs ( ) man-db ( =  2.12.0-8.el10)"
RPROVIDES:man-db-cron = "config(man-db-cron) ( =  2.12.0-8.el10) man-db-cron ( =  2.12.0-8.el10)"
