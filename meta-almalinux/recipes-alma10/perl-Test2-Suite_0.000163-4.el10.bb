
PN = "perl-Test2-Suite"
PE = "0"
PV = "0.000163"
PR = "4.el10"
PACKAGES = "perl-Test2-Suite perl-Test2-Suite-tests"


URI_perl-Test2-Suite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Test2-Suite-0.000163-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test2-Suite = " \
 perl-constant \
 perl-threads \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Test-Simple \
 perl-Test2-Suite \
 perl-B \
 perl-overload \
 perl-PathTools \
 perl-Time-HiRes \
 perl-Exporter \
 perl-Data-Dumper \
 perl-base \
 perl-File-Temp \
 perl-Term-Table \
"

URI_perl-Test2-Suite-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test2-Suite-tests-0.000163-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test2-Suite-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-ExtUtils-MakeMaker \
 perl-Scalar-List-Utils \
 perl-Test2-Suite \
 perl-File-Temp \
 perl-overload \
 bash \
 perl-PathTools \
 perl-Symbol \
 perl-interpreter \
 perl-Data-Dumper \
 perl-base \
 perl-lib \
"
