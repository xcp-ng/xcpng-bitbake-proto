
inherit dnf-bridge

PN = "perl-Term-Table"
PE = "0"
PV = "0.018"
PR = "513.el10"
PACKAGES = "perl-Term-Table perl-Term-Table-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Term-Table-0.018-513.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Term-Table = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Table-0.018-513.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Term-Table}"
RDEPENDS:perl-Term-Table = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Exporter \
 perl-base \
 perl-Term-Table \
"

URI_perl-Term-Table-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Table-tests-0.018-513.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Term-Table-tests}"
RDEPENDS:perl-Term-Table-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-base \
 perl-Term-Table \
"
