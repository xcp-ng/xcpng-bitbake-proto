
inherit dnf-bridge

PN = "perl-DBD-SQLite"
PE = "0"
PV = "1.74"
PR = "6.el10"
PACKAGES = "perl-DBD-SQLite perl-DBD-SQLite-tests"


URI_perl-DBD-SQLite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBD-SQLite-1.74-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-SQLite = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-locale \
 sqlite-libs \
 perl-DBI \
 perl-DBD-SQLite \
 glibc \
 perl-Exporter \
 perl-base \
"

URI_perl-DBD-SQLite-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBD-SQLite-tests-1.74-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-DBD-SQLite-tests = " \
 perl-libs \
 perl-locale \
 perl-FindBin \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-DBD-SQLite \
 perl-DBI \
 perl-lib \
 perl-Time-HiRes \
 perl-Digest-MD5 \
 perl-Encode \
 bash \
 perl-Exporter \
 perl-base \
 perl-POSIX \
 perl-PathTools \
 perl-if \
 perl-interpreter \
 perl-File-Temp \
"
