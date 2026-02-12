
inherit dnf-bridge

PN = "perl-Bit-Vector"
PE = "0"
PV = "7.4"
PR = "36.el10"
PACKAGES = "perl-Bit-Vector perl-Bit-Vector-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Bit-Vector-7.4-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Bit-Vector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Bit-Vector-7.4-36.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Bit-Vector}"
RDEPENDS:perl-Bit-Vector = " \
 perl-libs \
 perl-Carp-Clan \
 perl-vars \
 perl-Storable \
 perl-DynaLoader \
 perl-overload \
 glibc \
 perl-Exporter \
"

URI_perl-Bit-Vector-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Bit-Vector-tests-7.4-36.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Bit-Vector-tests}"
RDEPENDS:perl-Bit-Vector-tests = " \
 perl-Test-Harness \
 perl-libs \
 bash \
 perl-interpreter \
 perl-Bit-Vector \
"
