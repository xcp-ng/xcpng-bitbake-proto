
inherit dnf-bridge

PN = "perl-Mozilla-CA"
PE = "0"
PV = "20231213"
PR = "5.el10"
PACKAGES = "perl-Mozilla-CA perl-Mozilla-CA-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Mozilla-CA-20231213-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Mozilla-CA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Mozilla-CA-20231213-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Mozilla-CA}"
RDEPENDS:perl-Mozilla-CA = " \
 ca-certificates \
 perl-PathTools \
 perl-libs \
"

URI_perl-Mozilla-CA-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Mozilla-CA-tests-20231213-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Mozilla-CA-tests}"
RDEPENDS:perl-Mozilla-CA-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Mozilla-CA \
 bash \
 perl-interpreter \
"
