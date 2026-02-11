
inherit dnf-bridge

PN = "perl-Sub-Quote"
PE = "0"
PV = "2.006008"
PR = "6.el10"
PACKAGES = "perl-Sub-Quote perl-Sub-Quote-tests"


URI_perl-Sub-Quote = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Quote-2.006008-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Quote = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-XString \
 perl-Exporter \
 perl-Sub-Quote \
"

URI_perl-Sub-Quote-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Quote-tests-2.006008-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Quote-tests = " \
 perl-constant \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Scalar-List-Utils \
 perl-Sub-Quote \
 perl-overload \
 bash \
 perl-B \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Exporter \
 perl-lib \
"
