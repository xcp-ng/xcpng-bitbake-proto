
inherit dnf-bridge

PN = "perl-local-lib"
PE = "0"
PV = "2.000029"
PR = "9.el10"
PACKAGES = "perl-local-lib perl-homedir perl-local-lib-tests"


URI_perl-local-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-local-lib-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-local-lib = " \
 perl-PathTools \
 perl-libs \
 perl-Carp \
 perl-File-Basename \
"

URI_perl-homedir = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-homedir-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-homedir = " \
 sed \
 perl-local-lib \
"

URI_perl-local-lib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-local-lib-tests-2.000029-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-local-lib-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-local-lib \
 perl-File-Basename \
 perl-File-Temp \
 perl-IPC-Open3 \
 bash \
 perl-PathTools \
 perl-base \
 perl-interpreter \
 perl-File-Path \
 perl-Exporter \
 perl-lib \
"
