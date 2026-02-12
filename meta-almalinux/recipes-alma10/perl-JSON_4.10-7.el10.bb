
inherit dnf-bridge

PN = "perl-JSON"
PE = "0"
PV = "4.10"
PR = "7.el10"
PACKAGES = "perl-JSON perl-JSON-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-JSON-4.10-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-JSON = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-JSON-4.10-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-JSON}"
RDEPENDS:perl-JSON = " \
 perl-constant \
 perl-Math-BigInt \
 perl-libs \
 perl-Carp \
 perl-Encode \
 perl-overload \
 perl-B \
 perl-Exporter \
"

URI_perl-JSON-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-JSON-tests-4.10-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-JSON-tests}"
RDEPENDS:perl-JSON-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-Tie-IxHash \
 perl-Encode \
 perl-overload \
 bash \
 perl-JSON \
 perl-Tie \
 coreutils \
 perl-interpreter \
 perl-Data-Dumper \
"
