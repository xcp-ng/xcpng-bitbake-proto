
inherit dnf-bridge

PN = "perl-XString"
PE = "0"
PV = "0.005"
PR = "16.el10"
PACKAGES = "perl-XString perl-XString-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-XString-0.005-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-XString = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-XString-0.005-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-XString}"
RDEPENDS:perl-XString = " \
 glibc \
 perl-libs \
"

URI_perl-XString-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XString-tests-0.005-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-XString-tests}"
RDEPENDS:perl-XString-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-XString \
 bash \
 perl-B \
 perl-interpreter \
"
