
PN = "perl-Time-Local"
PE = "2"
PV = "1.350"
PR = "511.el10"
PACKAGES = "perl-Time-Local perl-Time-Local-tests"


URI_perl-Time-Local = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Time-Local-1.350-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Time-Local = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-parent \
 perl-Exporter \
"

URI_perl-Time-Local-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Time-Local-tests-1.350-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Time-Local-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Time-Local \
"
