
PN = "perl-DBD-Pg"
PE = "0"
PV = "3.18.0"
PR = "6.el10"
PACKAGES = "perl-DBD-Pg perl-DBD-Pg-tests"


URI_perl-DBD-Pg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-Pg-3.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-Pg = " \
 perl-constant \
 perl-libs \
 libpq \
 perl-version \
 perl-DBI \
 glibc \
 perl-Exporter \
"

URI_perl-DBD-Pg-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-Pg-tests-3.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-Pg-tests = " \
 perl-libs \
 perl-open \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 postgresql-server \
 perl-DBD-Pg \
 perl-lib \
 perl-Data-Dumper \
 perl-Time-HiRes \
 perl-Time-Piece \
 perl-Encode \
 bash \
 perl-constant \
 perl-Fcntl \
 perl-POSIX \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
