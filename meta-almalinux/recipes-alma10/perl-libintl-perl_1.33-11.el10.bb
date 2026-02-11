
inherit dnf-bridge

PN = "perl-libintl-perl"
PE = "0"
PV = "1.33"
PR = "11.el10"
PACKAGES = "perl-libintl-perl perl-libintl-perl-tests"


URI_perl-libintl-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libintl-perl-1.33-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-libintl-perl = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-locale \
 perl-POSIX \
 perl-DynaLoader \
 perl-Encode \
 perl-PathTools \
 glibc \
 perl-Exporter \
 perl-base \
 perl-libintl-perl \
"

URI_perl-libintl-perl-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-libintl-perl-tests-1.33-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-libintl-perl-tests = " \
 perl-constant \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-File-Basename \
 perl-POSIX \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-libintl-perl \
"
