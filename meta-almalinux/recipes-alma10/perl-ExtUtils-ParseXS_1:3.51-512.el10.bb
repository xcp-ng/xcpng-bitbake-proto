
inherit dnf-bridge

PN = "perl-ExtUtils-ParseXS"
PE = "1"
PV = "3.51"
PR = "512.el10"
PACKAGES = "perl-ExtUtils-ParseXS perl-ExtUtils-ParseXS-tests"


URI_perl-ExtUtils-ParseXS = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-ParseXS-3.51-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-ParseXS = " \
 perl-libs \
 perl-ExtUtils-ParseXS \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Symbol \
 perl-PathTools \
 perl-interpreter \
 perl-Exporter \
"

URI_perl-ExtUtils-ParseXS-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-ParseXS-tests-3.51-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-ParseXS-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-ExtUtils-ParseXS \
 perl-DynaLoader \
 perl-File-Temp \
 perl-overload \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-ExtUtils-CBuilder \
 perl-lib \
"
