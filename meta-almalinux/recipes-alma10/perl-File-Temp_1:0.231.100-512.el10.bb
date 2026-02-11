
inherit dnf-bridge

PN = "perl-File-Temp"
PE = "1"
PV = "0.231.100"
PR = "512.el10"
PACKAGES = "perl-File-Temp perl-File-Temp-tests"


URI_perl-File-Temp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Temp-0.231.100-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Temp = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Fcntl \
 perl-POSIX \
 perl-overload \
 perl-PathTools \
 perl-parent \
 perl-Errno \
 perl-Exporter \
 perl-File-Path \
"

URI_perl-File-Temp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Temp-tests-0.231.100-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Temp-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-FileHandle \
 perl-Fcntl \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"
