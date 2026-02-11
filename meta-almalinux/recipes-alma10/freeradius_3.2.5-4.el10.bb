
PN = "freeradius"
PE = "0"
PV = "3.2.5"
PR = "4.el10"
PACKAGES = "freeradius freeradius-devel freeradius-doc freeradius-krb5 freeradius-ldap freeradius-utils python3-freeradius freeradius-mysql freeradius-perl freeradius-postgresql freeradius-rest freeradius-sqlite freeradius-unixODBC"


URI_freeradius = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius = " \
 glibc-common \
 libpcap \
 shadow-utils \
 systemd \
 libxcrypt \
 openssl \
 openssl-libs \
 readline \
 make \
 json-c \
 gdbm-libs \
 pam-libs \
 bash \
 libtalloc \
 glibc \
 perl-interpreter \
"

URI_freeradius-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-devel-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-devel = " \
 freeradius \
"

URI_freeradius-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-doc-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-doc = ""

URI_freeradius-krb5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-krb5-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-krb5 = " \
 glibc \
 krb5-libs \
 libcom_err \
 freeradius \
"

URI_freeradius-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-ldap-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-ldap = " \
 glibc \
 openldap \
 freeradius \
"

URI_freeradius-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeradius-utils-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-utils = " \
 libpcap \
 freeradius \
 perl-libs \
 openssl-libs \
 perl-Fcntl \
 gdbm-libs \
 perl-Getopt-Long \
 perl-POSIX \
 perl-File-Basename \
 perl-Getopt-Std \
 perl-DBI \
 perl-GDBM_File \
 bash \
 libtalloc \
 glibc \
 perl-interpreter \
 perl-Time-HiRes \
"

URI_python3-freeradius = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-freeradius-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-freeradius = " \
 glibc \
 freeradius \
 python3 \
 python3-libs \
"

URI_freeradius-mysql = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-mysql-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-mysql = " \
 glibc \
 mariadb-connector-c \
 freeradius \
"

URI_freeradius-perl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-perl-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-perl = " \
 glibc \
 perl-libs \
 freeradius \
"

URI_freeradius-postgresql = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-postgresql-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-postgresql = " \
 glibc \
 freeradius \
 libpq \
"

URI_freeradius-rest = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-rest-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-rest = " \
 glibc \
 json-c \
 freeradius \
 libcurl \
"

URI_freeradius-sqlite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-sqlite-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-sqlite = " \
 glibc \
 sqlite-libs \
 freeradius \
"

URI_freeradius-unixODBC = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeradius-unixODBC-3.2.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeradius-unixODBC = " \
 glibc \
 unixODBC \
 freeradius \
"
