
inherit dnf-bridge

PN = "perl-Sub-Uplevel"
PE = "1"
PV = "0.2800"
PR = "25.el10"
PACKAGES = "perl-Sub-Uplevel perl-Sub-Uplevel-tests"


URI_perl-Sub-Uplevel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Sub-Uplevel-0.2800-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Uplevel = " \
 perl-constant \
 perl-libs \
 perl-Carp \
"

URI_perl-Sub-Uplevel-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Uplevel-tests-0.2800-25.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Uplevel-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-ExtUtils-MakeMaker \
 bash \
 perl-PathTools \
 perl-Sub-Uplevel \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
