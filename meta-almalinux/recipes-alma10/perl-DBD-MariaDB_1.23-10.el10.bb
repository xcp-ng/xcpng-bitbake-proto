
inherit dnf-bridge

PN = "perl-DBD-MariaDB"
PE = "0"
PV = "1.23"
PR = "10.el10"
PACKAGES = "perl-DBD-MariaDB perl-DBD-MariaDB-tests"


URI_perl-DBD-MariaDB = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-MariaDB-1.23-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MariaDB = " \
 perl-libs \
 perl-DynaLoader \
 perl-DBI \
 mariadb-connector-c \
 glibc \
"

URI_perl-DBD-MariaDB-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-MariaDB-tests-1.23-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-MariaDB-tests = " \
 perl-libs \
 perl-FindBin \
 perl-B \
 perl-Test-Deep \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-CPAN-Meta-YAML \
 perl-vars \
 mariadb \
 mariadb-server \
 perl-DBD-MariaDB \
 perl-DBI \
 perl-lib \
 perl-Data-Dumper \
 perl-Time-HiRes \
 perl-Encode \
 bash \
 perl-bignum \
 hostname \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"
