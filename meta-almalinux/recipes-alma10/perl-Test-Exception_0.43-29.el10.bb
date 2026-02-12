
inherit dnf-bridge

PN = "perl-Test-Exception"
PE = "0"
PV = "0.43"
PR = "29.el10"
PACKAGES = "perl-Test-Exception perl-Test-Exception-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Test-Exception-0.43-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-Exception = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Exception-0.43-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Exception}"
RDEPENDS:perl-Test-Exception = " \
 perl-Test-Simple \
 perl-libs \
 perl-Carp \
 perl-Sub-Uplevel \
 perl-Exporter \
 perl-base \
"

URI_perl-Test-Exception-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Exception-tests-0.43-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Exception-tests}"
RDEPENDS:perl-Test-Exception-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-overload \
 bash \
 perl-Sub-Uplevel \
 perl-interpreter \
 perl-Test-Exception \
 perl-base \
"
