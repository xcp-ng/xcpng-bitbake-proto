
inherit dnf-bridge

PN = "perl-File-Slurp"
PE = "0"
PV = "9999.32"
PR = "17.el10"
PACKAGES = "perl-File-Slurp perl-File-Slurp-tests"


URI_perl-File-Slurp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Slurp-9999.32-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurp = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Fcntl \
 perl-POSIX \
 perl-File-Basename \
 perl-PathTools \
 perl-Errno \
 perl-Exporter \
 perl-File-Temp \
"

URI_perl-File-Slurp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurp-tests-9999.32-17.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurp-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Socket \
 perl-overload \
 perl-Symbol \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 perl-lib \
 bash \
 perl-Exporter \
 perl-Fcntl \
 perl-File-Basename \
 perl-POSIX \
 perl-PathTools \
 perl-interpreter \
 perl-File-Slurp \
 perl-File-Temp \
"
