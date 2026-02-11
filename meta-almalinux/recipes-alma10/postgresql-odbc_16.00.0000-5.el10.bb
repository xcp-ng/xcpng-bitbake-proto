
PN = "postgresql-odbc"
PE = "0"
PV = "16.00.0000"
PR = "5.el10"
PACKAGES = "postgresql-odbc postgresql-odbc-tests"


URI_postgresql-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-odbc-16.00.0000-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-odbc = " \
 glibc \
 unixODBC \
 libpq \
"

URI_postgresql-odbc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/postgresql-odbc-tests-16.00.0000-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-odbc-tests = " \
 unixODBC-devel \
 postgresql-odbc \
 make \
 bash \
 postgresql-test \
 gcc \
"
