
inherit dnf-bridge

PN = "perl-B-COW"
PE = "0"
PV = "0.007"
PR = "9.el10"
PACKAGES = "perl-B-COW perl-B-COW-tests"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-B-COW-0.007-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-B-COW = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-B-COW-0.007-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-B-COW}"
RDEPENDS:perl-B-COW = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-base \
"

URI_perl-B-COW-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-B-COW-tests-0.007-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-B-COW-tests}"
RDEPENDS:perl-B-COW-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-B-COW \
 perl-Devel-Peek \
 perl-Test-Simple \
 perl-PathTools \
 bash \
 perl-interpreter \
"
