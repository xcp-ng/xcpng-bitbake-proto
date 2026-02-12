
inherit dnf-bridge

PN = "perl-Test-Fatal"
PE = "0"
PV = "0.017"
PR = "8.el10"
PACKAGES = "perl-Test-Fatal perl-Test-Fatal-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Test-Fatal-0.017-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-Fatal = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Fatal-0.017-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Fatal}"
RDEPENDS:perl-Test-Fatal = " \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Try-Tiny \
 perl-Exporter \
"

URI_perl-Test-Fatal-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Fatal-tests-0.017-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Fatal-tests}"
RDEPENDS:perl-Test-Fatal-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-Try-Tiny \
 perl-overload \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Test-Fatal \
"
