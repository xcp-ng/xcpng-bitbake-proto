
inherit dnf-bridge

PN = "perl-Capture-Tiny"
PE = "0"
PV = "0.48"
PR = "23.el10"
PACKAGES = "perl-Capture-Tiny perl-Capture-Tiny-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Capture-Tiny-0.48-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Capture-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Capture-Tiny-0.48-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Capture-Tiny}"
RDEPENDS:perl-Capture-Tiny = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-PathTools \
 perl-Exporter \
 perl-File-Temp \
"

URI_perl-Capture-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Capture-Tiny-tests-0.48-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Capture-Tiny-tests}"
RDEPENDS:perl-Capture-Tiny-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-Test-Simple \
 perl-Capture-Tiny \
 perl-File-Temp \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
