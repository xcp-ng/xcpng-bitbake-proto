
inherit dnf-bridge

PN = "perl-Algorithm-Diff"
PE = "0"
PV = "1.2010"
PR = "14.el10"
PACKAGES = "perl-Algorithm-Diff perl-Algorithm-Diff-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Algorithm-Diff-1.2010-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Algorithm-Diff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Algorithm-Diff-1.2010-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Algorithm-Diff}"
RDEPENDS:perl-Algorithm-Diff = " \
 perl-Exporter \
 perl-vars \
 perl-libs \
 perl-Carp \
"

URI_perl-Algorithm-Diff-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Algorithm-Diff-tests-1.2010-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Algorithm-Diff-tests}"
RDEPENDS:perl-Algorithm-Diff-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Algorithm-Diff \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-lib \
"
