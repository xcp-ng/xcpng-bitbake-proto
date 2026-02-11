
PN = "freeradius"
PE = "0"
PV = "3.2.5"
PR = "4.el10"
PACKAGES = "freeradius freeradius-devel freeradius-doc freeradius-krb5 freeradius-ldap freeradius-utils python3-freeradius freeradius-mysql freeradius-perl freeradius-postgresql freeradius-rest freeradius-sqlite freeradius-unixODBC"


URI_freeradius = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius = "/bin/sh ( ) shadow-utils ( ) systemd-units ( ) glibc-common ( ) systemd-sysv ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/perl ( ) libcrypt.so.2()(64bit) ( ) make ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libpcap.so.1()(64bit) ( ) libgdbm.so.6()(64bit) ( ) openssl ( >=  1:3.2.2)"
RPROVIDES:freeradius = "group(radiusd) ( ) libfreeradius-dhcp.so()(64bit) ( ) libfreeradius-eap.so()(64bit) ( ) libfreeradius-radius.so()(64bit) ( ) libfreeradius-server.so()(64bit) ( ) freeradius ( =  3.2.5-4.el10) config(freeradius) ( =  3.2.5-4.el10) freeradius(x86-64) ( =  3.2.5-4.el10) group(radiusd) ( =  ZyByYWRpdXNkIDk1IC0gLSAt) user(radiusd) ( =  dSByYWRpdXNkIDk1ICJyYWRpdXNkIHVzZXIiIC92YXIvbGliL3JhZGl1c2QgL3NiaW4vbm9sb2dpbgAA)"

URI_freeradius-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-devel-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-devel = "freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-devel = "freeradius-devel ( =  3.2.5-4.el10) freeradius-devel(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-doc-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-doc = ""
RPROVIDES:freeradius-doc = "freeradius-doc ( =  3.2.5-4.el10) freeradius-doc(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-krb5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-krb5-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-krb5 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libcom_err.so.2()(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-krb5 = "config(freeradius-krb5) ( =  3.2.5-4.el10) freeradius-krb5 ( =  3.2.5-4.el10) freeradius-krb5(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-ldap-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-ldap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-ldap = "config(freeradius-ldap) ( =  3.2.5-4.el10) freeradius-ldap ( =  3.2.5-4.el10) freeradius-ldap(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-utils-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) perl(strict) ( ) perl(warnings) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/perl ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(Fcntl) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) perl(Getopt::Std) ( ) perl(Time::HiRes) ( ) libpcap.so.1()(64bit) ( ) perl(DBI) ( ) libgdbm.so.6()(64bit) ( ) perl(GDBM_File) ( ) libfreeradius-dhcp.so()(64bit) ( ) libfreeradius-eap.so()(64bit) ( ) libfreeradius-radius.so()(64bit) ( ) libfreeradius-server.so()(64bit) ( ) freeradius ( =  3.2.5-4.el10) libpcap ( >=  0.9.4)"
RPROVIDES:freeradius-utils = "freeradius-utils ( =  3.2.5-4.el10) freeradius-utils(x86-64) ( =  3.2.5-4.el10)"

URI_python3-freeradius = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-freeradius-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-freeradius = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) libpython3.12.so.1.0()(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:python3-freeradius = "python-freeradius ( =  3.2.5-4.el10) python3-freeradius ( =  3.2.5-4.el10) python3-freeradius(x86-64) ( =  3.2.5-4.el10) python3.12-freeradius ( =  3.2.5-4.el10)"

URI_freeradius-mysql = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-mysql-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-mysql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-mysql = "config(freeradius-mysql) ( =  3.2.5-4.el10) freeradius-mysql ( =  3.2.5-4.el10) freeradius-mysql(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-perl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-perl-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-perl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libperl.so.5.40()(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-perl = "config(freeradius-perl) ( =  3.2.5-4.el10) freeradius-perl ( =  3.2.5-4.el10) freeradius-perl(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-postgresql = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-postgresql-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-postgresql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-postgresql = "config(freeradius-postgresql) ( =  3.2.5-4.el10) freeradius-postgresql ( =  3.2.5-4.el10) freeradius-postgresql(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-rest = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-rest-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-rest = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libcurl.so.4()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-rest = "config(freeradius-rest) ( =  3.2.5-4.el10) freeradius-rest ( =  3.2.5-4.el10) freeradius-rest(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-sqlite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-sqlite-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-sqlite = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-sqlite = "config(freeradius-sqlite) ( =  3.2.5-4.el10) freeradius-sqlite ( =  3.2.5-4.el10) freeradius-sqlite(x86-64) ( =  3.2.5-4.el10)"

URI_freeradius-unixODBC = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-unixODBC-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-unixODBC = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libodbc.so.2()(64bit) ( ) freeradius ( =  3.2.5-4.el10)"
RPROVIDES:freeradius-unixODBC = "freeradius-unixODBC ( =  3.2.5-4.el10) freeradius-unixODBC(x86-64) ( =  3.2.5-4.el10)"
