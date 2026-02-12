
inherit dnf-bridge

PN = "perl-Devel-Symdump"
PE = "1"
PV = "2.18"
PR = "31.el10"
PACKAGES = "perl-Devel-Symdump perl-Devel-Symdump-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Devel-Symdump-2.18-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Devel-Symdump = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-Symdump-2.18-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Devel-Symdump}"
RDEPENDS:perl-Devel-Symdump = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Devel-Symdump \
 perl-B \
 perl-Exporter \
"

URI_perl-Devel-Symdump-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-Symdump-tests-2.18-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Devel-Symdump-tests}"
RDEPENDS:perl-Devel-Symdump-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-Devel-Symdump \
 perl-interpreter \
 perl-lib \
"
