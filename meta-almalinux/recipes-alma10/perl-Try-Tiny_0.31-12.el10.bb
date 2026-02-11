
PN = "perl-Try-Tiny"
PE = "0"
PV = "0.31"
PR = "12.el10"
PACKAGES = "perl-Try-Tiny perl-Try-Tiny-tests"


URI_perl-Try-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Try-Tiny-0.31-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Try-Tiny = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Exporter \
"

URI_perl-Try-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Try-Tiny-tests-0.31-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Try-Tiny-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Try-Tiny \
 bash \
 perl-PathTools \
 perl-interpreter \
"
