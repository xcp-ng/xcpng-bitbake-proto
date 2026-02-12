
inherit dnf-bridge

PN = "perl-Params-Check"
PE = "1"
PV = "0.38"
PR = "511.el10"
PACKAGES = "perl-Params-Check perl-Params-Check-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Params-Check-0.38-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Params-Check = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Params-Check-0.38-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Params-Check}"
RDEPENDS:perl-Params-Check = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Exporter \
 perl-Locale-Maketext-Simple \
"

URI_perl-Params-Check-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Params-Check-tests-0.38-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Params-Check-tests}"
RDEPENDS:perl-Params-Check-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Params-Check \
 bash \
 perl-interpreter \
"
